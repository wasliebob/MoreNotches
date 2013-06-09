package mods.MoreNotch.hell;

import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Key extends Item
{
       public Key(int id)
       {
             super(id);
             this.setCreativeTab(CreativeTabs.tabMisc);
             setUnlocalizedName("MoreNotch:key");
       }
       
       public void updateIcons(IconRegister par1IconRegister) {
           this.itemIcon = par1IconRegister.registerIcon("MoreNotch:key");
           
       }

       
       public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
             if(!par3World.isRemote)
             {
                    int direction = MathHelper.floor_double((double)(par2EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
                   
                    if(direction == 1 || direction == 3)
                    {
                           for(int y = 1; y < 5; y++)
                           {
                                  for (int z = -1; z < 2; z++)
                                  {
                                        if(par3World.getBlockId(par4, par5 + y, par6 + z) != 0)
                                        {
                                               par2EntityPlayer.addChatMessage("No room for a portal.");
                                               return false;
                                        }
                                  }
                           }
                          
                           par3World.setBlock(par4, par5 + 1, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 1, par6 + 1, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 1, par6 + 2, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 1, par6 - 1, MoreNotch.hellBrick.blockID);
                          
                           par3World.setBlock(par4, par5 + 2, par6 - 1, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 3, par6 - 1, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 4, par6 - 1, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 5, par6 - 1, MoreNotch.hellBrick.blockID);
                          
                           par3World.setBlock(par4, par5 + 2, par6 + 2, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 3, par6 + 2, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 4, par6 + 2, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 5, par6 + 2, MoreNotch.hellBrick.blockID);
                          
                           par3World.setBlock(par4, par5 + 5, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4, par5 + 5, par6 + 1, MoreNotch.hellBrick.blockID);
                          
                           par3World.setBlock(par4, par5 + 2, par6, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4, par5 + 3, par6, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4, par5 + 4, par6, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4, par5 + 2, par6 + 1, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4, par5 + 3, par6 + 1, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4, par5 + 4, par6 + 1, MoreNotch.portal2.blockID);
                           par2EntityPlayer.inventory.getCurrentItem().stackSize--;
                    }
                    else
                    {
                           for(int y = 1; y < 5; y++)
                           {
                                  for (int x = -1; x < 2; x++)
                                  {
                                        if(par3World.getBlockId(par4 + x, par5 + y, par6) != 0)
                                        {
                                               par2EntityPlayer.addChatMessage("There is no room to create a portal here");
                                               return false;
                                        }
                                  }
                           }
                          
                           par3World.setBlock(par4, par5 + 1, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 + 1, par5 + 1, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 + 2, par5 + 1, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 - 1, par5 + 1, par6, MoreNotch.hellBrick.blockID);
                          
                           par3World.setBlock(par4 - 1, par5 + 2, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 - 1, par5 + 3, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 - 1, par5 + 4, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 - 1, par5 + 5, par6, MoreNotch.hellBrick.blockID);
                          
                           par3World.setBlock(par4 + 2, par5 + 2, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 + 2, par5 + 3, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 + 2, par5 + 4, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 + 2, par5 + 5, par6, MoreNotch.hellBrick.blockID);
                          
                           par3World.setBlock(par4, par5 + 5, par6, MoreNotch.hellBrick.blockID);
                           par3World.setBlock(par4 + 1, par5 + 5, par6, MoreNotch.hellBrick.blockID);
                          
                           par3World.setBlock(par4, par5 + 2, par6, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4, par5 + 3, par6, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4, par5 + 4, par6, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4 + 1, par5 + 2, par6, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4 + 1, par5 + 3, par6, MoreNotch.portal2.blockID);
                           par3World.setBlock(par4 + 1, par5 + 4, par6, MoreNotch.portal2.blockID);
                           par2EntityPlayer.inventory.getCurrentItem().stackSize--;
                    }
                   
                    return true;
             }
             else
                    return false;
    }
}
