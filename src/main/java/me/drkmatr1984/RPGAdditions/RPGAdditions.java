package me.drkmatr1984.RPGAdditions;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import net.md_5.bungee.api.ChatColor;

public class RPGAdditions extends org.bukkit.plugin.java.JavaPlugin
{
	private Logger log;
	private PluginManager pm;
  
	public void onEnable()
	{
		log = getLogger();
		pm = getServer().getPluginManager();
		pm.registerEvents(new Items(this), this);
		if(pm.isPluginEnabled("ShinyItems")) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&aRPG&eAdditions&f] &eShinyItems &adetected. Glowstone Items will Glow!"));			
			pm.registerEvents(new ShinyItemsHook(Boolean.valueOf(true)), this);
		}
		this.log.info("RPGAdditions enabled!");
	}	
}