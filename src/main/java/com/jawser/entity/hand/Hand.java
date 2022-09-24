package com.jawser.entity.hand;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.jawser.main.mainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Hand {
	
	public static void mainRegistry() {
		registerEntity();
	}
	
	public static void registerEntity() {
		
		createEntity(HandMob.class, "Hand", 0x25CF5B, 0xFFFF00);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, mainRegistry.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 5, 10, EnumCreatureType.creature, BiomeGenBase.forest);
		EntityRegistry.addSpawn(entityClass, 2, 5, 10, EnumCreatureType.creature, BiomeGenBase.desert);
		EntityRegistry.addSpawn(entityClass, 2, 5, 10, EnumCreatureType.creature, BiomeGenBase.beach);
		EntityRegistry.addSpawn(entityClass, 2, 5, 10, EnumCreatureType.creature, BiomeGenBase.birchForest);
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));	
	}
}
