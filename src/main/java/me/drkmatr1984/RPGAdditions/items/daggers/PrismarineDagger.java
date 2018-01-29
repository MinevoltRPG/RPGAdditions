package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class PrismarineDagger extends Dagger {
	
	public PrismarineDagger() {
		super(DamageableItem.DIAMOND_SWORD, 207, "prismarine_dagger", "Prismarine Dagger", new MaterialData(Material.PRISMARINE_SHARD), new MaterialData(Material.STICK));
		addAttackDamage(3.5);    //Attack Damage
	}
}