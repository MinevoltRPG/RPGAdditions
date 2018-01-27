package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneDagger extends Dagger {
	
	public RedstoneDagger() {
		super(DamageableItem.STONE_SWORD, 109, "redstone_dagger", "Redstone Dagger", new MaterialData(Material.REDSTONE), new MaterialData(Material.REDSTONE));
		addAttackDamage(2.5);    //Attack Damage
	}
}