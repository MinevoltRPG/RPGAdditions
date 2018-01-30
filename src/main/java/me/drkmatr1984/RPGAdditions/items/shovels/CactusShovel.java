package me.drkmatr1984.RPGAdditions.items.shovels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Shovel;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusShovel extends Shovel {

	public CactusShovel() {
		super(DamageableItem.STONE_SHOVEL, 118, "cactus_shovel", "Cactus Shovel", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(4.5);    //Attack Damage
	}
}