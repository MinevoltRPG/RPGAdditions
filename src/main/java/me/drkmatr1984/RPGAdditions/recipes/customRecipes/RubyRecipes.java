package me.drkmatr1984.RPGAdditions.recipes.customRecipes;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.RubyAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.RubyChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.RubyDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.RubyDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.RubyHoe;
import me.drkmatr1984.RPGAdditions.items.ores.Ruby;
import me.drkmatr1984.RPGAdditions.items.pickaxes.RubyPickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.RubyShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.RubySickle;
import me.drkmatr1984.RPGAdditions.items.swords.RubySword;
import me.drkmatr1984.RPGAdditions.recipes.CustomRecipes;

public class RubyRecipes{
	
	public static void rubyItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack ruby = null;		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Ruby) {
				ruby = new CustomItemStack(cItem);
			}
		}
		if(ruby!=null){
			for(CustomItem cItem : customItems) {
				if(cItem instanceof RubySword) {
					CustomRecipes.registerCustomSwordRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
				}
				if(cItem instanceof RubyAxe) {
					CustomRecipes.registerCustomAxeRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
				}
				if(cItem instanceof RubyPickaxe) {
					CustomRecipes.registerCustomPickaxeRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
				}
				if(cItem instanceof RubyShovel) {
					CustomRecipes.registerCustomShovelRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
				}
				if(cItem instanceof RubyHoe) {
					CustomRecipes.registerCustomHoeRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
				}
				if(cItem instanceof RubyDagger) {
					CustomRecipes.registerCustomDaggerRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof RubyChisel) {
						CustomRecipes.registerCustomChiselRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
					}
					if(cItem instanceof RubyDoubleAxe) {
						CustomRecipes.registerCustomDoubleAxeRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
					}
					if(cItem instanceof RubySickle) {
						CustomRecipes.registerCustomSickleRecipe(new CustomItemStack(cItem), ruby, Material.STICK);
					}
				}
			}
		}
	}	
}