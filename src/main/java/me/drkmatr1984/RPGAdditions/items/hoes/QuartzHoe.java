package me.drkmatr1984.RPGAdditions.items.hoes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Hoe;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzHoe extends Hoe {

	public QuartzHoe() {
		super(DamageableItem.DIAMOND_HOE, 251, 4.0, "quartz_hoe", "Quartz Hoe", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(1.0);    //Attack Damage
	}
}