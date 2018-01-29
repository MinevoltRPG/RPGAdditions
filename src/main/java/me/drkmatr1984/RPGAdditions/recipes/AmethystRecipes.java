package me.drkmatr1984.RPGAdditions.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.inventivetalent.recipebuilder.ShapedRecipeBuilder;

import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.items.ores.Amethyst;
import me.drkmatr1984.RPGAdditions.items.swords.AmethystSword;

public class AmethystRecipes{
	
	public static void amethystItems(ImmutableList<CustomItem> customItems) 
	{
		ItemStack amethyst = null;
		ItemStack amethystSword = null;
		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Amethyst) {
				amethyst = new CustomItemStack(cItem).getItemStack();
			}
			if(cItem instanceof AmethystSword) {
				amethystSword = new CustomItemStack(cItem).getItemStack();
			}
		}
		
		if(amethyst!=null){
			if(amethystSword!=null) {
				new ShapedRecipeBuilder().forResult(amethystSword).withShape("xax", "xax", "xsx").withIngredient('a', amethyst).withIngredient('s', Material.STICK).register();
			}
		}
	}
	
}
