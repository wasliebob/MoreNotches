package mods.MoreNotch.dimension;

import java.util.Random;

import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.Event;

public class HeavenPortal extends BlockPortal {

        public HeavenPortal(int id) {
                super(id);
                
             // Constructor Configuration
                setUnlocalizedName("MoreNotch:portal");
                setResistance(5.0F);
                setBlockUnbreakable();
        }
        
        public void registerIcons(IconRegister iconRegister)
        {
                 blockIcon = iconRegister.registerIcon("MoreNotch:portal");
        }
        
        public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
        {

        }
        public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
        {
        if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null)
        {
        if (par5Entity instanceof EntityPlayerMP)
        {
        EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
        if (par5Entity.dimension != 20)
        {
        thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 20, new TeleporterH(thePlayer.mcServer.worldServerForDimension(20)));
        }
        else
        {
        thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterH(thePlayer.mcServer.worldServerForDimension(0)));
        }
        }
        }
        }
        public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4)
            {
                byte var5 = 0;
                byte var6 = 0;

                if (par1World.getBlockId(par2 - 1, par3, par4) == Block.sandStone.blockID || par1World.getBlockId(par2 + 1, par3, par4) == Block.sandStone.blockID)
                {
                    var5 = 1;
                }

                if (par1World.getBlockId(par2, par3, par4 - 1) == Block.sandStone.blockID || par1World.getBlockId(par2, par3, par4 + 1) == Block.sandStone.blockID)
                {
                    var6 = 1;
                }

                if (var5 == var6)
                {
                    return false;
                }
                else
                {
                    if (par1World.getBlockId(par2 - var5, par3, par4 - var6) == 0)
                    {
                        par2 -= var5;
                        par4 -= var6;
                    }

                    int var7;
                    int var8;

                    for (var7 = -1; var7 <= 2; ++var7)
                    {
                        for (var8 = -1; var8 <= 3; ++var8)
                        {
                            boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;

                            if (var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3)
                            {
                                int var10 = par1World.getBlockId(par2 + var5 * var7, par3 + var8, par4 + var6 * var7);

                                if (var9)
                                {
                                    if (var10 != Block.sandStone.blockID)
                                    {
                                        return false;
                                    }
                                }
                                else if (var10 != 0 && var10 != Block.fire.blockID)
                                {
                                    return false;
                                }
                            }
                        }
                    }

           

                    for (var7 = 0; var7 < 2; ++var7)
                    {
                        for (var8 = 0; var8 < 3; ++var8)
                        {
                        	
                        }
                    }

                    return true;
                }
            }

        public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
            {
                
            }

        public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
        {
        byte var6 = 0;
        byte var7 = 1;

        if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
        {
        var6 = 1;
        var7 = 0;
        }

        int var8;

        for (var8 = par3; par1World.getBlockId(par2, var8 - 1, par4) == this.blockID; --var8)
        {
        ;
        }

        if (par1World.getBlockId(par2, var8 - 1, par4) != Block.sandStone.blockID)
        {

        }
        else
        {
        int var9;

        for (var9 = 1; var9 < 4 && par1World.getBlockId(par2, var8 + var9, par4) == this.blockID; ++var9)
        {
        ;
        }

        if (var9 == 3 && par1World.getBlockId(par2, var8 + var9, par4) == Block.sandStone.blockID)
        {
        boolean var10 = par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID;
        boolean var11 = par1World.getBlockId(par2, par3, par4 - 1) == this.blockID || par1World.getBlockId(par2, par3, par4 + 1) == this.blockID;

        if (var10 && var11)
        {
        }
        else
        {
        if ((par1World.getBlockId(par2 + var6, par3, par4 + var7) != Block.sandStone.blockID || par1World.getBlockId(par2 - var6, par3, par4 - var7) != this.blockID) && (par1World.getBlockId(par2 - var6, par3, par4 - var7) != Block.sandStone.blockID || par1World.getBlockId(par2 + var6, par3, par4 + var7) != this.blockID))
        {
        }
        }
        }
        else
        {
        }
        }
        }
        }