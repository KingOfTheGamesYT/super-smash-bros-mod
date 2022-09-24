package com.jawser.entity.mario;

import com.jawser.entity.cfalcon.CfalconMob;
import com.jawser.entity.drmario.DrmarioMob;
import com.jawser.entity.hand.HandMob;
import com.jawser.entity.kirby.KirbyMob;
import com.jawser.entity.link.LinkMob;
import com.jawser.entity.littlemac.LittleMacMob;
import com.jawser.entity.luigi.LuigiMob;
import com.jawser.entity.megaman.MegamanMob;
import com.jawser.entity.pacman.PacmanMob;
import com.jawser.entity.pokemon.charizard.ChariMob;
import com.jawser.entity.pokemon.mewtwo.MTMob;
import com.jawser.entity.pokemon.pikachu.PikaMob;
import com.jawser.entity.samus.SamusMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class MarioMob extends EntityMob {

	public MarioMob(World par1World) {
		super(par1World);
        this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIMoveTowardsRestriction(this, 0.6D));
        this.tasks.addTask(3, new EntityAIWander(this, 0.6D));
        /**
         * EntityAIWatchClosest
         */
        this.tasks.addTask(4, new EntityAIWatchClosest(this, LuigiMob.class, 5.0F));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, KirbyMob.class, 5.0F));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, LinkMob.class, 5.0F));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, PikaMob.class, 5.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, LittleMacMob.class, 5.0F));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, CfalconMob.class, 5.0F));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, PacmanMob.class, 5.0F));
        this.tasks.addTask(11, new EntityAIWatchClosest(this, SamusMob.class, 5.0F));
        this.tasks.addTask(12, new EntityAIWatchClosest(this, MegamanMob.class, 5.0F));
        this.tasks.addTask(12, new EntityAIWatchClosest(this, HandMob.class, 5.0F));
        this.tasks.addTask(13, new EntityAIWatchClosest(this, PikaMob.class, 5.0F));
        this.tasks.addTask(13, new EntityAIWatchClosest(this, DrmarioMob.class, 5.0F));
        this.tasks.addTask(13, new EntityAIWatchClosest(this, MarioMob.class, 5.0F));
        this.tasks.addTask(13, new EntityAIWatchClosest(this, MTMob.class, 5.0F));
        this.tasks.addTask(13, new EntityAIWatchClosest(this, ChariMob.class, 5.0F));
        this.tasks.addTask(14, new EntityAILookIdle(this));
        /**
         * EntityAIAttackOnCollide
         */
        this.tasks.addTask(13, new EntityAIAttackOnCollide(this, MarioMob.class, 0.6D, false));
        this.tasks.addTask(14, new EntityAIAttackOnCollide(this, LuigiMob.class, 0.6D, false));
        this.tasks.addTask(15, new EntityAIAttackOnCollide(this, LinkMob.class, 0.6D, false));
        this.tasks.addTask(16, new EntityAIAttackOnCollide(this, KirbyMob.class, 1.0D, false));
        this.tasks.addTask(17, new EntityAIAttackOnCollide(this, PikaMob.class, 1.0D, false));
        this.tasks.addTask(18, new EntityAIAttackOnCollide(this, LittleMacMob.class, 0.6D, false));
        this.tasks.addTask(19, new EntityAIAttackOnCollide(this, PacmanMob.class, 0.6D, false));
        this.tasks.addTask(21, new EntityAIAttackOnCollide(this, SamusMob.class, 0.6D, false));
        this.tasks.addTask(22, new EntityAIAttackOnCollide(this, MegamanMob.class, 0.6D, false));
        this.tasks.addTask(23, new EntityAIAttackOnCollide(this, HandMob.class, 0.6D, false));
        this.tasks.addTask(20, new EntityAIAttackOnCollide(this, PikaMob.class, 0.6D, false));
        this.tasks.addTask(20, new EntityAIAttackOnCollide(this, DrmarioMob.class, 0.6D, false));
        this.tasks.addTask(20, new EntityAIAttackOnCollide(this, MarioMob.class, 0.6D, false));
        this.tasks.addTask(20, new EntityAIAttackOnCollide(this, MTMob.class, 0.6D, false));
        this.tasks.addTask(20, new EntityAIAttackOnCollide(this, ChariMob.class, 0.6D, false));
        
        /**
         * EnityAINearestAttackableTarget
         */
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, LuigiMob.class, 0, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, KirbyMob.class, 0, true));
        this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, LinkMob.class, 0, true));
        this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, PikaMob.class, 0, true));
        this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, LittleMacMob.class, 0, true));
        this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, MarioMob.class, 0, true));
        this.targetTasks.addTask(8, new EntityAINearestAttackableTarget(this, PacmanMob.class, 0, true));
        this.targetTasks.addTask(9, new EntityAINearestAttackableTarget(this, SamusMob.class, 0, true));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, MegamanMob.class, 0, true));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, HandMob.class, 0, true));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, PikaMob.class, 0, true));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, DrmarioMob.class, 0, true));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, MarioMob.class, 0, true));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, MTMob.class, 0, true));
        this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, ChariMob.class, 0, true));
        this.setSize(0.6F, 1.8F);
	}

	
	public boolean isAIEnabled() {
		return true;
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0F);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.7D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
	}
}
