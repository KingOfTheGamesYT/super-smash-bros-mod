package com.jawser.entity.pacman;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPacman extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer LLeg;
    ModelRenderer RLeg;
    ModelRenderer RShoe;
    ModelRenderer LShoe;
    ModelRenderer Larm;
    ModelRenderer Rarm;
  
  public ModelPacman()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 10, 9, 10);
      Body.setRotationPoint(-6F, 7F, -4F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LLeg = new ModelRenderer(this, 48, 0);
      LLeg.addBox(0F, 0F, 0F, 2, 8, 2);
      LLeg.setRotationPoint(-5F, 16F, 0F);
      LLeg.setTextureSize(64, 32);
      LLeg.mirror = true;
      setRotation(LLeg, 0F, 0F, 0F);
      RLeg = new ModelRenderer(this, 40, 0);
      RLeg.addBox(0F, 0F, 0F, 2, 8, 2);
      RLeg.setRotationPoint(1F, 16F, 0F);
      RLeg.setTextureSize(64, 32);
      RLeg.mirror = true;
      setRotation(RLeg, 0F, 0F, 0F);
      RShoe = new ModelRenderer(this, 0, 19);
      RShoe.addBox(0F, 0F, 0F, 4, 2, 7);
      RShoe.setRotationPoint(0F, 22F, -4F);
      RShoe.setTextureSize(64, 32);
      RShoe.mirror = true;
      setRotation(RShoe, 0F, 0F, 0F);
      LShoe = new ModelRenderer(this, 19, 19);
      LShoe.addBox(0F, 0F, 0F, 4, 2, 7);
      LShoe.setRotationPoint(-6F, 22F, -4F);
      LShoe.setTextureSize(64, 32);
      LShoe.mirror = true;
      setRotation(LShoe, 0F, 0F, 0F);
      Larm = new ModelRenderer(this, 40, 10);
      Larm.addBox(0F, 0F, 0F, 2, 8, 2);
      Larm.setRotationPoint(-7F, 9F, 0F);
      Larm.setTextureSize(64, 32);
      Larm.mirror = true;
      setRotation(Larm, 0F, 0F, 0.4089647F);
      Rarm = new ModelRenderer(this, 40, 10);
      Rarm.addBox(0F, 0F, 0F, 2, 8, 2);
      Rarm.setRotationPoint(3.2F, 9.6F, 0F);
      Rarm.setTextureSize(64, 32);
      Rarm.mirror = true;
      setRotation(Rarm, 0F, 0F, -0.4008149F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    LLeg.render(f5);
    RLeg.render(f5);
    RShoe.render(f5);
    LShoe.render(f5);
    Larm.render(f5);
    Rarm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
    float f6 = (180F / (float)Math.PI);
    this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    
    this.LLeg.rotateAngleX = MathHelper.cos(this.LLeg.rotateAngleX) * 1.4F * f1;
    this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    
    this.Larm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.Rarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }

}
