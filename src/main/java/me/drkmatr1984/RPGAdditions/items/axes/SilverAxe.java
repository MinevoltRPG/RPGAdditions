package me.drkmatr1984.RPGAdditions.items.axes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverAxe extends CustomAxe {
	
	public SilverAxe() {
		super(DamageableItem.IRON_AXE, 502, 0.9,  "silver_axe", "Silver Axe");
		addAttackDamage(10.0);		
	}
}