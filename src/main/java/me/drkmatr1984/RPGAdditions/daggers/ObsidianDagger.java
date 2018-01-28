package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.material.MaterialData;

import com.comphenix.attribute.Attributes;

import me.drkmatr1984.RPGAdditions.customitemtypes.Dagger;
import us.fihgu.toolbox.item.DamageableItem;

public class ObsidianDagger extends Dagger {
	
	public ObsidianDagger() {
		super(DamageableItem.IRON_SWORD, 5498, "obsidian_dagger", "Obsidian Dagger", new MaterialData(Material.OBSIDIAN), new MaterialData(Material.OBSIDIAN));
		addAttackDamage(3.0);    //Attack Damage
		addAttribute(Attributes.AttributeType.GENERIC_KNOCKBACK_RESISTANCE, 0.1D, EquipmentSlot.HAND, Attributes.Operation.ADD_NUMBER);
	}
}