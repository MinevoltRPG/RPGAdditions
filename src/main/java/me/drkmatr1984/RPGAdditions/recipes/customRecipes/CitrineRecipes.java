package me.drkmatr1984.RPGAdditions.recipes.customRecipes;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.CitrineAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.CitrineChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.CitrineDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.CitrineDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.CitrineHoe;
import me.drkmatr1984.RPGAdditions.items.ores.Citrine;
import me.drkmatr1984.RPGAdditions.items.pickaxes.CitrinePickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.CitrineShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.CitrineSickle;
import me.drkmatr1984.RPGAdditions.items.swords.CitrineSword;
import me.drkmatr1984.RPGAdditions.recipes.CustomRecipes;

public class CitrineRecipes{
	
	public static void citrineItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack citrine = null;		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Citrine) {
				citrine = new CustomItemStack(cItem);
			}
		}
		if(citrine!=null){
			for(CustomItem cItem : customItems) {
				if(cItem instanceof CitrineSword) {
					CustomRecipes.registerCustomSwordRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
				}
				if(cItem instanceof CitrineAxe) {
					CustomRecipes.registerCustomAxeRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
				}
				if(cItem instanceof CitrinePickaxe) {
					CustomRecipes.registerCustomPickaxeRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
				}
				if(cItem instanceof CitrineShovel) {
					CustomRecipes.registerCustomShovelRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
				}
				if(cItem instanceof CitrineHoe) {
					CustomRecipes.registerCustomHoeRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
				}
				if(cItem instanceof CitrineDagger) {
					CustomRecipes.registerCustomDaggerRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof CitrineChisel) {
						CustomRecipes.registerCustomChiselRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
					}
					if(cItem instanceof CitrineDoubleAxe) {
						CustomRecipes.registerCustomDoubleAxeRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
					}
					if(cItem instanceof CitrineSickle) {
						CustomRecipes.registerCustomSickleRecipe(new CustomItemStack(cItem), citrine, Material.STICK);
					}
				}
			}
		}
	}	
}