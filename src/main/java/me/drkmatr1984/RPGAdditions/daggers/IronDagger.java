package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class IronDagger extends Dagger {

	public IronDagger() {
		super(DamageableItem.IRON_SWORD, 218, "iron_dagger", "Iron Dagger", new MaterialData(Material.IRON_INGOT), new MaterialData(Material.STICK));
		addAttackDamage(3.0);    //Attack Damage
	}
}