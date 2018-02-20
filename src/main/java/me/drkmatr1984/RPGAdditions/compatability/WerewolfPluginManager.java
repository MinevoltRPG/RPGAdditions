package me.drkmatr1984.RPGAdditions.compatability;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import com.chrismin13.additionsapi.AdditionsAPI;
import com.chrismin13.additionsapi.items.CustomItem;
import com.chrismin13.additionsapi.items.CustomItemStack;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.items.axes.SilverAxe;
import me.drkmatr1984.RPGAdditions.items.chisels.SilverChisel;
import me.drkmatr1984.RPGAdditions.items.daggers.SilverDagger;
import me.drkmatr1984.RPGAdditions.items.doubleaxes.SilverDoubleAxe;
import me.drkmatr1984.RPGAdditions.items.hoes.SilverHoe;
import me.drkmatr1984.RPGAdditions.items.pickaxes.SilverPickaxe;
import me.drkmatr1984.RPGAdditions.items.sickels.SilverSickle;
import me.drkmatr1984.RPGAdditions.listeners.WerewolfDamageListener;
import us.rfsmassacre.HeavenLib.Managers.ChatManager;
import us.rfsmassacre.HeavenLib.Managers.ConfigManager;
import us.rfsmassacre.Werewolf.WerewolfPlugin;
import us.rfsmassacre.Werewolf.Items.Weapons.SilverSword;
import us.rfsmassacre.Werewolf.Managers.ClanManager;
import us.rfsmassacre.Werewolf.Managers.ItemManager;
import us.rfsmassacre.Werewolf.Managers.MoonManager;
import us.rfsmassacre.Werewolf.Managers.SkinManager;
import us.rfsmassacre.Werewolf.Managers.WerewolfManager;

public class WerewolfPluginManager{
	
	private ItemMeta silverSwordMeta;
	
	public WerewolfPluginManager(JavaPlugin plugin) {
		this.silverSwordMeta = new SilverSword().getItemMeta();
		RPGAdditions.getInstance().getPluginManager().registerEvents(new WerewolfDamageListener(), plugin);
		Bukkit.getConsoleSender().sendMessage("Werewolf Listener Registered");
	}
	
	public ClanManager getClanManager() {
		return WerewolfPlugin.getClanManager();
	}
	
	public ChatManager getChatManager() {
		return WerewolfPlugin.getChatManager();
	}
	
	public WerewolfManager getWerewolfManager() {
		return WerewolfPlugin.getWerewolfManager();
	}
	
	public ConfigManager getConfigManager() {
		return WerewolfPlugin.getConfigManager();
	}
	
	public ItemManager getItemManager() {
		return WerewolfPlugin.getItemManager();
	}
	
	public MoonManager getMoonManager() {
		return WerewolfPlugin.getMoonManager();
	}
	
	public SkinManager getSkinManager() {
		return WerewolfPlugin.getSkinManager();
	}
	
	public List<String> getSilverLore() { 
		return this.silverSwordMeta.getLore();		
	}
	
	public String getSilverSwordDisplayName() {
		return this.silverSwordMeta.getDisplayName();
	}
	
	public boolean isSilverTool(ItemStack stack) {
		for(CustomItem cItem : AdditionsAPI.getAllCustomItems()) {			
			if(cItem instanceof me.drkmatr1984.RPGAdditions.items.swords.SilverSword) {
				if(stack.isSimilar(new CustomItemStack(cItem).getItemStack())) {
					return true;
				}
			}
			
			if(cItem instanceof SilverDagger) {
				if(stack.isSimilar(new CustomItemStack(cItem).getItemStack())) {
					return true;
				}
			}
			
			if(cItem instanceof SilverAxe) {
				if(stack.isSimilar(new CustomItemStack(cItem).getItemStack())) {
					return true;
				}
			}
			if(cItem instanceof SilverPickaxe) {
				if(stack.isSimilar(new CustomItemStack(cItem).getItemStack())) {
					return true;
				}
			}
			if(cItem instanceof SilverHoe) {
				if(stack.isSimilar(new CustomItemStack(cItem).getItemStack())) {
					return true;
				}
			}
			if(RPGAdditions.getInstance().isVanillaAdditions()) {
				if(cItem instanceof SilverChisel) {
					if(stack.isSimilar(new CustomItemStack(cItem).getItemStack())) {
						return true;
					}
				}
				if(cItem instanceof SilverDoubleAxe) {
					if(stack.isSimilar(new CustomItemStack(cItem).getItemStack())) {
						return true;
					}
				}
				if(cItem instanceof SilverSickle) {
					if(stack.isSimilar(new CustomItemStack(cItem).getItemStack())) {
						return true;
					}
				}
			}
		}
		return false;
	}
}