package me.drkmatr1984.RPGAdditions.items.axes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Axe;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusAxe extends Axe {
	
	public CactusAxe() {
		super(DamageableItem.STONE_AXE, 118, 0.9, "cactus_axe", "Cactus Axe", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(9.0);		
	}
}