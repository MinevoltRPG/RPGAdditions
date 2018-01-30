package me.drkmatr1984.RPGAdditions.items.pickaxes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Pickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class GlowstonePickaxe extends Pickaxe {

	public GlowstonePickaxe() {
		super(DamageableItem.STONE_PICKAXE, 118, "glowstone_pickaxe", "Glowstone Pickaxe", new MaterialData(Material.GLOWSTONE_DUST), new MaterialData(Material.STICK));
		addAttackDamage(4.0);    //Attack Damage
	}
}