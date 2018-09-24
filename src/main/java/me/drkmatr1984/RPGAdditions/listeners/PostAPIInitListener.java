package me.drkmatr1984.RPGAdditions.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import com.chrismin13.additionsapi.events.AdditionsAPIPostInitializationEvent;
import com.chrismin13.additionsapi.items.CustomItem;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.daggers.GlowstoneDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.RedstoneDagger;
import me.drkmatr1984.RPGAdditions.items.swords.GlowstoneSword;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.AmethystRecipes;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.BloodstoneRecipes;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.CitrineRecipes;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.OnyxRecipes;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.RubyRecipes;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.SapphireRecipes;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.SilverFurnaceRecipes;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.SilverRecipes;
import me.drkmatr1984.RPGAdditions.recipes.customRecipes.YellowTopazRecipes;

public class PostAPIInitListener implements Listener {
	
	@EventHandler
	public void onPostInitialization(AdditionsAPIPostInitializationEvent event) {
		ImmutableList<CustomItem> customItems = event.getCustomItems();	
		AmethystRecipes.amethystItems(customItems);
		BloodstoneRecipes.bloodstoneItems(customItems);
		AmethystRecipes.amethystItems(customItems);
		BloodstoneRecipes.bloodstoneItems(customItems);
		CitrineRecipes.citrineItems(customItems);
		OnyxRecipes.onyxItems(customItems);
		RubyRecipes.rubyItems(customItems);
		SapphireRecipes.sapphireItems(customItems);
		YellowTopazRecipes.yellowTopazItems(customItems);
		SilverRecipes.silverItems(customItems);
		SilverFurnaceRecipes.silverFurnaceRecipes(customItems);
		shinyItems(customItems);
	}

	public void shinyItems(ImmutableList<CustomItem> customItems) {
		if(RPGAdditions.getInstance().getPluginManager().isPluginEnabled("ShinyItems")) {
			List<io.github.sipsi133.ShinyItem> shinyItems = new ArrayList<io.github.sipsi133.ShinyItem>();
			for(CustomItem cItem : customItems) {
				for(io.github.sipsi133.ShinyItem shinyItem : io.github.sipsi133.ShinyItems.instance.getLightSources()) {
					if(shinyItem.getMaterial().equals(Material.GLOWSTONE)) {
						if(cItem instanceof GlowstoneDagger) {
							shinyItems.add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), (int) cItem.getDurability(), true));
						}
						if(cItem instanceof GlowstoneSword) {
							shinyItems.add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), (int) cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.GLOWSTONE_DUST)) {
						if(cItem instanceof GlowstoneDagger) {
							shinyItems.add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), (int) cItem.getDurability(), true));
						}
						if(cItem instanceof GlowstoneSword) {
							shinyItems.add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), (int) cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.REDSTONE_TORCH)) {
						if(cItem instanceof RedstoneDagger) {
							shinyItems.add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), (int) cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.REDSTONE)) {
						if(cItem instanceof RedstoneDagger) {
							shinyItems.add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), (int) cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.REDSTONE_BLOCK)) {
						if(cItem instanceof RedstoneDagger) {
							shinyItems.add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), (int) cItem.getDurability(), true));
						}
					}
				}
			}
			if(!shinyItems.isEmpty()) {
				for(io.github.sipsi133.ShinyItem shinyItem : shinyItems) {
					io.github.sipsi133.ShinyItems.instance.getLightSources().add(shinyItem);
				}
			}
			Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&aRPG&eAdditions&f] &6ShinyItems &adetected. &aItems will &eGlow!"));
		}	
	}
		
}