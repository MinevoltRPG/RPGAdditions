package me.drkmatr1984.RPGAdditions;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.chrismin13.additionsapi.events.AdditionsAPIPostInitializationEvent;
import com.chrismin13.additionsapi.items.CustomItem;

import io.github.sipsi133.ShinyItem;
import io.github.sipsi133.ShinyItems;
import me.drkmatr1984.RPGAdditions.daggers.GlowstoneDagger;
import me.drkmatr1984.RPGAdditions.swords.GlowstoneSword;

public class ShinyItemsHook implements Listener { // Class must implement Listener
	
	private boolean shinyItems;
	
	public ShinyItemsHook(boolean shinyItems) {
		this.shinyItems = shinyItems;
	}
	
	@EventHandler
	public void onInitialization(AdditionsAPIPostInitializationEvent event) {
		if(shinyItems) {
			for(CustomItem item : event.getCustomItems()) {
				if(item instanceof GlowstoneDagger) {
					ShinyItems.getInstance().getLightSources().add(new ShinyItem(Material.DIAMOND_SWORD, 15, item.getDurability(), true));
				}
				if(item instanceof GlowstoneSword) {
					ShinyItems.getInstance().getLightSources().add(new ShinyItem(Material.DIAMOND_SWORD, 15, item.getDurability(), true));
				}
			}
		}
	}
	
}