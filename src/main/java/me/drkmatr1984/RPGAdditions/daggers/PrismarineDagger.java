package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class PrismarineDagger extends Dagger {
	
	public PrismarineDagger() {
		super(DamageableItem.DIAMOND_SWORD, 207, "prismarine_dagger", "Prismarine Dagger", new MaterialData(Material.PRISMARINE_SHARD), new MaterialData(Material.STICK));
		addAttackDamage(3.5);    //Attack Damage
	}
}