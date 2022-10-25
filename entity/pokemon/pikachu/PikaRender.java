package com.jawser.entity.pokemon.pikachu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.jawser.lib.Strings;

public class PikaRender extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/entity/Pikachu.png");
	
	public PikaRender(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(PikaMob entity) {
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((PikaMob)entity);
	}

}
