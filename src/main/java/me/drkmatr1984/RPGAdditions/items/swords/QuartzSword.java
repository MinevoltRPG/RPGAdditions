package me.drkmatr1984.RPGAdditions.items.swords;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Sword;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzSword extends Sword {
	
	public QuartzSword() {
		super(DamageableItem.DIAMOND_SWORD, 251, "quartz_sword", "Quartz Sword", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(6.0);		
	}
}