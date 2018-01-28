package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class GoldDagger extends Dagger {

	public GoldDagger() {
		super(DamageableItem.GOLDEN_SWORD, 30, "gold_dagger", "Gold Dagger", new MaterialData(Material.GOLD_INGOT), new MaterialData(Material.STICK));
		addAttackDamage(2.0);    //Attack Damage
	}
}