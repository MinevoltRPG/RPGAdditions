package me.drkmatr1984.RPGAdditions.items.axes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystAxe extends CustomAxe {
	
	public AmethystAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "amethyst_axe", "Amethyst Axe");
		addAttackDamage(10.0);		
	}
}