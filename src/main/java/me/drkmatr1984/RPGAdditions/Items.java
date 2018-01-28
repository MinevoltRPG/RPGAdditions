package me.drkmatr1984.RPGAdditions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import com.chrismin13.additionsapi.events.AdditionsAPIInitializationEvent;
import me.drkmatr1984.RPGAdditions.daggers.*;
import me.drkmatr1984.RPGAdditions.ores.SilverIngot;
import me.drkmatr1984.RPGAdditions.ores.SilverNugget;
import me.drkmatr1984.RPGAdditions.swords.BoneSword;
import me.drkmatr1984.RPGAdditions.swords.GlowstoneSword;
import me.drkmatr1984.RPGAdditions.swords.QuartzSword;
import me.drkmatr1984.RPGAdditions.swords.SilverSword;

public class Items implements Listener { // Class must implement Listener
	
	private RPGAdditions plugin;
	
	public Items(RPGAdditions plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInitialization(AdditionsAPIInitializationEvent event) {
		// Adds the Resource Pack from the plugin's jar. Don't forget to include the .zip extendsion!
		event.addResourcePackFromPlugin(plugin, "RPGAdditions-v1.0.zip");
		//################    Daggers    ##################
		event.addCustomItem(new DiamondDagger());
		event.addCustomItem(new GoldDagger());
		event.addCustomItem(new StoneDagger());
		event.addCustomItem(new IronDagger());
		event.addCustomItem(new EmeraldDagger());
		event.addCustomItem(new AcaciaWoodDagger());
		event.addCustomItem(new BigOakWoodDagger());
		event.addCustomItem(new BirchWoodDagger());
		event.addCustomItem(new BoneDagger());
		event.addCustomItem(new ClayDagger());
		event.addCustomItem(new CoalDagger());
		event.addCustomItem(new EndStoneDagger());
		event.addCustomItem(new GlowstoneDagger());
		event.addCustomItem(new JungleWoodDagger());
		event.addCustomItem(new LapisDagger());
		event.addCustomItem(new NetherrackDagger());
		event.addCustomItem(new OakWoodDagger());
		event.addCustomItem(new ObsidianDagger());
		event.addCustomItem(new PrismarineDagger());
		event.addCustomItem(new QuartzDagger());
		event.addCustomItem(new RedstoneDagger());
		event.addCustomItem(new SlimeDagger());
		event.addCustomItem(new SpruceWoodDagger());
		
		//################    Swords    ##################
		event.addCustomItem(new GlowstoneSword());
		event.addCustomItem(new QuartzSword());
		event.addCustomItem(new BoneSword());
		event.addCustomItem(new SilverSword());
		
		//################    Ores    ##################
		event.addCustomItem(new SilverNugget());
		event.addCustomItem(new SilverIngot());
	}
	
}