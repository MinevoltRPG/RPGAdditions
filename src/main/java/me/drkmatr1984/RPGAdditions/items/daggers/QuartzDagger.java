package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzDagger extends Dagger {
	
	public QuartzDagger() {
		super(DamageableItem.DIAMOND_SWORD, 203, "quartz_dagger", "Quartz Dagger", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(3.5);    //Attack Damage
	}
}