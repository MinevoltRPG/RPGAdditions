package me.drkmatr1984.RPGAdditions.customitemtypes;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import com.chrismin13.vanillaadditions.abilities.SickleAbilities;
import com.chrismin13.vanillaadditions.durability.SickleDurability;

import us.fihgu.toolbox.item.DamageableItem;

public class CustomSickle extends CustomTexturedTool implements SickleAbilities{
	
	private int breakRadius = 0;
	
	public CustomSickle(DamageableItem damageable, int durability, int breakRadius, double attackSpeed, String identifier, String name) {
		super(damageable, "rpg_additions:" + identifier, identifier);
		this.breakRadius = breakRadius;
		addAttackSpeed(attackSpeed);     //Attack Speed
		setFakeDurability(durability);
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName(name);
		setDurabilityMechanics(new SickleDurability());
	}

	@Override
	public int getBreakRadius() {
		// TODO Auto-generated method stub
		return this.breakRadius;
	}
}