package me.drkmatr1984.RPGAdditions.items.swords;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Sword;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneSword extends Sword {

	public GlowstoneSword() {
		super(DamageableItem.STONE_SWORD, 118, "glowstone_sword", "Glowstone Sword", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(6.0);
	}
}