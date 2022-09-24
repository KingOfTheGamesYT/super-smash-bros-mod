package com.jawser.items.weapons;

import com.jawser.lib.Strings;
import com.jawser.main.mainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class lazerAmmo extends Item{
	
	   public lazerAmmo()
	   {
	     super();
	     setCreativeTab(CreativeTabs.tabCombat);
	     setUnlocalizedName("lazerAmmo");
	     setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon(Strings.MODID + ":lazerAmmo");
	}
}
