package com.jawser.entity.cfalcon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.jawser.lib.Strings;

public class CfalconRender extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/entity/CaptainFalcon.png");
	
	public CfalconRender(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(CfalconMob entity) {
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((CfalconMob)entity);
	}

}
