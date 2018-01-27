package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class EmeraldDagger extends Dagger {

	public EmeraldDagger() {
		super(DamageableItem.DIAMOND_SWORD, 2924,"emerald_dagger", "Emerald Dagger", new MaterialData(Material.EMERALD), new MaterialData(Material.STICK));
		addAttackDamage(4.0);    //Attack Damage
	}
}