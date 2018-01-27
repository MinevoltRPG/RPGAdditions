package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class EndStoneDagger extends Dagger {
	
	public EndStoneDagger() {
		super(DamageableItem.STONE_SWORD, 218, "end_stone_dagger", "End Stone Dagger", new MaterialData(Material.ENDER_STONE), new MaterialData(Material.STICK));
		addAttackDamage(2.5);    //Attack Damage
	}
}