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
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.daggers.GlowstoneDagger;
import me.drkmatr1984.RPGAdditions.ores.Ore;
import me.drkmatr1984.RPGAdditions.ores.SilverIngot;
import me.drkmatr1984.RPGAdditions.ores.SilverNugget;
import me.drkmatr1984.RPGAdditions.swords.CustomSword;
import me.drkmatr1984.RPGAdditions.swords.GlowstoneSword;
import me.drkmatr1984.RPGAdditions.swords.SilverSword;

public class PostAPIInitListener implements Listener {
	
	@EventHandler
	public void onPostInitialization(AdditionsAPIPostInitializationEvent event) {
		ImmutableList<CustomItem> customItems = event.getCustomItems();
		shinyItems(customItems);
		silverItems(customItems);	
	}
	
	public void shinyItems(ImmutableList<CustomItem> customItems) {
		if(RPGAdditions.getInstance().getPluginManager().isPluginEnabled("ShinyItems")) {
			for(CustomItem cItem : customItems) {	
				if(cItem instanceof GlowstoneDagger) {
					io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), 15, cItem.getDurability(), true));
				}
				if(cItem instanceof GlowstoneSword) {
					io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), 15, cItem.getDurability(), true));
				}
			}
			Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&aRPG&eAdditions&f] &6ShinyItems &adetected. Glowstone Items will Glow!"));
		}	
	}
	
	public void silverItems(ImmutableList<CustomItem> customItems) 
	{
		ItemStack silverNugget = null;
		ItemStack silverIngot = null;
		CustomItem customSilverSword = null;
		for(CustomItem cItem : customItems) {
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
		}
		if(silverNugget!=null && silverIngot!=null) {
			new ShapedRecipeBuilder().forResult(silverIngot).withShape("sss", "sss", "sss").withIngredient('s', silverNugget).register();	
			if(customSilverSword!=null) {
				if(RPGAdditions.getInstance().getPluginManager().isPluginEnabled("Werewolf")) {
					setWerewolfSilverWeapons(customSilverSword, silverIngot);
				}else {
					new ShapedRecipeBuilder().forResult((new CustomItemStack(customSilverSword)).getItemStack()).withShape("sxs", "sxs", "sbs").withIngredient('x', silverIngot).withIngredient('b', Material.STICK).register();
				}				
			}
		}
	}
	
	public void setWerewolfSilverWeapons(CustomItem customSilverSword, ItemStack silverIngot) {
		ItemMeta meta = us.rfsmassacre.Werewolf.WerewolfPlugin.getItemManager().getWerewolfItem(us.rfsmassacre.Werewolf.Items.WerewolfItem.WerewolfItemType.SILVER_SWORD).getItemMeta();				
		ItemStack silverSword = (new CustomItemStack(customSilverSword)).getItemStack();
		ItemMeta swordMeta = null;
		if(silverSword.hasItemMeta()) {
			swordMeta = silverSword.getItemMeta();
			if(!swordMeta.hasDisplayName()) {
				if(meta.hasDisplayName()) {
					swordMeta.setDisplayName(meta.getDisplayName());
				}else {
					swordMeta.setDisplayName("Silver Sword");
				}						
			}
		}			
		List<String> lore = new ArrayList<String>();
		if (meta.hasLore()) {
			for(String s : meta.getLore()) {
				if(s.contains("The purified metal from your")) {
					s = s.replace("The purified metal from your", "");
					lore.add(new String(ChatColor.translateAlternateColorCodes('&', "&f&oThere are stories in Minevoltia&r")) + s);
				}else if(s.contains("iron sword has become silver.")) {
					s = s.replace("iron sword has become silver.", "");
					lore.add(new String(ChatColor.translateAlternateColorCodes('&', "&f&oabout werewolves and their&r")) + s);
				}else if(s.contains("This blade pierces through the")){
					s = s.replace("This blade pierces through the", "");
					lore.add(new String(ChatColor.translateAlternateColorCodes('&', "&f&oweaknesses to Silver items.&r")) + s);
				}else if(s.contains("defense of any Werewolf.")) {
					s = s.replace("defense of any Werewolf.", "");
					lore.add("");
					lore.add(new String(ChatColor.translateAlternateColorCodes('&', "&eDeals Extra Damage to &6&lWerewolves&r")) + s);
				}else {
					lore.add(s);
				}					
			}
			if(swordMeta.hasLore()) {
				for(String s : swordMeta.getLore()) {
					lore.add(s);
				}
			}
		}
		swordMeta.setLore(lore);
		silverSword.setItemMeta(swordMeta);
		new ShapedRecipeBuilder().forResult(silverSword).withShape("sxs", "sxs", "sbs").withIngredient('x', silverIngot).withIngredient('b', Material.STICK).register();
		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&aRPG&eAdditions&f] &6Werewolf &adetected. Silver Weapons will do extra damage to werewolves!"));
	}
}