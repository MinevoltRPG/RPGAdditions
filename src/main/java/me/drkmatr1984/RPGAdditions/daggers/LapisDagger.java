package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import us.fihgu.toolbox.item.DamageableItem;

public class LapisDagger extends Dagger {
	
	public LapisDagger() {
		super(DamageableItem.IRON_SWORD, 45, "lapis_dagger", "Lapis Dagger", new MaterialData(Material.INK_SACK, (byte)4), new MaterialData(Material.STICK));
		addAttackDamage(3.0);    //Attack Damage
	}
}