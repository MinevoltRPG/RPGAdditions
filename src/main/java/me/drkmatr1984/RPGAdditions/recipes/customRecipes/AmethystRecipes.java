package me.drkmatr1984.RPGAdditions.recipes.customRecipes;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.AmethystAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.AmethystChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.AmethystDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.AmethystDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.AmethystHoe;
import me.drkmatr1984.RPGAdditions.items.ores.Amethyst;
import me.drkmatr1984.RPGAdditions.items.pickaxes.AmethystPickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.AmethystShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.AmethystSickle;
import me.drkmatr1984.RPGAdditions.items.swords.AmethystSword;
import me.drkmatr1984.RPGAdditions.recipes.CustomRecipes;

public class AmethystRecipes{
	
	public static void amethystItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack amethyst = null;		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Amethyst) {
				amethyst = new CustomItemStack(cItem);
			}
		}
		if(amethyst!=null){
			for(CustomItem cItem : customItems) {
				if(cItem instanceof AmethystSword) {
					CustomRecipes.registerCustomSwordRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
				}
				if(cItem instanceof AmethystAxe) {
					CustomRecipes.registerCustomAxeRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
				}
				if(cItem instanceof AmethystPickaxe) {
					CustomRecipes.registerCustomPickaxeRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
				}
				if(cItem instanceof AmethystShovel) {
					CustomRecipes.registerCustomShovelRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
				}
				if(cItem instanceof AmethystHoe) {
					CustomRecipes.registerCustomHoeRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
				}
				if(cItem instanceof AmethystDagger) {
					CustomRecipes.registerCustomDaggerRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof AmethystChisel) {
						CustomRecipes.registerCustomChiselRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
					}
					if(cItem instanceof AmethystDoubleAxe) {
						CustomRecipes.registerCustomDoubleAxeRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
					}
					if(cItem instanceof AmethystSickle) {
						CustomRecipes.registerCustomSickleRecipe(new CustomItemStack(cItem), amethyst, Material.STICK);
					}
				}
			}
		}
	}	
}
