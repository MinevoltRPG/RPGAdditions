package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneDagger extends Dagger {
	
	public GlowstoneDagger() {
		super(DamageableItem.STONE_SWORD, 45, "glowstone_dagger", "Glowstone Dagger", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(3.0);    //Attack Damage
	}
}