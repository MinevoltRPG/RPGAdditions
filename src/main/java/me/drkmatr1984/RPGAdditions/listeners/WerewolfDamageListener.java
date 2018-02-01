package me.drkmatr1984.RPGAdditions.listeners;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import com.chrismin13.additionsapi.AdditionsAPI;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;

import me.drkmatr1984.RPGAdditions.items.axes.SilverAxe;
import me.drkmatr1984.RPGAdditions.items.daggers.SilverDagger;
import me.drkmatr1984.RPGAdditions.items.swords.SilverSword;
import me.drkmatr1984.customevents.pvpEvents.PlayerDamageByPlayerEvent;
import us.rfsmassacre.Werewolf.WerewolfPlugin;
import us.rfsmassacre.Werewolf.Managers.WerewolfManager;
import us.rfsmassacre.Werewolf.Origin.Werewolf;

public class WerewolfDamageListener implements Listener{
	
	private List<ItemStack> silverTools;
	
	@EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
	public void onPvPDamage(PlayerDamageByPlayerEvent event)
	{	
		WerewolfManager wolfManager = WerewolfPlugin.getWerewolfManager();
		if(AdditionsAPI.isCustomItem(event.getDamagingPlayer().getInventory().getItemInMainHand()) && wolfManager.isWerewolf(event.getDamagedPlayer())) {
			final Werewolf werewolf = wolfManager.getWerewolf(event.getDamagedPlayer());
			if(werewolf.inWolfForm()) {
				silverTools = new ArrayList<ItemStack>();
				for(CustomItem cItem : AdditionsAPI.getAllCustomItems()) {			
					if(cItem instanceof SilverSword) {
						silverTools.add(new CustomItemStack(cItem).getItemStack());
					}
					
					if(cItem instanceof SilverDagger) {
						silverTools.add(new CustomItemStack(cItem).getItemStack());
					}
					
					if(cItem instanceof SilverAxe) {
						silverTools.add(new CustomItemStack(cItem).getItemStack());
					}	
				}
				for(ItemStack stack : silverTools) {
					if(event.getDamagingPlayer().getInventory().getItemInMainHand().isSimilar(stack)) {						
				        final String key = werewolf.getType().toKey();
				        event.setDamage(event.getDamage() / WerewolfPlugin.getConfigManager().getDouble("werewolf-stats." + key + ".werewolf.defense"));
					}
				}
			}			
		}
	}
	
}