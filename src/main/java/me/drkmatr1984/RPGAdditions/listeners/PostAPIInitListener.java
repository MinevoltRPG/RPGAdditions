package me.drkmatr1984.RPGAdditions.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import com.chrismin13.additionsapi.events.AdditionsAPIPostInitializationEvent;
import com.chrismin13.additionsapi.items.CustomItem;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.daggers.GlowstoneDagger;
import me.drkmatr1984.RPGAdditions.recipes.SilverRecipes;
import me.drkmatr1984.RPGAdditions.swords.GlowstoneSword;

public class PostAPIInitListener implements Listener {
	
	@EventHandler
	public void onPostInitialization(AdditionsAPIPostInitializationEvent event) {
		ImmutableList<CustomItem> customItems = event.getCustomItems();
		shinyItems(customItems);
		SilverRecipes.silverItems(customItems);
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
	
	
}