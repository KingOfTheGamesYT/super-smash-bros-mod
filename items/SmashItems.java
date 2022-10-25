package com.jawser.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.jawser.items.food.starman;
import com.jawser.items.weapons.bobomb;
import com.jawser.items.weapons.hammer;
import com.jawser.items.weapons.homerunBat;
import com.jawser.items.weapons.lazerAmmo;
import com.jawser.items.weapons.lazerGun;
import com.jawser.items.weapons.smartBomb;
import com.jawser.items.weapons.superscope;

import cpw.mods.fml.common.registry.GameRegistry;

public class SmashItems {
	
	public static ToolMaterial enumToolMaterialSmash = EnumHelper.addToolMaterial("SMASH", 3, 10, 11.0F, 5.0F, 30);
	public static ArmorMaterial enumArmorMaterialSmash = EnumHelper.addArmorMaterial("SMASH", 50, new int[] {5, 10, 8, 3}, 30);
	
	public static void mainRegistry(){
    	initItems();
    	registerItems();
    }
	//Combat
	public static Item hammer;
	public static Item lazerGun;
	public static Item lazerAmmo;
	public static Item smartBomb;
	public static Item homerunBat;
	public static Item superscope;
	public static Item bobomb;
	//Food
	public static Item starman;
	//Armor
	
	public static void initItems(){
		
		hammer = new hammer(enumToolMaterialSmash, 60).setUnlocalizedName("hammer").setCreativeTab(CreativeTabs.tabCombat);
		//Combat
		lazerGun = new lazerGun();
		lazerAmmo = new lazerAmmo();
		smartBomb = new smartBomb();
		homerunBat = new homerunBat(enumToolMaterialSmash, 5).setUnlocalizedName("homerunBat");
		superscope = new superscope().setUnlocalizedName("superscope");
		bobomb = new bobomb();
		//Food
		starman = new starman(10, 0, false).setUnlocalizedName("starman");
	}
	
	public static void registerItems(){
		//Combat
		GameRegistry.registerItem(hammer, "hammer");
		GameRegistry.registerItem(lazerGun, "lazerGun");
		GameRegistry.registerItem(lazerAmmo, "lazerAmmo");
		GameRegistry.registerItem(smartBomb, "smartBomb");
		GameRegistry.registerItem(homerunBat, "homerunBat");
		GameRegistry.registerItem(superscope, "superscope");
		GameRegistry.registerItem(bobomb, "bobomb");
		//Food
		GameRegistry.registerItem(starman, "starman");
		//Armor
	}
	

}
