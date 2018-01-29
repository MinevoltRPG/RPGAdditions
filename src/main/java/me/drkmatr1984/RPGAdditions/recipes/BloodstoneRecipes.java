package me.drkmatr1984.RPGAdditions.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.inventivetalent.recipebuilder.ShapedRecipeBuilder;

import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.ores.Bloodstone;
import me.drkmatr1984.RPGAdditions.swords.BloodstoneSword;

public class BloodstoneRecipes{
	
	public static void bloodstoneItems(ImmutableList<CustomItem> customItems) 
	{
		ItemStack bloodstone = null;
		ItemStack bloodstoneSword = null;
		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Bloodstone) {
				bloodstone = new CustomItemStack(cItem).getItemStack();
			}
			if(cItem instanceof BloodstoneSword) {
				bloodstoneSword = new CustomItemStack(cItem).getItemStack();
			}
		}
		
		if(bloodstone!=null){
			if(bloodstoneSword!=null) {
				new ShapedRecipeBuilder().forResult(bloodstoneSword).withShape("xax", "xax", "xsx").withIngredient('a', bloodstone).withIngredient('s', Material.STICK).register();
			}
		}
	}
	
}
