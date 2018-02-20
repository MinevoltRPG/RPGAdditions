package me.drkmatr1984.RPGAdditions.recipes.customRecipes;

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
import me.drkmatr1984.RPGAdditions.recipes.CustomRecipes;

public class SilverRecipes{
	
	public static void silverItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack silverNugget = null;
		CustomItemStack silverIngot = null;
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
					CustomRecipes.registerCustomSwordRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
				}
				if(cItem instanceof SilverDagger) {
					CustomRecipes.registerCustomDaggerRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
				}
				if(cItem instanceof SilverAxe) {
					CustomRecipes.registerCustomAxeRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
				}
				if(cItem instanceof SilverHoe) {
					CustomRecipes.registerCustomHoeRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
				}
				if(cItem instanceof SilverShovel) {
					CustomRecipes.registerCustomShovelRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
				}
				if(cItem instanceof SilverPickaxe) {
					CustomRecipes.registerCustomPickaxeRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof SilverChisel) {
						CustomRecipes.registerCustomChiselRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
					}
					if(cItem instanceof SilverDoubleAxe) {
						CustomRecipes.registerCustomDoubleAxeRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
					}
					if(cItem instanceof SilverSickle) {
						CustomRecipes.registerCustomSickleRecipe(new CustomItemStack(cItem), silverIngot, Material.STICK);
					}
				}				
			}
		}
	}
}