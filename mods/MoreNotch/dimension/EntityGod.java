package mods.MoreNotch.dimension;


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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class EntityGod extends EntityMob
{
public EntityGod(World par1World) 
{
super(par1World);
this.texture = "/mods/MoreNotch/textures/mobs/godnotch.png";
this.moveSpeed = 0.5F;
this.tasks.addTask(0, new EntityAISwimming(this));
this.tasks.addTask(1, new EntityAIBreakDoor(this));
this.tasks.addTask(2, new EntityAIWander(this, this.moveSpeed));
this.tasks.addTask(3, new EntityAIOpenDoor(this, hasAttacked));
this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
}

public int getAttackStrength(Entity par1Entity) { return 2; }

protected boolean isAIEnabled()
    {
        return true;
    }

public int getMaxHealth() 
{
return 200;
}

public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
public String getTexture()
{
return "/mods/MoreNotch/textures/mobs/notchgod.png";
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

public boolean interact(EntityPlayer player)
{
    if (!this.worldObj.isRemote){
	player.sendChatToPlayer("I expected you already" + " " + player.username);
	player.sendChatToPlayer("I brought you here because there is something terrible that is going to happen");
	player.sendChatToPlayer("Devil Notch has brought The Wither Notch to The Overworld");
	player.sendChatToPlayer("Please use this to call him to you and kill him");
	player.sendChatToPlayer("You are the only one who can kill Devil Notch");
	player.inventory.addItemStackToInventory(new ItemStack(MoreNotch.wither));
	
	this.setDead();
    }
	return hasAttacked;
}
}