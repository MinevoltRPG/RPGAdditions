package me.drkmatr1984.RPGAdditions.items.axes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Axe;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzAxe extends Axe {
	
	public QuartzAxe() {
		super(DamageableItem.DIAMOND_AXE, 251, 0.9, "quartz_axe", "Quartz Axe", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(9.0);		
	}
}