package com.jawser.entity.pokemon.mewtwo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Mewtwo extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Neck;
    ModelRenderer LEar;
    ModelRenderer REar;
    ModelRenderer Larm;
    ModelRenderer LLeg;
    ModelRenderer RLeg;
    ModelRenderer Body;
    ModelRenderer Back;
    ModelRenderer Back2;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
  
  public Mewtwo()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      Head = new ModelRenderer(this, 0, 28);
      Head.addBox(0F, 0F, 0F, 6, 6, 6);
      Head.setRotationPoint(-3F, -10F, -1F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 0, 21);
      Neck.addBox(0F, 0F, 0F, 4, 2, 4);
      Neck.setRotationPoint(-2F, -4F, 0F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      LEar = new ModelRenderer(this, 59, 0);
      LEar.addBox(0F, 0F, 0F, 1, 2, 3);
      LEar.setRotationPoint(-3F, -10F, 3F);
      LEar.setTextureSize(64, 32);
      LEar.mirror = true;
      setRotation(LEar, 0.7811528F, 0F, 0F);
      REar = new ModelRenderer(this, 68, 0);
      REar.addBox(0F, 0F, 0F, 1, 2, 3);
      REar.setRotationPoint(2F, -10F, 3F);
      REar.setTextureSize(64, 32);
      REar.mirror = true;
      setRotation(REar, 0.7811528F, 0F, 0F);
      Larm = new ModelRenderer(this, 59, 24);
      Larm.addBox(0F, 0F, 0F, 9, 3, 3);
      Larm.setRotationPoint(-9F, 5F, 1F);
      Larm.setTextureSize(64, 32);
      Larm.mirror = true;
      setRotation(Larm, 0F, 0F, -0.8151159F);
      LLeg = new ModelRenderer(this, 25, 0);
      LLeg.addBox(0F, 0F, 0F, 4, 13, 4);
      LLeg.setRotationPoint(-6F, 11F, 0F);
      LLeg.setTextureSize(64, 32);
      LLeg.mirror = true;
      setRotation(LLeg, 0F, 0F, 0F);
      RLeg = new ModelRenderer(this, 42, 0);
      RLeg.addBox(0F, 0F, 0F, 4, 13, 4);
      RLeg.setRotationPoint(2F, 11F, 0F);
      RLeg.setTextureSize(64, 32);
      RLeg.mirror = true;
      setRotation(RLeg, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 6, 15, 6);
      Body.setRotationPoint(-3F, -2F, -1F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Back = new ModelRenderer(this, 0, 64);
      Back.addBox(0F, 0F, 0F, 2, 2, 3);
      Back.setRotationPoint(-1F, -6F, 5F);
      Back.setTextureSize(64, 32);
      Back.mirror = true;
      setRotation(Back, -0.6627534F, 0F, 0F);
      Back2 = new ModelRenderer(this, 0, 70);
      Back2.addBox(0F, 0F, 0F, 2, 2, 3);
      Back2.setRotationPoint(-1F, -2F, 4F);
      Back2.setTextureSize(64, 32);
      Back2.mirror = true;
      setRotation(Back2, 0.5094475F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 42);
      Shape1.addBox(0F, 0F, 0F, 4, 4, 16);
      Shape1.setRotationPoint(-2F, 9F, 2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0.5773738F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 59, 31);
      Shape2.addBox(0F, 0F, 0F, 9, 3, 3);
      Shape2.setRotationPoint(3F, -1F, 1F);
      Shape2.setTextureSize(256, 256);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0.8179294F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Neck.render(f5);
    LEar.render(f5);
    REar.render(f5);
    Larm.render(f5);
    LLeg.render(f5);
    RLeg.render(f5);
    Body.render(f5);
    Back.render(f5);
    Back2.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
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
  }

}
