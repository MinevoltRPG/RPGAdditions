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
import me.drkmatr1984.RPGAdditions.items.doubleaxes.AmethystDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.BloodstoneDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.BoneDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.CactusDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.CitrineDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.GlowstoneDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.OnyxDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.QuartzDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.RubyDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.SapphireDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.SilverDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.YellowTopazDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.*;
import me.drkmatr1984.RPGAdditions.items.ores.*;
import me.drkmatr1984.RPGAdditions.items.pickaxes.*;
import me.drkmatr1984.RPGAdditions.items.shovels.*;
import me.drkmatr1984.RPGAdditions.items.sickels.AmethystSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.BloodstoneSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.BoneSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.CactusSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.CitrineSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.GlowstoneSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.OnyxSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.QuartzSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.RubySickle;
import me.drkmatr1984.RPGAdditions.items.sickels.SapphireSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.SilverSickle;
import me.drkmatr1984.RPGAdditions.items.sickels.YellowTopazSickle;
import me.drkmatr1984.RPGAdditions.items.swords.*;
import me.drkmatr1984.RPGAdditions.items.axes.*;
import me.drkmatr1984.RPGAdditions.items.chisels.AmethystChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.BloodstoneChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.BoneChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.CactusChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.CitrineChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.GlowstoneChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.OnyxChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.QuartzChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.RubyChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.SapphireChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.SilverChisel;
import me.drkmatr1984.RPGAdditions.items.chisels.YellowTopazChisel;

public class Items implements Listener { // Class must implement Listener
	
	private RPGAdditions plugin;
	
	public Items(RPGAdditions plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInitialization(AdditionsAPIInitializationEvent event) {
		// Adds the Resource Pack from the plugin's jar. Don't forget to include the .zip extendsion!
		
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
		
		event.addCustomItem(new AmethystDagger());		
		event.addCustomItem(new BloodstoneDagger());
		event.addCustomItem(new BoneDagger());
		event.addCustomItem(new CactusDagger());
		event.addCustomItem(new CitrineDagger());
		event.addCustomItem(new DiamondDagger());
		event.addCustomItem(new EmeraldDagger());
		event.addCustomItem(new GlowstoneDagger());
		event.addCustomItem(new GoldDagger());		
		event.addCustomItem(new IronDagger());
		event.addCustomItem(new OakWoodDagger());
		event.addCustomItem(new OnyxDagger());
		event.addCustomItem(new QuartzDagger());
		event.addCustomItem(new RubyDagger());
		event.addCustomItem(new SapphireDagger());
		event.addCustomItem(new SilverDagger());
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
		
		//#########  VanillaAdditions Items  ###########
		
		if(RPGAdditions.getInstance().isVanillaAdditions()) {
			//################     Daggers   ##################
			event.addCustomItem(new AcaciaWoodDagger());
			event.addCustomItem(new BigOakWoodDagger());
			event.addCustomItem(new BirchWoodDagger());
			event.addCustomItem(new ClayDagger());
			event.addCustomItem(new CoalDagger());
			event.addCustomItem(new EndStoneDagger());
			event.addCustomItem(new JungleWoodDagger());
			event.addCustomItem(new LapisDagger());
			event.addCustomItem(new NetherrackDagger());
			event.addCustomItem(new ObsidianDagger());
			event.addCustomItem(new PrismarineDagger());
			event.addCustomItem(new RedstoneDagger());
			event.addCustomItem(new SlimeDagger());
			event.addCustomItem(new SpruceWoodDagger());
			
			//################     Chisels   ##################
			event.addCustomItem(new AmethystChisel());
			event.addCustomItem(new BloodstoneChisel());
			event.addCustomItem(new BoneChisel());
			event.addCustomItem(new CactusChisel());
			event.addCustomItem(new CitrineChisel());
			event.addCustomItem(new GlowstoneChisel());
			event.addCustomItem(new OnyxChisel());
			event.addCustomItem(new QuartzChisel());
			event.addCustomItem(new RubyChisel());
			event.addCustomItem(new SapphireChisel());
			event.addCustomItem(new SilverChisel());
			event.addCustomItem(new YellowTopazChisel());
		
			//################     Sickles   ##################
			event.addCustomItem(new AmethystSickle());
			event.addCustomItem(new BloodstoneSickle());
			event.addCustomItem(new BoneSickle());
			event.addCustomItem(new CactusSickle());
			event.addCustomItem(new CitrineSickle());
			event.addCustomItem(new GlowstoneSickle());
			event.addCustomItem(new OnyxSickle());
			event.addCustomItem(new QuartzSickle());
			event.addCustomItem(new RubySickle());
			event.addCustomItem(new SapphireSickle());
			event.addCustomItem(new SilverSickle());
			event.addCustomItem(new YellowTopazSickle());
		
			//################  Double Axes  ##################
			event.addCustomItem(new AmethystDoubleAxe());
			event.addCustomItem(new BloodstoneDoubleAxe());
			event.addCustomItem(new BoneDoubleAxe());
			event.addCustomItem(new CactusDoubleAxe());
			event.addCustomItem(new CitrineDoubleAxe());
			event.addCustomItem(new GlowstoneDoubleAxe());
			event.addCustomItem(new OnyxDoubleAxe());
			event.addCustomItem(new QuartzDoubleAxe());
			event.addCustomItem(new RubyDoubleAxe());
			event.addCustomItem(new SapphireDoubleAxe());
			event.addCustomItem(new SilverDoubleAxe());
			event.addCustomItem(new YellowTopazDoubleAxe());
			
		}
		event.addResourcePackFromPlugin(plugin, "rpgadditions-v1.1.zip");
	}
	
}