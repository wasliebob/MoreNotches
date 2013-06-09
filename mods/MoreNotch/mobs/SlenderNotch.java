package mods.MoreNotch.mobs;


import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;


public class SlenderNotch extends EntityEnderman 
{
public SlenderNotch(World par1World) 
{
super(par1World);
this.texture = "/mods/MoreNotch/textures/mobs/slendernotch.png";
this.moveSpeed = 0.3F;
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIBreakDoor(this));
this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(5, new EntityAIOpenDoor(this, hasAttacked));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
this.experienceValue = 75;
}

public int getAttackStrength(Entity par1Entity) { return 10; }

protected boolean isAIEnabled()
    {
        return true;
    }

public int getMaxHealth() 
{
return 1000;
}

public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
public String getTexture()
{
return "/mods/MoreNotch/textures/mobs/slendernotch.png";
}



protected void dropFewItems(boolean par1, int par2)
{
this.dropItem(MoreNotch.i5.itemID, 1);
}

protected String getLivingSound()
{
    return "mob.endermen.say";
}

protected String getHurtSound()
{
    return "mob.endermen.hurt";
}

protected String getDeathSound()
{
    return "mob.endermen.death";
}

protected void playStepSound(int par1, int par2, int par3, int par4)
{
    this.worldObj.playSoundAtEntity(this, "mob.endermen.step", 0.15F, 1.0F);
}

public boolean attackEntityAsMob(Entity par1Entity)
{
    if (super.attackEntityAsMob(par1Entity))
    {
            ((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 50));
            ((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 50));
            ((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 50));
            ((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 50));
            ((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 50));
            ((EntityLiving)par1Entity).addPotionEffect(new PotionEffect(Potion.wither.id, 50));

    }

    else
    {
        return false;
    }
	return hasAttacked;
}

/**
 * Teleport Slender Notch to an random nearby position
 */
protected boolean teleportRandomly()
{
    double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 64.0D;
    double d1 = this.posY + (double)(this.rand.nextInt(64) - 32);
    double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 64.0D;
    return this.teleportTo(d0, d1, d2);
}

protected boolean teleportToEntity(Entity par1Entity)
{
    Vec3 vec3 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX - par1Entity.posX, this.boundingBox.minY + (double)(this.height / 2.0F) - par1Entity.posY + (double)par1Entity.getEyeHeight(), this.posZ - par1Entity.posZ);
    vec3 = vec3.normalize();
    double d0 = 16.0D;
    double d1 = this.posX + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.xCoord * d0;
    double d2 = this.posY + (double)(this.rand.nextInt(16) - 8) - vec3.yCoord * d0;
    double d3 = this.posZ + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.zCoord * d0;
    return this.teleportTo(d1, d2, d3);
}

/**
 * Teleport Slender Notch
 */
protected boolean teleportTo(double par1, double par3, double par5)
{
    EnderTeleportEvent event = new EnderTeleportEvent(this, par1, par3, par5, 0);
    if (MinecraftForge.EVENT_BUS.post(event)){
        return false;
    }

    double d3 = this.posX;
    double d4 = this.posY;
    double d5 = this.posZ;
    this.posX = event.targetX;
    this.posY = event.targetY;
    this.posZ = event.targetZ;
    boolean flag = false;
    int i = MathHelper.floor_double(this.posX);
    int j = MathHelper.floor_double(this.posY);
    int k = MathHelper.floor_double(this.posZ);
    int l;

    if (this.worldObj.blockExists(i, j, k))
    {
        boolean flag1 = false;

        while (!flag1 && j > 0)
        {
            l = this.worldObj.getBlockId(i, j - 1, k);

            if (l != 0 && Block.blocksList[l].blockMaterial.blocksMovement())
            {
                flag1 = true;
            }
            else
            {
                --this.posY;
                --j;
            }
        }

        if (flag1)
        {
            this.setPosition(this.posX, this.posY, this.posZ);

            if (this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox))
            {
                flag = true;
            }
        }
    }

    if (!flag)
    {
        this.setPosition(d3, d4, d5);
        return false;
    }
    else
    {
        short short1 = 128;

        for (l = 0; l < short1; ++l)
        {
            double d6 = (double)l / ((double)short1 - 1.0D);
            float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
            float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
            float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
            double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
            double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * (double)this.height;
            double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
            this.worldObj.spawnParticle("portal", d7, d8, d9, (double)f, (double)f1, (double)f2);
        }

        this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
        this.playSound("mob.endermen.portal", 1.0F, 1.0F);
        return true;
    }
}


	
}