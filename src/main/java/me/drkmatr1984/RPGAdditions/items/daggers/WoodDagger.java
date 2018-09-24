package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

@SuppressWarnings("deprecation")
public class WoodDagger extends Dagger{

	public WoodDagger(String identifier, String name, TreeSpecies species) {
		super(DamageableItem.WOODEN_SWORD, 50, identifier, name, new MaterialData(Material.LEGACY_WOOD , species.getData()), new MaterialData(Material.STICK));
		addAttackDamage(2.0);    //Attack Damage
	}

}