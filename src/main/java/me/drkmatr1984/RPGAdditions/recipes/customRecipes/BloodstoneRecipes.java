package me.drkmatr1984.RPGAdditions.recipes.customRecipes;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.BloodstoneAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.BloodstoneChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.BloodstoneDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.BloodstoneDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.BloodstoneHoe;
import me.drkmatr1984.RPGAdditions.items.ores.Bloodstone;
import me.drkmatr1984.RPGAdditions.items.pickaxes.BloodstonePickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.BloodstoneShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.BloodstoneSickle;
import me.drkmatr1984.RPGAdditions.items.swords.BloodstoneSword;
import me.drkmatr1984.RPGAdditions.recipes.CustomRecipes;

public class BloodstoneRecipes{
	
	public static void bloodstoneItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack bloodstone = null;		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Bloodstone) {
				bloodstone = new CustomItemStack(cItem);
			}
		}
		if(bloodstone!=null){
			for(CustomItem cItem : customItems) {
				if(cItem instanceof BloodstoneSword) {
					CustomRecipes.registerCustomSwordRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
				}
				if(cItem instanceof BloodstoneAxe) {
					CustomRecipes.registerCustomAxeRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
				}
				if(cItem instanceof BloodstonePickaxe) {
					CustomRecipes.registerCustomPickaxeRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
				}
				if(cItem instanceof BloodstoneShovel) {
					CustomRecipes.registerCustomShovelRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
				}
				if(cItem instanceof BloodstoneHoe) {
					CustomRecipes.registerCustomHoeRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
				}
				if(cItem instanceof BloodstoneDagger) {
					CustomRecipes.registerCustomDaggerRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof BloodstoneChisel) {
						CustomRecipes.registerCustomChiselRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
					}
					if(cItem instanceof BloodstoneDoubleAxe) {
						CustomRecipes.registerCustomDoubleAxeRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
					}
					if(cItem instanceof BloodstoneSickle) {
						CustomRecipes.registerCustomSickleRecipe(new CustomItemStack(cItem), bloodstone, Material.STICK);
					}
				}
			}
		}
	}	
}