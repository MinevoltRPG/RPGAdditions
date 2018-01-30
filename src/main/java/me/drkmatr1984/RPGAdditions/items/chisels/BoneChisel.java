package me.drkmatr1984.RPGAdditions.items.chisels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Chisel;
import us.fihgu.toolbox.item.DamageableItem;

public class BoneChisel extends Chisel {

	public BoneChisel() {
		super(DamageableItem.WOODEN_PICKAXE, 285, "bone_chisel", "Bone Chisel", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(4.0);    //Attack Damage
	}
}