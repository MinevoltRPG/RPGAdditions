package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class CoalDagger extends Dagger {
	
	public CoalDagger() {
		super(DamageableItem.WOODEN_SWORD, 102, "coal_dagger", "Coal Dagger", new MaterialData(Material.COAL), new MaterialData(Material.STICK));
		setBurnTime(1 * 100 + 2 * 800);
		addAttackDamage(2.0);    //Attack Damage
	}
}