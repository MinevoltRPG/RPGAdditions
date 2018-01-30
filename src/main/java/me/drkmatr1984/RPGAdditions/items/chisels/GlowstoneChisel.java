package me.drkmatr1984.RPGAdditions.items.chisels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Chisel;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneChisel extends Chisel {

	public GlowstoneChisel() {
		super(DamageableItem.STONE_PICKAXE, 118, "glowstone_chisel", "Glowstone Chisel", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(4.0);    //Attack Damage
	}
}