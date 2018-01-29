package me.drkmatr1984.RPGAdditions.items.axes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Axe;
import us.fihgu.toolbox.item.DamageableItem;

public class BoneAxe extends Axe {

	public BoneAxe() {
		super(DamageableItem.WOODEN_AXE, 285, 0.9, "bone_axe", "Bone Axe", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(9.0);    //Attack Damage
	}
}