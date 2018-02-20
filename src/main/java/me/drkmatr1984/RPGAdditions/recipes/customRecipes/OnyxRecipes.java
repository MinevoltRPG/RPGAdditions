package me.drkmatr1984.RPGAdditions.recipes.customRecipes;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.OnyxAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.OnyxChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.OnyxDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.OnyxDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.OnyxHoe;
import me.drkmatr1984.RPGAdditions.items.ores.Onyx;
import me.drkmatr1984.RPGAdditions.items.pickaxes.OnyxPickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.OnyxShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.OnyxSickle;
import me.drkmatr1984.RPGAdditions.items.swords.OnyxSword;
import me.drkmatr1984.RPGAdditions.recipes.CustomRecipes;

public class OnyxRecipes{
	
	public static void onyxItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack onyx = null;		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Onyx) {
				onyx = new CustomItemStack(cItem);
			}
		}
		if(onyx!=null){
			for(CustomItem cItem : customItems) {
				if(cItem instanceof OnyxSword) {
					CustomRecipes.registerCustomSwordRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
				}
				if(cItem instanceof OnyxAxe) {
					CustomRecipes.registerCustomAxeRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
				}
				if(cItem instanceof OnyxPickaxe) {
					CustomRecipes.registerCustomPickaxeRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
				}
				if(cItem instanceof OnyxShovel) {
					CustomRecipes.registerCustomShovelRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
				}
				if(cItem instanceof OnyxHoe) {
					CustomRecipes.registerCustomHoeRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
				}
				if(cItem instanceof OnyxDagger) {
					CustomRecipes.registerCustomDaggerRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof OnyxChisel) {
						CustomRecipes.registerCustomChiselRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
					}
					if(cItem instanceof OnyxDoubleAxe) {
						CustomRecipes.registerCustomDoubleAxeRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
					}
					if(cItem instanceof OnyxSickle) {
						CustomRecipes.registerCustomSickleRecipe(new CustomItemStack(cItem), onyx, Material.STICK);
					}
				}
			}
		}
	}	
}