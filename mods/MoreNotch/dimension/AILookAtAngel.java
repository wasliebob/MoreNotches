package mods.MoreNotch.dimension;

import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;

public class AILookAtAngel extends EntityAIWatchClosest
{
    private final EntityAngle theMerchant;

    public AILookAtAngel(EntityAngle par1EntityAngel)
    {
        super(par1EntityAngel, EntityPlayer.class, 8.0F);
        this.theMerchant = par1EntityAngel;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (this.theMerchant.isTrading())
        {
            this.closestEntity = this.theMerchant.getCustomer();
            return true;
        }
        else
        {
            return false;
        }
    }
}
