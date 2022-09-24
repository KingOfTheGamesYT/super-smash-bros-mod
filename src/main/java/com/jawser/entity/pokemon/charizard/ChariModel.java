package com.jawser.entity.pokemon.charizard;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ChariModel extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer LLeg;
    ModelRenderer RLeg;
    ModelRenderer Nail2;
    ModelRenderer Larm;
    ModelRenderer Nail1;
    ModelRenderer Nail3;
    ModelRenderer Rarm;
    ModelRenderer Nail4;
    ModelRenderer Nail5;
    ModelRenderer Nail6;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Mouth;
    ModelRenderer Horn1;
    ModelRenderer Horn2;
    ModelRenderer LWing;
    ModelRenderer RWing;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Fire;
  
  public ChariModel()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 22, 0);
      Body.addBox(0F, 0F, 0F, 12, 15, 11);
      Body.setRotationPoint(-1F, 3F, -3F);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      LLeg = new ModelRenderer(this, 0, 0);
      LLeg.addBox(0F, 0F, 0F, 5, 9, 6);
      LLeg.setRotationPoint(9F, 15F, 0F);
      LLeg.setTextureSize(128, 64);
      LLeg.mirror = true;
      setRotation(LLeg, 0F, 0F, 0F);
      RLeg = new ModelRenderer(this, 0, 0);
      RLeg.addBox(0F, 0F, 0F, 5, 9, 6);
      RLeg.setRotationPoint(-4F, 15F, 0F);
      RLeg.setTextureSize(128, 64);
      RLeg.mirror = true;
      setRotation(RLeg, 0F, 0F, 0F);
      Nail2 = new ModelRenderer(this, 0, 24);
      Nail2.addBox(0F, 0F, 0F, 1, 1, 1);
      Nail2.setRotationPoint(-4F, 9F, 0F);
      Nail2.setTextureSize(128, 64);
      Nail2.mirror = true;
      setRotation(Nail2, 0F, 0F, -0.6692116F);
      Larm = new ModelRenderer(this, 0, 30);
      Larm.addBox(0F, 0F, 0F, 7, 3, 3);
      Larm.setRotationPoint(-6F, 10F, 1F);
      Larm.setTextureSize(128, 64);
      Larm.mirror = true;
      setRotation(Larm, 0F, 0F, -0.669215F);
      Nail1 = new ModelRenderer(this, 0, 24);
      Nail1.addBox(0F, 0F, 0F, 1, 1, 1);
      Nail1.setRotationPoint(-5F, 10F, 0F);
      Nail1.setTextureSize(128, 64);
      Nail1.mirror = true;
      setRotation(Nail1, 0F, 0F, -0.6692116F);
      Nail3 = new ModelRenderer(this, 0, 24);
      Nail3.addBox(0F, 0F, 0F, 1, 1, 1);
      Nail3.setRotationPoint(-4F, 10F, 0F);
      Nail3.setTextureSize(128, 64);
      Nail3.mirror = true;
      setRotation(Nail3, 0F, 0F, -0.6692116F);
      Rarm = new ModelRenderer(this, 0, 0);
      Rarm.addBox(0F, 0F, 0F, 7, 3, 3);
      Rarm.setRotationPoint(11F, 6F, 0F);
      Rarm.setTextureSize(128, 64);
      Rarm.mirror = true;
      setRotation(Rarm, 0F, 0F, 0.669215F);
      Nail4 = new ModelRenderer(this, 0, 24);
      Nail4.addBox(0F, 0F, 0F, 1, 1, 1);
      Nail4.setRotationPoint(14F, 9F, -1F);
      Nail4.setTextureSize(128, 64);
      Nail4.mirror = true;
      setRotation(Nail4, 0F, 0F, 0.6692116F);
      Nail5 = new ModelRenderer(this, 0, 24);
      Nail5.addBox(0F, 0F, 0F, 1, 1, 1);
      Nail5.setRotationPoint(15F, 10F, -1F);
      Nail5.setTextureSize(128, 64);
      Nail5.mirror = true;
      setRotation(Nail5, 0F, 0F, 0.6692116F);
      Nail5 = new ModelRenderer(this, 0, 24);
      Nail5.addBox(0F, 0F, 0F, 1, 1, 1);
      Nail5.setRotationPoint(14F, 10F, -1F);
      Nail5.setTextureSize(128, 64);
      Nail5.mirror = true;
      setRotation(Nail5, 0F, 0F, 0.6692116F);
      Neck = new ModelRenderer(this, 0, 38);
      Neck.addBox(0F, 0F, 0F, 6, 9, 7);
      Neck.setRotationPoint(2F, -6F, -1F);
      Neck.setTextureSize(128, 64);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 72, 0);
      Head.addBox(0F, 0F, 0F, 8, 8, 9);
      Head.setRotationPoint(1F, -12F, -2F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Mouth = new ModelRenderer(this, 26, 40);
      Mouth.addBox(0F, 0F, 0F, 6, 3, 5);
      Mouth.setRotationPoint(2F, -8F, -7F);
      Mouth.setTextureSize(128, 64);
      Mouth.mirror = true;
      setRotation(Mouth, 0F, 0F, 0F);
      Horn1 = new ModelRenderer(this, 28, 26);
      Horn1.addBox(0F, 0F, 0F, 2, 7, 2);
      Horn1.setRotationPoint(-2F, -17F, 5F);
      Horn1.setTextureSize(128, 64);
      Horn1.mirror = true;
      setRotation(Horn1, 0F, 0F, -0.411399F);
      Horn2 = new ModelRenderer(this, 28, 26);
      Horn2.addBox(0F, 0F, 0F, 2, 7, 2);
      Horn2.setRotationPoint(9F, -18F, 5F);
      Horn2.setTextureSize(128, 64);
      Horn2.mirror = true;
      setRotation(Horn2, 0F, 0F, 0.3365992F);
      LWing = new ModelRenderer(this, 52, 27);
      LWing.addBox(0F, 0F, 0F, 10, 13, 1);
      LWing.setRotationPoint(-10F, 2.222222F, 8F);
      LWing.setTextureSize(128, 64);
      LWing.mirror = true;
      setRotation(LWing, 0F, 0F, -1.223337F);
      RWing = new ModelRenderer(this, 74, 27);
      RWing.addBox(0F, 0F, 0F, 10, 13, 1);
      RWing.setRotationPoint(17F, -8F, 8F);
      RWing.setTextureSize(128, 64);
      RWing.mirror = true;
      setRotation(RWing, 0F, 0F, 1.128039F);
      Tail1 = new ModelRenderer(this, 52, 41);
      Tail1.addBox(0F, 0F, 0F, 6, 6, 6);
      Tail1.setRotationPoint(2F, 12F, 5F);
      Tail1.setTextureSize(128, 64);
      Tail1.mirror = true;
      setRotation(Tail1, 0.4089647F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 76, 41);
      Tail2.addBox(0F, 0F, 0F, 4, 5, 7);
      Tail2.setRotationPoint(3F, 10F, 11F);
      Tail2.setTextureSize(128, 64);
      Tail2.mirror = true;
      setRotation(Tail2, 0.4089656F, 0F, 0F);
      Fire = new ModelRenderer(this, 109, 26);
      Fire.addBox(0F, 0F, 0F, 2, 3, 3);
      Fire.setRotationPoint(4F, 8F, 18F);
      Fire.setTextureSize(128, 64);
      Fire.mirror = true;
      setRotation(Fire, 0.4264188F, 0.0174533F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    LLeg.render(f5);
    RLeg.render(f5);
    Nail2.render(f5);
    Larm.render(f5);
    Nail1.render(f5);
    Nail3.render(f5);
    Rarm.render(f5);
    Nail4.render(f5);
    Nail5.render(f5);
    Nail5.render(f5);
    Neck.render(f5);
    Head.render(f5);
    Mouth.render(f5);
    Horn1.render(f5);
    Horn2.render(f5);
    LWing.render(f5);
    RWing.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Fire.render(f5);
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
