package mods.MoreNotch;

import mods.MoreNotch.NCE.Amulet;
import mods.MoreNotch.NCE.ContainerNCE;
import mods.MoreNotch.NCE.GUINCE;
import mods.MoreNotch.dimension.ContainerMerchant;
import mods.MoreNotch.dimension.EntityAngle;
import mods.MoreNotch.dimension.GuiAngel;
import mods.MoreNotch.forge.ContainerForge;
import mods.MoreNotch.forge.GuiForge;
import mods.MoreNotch.forge.TileEntityForge;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;


public class GuiHandler implements IGuiHandler {
        //returns an instance of the Container you made earlier
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(id == 0){
                        return new ContainerNCE(player.inventory, world, x, y, z);
                }
                else if(tileEntity instanceof TileEntityForge){
                    return new ContainerForge(player.inventory, (TileEntityForge) tileEntity);
                }
                else if(id == 2){
                return new ContainerMerchant(player.inventory, null, world);
                }
				return null;
        }


        //returns an instance of the Gui you made earlier
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world,
                        int x, int y, int z) {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(id == 0){
                	return new GUINCE(player.inventory, world, x, y, z);
                }
                else if(tileEntity instanceof TileEntityForge){
                    return new GuiForge(player.inventory, (TileEntityForge) tileEntity);
                }
                else if(id == 2){
                    return new GuiAngel(player.inventory, null, world, "Angel");
                }
                return null;

        }
}