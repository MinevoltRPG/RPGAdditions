package me.drkmatr1984.RPGAdditions.items.shovels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Shovel;
import us.fihgu.toolbox.item.DamageableItem;

public class BoneShovel extends Shovel {

	public BoneShovel() {
		super(DamageableItem.WOODEN_SHOVEL, 285, "bone_shovel", "Bone Shovel", new MaterialData(Material.BONE_BLOCK), new MaterialData(Material.BONE));
		addAttackDamage(4.5);    //Attack Damage
	}
}