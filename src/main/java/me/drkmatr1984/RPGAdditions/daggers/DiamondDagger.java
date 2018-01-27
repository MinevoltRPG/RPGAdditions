package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class DiamondDagger extends Dagger {

	public DiamondDagger() {		
		super(DamageableItem.DIAMOND_SWORD, 1494, "diamond_dagger", "Diamond Dagger", new MaterialData(Material.DIAMOND), new MaterialData(Material.STICK));
		addAttackDamage(4.0); // This will set the Attack Damage to 4.
	}
}