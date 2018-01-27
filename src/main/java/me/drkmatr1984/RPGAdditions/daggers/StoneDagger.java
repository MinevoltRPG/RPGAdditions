package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class StoneDagger extends Dagger {

	public StoneDagger() {
		super(DamageableItem.STONE_SWORD, 115, "stone_dagger", "Stone Dagger", new MaterialData(Material.COBBLESTONE), new MaterialData(Material.STICK));
		addAttackDamage(2.5);    //Attack Damage
	}
}