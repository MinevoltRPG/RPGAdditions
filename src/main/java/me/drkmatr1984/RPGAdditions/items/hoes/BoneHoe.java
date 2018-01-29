package me.drkmatr1984.RPGAdditions.items.hoes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Hoe;
import us.fihgu.toolbox.item.DamageableItem;

public class BoneHoe extends Hoe {

	public BoneHoe() {
		super(DamageableItem.WOODEN_HOE, 285, 3.0, "bone_hoe", "Bone Hoe", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(1.0);    //Attack Damage
	}
}