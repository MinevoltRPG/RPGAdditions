package me.drkmatr1984.RPGAdditions.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import com.chrismin13.additionsapi.AdditionsAPI;
import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.compatability.WerewolfPluginManager;
import me.drkmatr1984.customevents.pvpEvents.PlayerDamageByPlayerEvent;
import us.rfsmassacre.Werewolf.WerewolfPlugin;
import us.rfsmassacre.Werewolf.Origin.Werewolf;

public class WerewolfDamageListener implements Listener{
		
	@EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
	public void onPvPDamage(PlayerDamageByPlayerEvent event)
	{
		WerewolfPluginManager werewolfPluginManager = RPGAdditions.getInstance().getWerewolfPluginManager();
		if(AdditionsAPI.isCustomItem(event.getDamagingPlayer().getInventory().getItemInMainHand()) && werewolfPluginManager.getWerewolfManager().isWerewolf(event.getDamagedPlayer())) {
			final Werewolf werewolf = werewolfPluginManager.getWerewolfManager().getWerewolf(event.getDamagedPlayer());
			if(werewolf.inWolfForm()) {
				if(werewolfPluginManager.isSilverTool(event.getDamagingPlayer().getInventory().getItemInMainHand())) {
					final String key = werewolf.getType().toKey();
			        event.setDamage(event.getDamage() / WerewolfPlugin.getConfigManager().getDouble("werewolf-stats." + key + ".werewolf.defense"));
				}
			}			
		}
	}
		
}
