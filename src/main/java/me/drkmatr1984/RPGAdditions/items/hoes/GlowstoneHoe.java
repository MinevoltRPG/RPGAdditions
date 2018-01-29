package me.drkmatr1984.RPGAdditions.items.hoes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Hoe;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneHoe extends Hoe {

	public GlowstoneHoe() {
		super(DamageableItem.STONE_HOE, 118, 3.0, "glowstone_hoe", "Glowstone Hoe", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(1.0);    //Attack Damage
	}
}