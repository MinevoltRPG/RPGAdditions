package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.DoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzDoubleAxe extends DoubleAxe {
	
	public QuartzDoubleAxe() {
		super(DamageableItem.DIAMOND_AXE, 251, 1.0, "quartz_double_axe", "Quartz Double Axe", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(9.0);		
	}
}