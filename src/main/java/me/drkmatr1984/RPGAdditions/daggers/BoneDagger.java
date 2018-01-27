package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class BoneDagger extends Dagger {
	
	public BoneDagger() {
		super(DamageableItem.WOODEN_SWORD, 243, "bone_dagger", "Bone Dagger", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(3.0);
	}
}