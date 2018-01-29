package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class NetherrackDagger extends Dagger {

	public NetherrackDagger() {
		super(DamageableItem.STONE_SWORD, 45, "netherrack_dagger", "Netherrack Dagger", new MaterialData(Material.NETHERRACK), new MaterialData(Material.STICK));
		addAttackDamage(2.5);    //Attack Damage
	}
}