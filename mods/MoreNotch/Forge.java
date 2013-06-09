package mods.MoreNotch;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.MoreNotch.forge.TileEntityForge;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Forge extends BlockContainer {

        public Forge (int id) {
                super(id, Material.iron);
                setHardness(2.0F);
                setResistance(5.0F);
                setUnlocalizedName("MoreNotch:mana");
        }

        @Override
        public boolean onBlockActivated(World world, int x, int y, int z,
                        EntityPlayer player, int idk, float what, float these, float are) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if (tileEntity == null || player.isSneaking()) {
                        return false;
                }
        //code to open gui explained later
        player.openGui(MoreNotch.instance, 1, world, x, y, z);
                return true;
        }

        @Override
        public void breakBlock(World world, int x, int y, int z, int par5, int par6) {
                dropItems(world, x, y, z);
                super.breakBlock(world, x, y, z, par5, par6);
        }

        private void dropItems(World world, int x, int y, int z){
                Random rand = new Random();

                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if (!(tileEntity instanceof IInventory)) {
                        return;
                }
                IInventory inventory = (IInventory) tileEntity;

                for (int i = 0; i < inventory.getSizeInventory(); i++) {
                        ItemStack item = inventory.getStackInSlot(i);

                        if (item != null && item.stackSize > 0) {
                                float rx = rand.nextFloat() * 0.8F + 0.1F;
                                float ry = rand.nextFloat() * 0.8F + 0.1F;
                                float rz = rand.nextFloat() * 0.8F + 0.1F;

                                EntityItem entityItem = new EntityItem(world,
                                                x + rx, y + ry, z + rz,
                                                new ItemStack(item.itemID, item.stackSize, item.getItemDamage()));

                                

                                float factor = 0.05F;
                                entityItem.motionX = rand.nextGaussian() * factor;
                                entityItem.motionY = rand.nextGaussian() * factor + 0.2F;
                                entityItem.motionZ = rand.nextGaussian() * factor;
                                world.spawnEntityInWorld(entityItem);
                                item.stackSize = 0;
                        }
                }
        }

        @Override
        public TileEntity createNewTileEntity(World world) {
                return new TileEntityForge();
        }

        
        public void updateIcons(IconRegister par1IconRegister) {
            this.blockIcon = par1IconRegister.registerIcon("MoreNotch:mana");
        }
        
        @Override
        public void onNeighborBlockChange(World world, int x, int y, int z, int par5){
                if(world.getBlockId(x, y -1, z) == MoreNotch.hellBrick.blockID)
                {
                	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                }else{
                	world.setBlock(x, y, z, MoreNotch.core.blockID);
                }
                    if(world.getBlockId(x +1, y -1, z) == MoreNotch.hellBrick.blockID)
                    {
                    	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                    }else{
                    	world.setBlock(x, y, z, MoreNotch.core.blockID);
                    }
                        if(world.getBlockId(x -1, y -1, z) == MoreNotch.hellBrick.blockID)
                        {
                        	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                        }else{
                        	world.setBlock(x, y, z, MoreNotch.core.blockID);
                        }
                            if(world.getBlockId(x, y -1, z -1) == MoreNotch.hellBrick.blockID)
                            {
                            	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                            }else{
                            	world.setBlock(x, y, z, MoreNotch.core.blockID);
                            }
                                if(world.getBlockId(x +1, y -1, z -1) == MoreNotch.hellBrick.blockID)
                                {
                                	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                }else{
                                	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                }
                                    if(world.getBlockId(x -1, y -1, z -1) == MoreNotch.hellBrick.blockID)
                                    {
                                    	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                    }else{
                                    	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                    }
                                        if(world.getBlockId(x, y -1, z +1) == MoreNotch.hellBrick.blockID)
                                        {
                                        	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                        }else{
                                        	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                        }
                                            if(world.getBlockId(x +1, y -1, z +1) == MoreNotch.hellBrick.blockID)
                                            {
                                            	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                            }else{
                                            	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                            }
                                                if(world.getBlockId(x -1, y -1, z +1) == MoreNotch.hellBrick.blockID)
                                                {
                                                	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                                }else{
                                                	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                                }
                                                    if(world.getBlockId(x +1, y, z +1) == MoreNotch.hellBrick.blockID)
                                                    {
                                                    	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                                    }else{
                                                    	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                                    }
                                                        if(world.getBlockId(x +1, y, z -1) == MoreNotch.hellBrick.blockID)
                                                        {
                                                        	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                                        }else{
                                                        	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                                        }
                                                        	if(world.getBlockId(x -1, y, z +1) == MoreNotch.hellBrick.blockID)
                                                            {
                                                            	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                                            }else{
                                                            	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                                            }
                                                                if(world.getBlockId(x -1, y, z -1) == MoreNotch.hellBrick.blockID)
                                                                {
                                                                	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                                                }else{
                                                                	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                                                }
                                                                    if(world.getBlockId(x, y +1, z) == MoreNotch.hellBrick.blockID)
                                                                    {
                                                                    	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                                                                    }else{
                                                                    	world.setBlock(x, y, z, MoreNotch.core.blockID);
                                                                    }	

        }
        }