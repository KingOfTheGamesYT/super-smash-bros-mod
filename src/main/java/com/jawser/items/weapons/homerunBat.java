package com.jawser.items.weapons;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class homerunBat extends ItemSword {

	protected final float weaponDamage;

	public homerunBat(Item.ToolMaterial mat, float damage) {
		super(mat);
		this.weaponDamage = damage;

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		this.itemIcon = reg.registerIcon("jawser:weapons/homerunBat");

	}

	@Override
	public Multimap getItemAttributeModifiers() {
		Multimap multimap = HashMultimap.create();
		multimap.put(SharedMonsterAttributes.attackDamage
				.getAttributeUnlocalizedName(), new AttributeModifier(
				field_111210_e, "Weapon modifier", (double) this.weaponDamage,
				0));
		return multimap;
	}

	public void onUpdate(ItemStack itemstack, World par2World,
			Entity par3Entity, int par4, boolean par5) {
		if (itemstack.isItemEnchanted() == false) {
			itemstack.addEnchantment(Enchantment.knockback, 10);
		}
	}

}
