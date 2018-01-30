package me.drkmatr1984.RPGAdditions.items.pickaxes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Pickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusPickaxe extends Pickaxe {

	public CactusPickaxe() {
		super(DamageableItem.STONE_PICKAXE, 118, "cactus_pickaxe", "Cactus Pickaxe", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(4.0);    //Attack Damage
	}
}