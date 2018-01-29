package me.drkmatr1984.RPGAdditions.items.axes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Axe;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneAxe extends Axe {

	public GlowstoneAxe() {
		super(DamageableItem.STONE_AXE, 59, 0.9, "glowstone_axe", "Glowstone Axe", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(9.0);
	}
}