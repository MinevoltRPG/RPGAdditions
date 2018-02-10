package me.drkmatr1984.RPGAdditions.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.inventivetalent.recipebuilderlib.ShapedRecipeBuilder;

import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.customitemtypes.Ore;
import me.drkmatr1984.RPGAdditions.items.axes.SilverAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.SilverChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.SilverDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.SilverDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.SilverHoe;
import me.drkmatr1984.RPGAdditions.items.ores.SilverIngot;
import me.drkmatr1984.RPGAdditions.items.ores.SilverNugget;
import me.drkmatr1984.RPGAdditions.items.pickaxes.SilverPickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.SilverShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.SilverSickle;
import me.drkmatr1984.RPGAdditions.items.swords.SilverSword;

public class SilverRecipes{
	
	public static void silverItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack silverNugget = null;
		CustomItemStack silverIngot = null;
		CustomItemStack customSilverSword = null;
		CustomItemStack customSilverDagger = null;
		CustomItemStack customSilverAxe = null;
		CustomItemStack customSilverHoe = null;
		CustomItemStack customSilverShovel = null;
		CustomItemStack customSilverPickaxe = null;
		CustomItemStack customSilverChisel = null;
		CustomItemStack customSilverDoubleAxe = null;
		CustomItemStack customSilverSickle = null;
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Ore) {
				if(cItem instanceof SilverIngot) {
					silverIngot = new CustomItemStack(cItem);
				}
				if(cItem instanceof SilverNugget) {
					silverNugget = new CustomItemStack(cItem);
				}
			}
		}
		if(silverNugget!=null && silverIngot!=null) {
			ItemStack ingotStack = silverIngot.getItemStack();
			new ShapedRecipeBuilder().forResult(ingotStack).withShape("sss", "sss", "sss").withIngredient('s', silverNugget.getItemStack()).register();
			for(CustomItem cItem : customItems) {
				if(cItem instanceof SilverSword) {
					customSilverSword = new CustomItemStack(cItem);
				}
				if(cItem instanceof SilverDagger) {
					customSilverDagger = new CustomItemStack(cItem);
				}
				if(cItem instanceof SilverAxe) {
					customSilverAxe = new CustomItemStack(cItem);
				}
				if(cItem instanceof SilverHoe) {
					customSilverHoe = new CustomItemStack(cItem);
				}
				if(cItem instanceof SilverShovel) {
					customSilverShovel = new CustomItemStack(cItem);
				}
				if(cItem instanceof SilverPickaxe) {
					customSilverPickaxe = new CustomItemStack(cItem);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof SilverChisel) {
						customSilverChisel = new CustomItemStack(cItem);
					}
					if(cItem instanceof SilverDoubleAxe) {
						customSilverDoubleAxe = new CustomItemStack(cItem);
					}
					if(cItem instanceof SilverSickle) {
						customSilverSickle = new CustomItemStack(cItem);
					}
				}				
			}
			if(customSilverSword!=null) {
				CustomRecipes.registerCustomSwordRecipe(customSilverSword, silverIngot, Material.STICK);				
			}
			if(customSilverDagger!=null) {
				CustomRecipes.registerCustomDaggerRecipe(customSilverDagger, silverIngot, Material.STICK);
			}
			if(customSilverAxe!=null) {
				CustomRecipes.registerCustomAxeRecipe(customSilverAxe, silverIngot, Material.STICK);
			}
			if(customSilverHoe!=null) {
				CustomRecipes.registerCustomHoeRecipe(customSilverHoe, silverIngot, Material.STICK);
			}
			if(customSilverShovel!=null) {
				CustomRecipes.registerCustomShovelRecipe(customSilverShovel, silverIngot, Material.STICK);
			}
			if(customSilverPickaxe!=null) {
				CustomRecipes.registerCustomPickaxeRecipe(customSilverPickaxe, silverIngot, Material.STICK);
			}
			if(RPGAdditions.getInstance().isVanillaAdditions()) {
				if(customSilverChisel!=null) {
					CustomRecipes.registerCustomChiselRecipe(customSilverChisel, silverIngot, Material.STICK);
				}
				if(customSilverDoubleAxe!=null) {
					CustomRecipes.registerCustomDoubleAxeRecipe(customSilverDoubleAxe, silverIngot, Material.STICK);
				}
				if(customSilverSickle!=null) {
					CustomRecipes.registerCustomSickleRecipe(customSilverSickle, silverIngot, Material.STICK);
				}
			}
		}
	}
}