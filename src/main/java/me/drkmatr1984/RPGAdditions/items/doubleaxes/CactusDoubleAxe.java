package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.DoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusDoubleAxe extends DoubleAxe {
	
	public CactusDoubleAxe() {
		super(DamageableItem.STONE_AXE, 118, 0.9, "cactus_double_axe", "Cactus Double Axe", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(9.0);		
	}
}