package com.jawser.entity.pokemon.charizard;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.jawser.lib.Strings;

public class ChariRender extends RenderLiving {

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/entity/Charizard.png");
	
	public ChariRender(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
    protected void preRenderCallback(EntityLivingBase entity, float f){
    	GL11.glScalef(2F, 2F, 2F);
    }
	
	protected ResourceLocation getEntityTexture(ChariMob entity) {
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((ChariMob)entity);
	}

}
