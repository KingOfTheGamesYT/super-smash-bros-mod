package com.jawser.entity.drmario;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.jawser.main.mainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class Drmario {
	
	public static void mainRegistry() {
		registerEntity();
	}
	
	public static void registerEntity() {
		
		createEntity(DrmarioMob.class, "Drmario", 0xFFFFFF, 0x5C3636);
		
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, mainRegistry.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 5, 10, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));	
	}
}
