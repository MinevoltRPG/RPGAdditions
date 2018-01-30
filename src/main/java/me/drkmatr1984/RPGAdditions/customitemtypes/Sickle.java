package me.drkmatr1984.RPGAdditions.customitemtypes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;

import us.fihgu.toolbox.item.DamageableItem;

public class Sickle extends CustomSickle {
	
	@SuppressWarnings("deprecation")
	public Sickle(DamageableItem damageable, int durability, int breakRadius, double attackSpeed, String identifier, String name, MaterialData blade, MaterialData handle) {
		super(damageable, durability, breakRadius, attackSpeed, identifier, name);
		addCustomRecipe(new CustomShapedRecipe().setShape("xdx", "xxd", "sdx").setIngredient('x', Material.AIR)
				.setIngredient('d', new RecipeIngredient(blade.getItemType(), blade.getData())).setIngredient('s', new RecipeIngredient(handle.getItemType(), handle.getData())));
		addCustomRecipe(new CustomShapedRecipe().setShape("xdx", "dxx", "xds").setIngredient('x', Material.AIR)
				.setIngredient('d', new RecipeIngredient(blade.getItemType(), blade.getData())).setIngredient('s', new RecipeIngredient(handle.getItemType(), handle.getData())));
	}
}