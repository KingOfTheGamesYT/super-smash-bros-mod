package com.jawser.items.weapons;

import com.jawser.items.SmashItems;
import com.jawser.projectiles.EntityLazer;
import com.jawser.projectiles.EntitySuperScope;

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

public class superscope extends Item
 {
   public superscope()
   {
     super();
     setCreativeTab(CreativeTabs.tabCombat);
     setUnlocalizedName("lazerGun");
   }
   
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("jawser:weapons/lazerGun");
	}
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {

        if (p_77659_3_.capabilities.isCreativeMode || p_77659_3_.inventory.hasItem(SmashItems.lazerAmmo))
        {
            p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
        }
        p_77659_2_.spawnEntityInWorld(new EntitySuperScope(p_77659_2_, p_77659_3_));

        return p_77659_1_;
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

	     if (flag || par3EntityPlayer.inventory.hasItem(SmashItems.lazerAmmo))
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
	             par3EntityPlayer.inventory.consumeInventoryItem(SmashItems.lazerAmmo);
	         }

	         if (!par2World.isRemote)
	         {
	             par2World.spawnEntityInWorld(entityarrow);
	             if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(SmashItems.lazerAmmo));
	             par3EntityPlayer.inventory.consumeInventoryItem(SmashItems.lazerAmmo);
	         }
	     }
	 }
 }