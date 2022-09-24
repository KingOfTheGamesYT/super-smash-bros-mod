package com.jawser.items.weapons;

import com.jawser.items.SmashItems;
import com.jawser.projectiles.EntityBomb;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class smartBomb extends Item
 {
   public smartBomb()
   {
     super();
     setCreativeTab(CreativeTabs.tabCombat);
     setUnlocalizedName("smartBomb");
   }
   
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("jawser:weapons/smartBomb");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
	    if(par3EntityPlayer.capabilities.isCreativeMode||par3EntityPlayer.inventory.consumeInventoryItem(SmashItems.smartBomb))
	    {
	        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	        if (!par2World.isRemote)
	        {
	            par2World.spawnEntityInWorld(new EntityBomb(par2World, par3EntityPlayer));
	        }
	    }
	        return par1ItemStack;
	}
	 public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	 {
	     int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

	     ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
	     MinecraftForge.EVENT_BUS.post(event);
	     if (event.isCanceled())
	     {
	         return;
	     }
	     j = event.charge;

	     boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

	     if (flag || par3EntityPlayer.inventory.hasItem(Items.arrow))
	     {
	         float f = (float)j / 20.0F;
	         f = (f * f + f * 2.0F) / 3.0F;

	         if ((double)f < 0.1D)
	         {
	             return;
	         }

	         if (f > 1.0F)
	         {
	             f = 1.0F;
	         }

	         EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F);

	         if (f == 1.0F)
	         {
	             entityarrow.setIsCritical(true);
	         }

	         int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

	         if (k > 0)
	         {
	             entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
	         }

	         int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

	         if (l > 0)
	         {
	             entityarrow.setKnockbackStrength(l);
	         }

	         if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
	         {
	             entityarrow.setFire(100);
	         }

	         par1ItemStack.damageItem(1, par3EntityPlayer);
	         par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

	         if (flag)
	         {
	             entityarrow.canBePickedUp = 2;
	         }
	         else
	         {
	             par3EntityPlayer.inventory.consumeInventoryItem(Items.arrow);
	         }

	         if (!par2World.isRemote)
	         {
	             par2World.spawnEntityInWorld(entityarrow);
	             if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Items.arrow));
	             par3EntityPlayer.inventory.consumeInventoryItem(Items.arrow);
	         }
	     }
	 }
 }