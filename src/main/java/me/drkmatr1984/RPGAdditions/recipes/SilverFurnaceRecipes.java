package me.drkmatr1984.RPGAdditions.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;

import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.SilverAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.SilverChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.SilverDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.SilverDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.SilverHoe;
import me.drkmatr1984.RPGAdditions.items.ores.SilverNugget;
import me.drkmatr1984.RPGAdditions.items.pickaxes.SilverPickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.SilverShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.SilverSickle;
import me.drkmatr1984.RPGAdditions.items.swords.SilverSword;

public class SilverFurnaceRecipes{
	
	private ImmutableList<CustomItem> customItems;
    
	public SilverFurnaceRecipes(ImmutableList<CustomItem> customItems) {
		this.customItems = customItems;
	}
    
	@SuppressWarnings("deprecation")
	public void silverFurnaceRecipes(){
		SilverNugget silverNugget = null;
		SilverHoe silverHoe = null;
		SilverShovel silverShovel = null;
		SilverAxe silverAxe = null;
		SilverPickaxe silverPickAxe = null;
		SilverSword silverSword = null;
		SilverDagger silverDagger = null;
    	for(CustomItem cItem : this.customItems) {
    		if(cItem instanceof SilverNugget) {
    			silverNugget = (SilverNugget) cItem;
    		}
    		if(cItem instanceof SilverHoe) {
    			silverHoe = (SilverHoe) cItem;
    		}
    		if(cItem instanceof SilverShovel) {
    			silverShovel = (SilverShovel) cItem;
    		}
    	}
    	if(silverNugget!=null) {
    		if(silverShovel!=null) {
    			Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack(), silverShovel.getMaterial(), new CustomItemStack(silverShovel).getItemStack().getDurability(), (float)0.1));
    		}
    		if(silverHoe!=null) {
    			Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack(), silverShovel.getMaterial(), new CustomItemStack(silverHoe).getItemStack().getDurability(), (float)0.1));
    		}
    	}
    	//add chisels...etc
    	if(RPGAdditions.getInstance().isVanillaAdditions()) {
    		SilverChisel silverChisel = null;
    		SilverDoubleAxe silverDoubleAxe = null;
    		SilverSickle silverSickle = null;
    		if(silverNugget!=null) {
    			for(CustomItem cItem : this.customItems) {
    	    		if(cItem instanceof SilverChisel) {
    	    			silverChisel = (SilverChisel) cItem;
    	    		}
    	    		if(cItem instanceof SilverDoubleAxe) {
    	    			silverDoubleAxe = (SilverDoubleAxe) cItem;
    	    		}
    	    	}
    		}
		}     
    }
    
}