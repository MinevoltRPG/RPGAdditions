package me.drkmatr1984.RPGAdditions.customitemtypes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;

import us.fihgu.toolbox.item.DamageableItem;

public class DoubleAxe extends CustomDoubleAxe {
	
	@SuppressWarnings("deprecation")
	public DoubleAxe(DamageableItem damageable, int durability, double attackSpeed, String identifier, String name, MaterialData blade, MaterialData handle) {
		super(damageable, durability, attackSpeed, identifier, name);
		addCustomRecipe(new CustomShapedRecipe().setShape("ddd", "dsd", "xsx").setIngredient('x', Material.AIR)
				.setIngredient('d', new RecipeIngredient(blade.getItemType(), blade.getData())).setIngredient('s', new RecipeIngredient(handle.getItemType(), handle.getData())));
	}
}