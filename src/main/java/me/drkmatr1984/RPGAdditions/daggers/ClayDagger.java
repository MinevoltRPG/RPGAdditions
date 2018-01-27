package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class ClayDagger extends Dagger {
	
	public ClayDagger() {
		super(DamageableItem.WOODEN_SWORD, 25, "clay_dagger", "Clay Dagger", new MaterialData(Material.CLAY_BALL), new MaterialData(Material.STICK));
		addAttackDamage(2.0);    //Attack Damage
	}
}