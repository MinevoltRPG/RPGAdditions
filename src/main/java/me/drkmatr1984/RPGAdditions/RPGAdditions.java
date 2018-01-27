package me.drkmatr1984.RPGAdditions;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;

import me.drkmatr1984.RPGAdditions.listeners.PostAPIInitListener;

public class RPGAdditions extends org.bukkit.plugin.java.JavaPlugin
{
	private Logger log;
	private PluginManager pm;
	private static RPGAdditions plugin;
  
	public void onEnable()
	{
		plugin = this;
		log = getLogger();
		pm = getServer().getPluginManager();
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
}