package me.drkmatr1984.RPGAdditions.swords;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class BoneSword extends Sword {

	public BoneSword() {
		super(DamageableItem.WOODEN_SWORD, 285, "bone_sword", "Bone Sword", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(6.0);    //Attack Damage
	}
}