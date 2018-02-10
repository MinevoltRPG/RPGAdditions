package me.drkmatr1984.RPGAdditions.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.inventivetalent.recipebuilderlib.ShapedRecipeBuilder;

import com.chrismin13.additionsapi.items.CustomItemStack;

public class CustomRecipes
{
	/////////         daggers
	
	public static void registerCustomDaggerRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "bss").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "ssb").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
	}
	
	public static void registerCustomDaggerRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "bss").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "ssb").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomDaggerRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "bss").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "ssb").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	/////////         swords
	
	public static void registerCustomSwordRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxs", "sxs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();		
	}
	
	public static void registerCustomSwordRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxs", "sxs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomSwordRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxs", "sxs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	//////////         axes
	
	public static void registerCustomAxeRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxx", "sbx", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxs", "xbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
	}
	
	public static void registerCustomAxeRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxx", "sbx", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxs", "xbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomAxeRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxx", "sbx", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxs", "xbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	///////////       Pickaxes
	
	public static void registerCustomPickaxeRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxx", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
	}
	
	public static void registerCustomPickaxeRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxx", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomPickaxeRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxx", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	///////////       Hoes
	
	public static void registerCustomHoeRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxx", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxs", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
	}
	
	public static void registerCustomHoeRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxx", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxs", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomHoeRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxx", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxs", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	///////////      Shovels
	
	public static void registerCustomShovelRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxs", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
	}
	
	public static void registerCustomShovelRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxs", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomShovelRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sxs", "sbs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	//////////       Chisels
	
	public static void registerCustomChiselRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
	}
	
	public static void registerCustomChiselRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomChiselRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("sss", "sxs", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	//////////        Double Axes
	
	public static void registerCustomDoubleAxeRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxx", "xbx", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle.getItemStack()).register();
	}
	
	public static void registerCustomDoubleAxeRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxx", "xbx", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomDoubleAxeRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xxx", "xbx", "sbs").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	///////////        Sickle
	
	public static void registerCustomSickleRecipe(CustomItemStack result, CustomItemStack head, CustomItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xdx", "xxd", "sdx").withIngredient('d', head.getItemStack()).withIngredient('s', handle.getItemStack()).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xdx", "dxx", "xds").withIngredient('d', head.getItemStack()).withIngredient('s', handle.getItemStack()).register();
	}
	
	public static void registerCustomSickleRecipe(CustomItemStack result, CustomItemStack head, ItemStack handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xdx", "xxd", "sdx").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xdx", "dxx", "xds").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
	
	public static void registerCustomSickleRecipe(CustomItemStack result, CustomItemStack head, Material handle) {
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xdx", "xxd", "sdx").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
		new ShapedRecipeBuilder().forResult(result.getItemStack()).withShape("xdx", "dxx", "xds").withIngredient('x', head.getItemStack()).withIngredient('b', handle).register();
	}
}