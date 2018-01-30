package me.drkmatr1984.RPGAdditions.items.shovels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Shovel;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzShovel extends Shovel {

	public QuartzShovel() {
		super(DamageableItem.DIAMOND_SHOVEL, 251, "quartz_shovel", "Quartz Shovel", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(5.5);    //Attack Damage
	}
}