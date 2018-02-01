package me.drkmatr1984.RPGAdditions.recipes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.inventivetalent.recipebuilder.ShapedRecipeBuilder;

import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;
import com.google.common.collect.ImmutableList;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import me.drkmatr1984.RPGAdditions.customitemtypes.Ore;
import me.drkmatr1984.RPGAdditions.items.axes.SilverAxe;
import me.drkmatr1984.RPGAdditions.items.daggers.SilverDagger;
import me.drkmatr1984.RPGAdditions.items.ores.SilverIngot;
import me.drkmatr1984.RPGAdditions.items.ores.SilverNugget;
import me.drkmatr1984.RPGAdditions.items.swords.SilverSword;

public class SilverRecipes{
	
	private static ItemStack ingotStack = null;

	public static void silverItems(ImmutableList<CustomItem> customItems) 
	{
		CustomItem silverNugget = null;
		CustomItem silverIngot = null;
		CustomItem customSilverSword = null;
		CustomItem customSilverDagger = null;
		CustomItem customSilverAxe = null;
		CustomItem customSilverHoe = null;
		CustomItem customSilverShovel = null;
		for(CustomItem cItem : customItems) {
			if(cItem instanceof Ore) {
				if(cItem instanceof SilverIngot) {
					silverIngot = cItem;
				}
				if(cItem instanceof SilverNugget) {
					silverNugget = cItem;
				}
			}			
			if(cItem instanceof CustomSword) {
				if(cItem instanceof SilverSword) {
					customSilverSword = cItem;
				}
			}
			if(cItem instanceof CustomDagger) {
				if(cItem instanceof SilverDagger) {
					customSilverDagger = cItem;
				}
			}
			if(cItem instanceof CustomAxe) {
				if(cItem instanceof SilverAxe) {
					customSilverAxe = cItem;
				}
			}
		}
		if(silverNugget!=null && silverIngot!=null) {
			ingotStack = new CustomItemStack(silverIngot).getItemStack();
			ItemStack nuggetStack = new CustomItemStack(silverNugget).getItemStack();
			if(RPGAdditions.getInstance().isWerewolf()) {
				setWerewolfSilverItems(silverIngot, nuggetStack);
			}else {
				new ShapedRecipeBuilder().forResult(ingotStack).withShape("sss", "sss", "sss").withIngredient('s', new CustomItemStack(nuggetStack).getItemStack()).register();
			}
			if(customSilverSword!=null) {
				if(RPGAdditions.getInstance().isWerewolf()) {
					setWerewolfSilverItems(customSilverSword, ingotStack);
				}else {
					new ShapedRecipeBuilder().forResult((new CustomItemStack(customSilverSword)).getItemStack()).withShape("sxs", "sxs", "sbs").withIngredient('x', ingotStack).withIngredient('b', Material.STICK).register();
				}				
			}
			if(customSilverDagger!=null) {
				if(RPGAdditions.getInstance().isWerewolf()) {
					setWerewolfSilverItems(customSilverDagger, ingotStack);
				}else {
					new ShapedRecipeBuilder().forResult((new CustomItemStack(customSilverDagger)).getItemStack()).withShape("sss", "sxs", "bss").withIngredient('x', ingotStack).withIngredient('b', Material.STICK).register();
				}
			}
			if(customSilverAxe!=null) {
				if(RPGAdditions.getInstance().isWerewolf()) {
					setWerewolfSilverItems(customSilverAxe, ingotStack);
				}else {
					new ShapedRecipeBuilder().forResult((new CustomItemStack(customSilverAxe)).getItemStack()).withShape("sxx", "sbx", "sbs").withIngredient('x', ingotStack).withIngredient('b', Material.STICK).register();
					new ShapedRecipeBuilder().forResult((new CustomItemStack(customSilverAxe)).getItemStack()).withShape("xxs", "xbs", "sbs").withIngredient('x', ingotStack).withIngredient('b', Material.STICK).register();
				}
			}
		}
	}
	
	private static void setWerewolfSilverItems(CustomItem customItem, ItemStack silverIngredient) {
		//Match Lore for Silver Items with Werewolf Silver Item Lore
		ItemMeta werewolfMeta = us.rfsmassacre.Werewolf.WerewolfPlugin.getItemManager().getWerewolfItem(us.rfsmassacre.Werewolf.Items.WerewolfItem.WerewolfItemType.SILVER_SWORD).getItemMeta();				
		ItemStack silverItem = (new CustomItemStack(customItem)).getItemStack();
		ItemMeta silverMeta = null;
		if(silverItem.hasItemMeta()) {
			silverMeta = silverItem.getItemMeta();
			if(!silverMeta.hasDisplayName()) {
				if(werewolfMeta.hasDisplayName()) {
					silverMeta.setDisplayName(werewolfMeta.getDisplayName());
				}				
			}
		}			
		List<String> lore = new ArrayList<String>();
		if (werewolfMeta.hasLore()) {
			for(String s : werewolfMeta.getLore()) {
				lore.add(s);					
			}
			if(silverMeta.hasLore()) {
				for(String s : silverMeta.getLore()) {
					lore.add(s);
				}
			}
		}
		silverMeta.setLore(lore);
		silverItem.setItemMeta(silverMeta);
		if(customItem instanceof SilverIngot) {
			new ShapedRecipeBuilder().forResult(silverItem).withShape("sss", "sss", "sss").withIngredient('s', silverIngredient).register();
			ingotStack = silverItem;
		}
		if(customItem instanceof SilverSword) {
			new ShapedRecipeBuilder().forResult(silverItem).withShape("sxs", "sxs", "sbs").withIngredient('x', silverIngredient).withIngredient('b', Material.STICK).register();
		}
		if(customItem instanceof SilverDagger) {
			new ShapedRecipeBuilder().forResult(silverItem).withShape("sss", "sxs", "ssb").withIngredient('x', silverIngredient).withIngredient('b', Material.STICK).register();
			new ShapedRecipeBuilder().forResult(silverItem).withShape("sss", "sxs", "bss").withIngredient('x', silverIngredient).withIngredient('b', Material.STICK).register();
		}
		if(customItem instanceof SilverAxe) {
			new ShapedRecipeBuilder().forResult(silverItem).withShape("xxs", "xbs", "sbs").withIngredient('x', silverIngredient).withIngredient('b', Material.STICK).register();
			new ShapedRecipeBuilder().forResult(silverItem).withShape("sxx", "sbx", "sbs").withIngredient('x', silverIngredient).withIngredient('b', Material.STICK).register();
		}
		Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&aRPG&eAdditions&f] &6Werewolf &adetected. Silver Weapons will do extra damage to werewolves!"));
	}
	
}