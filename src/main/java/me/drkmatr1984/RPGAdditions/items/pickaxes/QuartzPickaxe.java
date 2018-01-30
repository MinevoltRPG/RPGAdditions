package me.drkmatr1984.RPGAdditions.items.pickaxes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Pickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class QuartzPickaxe extends Pickaxe {

	public QuartzPickaxe() {
		super(DamageableItem.DIAMOND_PICKAXE, 251, "quartz_pickaxe", "Quartz Pickaxe", new MaterialData(Material.QUARTZ), new MaterialData(Material.STICK));
		addAttackDamage(5.0);    //Attack Damage
	}
}