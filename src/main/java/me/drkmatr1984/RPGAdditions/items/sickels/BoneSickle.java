package me.drkmatr1984.RPGAdditions.items.sickels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Sickle;
import us.fihgu.toolbox.item.DamageableItem;

public class BoneSickle extends Sickle {

	public BoneSickle() {
		super(DamageableItem.WOODEN_HOE, 285, 3, 3.0, "bone_sickle", "Bone Sickle", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(1.0);    //Attack Damage
	}
}