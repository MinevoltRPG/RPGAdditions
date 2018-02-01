package me.drkmatr1984.RPGAdditions.listeners;

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
import me.drkmatr1984.RPGAdditions.recipes.AmethystRecipes;
import me.drkmatr1984.RPGAdditions.recipes.BloodstoneRecipes;
import me.drkmatr1984.RPGAdditions.recipes.SilverFurnaceRecipes;
import me.drkmatr1984.RPGAdditions.recipes.SilverRecipes;
import me.drkmatr1984.RPGAdditions.items.swords.GlowstoneSword;

public class PostAPIInitListener implements Listener {
	
	@EventHandler
	public void onPostInitialization(AdditionsAPIPostInitializationEvent event) {
		ImmutableList<CustomItem> customItems = event.getCustomItems();	
		AmethystRecipes.amethystItems(customItems);
		BloodstoneRecipes.bloodstoneItems(customItems);
		SilverRecipes.silverItems(customItems);
		new SilverFurnaceRecipes(customItems).silverFurnaceRecipes();
		shinyItems(customItems);		
	}

	public void shinyItems(ImmutableList<CustomItem> customItems) {
		if(RPGAdditions.getInstance().getPluginManager().isPluginEnabled("ShinyItems")) {
			for(CustomItem cItem : customItems) {
				for(io.github.sipsi133.ShinyItem shinyItem : io.github.sipsi133.ShinyItems.instance.getLightSources()) {
					if(shinyItem.getMaterial().equals(Material.GLOWSTONE)) {
						if(cItem instanceof GlowstoneDagger) {
							io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), cItem.getDurability(), true));
						}
						if(cItem instanceof GlowstoneSword) {
							io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.GLOWSTONE_DUST)) {
						if(cItem instanceof GlowstoneDagger) {
							io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), cItem.getDurability(), true));
						}
						if(cItem instanceof GlowstoneSword) {
							io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.REDSTONE_TORCH_ON)) {
						if(cItem instanceof RedstoneDagger) {
							io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.REDSTONE_TORCH_OFF)) {
						if(cItem instanceof RedstoneDagger) {
							io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.REDSTONE)) {
						if(cItem instanceof RedstoneDagger) {
							io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), cItem.getDurability(), true));
						}
					}
					if(shinyItem.getMaterial().equals(Material.REDSTONE_BLOCK)) {
						if(cItem instanceof RedstoneDagger) {
							io.github.sipsi133.ShinyItems.getInstance().getLightSources().add(new io.github.sipsi133.ShinyItem(cItem.getMaterial(), io.github.sipsi133.ShinyItems.getInstance().getLightlevel(shinyItem.getMaterial()), cItem.getDurability(), true));
						}
					}
				}
			}
			Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&aRPG&eAdditions&f] &6ShinyItems &adetected. &aItems will &eGlow!"));
		}	
	}
		
}