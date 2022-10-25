package com.jawser.entity.kirby;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKirby extends ModelBase
{
  //fields
    ModelRenderer LLeg;
    ModelRenderer RLeg;
    ModelRenderer body;
    ModelRenderer LArm;
    ModelRenderer RArm;
  
  public ModelKirby()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      LLeg = new ModelRenderer(this, 22, 0);
      LLeg.addBox(0F, 0F, 0F, 3, 3, 5);
      LLeg.setRotationPoint(1F, 21F, 0F);
      LLeg.setTextureSize(64, 32);
      LLeg.mirror = true;
      setRotation(LLeg, 0F, 0F, 0F);
      RLeg = new ModelRenderer(this, 22, 8);
      RLeg.addBox(0F, 0F, 0F, 3, 3, 5);
      RLeg.setRotationPoint(-4F, 21F, 0F);
      RLeg.setTextureSize(64, 32);
      RLeg.mirror = true;
      setRotation(RLeg, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 0);
      body.addBox(0F, 0F, 0F, 6, 6, 5);
      body.setRotationPoint(-3F, 15F, 1F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      LArm = new ModelRenderer(this, 14, 11);
      LArm.addBox(0F, 0F, 0F, 3, 1, 1);
      LArm.setRotationPoint(3F, 18F, 3F);
      LArm.setTextureSize(64, 32);
      LArm.mirror = true;
      setRotation(LArm, 0F, 0F, 0F);
      RArm = new ModelRenderer(this, 14, 11);
      RArm.addBox(0F, 0F, 0F, 3, 1, 1);
      RArm.setRotationPoint(-6F, 18F, 3F);
      RArm.setTextureSize(64, 32);
      RArm.mirror = true;
      setRotation(RArm, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    LLeg.render(f5);
    RLeg.render(f5);
    body.render(f5);
    LArm.render(f5);
    RArm.render(f5);
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
  }

}
