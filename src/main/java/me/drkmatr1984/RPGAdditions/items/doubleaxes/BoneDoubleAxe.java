package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.DoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class BoneDoubleAxe extends DoubleAxe {

	public BoneDoubleAxe() {
		super(DamageableItem.WOODEN_AXE, 285, 0.9, "bone_double_axe", "Bone Double Axe", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(9.0);    //Attack Damage
	}
}