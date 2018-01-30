package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrineDoubleAxe extends CustomDoubleAxe {
	
	public CitrineDoubleAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "citrine_double_axe", "Citrine Double Axe");
		addAttackDamage(10.0);		
	}
}