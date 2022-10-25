package com.jawser.projectiles;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySuperScope extends EntityThrowable
{
	 public EntitySuperScope(World p_i1773_1_)
	    {
	        super(p_i1773_1_);
	    }

	    public EntitySuperScope(World p_i1774_1_, EntityLivingBase p_i1774_2_)
	    {
	        super(p_i1774_1_, p_i1774_2_);
	    }

	    public EntitySuperScope(World p_i1775_1_, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_)
	    {
	        super(p_i1775_1_, p_i1775_2_, p_i1775_4_, p_i1775_6_);
	    }
	    protected float getGravityVelocity()
	    {
	        return 0.0F;
	    }

    private int explosionRadius = 4;
    
    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition) 
    {
    	
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);   
        this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        this.setDead();
    }
}
