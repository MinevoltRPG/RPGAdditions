package me.drkmatr1984.RPGAdditions.items.axes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class SapphireAxe extends CustomAxe {
	
	public SapphireAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "sapphire_axe", "Sapphire Axe");
		addAttackDamage(10.0);		
	}
}