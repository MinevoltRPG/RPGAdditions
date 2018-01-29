package me.drkmatr1984.RPGAdditions.items.axes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazAxe extends CustomAxe {
	
	public YellowTopazAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "yellow_topaz_axe", "Topaz Axe");
		addAttackDamage(10.0);		
	}
}