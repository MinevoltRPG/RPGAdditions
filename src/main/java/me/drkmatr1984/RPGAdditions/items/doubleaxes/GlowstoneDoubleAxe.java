package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.DoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneDoubleAxe extends DoubleAxe {

	public GlowstoneDoubleAxe() {
		super(DamageableItem.STONE_AXE, 59, 0.9, "glowstone_double_axe", "Glowstone Double Axe", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(9.0);
	}
}