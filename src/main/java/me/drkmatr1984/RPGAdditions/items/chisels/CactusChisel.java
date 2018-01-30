package me.drkmatr1984.RPGAdditions.items.chisels;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Chisel;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusChisel extends Chisel {

	public CactusChisel() {
		super(DamageableItem.STONE_PICKAXE, 118, "cactus_chisel", "Cactus Chisel", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(4.0);    //Attack Damage
	}
}