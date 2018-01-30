package me.drkmatr1984.RPGAdditions.items.sickels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Sickle;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneSickle extends Sickle {

	public GlowstoneSickle() {
		super(DamageableItem.STONE_HOE, 118, 3, 3.0, "glowstone_sickle", "Glowstone Sickle", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(1.0);    //Attack Damage
	}
}