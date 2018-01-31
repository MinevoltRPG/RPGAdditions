package me.drkmatr1984.RPGAdditions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import com.chrismin13.additionsapi.events.AdditionsAPIInitializationEvent;

import me.drkmatr1984.RPGAdditions.items.daggers.AcaciaWoodDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.AmethystDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.BigOakWoodDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.BirchWoodDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.BloodstoneDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.BoneDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.CactusDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.CitrineDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.ClayDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.CoalDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.DiamondDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.EmeraldDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.EndStoneDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.GlowstoneDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.GoldDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.IronDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.JungleWoodDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.LapisDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.NetherrackDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.OakWoodDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.ObsidianDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.OnyxDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.PrismarineDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.QuartzDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.RedstoneDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.RubyDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.SapphireDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.SilverDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.SlimeDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.SpruceWoodDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.StoneDagger;
import me.drkmatr1984.RPGAdditions.items.daggers.YellowTopazDagger;
import me.drkmatr1984.RPGAdditions.items.hoes.*;
import me.drkmatr1984.RPGAdditions.items.ores.*;
import me.drkmatr1984.RPGAdditions.items.pickaxes.*;
import me.drkmatr1984.RPGAdditions.items.shovels.*;
import me.drkmatr1984.RPGAdditions.items.swords.*;
import me.drkmatr1984.RPGAdditions.items.axes.*;

public class Items implements Listener { // Class must implement Listener
	
	private RPGAdditions plugin;
	
	public Items(RPGAdditions plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInitialization(AdditionsAPIInitializationEvent event) {
		// Adds the Resource Pack from the plugin's jar. Don't forget to include the .zip extendsion!
		event.addResourcePackFromPlugin(plugin, "RPGAdditions-v1.0.zip");
		
		//################      Axes     ##################
		event.addCustomItem(new AmethystAxe());
		event.addCustomItem(new BloodstoneAxe());
		event.addCustomItem(new BoneAxe());
		event.addCustomItem(new CactusAxe());
		event.addCustomItem(new CitrineAxe());
		event.addCustomItem(new GlowstoneAxe());
		event.addCustomItem(new OnyxAxe());
		event.addCustomItem(new QuartzAxe());
		event.addCustomItem(new RubyAxe());
		event.addCustomItem(new SapphireAxe());
		event.addCustomItem(new SilverAxe());
		event.addCustomItem(new YellowTopazAxe());
		
		//################    Shovels    ##################
		event.addCustomItem(new AmethystShovel());
		event.addCustomItem(new BloodstoneShovel());
		event.addCustomItem(new BoneShovel());
		event.addCustomItem(new CactusShovel());
		event.addCustomItem(new CitrineShovel());
		event.addCustomItem(new GlowstoneShovel());
		event.addCustomItem(new OnyxShovel());
		event.addCustomItem(new QuartzShovel());
		event.addCustomItem(new RubyShovel());
		event.addCustomItem(new SapphireShovel());
		event.addCustomItem(new SilverShovel());
		event.addCustomItem(new YellowTopazShovel());
		
		//################    Pickaxes   ##################
		event.addCustomItem(new AmethystPickaxe());
		event.addCustomItem(new BloodstonePickaxe());
		event.addCustomItem(new BonePickaxe());
		event.addCustomItem(new CactusPickaxe());
		event.addCustomItem(new CitrinePickaxe());
		event.addCustomItem(new GlowstonePickaxe());
		event.addCustomItem(new OnyxPickaxe());
		event.addCustomItem(new QuartzPickaxe());
		event.addCustomItem(new RubyPickaxe());
		event.addCustomItem(new SapphirePickaxe());
		event.addCustomItem(new SilverPickaxe());
		event.addCustomItem(new YellowTopazPickaxe());
		
		//################      Hoes     ##################
		event.addCustomItem(new AmethystHoe());
		event.addCustomItem(new BloodstoneHoe());
		event.addCustomItem(new BoneHoe());
		event.addCustomItem(new CactusHoe());
		event.addCustomItem(new CitrineHoe());
		event.addCustomItem(new GlowstoneHoe());
		event.addCustomItem(new OnyxHoe());
		event.addCustomItem(new QuartzHoe());
		event.addCustomItem(new RubyHoe());
		event.addCustomItem(new SapphireHoe());
		event.addCustomItem(new SilverHoe());
		event.addCustomItem(new YellowTopazHoe());
		
		//################    Daggers    ##################
		event.addCustomItem(new AcaciaWoodDagger());
		event.addCustomItem(new AmethystDagger());
		event.addCustomItem(new BigOakWoodDagger());
		event.addCustomItem(new BirchWoodDagger());
		event.addCustomItem(new BloodstoneDagger());
		event.addCustomItem(new BoneDagger());
		event.addCustomItem(new CactusDagger());
		event.addCustomItem(new CitrineDagger());
		event.addCustomItem(new ClayDagger());
		event.addCustomItem(new CoalDagger());
		event.addCustomItem(new DiamondDagger());
		event.addCustomItem(new EmeraldDagger());
		event.addCustomItem(new EndStoneDagger());
		event.addCustomItem(new GlowstoneDagger());
		event.addCustomItem(new GoldDagger());		
		event.addCustomItem(new IronDagger());
		event.addCustomItem(new JungleWoodDagger());
		event.addCustomItem(new LapisDagger());
		event.addCustomItem(new NetherrackDagger());
		event.addCustomItem(new OakWoodDagger());
		event.addCustomItem(new ObsidianDagger());
		event.addCustomItem(new OnyxDagger());
		event.addCustomItem(new PrismarineDagger());
		event.addCustomItem(new QuartzDagger());
		event.addCustomItem(new RedstoneDagger());
		event.addCustomItem(new RubyDagger());
		event.addCustomItem(new SapphireDagger());
		event.addCustomItem(new SilverDagger());
		event.addCustomItem(new SlimeDagger());
		event.addCustomItem(new SpruceWoodDagger());
		event.addCustomItem(new StoneDagger());
		event.addCustomItem(new YellowTopazDagger());
		
		//################    Swords    ##################
		event.addCustomItem(new AmethystSword());
		event.addCustomItem(new BloodstoneSword());
		event.addCustomItem(new BoneSword());
		event.addCustomItem(new CactusSword());
		event.addCustomItem(new CitrineSword());
		event.addCustomItem(new GlowstoneSword());
		event.addCustomItem(new OnyxSword());
		event.addCustomItem(new QuartzSword());
		event.addCustomItem(new RubySword());
		event.addCustomItem(new SapphireSword());
		event.addCustomItem(new SilverSword());
		event.addCustomItem(new YellowTopazSword());
		
		//################    Ores    ##################
		event.addCustomItem(new Amethyst());
		event.addCustomItem(new Bloodstone());
		event.addCustomItem(new Citrine());
		event.addCustomItem(new Onyx());
		event.addCustomItem(new Ruby());
		event.addCustomItem(new Sapphire());
		event.addCustomItem(new SilverNugget());
		event.addCustomItem(new SilverIngot());
		event.addCustomItem(new YellowTopaz());
		
		//#########  VanillaAdditions Items  ###########
		
		//Don't forget to do the daggers!
		if(RPGAdditions.getInstance().isVanillaAdditions()) {
		
			//################     Chisels   ##################
		
		
			//################     Sickles   ##################
		
		
			//################  Double Axes  ##################
		
		}
	}
	
}