package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class BoneDagger extends Dagger {
	
	public BoneDagger() {
		super(DamageableItem.WOODEN_SWORD, 243, "bone_dagger", "Bone Dagger", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(3.0);
	}
}