package me.drkmatr1984.RPGAdditions.items.daggers;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

@SuppressWarnings("deprecation")
public class LapisDagger extends Dagger {
	
	public LapisDagger() {
		super(DamageableItem.IRON_SWORD, 45, "lapis_dagger", "Lapis Dagger", new MaterialData(Material.LAPIS_LAZULI), new MaterialData(Material.STICK));
		addAttackDamage(3.0);    //Attack Damage
	}
}