package me.drkmatr1984.RPGAdditions.items.sickels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Sickle;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzSickle extends Sickle {

	public QuartzSickle() {
		super(DamageableItem.DIAMOND_HOE, 251, 5 , 4.0, "quartz_sickle", "Quartz Sickle", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(1.0);    //Attack Damage
	}
}