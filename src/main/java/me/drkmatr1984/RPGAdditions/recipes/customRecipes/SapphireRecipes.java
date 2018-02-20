package me.drkmatr1984.RPGAdditions.recipes.customRecipes;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.SapphireAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.SapphireChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.SapphireDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.SapphireDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.SapphireHoe;
import me.drkmatr1984.RPGAdditions.items.ores.Sapphire;
import me.drkmatr1984.RPGAdditions.items.pickaxes.SapphirePickaxe;
import me.drkmatr1984.RPGAdditions.items.shovels.SapphireShovel;
import me.drkmatr1984.RPGAdditions.items.sickels.SapphireSickle;
import me.drkmatr1984.RPGAdditions.items.swords.SapphireSword;
import me.drkmatr1984.RPGAdditions.recipes.CustomRecipes;

public class SapphireRecipes{
	
	public static void sapphireItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItemStack sapphire = null;		
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Sapphire) {
				sapphire = new CustomItemStack(cItem);
			}
		}
		if(sapphire!=null){
			for(CustomItem cItem : customItems) {
				if(cItem instanceof SapphireSword) {
					CustomRecipes.registerCustomSwordRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
				}
				if(cItem instanceof SapphireAxe) {
					CustomRecipes.registerCustomAxeRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
				}
				if(cItem instanceof SapphirePickaxe) {
					CustomRecipes.registerCustomPickaxeRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
				}
				if(cItem instanceof SapphireShovel) {
					CustomRecipes.registerCustomShovelRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
				}
				if(cItem instanceof SapphireHoe) {
					CustomRecipes.registerCustomHoeRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
				}
				if(cItem instanceof SapphireDagger) {
					CustomRecipes.registerCustomDaggerRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
				}
				if(RPGAdditions.getInstance().isVanillaAdditions()) {
					if(cItem instanceof SapphireChisel) {
						CustomRecipes.registerCustomChiselRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
					}
					if(cItem instanceof SapphireDoubleAxe) {
						CustomRecipes.registerCustomDoubleAxeRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
					}
					if(cItem instanceof SapphireSickle) {
						CustomRecipes.registerCustomSickleRecipe(new CustomItemStack(cItem), sapphire, Material.STICK);
					}
				}
			}
		}
	}	
}