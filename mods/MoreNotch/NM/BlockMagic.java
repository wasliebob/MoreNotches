package mods.MoreNotch.NM;

import java.util.Random;


import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMagic extends Block
{

public BlockMagic(int par1)
{
super(par1, Material.wood);
this.setCreativeTab(MoreNotch.tabCustom);
this.setHardness(1.0F);
this.setUnlocalizedName("MoreNotch:furnace_front");
}

public void updateIcons(IconRegister par1IconRegister) {
    this.blockIcon = par1IconRegister.registerIcon("MoreNotch:furnace_front");
    
}  
public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
{
   return true;

}

public boolean isOpaqueCube()
{
   return false;
}


public TileEntity createNewTileEntity(World world)
{
   return new TileEntityMagic();
}

}