package com.jawser.entity.pokemon.pikachu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class PikaModel extends ModelBase
{
  //fields
    ModelRenderer Rfoot;
    ModelRenderer Lfoot;
    ModelRenderer Body;
    ModelRenderer Rarm;
    ModelRenderer Larm;
    ModelRenderer Head;
    ModelRenderer Rear;
    ModelRenderer Lear;
    ModelRenderer Tail;
  
  public PikaModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Rfoot = new ModelRenderer(this, 0, 0);
      Rfoot.addBox(0F, 0F, 0F, 2, 1, 5);
      Rfoot.setRotationPoint(-4F, 23F, -3F);
      Rfoot.setTextureSize(64, 64);
      Rfoot.mirror = true;
      setRotation(Rfoot, 0F, 0F, 0F);
      Lfoot = new ModelRenderer(this, 15, 0);
      Lfoot.addBox(0F, 0F, 0F, 2, 1, 5);
      Lfoot.setRotationPoint(2F, 23F, -3F);
      Lfoot.setTextureSize(64, 64);
      Lfoot.mirror = true;
      setRotation(Lfoot, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 6);
      Body.addBox(0F, 0F, 0F, 6, 6, 5);
      Body.setRotationPoint(-3F, 17F, -2F);
      Body.setTextureSize(64, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Rarm = new ModelRenderer(this, 13, 18);
      Rarm.addBox(0F, 0F, 0F, 4, 2, 2);
      Rarm.setRotationPoint(-5F, 17F, -1F);
      Rarm.setTextureSize(64, 64);
      Rarm.mirror = true;
      setRotation(Rarm, 0F, 0F, 0.5948578F);
      Larm = new ModelRenderer(this, 0, 18);
      Larm.addBox(0F, 0F, 0F, 4, 2, 2);
      Larm.setRotationPoint(2F, 19.5F, -1F);
      Larm.setTextureSize(64, 64);
      Larm.mirror = true;
      setRotation(Larm, 0F, 0F, -0.6030113F);
      Head = new ModelRenderer(this, 29, 0);
      Head.addBox(0F, 0F, 0F, 6, 5, 7);
      Head.setRotationPoint(-3F, 12F, -3F);
      Head.setTextureSize(64, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Rear = new ModelRenderer(this, 0, 23);
      Rear.addBox(0F, 0F, 0F, 2, 5, 1);
      Rear.setRotationPoint(-6F, 9F, 0F);
      Rear.setTextureSize(64, 64);
      Rear.mirror = true;
      setRotation(Rear, -0.0371786F, -0.0371786F, -0.5948578F);
      Lear = new ModelRenderer(this, 0, 23);
      Lear.addBox(0F, 0F, 0F, 2, 5, 1);
      Lear.setRotationPoint(4F, 8F, 0F);
      Lear.setTextureSize(64, 64);
      Lear.mirror = true;
      setRotation(Lear, -0.0371786F, -0.0371786F, 0.5205006F);
      Tail = new ModelRenderer(this, 27, 16);
      Tail.addBox(0F, 0F, 0F, 2, 2, 5);
      Tail.setRotationPoint(-1F, 21F, 2F);
      Tail.setTextureSize(64, 64);
      Tail.mirror = true;
      setRotation(Tail, 0.5576792F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Rfoot.render(f5);
    Lfoot.render(f5);
    Body.render(f5);
    Rarm.render(f5);
    Larm.render(f5);
    Head.render(f5);
    Rear.render(f5);
    Lear.render(f5);
    Tail.render(f5);
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
