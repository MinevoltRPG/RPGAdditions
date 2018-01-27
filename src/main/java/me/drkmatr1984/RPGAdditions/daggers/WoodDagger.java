package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class WoodDagger extends Dagger{

	@SuppressWarnings("deprecation")
	public WoodDagger(String identifier, String name, TreeSpecies species) {
		super(DamageableItem.WOODEN_SWORD, 50, identifier, name, new MaterialData(Material.WOOD , species.getData()), new MaterialData(Material.STICK));
		addAttackDamage(2.0);    //Attack Damage
	}

}