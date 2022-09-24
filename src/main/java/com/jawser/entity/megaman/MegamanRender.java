package com.jawser.entity.megaman;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.jawser.lib.Strings;

public class MegamanRender extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/entity/Megaman.png");
	
	public MegamanRender(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(MegamanMob entity) {
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((MegamanMob)entity);
	}

}
