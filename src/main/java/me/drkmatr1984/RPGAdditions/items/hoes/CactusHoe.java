package me.drkmatr1984.RPGAdditions.items.hoes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Hoe;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusHoe extends Hoe {

	public CactusHoe() {
		super(DamageableItem.STONE_HOE, 118, 3.0, "cactus_hoe", "Cactus Hoe", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(1.0);    //Attack Damage
	}
}