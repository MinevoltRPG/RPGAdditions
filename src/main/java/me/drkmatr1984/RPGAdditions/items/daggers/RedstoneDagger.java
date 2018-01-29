package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneDagger extends Dagger {
	
	public RedstoneDagger() {
		super(DamageableItem.STONE_SWORD, 109, "redstone_dagger", "Redstone Dagger", new MaterialData(Material.REDSTONE), new MaterialData(Material.STICK));
		addAttackDamage(2.5);    //Attack Damage
	}
}