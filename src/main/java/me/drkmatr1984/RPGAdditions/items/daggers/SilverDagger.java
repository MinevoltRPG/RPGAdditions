package me.drkmatr1984.RPGAdditions.items.daggers;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverDagger extends CustomDagger {
	
	public SilverDagger() {
		super(DamageableItem.IRON_SWORD, 478, "silver_dagger", "Silver Dagger");
		addAttackDamage(4.0);    //Attack Damage
		if(RPGAdditions.getInstance().isWerewolf()) {
			for(String s : RPGAdditions.getInstance().getWerewolfPluginManager().getSilverLore()) {
				addLoreLine(s);
			}
		}
	}
}