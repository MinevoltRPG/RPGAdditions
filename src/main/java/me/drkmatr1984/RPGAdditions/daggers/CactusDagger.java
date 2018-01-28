package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusDagger extends Dagger {
	
	public CactusDagger() {
		super(DamageableItem.STONE_SWORD, 101, "cactus_dagger", "Cactus Dagger", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(3.0);
	}
}