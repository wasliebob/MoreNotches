package mods.MoreNotch.mobs;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
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
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class FriendlyNotch extends EntityMob
{
    private final EntityAIControlledByPlayer aiControlledByPlayer;

public FriendlyNotch(World par1World) 
{
super(par1World);
this.texture = "/mods/MoreNotch/textures/mobs/friendlynotch.png";
this.moveSpeed = 0.4F;
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIBreakDoor(this));
this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntitySkeleton.class, this.moveSpeed, false));
this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityZombie.class, this.moveSpeed, false));
this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(5, new EntityAIOpenDoor(this, hasAttacked));
this.tasks.addTask(6, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.34F));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 16.0F, 0, true));
this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityZombie.class, 16.0F, 0, true));

}

public int getAttackStrength(Entity par1Entity) { return 6; }

protected boolean isAIEnabled()
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
return "/mods/MoreNotch/textures/mobs/friendlynotch.png";
}


protected String getLivingSound()
{
    return "mob.zombie.say";
}

protected String getHurtSound()
{
    return "mob.zombie.hurt";
}

protected String getDeathSound()
{
    return "mob.zombie.death";
}

protected void playStepSound(int par1, int par2, int par3, int par4)
{
    this.worldObj.playSoundAtEntity(this, "mob.zombie.step", 0.15F, 1.0F);
}

//Ride
public boolean interact(EntityPlayer par1EntityPlayer)
{
    if (super.interact(par1EntityPlayer))
    {
        return true;
    }
    else if (this.getSaddled() && !this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == par1EntityPlayer))
    {
        par1EntityPlayer.mountEntity(this);
        return true;
    }
    else
    {
        return false;
    }
}

public boolean getSaddled()
{
    return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
}

public void setSaddled(boolean par1)
{
    if (par1)
    {
        this.dataWatcher.updateObject(16, Byte.valueOf((byte)1));
    }
    else
    {
        this.dataWatcher.updateObject(16, Byte.valueOf((byte)0));
    }
}

public EntityAIControlledByPlayer getAIControlledByPlayer()
{
    return this.aiControlledByPlayer;
}

protected void entityInit()
{
    super.entityInit();
    this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
}

/**
 * (abstract) Protected helper method to write subclass entity data to NBT.
 */
public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
{
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setBoolean("Saddle", this.getSaddled());
}

/**
 * (abstract) Protected helper method to read subclass entity data from NBT.
 */
public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
{
    super.readEntityFromNBT(par1NBTTagCompound);
    this.setSaddled(par1NBTTagCompound.getBoolean("Saddle"));
}

}