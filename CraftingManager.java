package com.jawser.main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.jawser.items.SmashItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {
	
	public static void mainRegistry(){
		addCraftingRecipes();
	}
	
	public static void addCraftingRecipes(){
		
		//The Hammer
		GameRegistry.addShapedRecipe(new ItemStack(SmashItems.hammer), "BBB", " S ", " S ", 'B', Blocks.stone, 'S', Items.stick);
		
	}
}
