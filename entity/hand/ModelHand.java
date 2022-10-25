package com.jawser.entity.hand;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHand extends ModelBase
{
  //fields
    ModelRenderer Palm;
    ModelRenderer Pinky;
    ModelRenderer FourFinger;
    ModelRenderer MiddleFinger;
    ModelRenderer IndexFinger;
    ModelRenderer Shape1;
  
  public ModelHand()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Palm = new ModelRenderer(this, 0, 0);
      Palm.addBox(0F, 0F, 0F, 15, 10, 20);
      Palm.setRotationPoint(0F, 0F, 0F);
      Palm.setTextureSize(64, 32);
      Palm.mirror = true;
      setRotation(Palm, 0F, 0F, 0F);
      Pinky = new ModelRenderer(this, 0, 0);
      Pinky.addBox(0F, 0F, 0F, 3, 3, 9);
      Pinky.setRotationPoint(0F, 0F, -9F);
      Pinky.setTextureSize(64, 32);
      Pinky.mirror = true;
      setRotation(Pinky, 0F, 0F, 0F);
      FourFinger = new ModelRenderer(this, 1, 0);
      FourFinger.addBox(0F, 0F, 0F, 3, 3, 12);
      FourFinger.setRotationPoint(4F, 1F, -12F);
      FourFinger.setTextureSize(64, 32);
      FourFinger.mirror = true;
      setRotation(FourFinger, 0F, 0F, 0F);
      MiddleFinger = new ModelRenderer(this, 1, 0);
      MiddleFinger.addBox(0F, 0F, 0F, 3, 3, 14);
      MiddleFinger.setRotationPoint(8F, 0F, -14F);
      MiddleFinger.setTextureSize(64, 32);
      MiddleFinger.mirror = true;
      setRotation(MiddleFinger, 0F, 0F, 0F);
      IndexFinger = new ModelRenderer(this, 1, 0);
      IndexFinger.addBox(0F, 0F, 0F, 3, 3, 10);
      IndexFinger.setRotationPoint(12F, 0F, -10F);
      IndexFinger.setTextureSize(64, 32);
      IndexFinger.mirror = true;
      setRotation(IndexFinger, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 3, 3, 11);
      Shape1.setRotationPoint(15F, 4F, -6F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Palm.render(f5);
    Pinky.render(f5);
    FourFinger.render(f5);
    MiddleFinger.render(f5);
    IndexFinger.render(f5);
    Shape1.render(f5);
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
