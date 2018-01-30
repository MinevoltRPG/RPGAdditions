package me.drkmatr1984.RPGAdditions.items.sickels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Sickle;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusSickle extends Sickle {

	public CactusSickle() {
		super(DamageableItem.STONE_HOE, 118, 3, 3.0, "cactus_sickle", "Cactus Sickle", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(1.0);    //Attack Damage
	}
}