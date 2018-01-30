package me.drkmatr1984.RPGAdditions.items.chisels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Chisel;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzChisel extends Chisel {

	public QuartzChisel() {
		super(DamageableItem.DIAMOND_PICKAXE, 251, "quartz_chisel", "Quartz Chisel", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(5.0);    //Attack Damage
	}
}