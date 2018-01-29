package me.drkmatr1984.RPGAdditions.items.pickaxes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Pickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class BonePickaxe extends Pickaxe {

	public BonePickaxe() {
		super(DamageableItem.WOODEN_PICKAXE, 285, "bone_pickaxe", "Bone Pickaxe", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(4.0);    //Attack Damage
	}
}