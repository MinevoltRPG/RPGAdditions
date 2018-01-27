package me.drkmatr1984.RPGAdditions.listeners;

import java.util.List;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.inventivetalent.recipebuilder.ShapedRecipeBuilder;

import com.chrismin13.additionsapi.events.AdditionsAPIPostInitializationEvent;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.daggers.GlowstoneDagger;
import me.drkmatr1984.RPGAdditions.ores.Ore;
import me.drkmatr1984.RPGAdditions.ores.SilverIngot;
import me.drkmatr1984.RPGAdditions.ores.SilverNugget;
import me.drkmatr1984.RPGAdditions.swords.CustomSword;
import me.drkmatr1984.RPGAdditions.swords.GlowstoneSword;
import me.drkmatr1984.RPGAdditions.swords.SilverSword;
import us.rfsmassacre.Werewolf.Items.WerewolfItem.WerewolfItemType;

public class PostAPIInitListener implements Listener {
	
	@EventHandler
	public void onPostInitialization(AdditionsAPIPostInitializationEvent event) {		
		ItemStack silverNugget = null;
		ItemStack silverIngot = null;
		CustomItem customSilverSword = null;
		for(CustomItem cItem : event.getCustomItems()) {
			if(cItem instanceof Ore) {
				if(cItem instanceof SilverIngot) {
					silverIngot = (new CustomItemStack(cItem)).getItemStack();
				}
				if(cItem instanceof SilverNugget) {
					silverNugget = (new CustomItemStack(cItem)).getItemStack();
				}
			}			
			if(cItem instanceof CustomSword) {
				if(cItem instanceof SilverSword) {
					customSilverSword = cItem;
				}
			}
			if(RPGAdditions.getInstance().getPluginManager().isPluginEnabled("ShinyItems")) {
				if(cItem instanceof GlowstoneDagger) {
					io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), 15, cItem.getDurability(), true));
				}
				if(cItem instanceof GlowstoneSword) {
					io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), 15, cItem.getDurability(), true));
				}
				Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&aRPG&eAdditions&f] &eShinyItems &adetected. Glowstone Items will Glow!"));
			}
		}
		if(silverNugget!=null && silverIngot!=null) {
			new ShapedRecipeBuilder().forResult(silverIngot).withShape("sss", "sss", "sss").withIngredient('s', silverNugget).register();	
		}
		if(customSilverSword!=null) {
			if(RPGAdditions.getInstance().getPluginManager().isPluginEnabled("WerewolfPlugin") || RPGAdditions.getInstance().getPluginManager().isPluginEnabled("Werewolf")) {
				ItemMeta meta = us.rfsmassacre.Werewolf.WerewolfPlugin.getItemManager().getWerewolfItem(WerewolfItemType.SILVER_SWORD).getItemMeta();				
				customSilverSword.setDisplayName(meta.getDisplayName());
				List<String> lore = new ArrayList<String>();
				for(String s : meta.getLore()) {
					if(s.contains("The purified metal from your")) {
						s = s.replace("The purified metal from your", "");
					}
					if(s.contains("iron sword has become silver.")) {
						s = s.replace("iron sword has become silver.", "");
					}
					lore.add(s);
				}
				customSilverSword.setLore(lore);
			}
			new ShapedRecipeBuilder().forResult((new CustomItemStack(customSilverSword)).getItemStack()).withShape("sxs", "sxs", "sbs").withIngredient('x', silverIngot).withIngredient('b', Material.STICK).register();
		}
	}
}