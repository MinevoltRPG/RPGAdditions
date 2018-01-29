package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class StoneDagger extends Dagger {

	public StoneDagger() {
		super(DamageableItem.STONE_SWORD, 115, "stone_dagger", "Stone Dagger", new MaterialData(Material.COBBLESTONE), new MaterialData(Material.STICK));
		addAttackDamage(2.5);    //Attack Damage
	}
}