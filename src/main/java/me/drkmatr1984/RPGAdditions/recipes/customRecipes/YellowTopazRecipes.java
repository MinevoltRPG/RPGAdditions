package me.drkmatr1984.RPGAdditions.recipes.customRecipes;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.YellowTopazAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.YellowTopazChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.YellowTopazDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.YellowTopazDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.YellowTopazHoe;
import me.drkmatr1984.RPGAdditions.items.ores.YellowTopaz;
import me.drkmatr1984.RPGAdditions.items.pickaxes.YellowTopazPickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.YellowTopazShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.YellowTopazSickle;
import me.drkmatr1984.RPGAdditions.items.swords.YellowTopazSword;
import me.drkmatr1984.RPGAdditions.recipes.CustomRecipes;

public class YellowTopazRecipes{
	
	public static void yellowTopazItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack yellowTopaz = null;		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof YellowTopaz) {
				yellowTopaz = new CustomItemStack(cItem);
			}
		}
		if(yellowTopaz!=null){
			for(CustomItem cItem : customItems) {
				if(cItem instanceof YellowTopazSword) {
					CustomRecipes.registerCustomSwordRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
				}
				if(cItem instanceof YellowTopazAxe) {
					CustomRecipes.registerCustomAxeRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
				}
				if(cItem instanceof YellowTopazPickaxe) {
					CustomRecipes.registerCustomPickaxeRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
				}
				if(cItem instanceof YellowTopazShovel) {
					CustomRecipes.registerCustomShovelRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
				}
				if(cItem instanceof YellowTopazHoe) {
					CustomRecipes.registerCustomHoeRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
				}
				if(cItem instanceof YellowTopazDagger) {
					CustomRecipes.registerCustomDaggerRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof YellowTopazChisel) {
						CustomRecipes.registerCustomChiselRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
					}
					if(cItem instanceof YellowTopazDoubleAxe) {
						CustomRecipes.registerCustomDoubleAxeRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
					}
					if(cItem instanceof YellowTopazSickle) {
						CustomRecipes.registerCustomSickleRecipe(new CustomItemStack(cItem), yellowTopaz, Material.STICK);
					}
				}
			}
		}
	}	
}