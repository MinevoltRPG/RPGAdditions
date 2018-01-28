package me.drkmatr1984.RPGAdditions.swords;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import me.drkmatr1984.RPGAdditions.customitemtypes.Sword;
import us.fihgu.toolbox.item.DamageableItem;

public class CactusSword extends Sword {
	
	public CactusSword() {
		super(DamageableItem.STONE_SWORD, 118, "cactus_sword", "Cactus Sword", new MaterialData(Material.CACTUS), new MaterialData(Material.STICK));
		addAttackDamage(6.0);		
	}
}