package me.drkmatr1984.RPGAdditions.swords;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class QuartzSword extends Sword {
	
	public QuartzSword() {
		super(DamageableItem.DIAMOND_SWORD, 251, "quartz_sword", "Quartz Sword", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(6.0);		
	}
}