package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxDoubleAxe extends CustomDoubleAxe {
	
	public OnyxDoubleAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "onyx_double_axe", "Onyx Double Axe");
		addAttackDamage(10.0);		
	}
}