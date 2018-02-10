package me.drkmatr1984.RPGAdditions.recipes;

import org.inventivetalent.recipebuilderlib.FurnaceRecipeBuilder;

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
    
	public void silverFurnaceRecipes(){
		SilverNugget silverNugget = null;
		SilverHoe silverHoe = null;
		SilverShovel silverShovel = null;
		SilverAxe silverAxe = null;
		SilverPickaxe silverPickaxe = null;
		SilverSword silverSword = null;
		SilverDagger silverDagger = null;
		SilverChisel silverChisel = null;
		SilverDoubleAxe silverDoubleAxe = null;
		SilverSickle silverSickle = null;
    	for(CustomItem cItem : this.customItems) {
    		if(cItem instanceof SilverNugget) {
    			silverNugget = (SilverNugget) cItem;
    		} 		
    	}
    	if(silverNugget!=null) {
    		for(CustomItem cItem : this.customItems) {
    			if(cItem instanceof SilverHoe) {
    				silverHoe = (SilverHoe) cItem;
    				new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverHoe).getItemStack()).withExp((float)0.1).register();
    				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
    					, silverHoe.getMaterial(), new CustomItemStack(silverHoe).getItemStack()
    					.getDurability(), (float)0.1));*/
    			}
    			if(cItem instanceof SilverShovel) {
    				silverShovel = (SilverShovel) cItem;
    				new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverShovel).getItemStack()).withExp((float)0.1).register();
    				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
    					, silverShovel.getMaterial(), new CustomItemStack(silverShovel).getItemStack()
    					.getDurability(), (float)0.1));*/
    			}
    			if(cItem instanceof SilverPickaxe) {
    				silverPickaxe = (SilverPickaxe) cItem;
    				new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverPickaxe).getItemStack()).withExp((float)0.1).register();
    				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
    					, silverPickAxe.getMaterial(), new CustomItemStack(silverPickAxe).getItemStack()
    					.getDurability(), (float)0.1));*/
    			}
    			if(cItem instanceof SilverAxe) {
    				silverAxe = (SilverAxe) cItem;
    				new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverAxe).getItemStack()).withExp((float)0.1).register();
    				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
    					, silverAxe.getMaterial(), new CustomItemStack(silverAxe).getItemStack()
    					.getDurability(), (float)0.1));*/
    			}
    			if(cItem instanceof SilverSword) {
    				silverSword = (SilverSword) cItem;
    				new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverSword).getItemStack()).withExp((float)0.1).register();
    				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
    					, silverSword.getMaterial(), new CustomItemStack(silverSword).getItemStack()
    					.getDurability(), (float)0.1));*/
    			}
    			if(cItem instanceof SilverDagger) {
    				silverDagger = (SilverDagger) cItem;
    				new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverDagger).getItemStack()).withExp((float)0.1).register();
    				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
    					, silverDagger.getMaterial(), new CustomItemStack(silverDagger).getItemStack()
    					.getDurability(), (float)0.1));*/
    			}
    			if(RPGAdditions.getInstance().isVanillaAdditions()) {
    				if(cItem instanceof SilverChisel) {
    	    			silverChisel = (SilverChisel) cItem;
    	    			new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverChisel).getItemStack()).withExp((float)0.1).register();
        				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
        					, silverChisel.getMaterial(), new CustomItemStack(silverChisel).getItemStack()
        					.getDurability(), (float)0.1));*/
    	    		}
    	    		if(cItem instanceof SilverDoubleAxe) {
    	    			silverDoubleAxe = (SilverDoubleAxe) cItem;
    	    			new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverDoubleAxe).getItemStack()).withExp((float)0.1).register();
        				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
        					, silverDoubleAxe.getMaterial(), new CustomItemStack(silverDoubleAxe).getItemStack()
        					.getDurability(), (float)0.1));*/
    	    		}
    	    		if(cItem instanceof SilverSickle) {
    	    			silverSickle = (SilverSickle) cItem;
    	    			new FurnaceRecipeBuilder().forResult(new CustomItemStack(silverNugget).getItemStack()).withInput(new CustomItemStack(silverSickle).getItemStack()).withExp((float)0.1).register();
        				/*Bukkit.addRecipe(new FurnaceRecipe(new CustomItemStack(silverNugget).getItemStack()
        					, silverSickle.getMaterial(), new CustomItemStack(silverSickle).getItemStack()
        					.getDurability(), (float)0.1));*/
    	    		}
    			}    		
	    	}
    	}    
    }

}
