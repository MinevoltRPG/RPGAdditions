package me.drkmatr1984.RPGAdditions.items.shovels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Shovel;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneShovel extends Shovel {

	public GlowstoneShovel() {
		super(DamageableItem.STONE_SHOVEL, 118, "glowstone_shovel", "Glowstone Shovel", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(4.5);    //Attack Damage
	}
}