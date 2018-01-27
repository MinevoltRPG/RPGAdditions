package me.drkmatr1984.RPGAdditions.daggers;

import org.bukkit.Material;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.material.MaterialData;

import com.comphenix.attribute.Attributes;

import us.fihgu.toolbox.item.DamageableItem;

public class SlimeDagger extends Dagger {
	
	public SlimeDagger() {
		super(DamageableItem.WOODEN_SWORD, 45, "slime_dagger", "Slime Dagger", new MaterialData(Material.SLIME_BALL), new MaterialData(Material.STICK));
		addAttackDamage(2.0);    //Attack Damage
		addAttribute(Attributes.AttributeType.GENERIC_KNOCKBACK_RESISTANCE, -0.1D, EquipmentSlot.HAND, Attributes.Operation.ADD_NUMBER);
	}
}