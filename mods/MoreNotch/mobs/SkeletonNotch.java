package mods.MoreNotch.mobs;


import mods.MoreNotch.MoreNotch;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
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
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class SkeletonNotch extends EntitySkeleton
{
public SkeletonNotch(World par1World) 
{
super(par1World);
this.texture = "/mods/MoreNotch/textures/mobs/skeletonnotch.png";
this.moveSpeed = 0.4F;
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIBreakDoor(this));
this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(5, new EntityAIOpenDoor(this, hasAttacked));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
this.experienceValue = 12;
}

public int getAttackStrength(Entity par1Entity) { return 6; }

public boolean isAIEnabled()
    {
        return true;
    }

public int getMaxHealth() 
{
return 100;
}

public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
public String getTexture()
{
return "/mods/MoreNotch/textures/mobs/skeletonnotch.png";
}

protected void dropFewItems(boolean par1, int par2)
{
this.dropItem(MoreNotch.i4.itemID, 1);
this.dropItem(Item.bone.itemID, 16);
}

protected String getLivingSound()
{
    return "mob.skeleton.say";
}

protected String getHurtSound()
{
    return "mob.skeleton.hurt";
}

protected String getDeathSound()
{
    return "mob.skeleton.death";
}

protected void playStepSound(int par1, int par2, int par3, int par4)
{
    this.worldObj.playSoundAtEntity(this, "mob.skeleton.step", 0.15F, 1.0F);
}
}