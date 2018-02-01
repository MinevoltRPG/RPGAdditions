package me.drkmatr1984.RPGAdditions.items.shovels;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.customitemtypes.CustomShovel;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverShovel extends CustomShovel {
	
	public SilverShovel() {
		super(DamageableItem.IRON_SHOVEL, 502, "silver_shovel", "Silver Shovel");
		addAttackDamage(6.5);
		if(RPGAdditions.getInstance().isWerewolf()) {
			for(String s : RPGAdditions.getInstance().getWerewolfPluginManager().getSilverLore()) {
				addLoreLine(s);
			}
		}
	}
}