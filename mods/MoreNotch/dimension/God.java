package mods.MoreNotch.dimension;

import java.util.List;
import java.util.Random;


import mods.MoreNotch.MoreNotch;
import mods.MoreNotch.mobs.WitherNotch;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class God extends Block
{

public God(int par1)
{
super(par1, Material.ground);
this.setCreativeTab(MoreNotch.tabCustom);
this.setHardness(1.0F);
this.setUnlocalizedName("MoreNotch:god");
this.setBlockUnbreakable();
}

@Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
		return 0;
    }

public void updateIcons(IconRegister par1IconRegister) {
    this.blockIcon = par1IconRegister.registerIcon("MoreNotch:god");
    
}  
public boolean onBlockActivated(World world, int x, int y, int z,
        EntityPlayer player, int idk, float what, float these, float are) {
	player.inventory.addItemStackToInventory(new ItemStack(MoreNotch.gods));
    if (!world.isRemote){
	player.sendChatToPlayer("An item appeared into your inventory");
    }
	return blockConstructorCalled;
}
public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean i)
{
list.add("Right Click To Activate!");
}
}