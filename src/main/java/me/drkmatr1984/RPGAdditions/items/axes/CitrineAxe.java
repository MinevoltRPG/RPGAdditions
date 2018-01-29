package me.drkmatr1984.RPGAdditions.items.axes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrineAxe extends CustomAxe {
	
	public CitrineAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "citrine_axe", "Citrine Axe");
		addAttackDamage(10.0);		
	}
}