package me.drkmatr1984.RPGAdditions;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;

import me.drkmatr1984.RPGAdditions.compatability.WerewolfPluginManager;
import me.drkmatr1984.RPGAdditions.listeners.PostAPIInitListener;
import me.drkmatr1984.customevents.CustomEvents;

public class RPGAdditions extends org.bukkit.plugin.java.JavaPlugin
{
	private Logger log;
	private PluginManager pm;
	private static RPGAdditions plugin;
	private WerewolfPluginManager werewolfPluginManager;
  
	public void onEnable()
	{
		plugin = this;
		log = getLogger();
		CustomEvents events = new CustomEvents(this, false, false, false, true, false);
		events.initializeLib();
		pm = getServer().getPluginManager();
		if(isWerewolf()) {
			werewolfPluginManager = new WerewolfPluginManager(this);
		}
		pm.registerEvents(new Items(this), this);
		pm.registerEvents(new PostAPIInitListener(), this);
					
		this.log.info("RPGAdditions enabled!");
	}
	
	public static RPGAdditions getInstance() {
		return plugin;
	}
	
	public PluginManager getPluginManager() {
		return this.pm;
	}
	
	public boolean isVanillaAdditions() {
		if(RPGAdditions.getInstance().getPluginManager().isPluginEnabled("VanillaAdditions")) {
			return true;
		}
		return false;
	}
	
	public boolean isWerewolf() {
		if(RPGAdditions.getInstance().getPluginManager().isPluginEnabled("Werewolf")) {
			return true;
		}
		return false;
	}
	
	public WerewolfPluginManager getWerewolfPluginManager() {
		return this.werewolfPluginManager;		
	}
}