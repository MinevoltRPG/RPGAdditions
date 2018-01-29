package me.drkmatr1984.RPGAdditions.items.axes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxAxe extends CustomAxe {
	
	public OnyxAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "onyx_axe", "Onyx Axe");
		addAttackDamage(10.0);		
	}
}