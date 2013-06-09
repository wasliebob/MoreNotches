package mods.MoreNotch.generation;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockNotchica extends Block {
	
public BlockNotchica(int ID){
	
super(ID,Material.iron); //Parameters: Block ID, Block material
setUnlocalizedName("MoreNotch:notchica");
setCreativeTab(MoreNotch.tabCustom);
setHardness(3.0F); //The block hardness
setResistance(5.0F); //The explosion resistance
}



public void registerIcons(IconRegister iconRegister)
{
         blockIcon = iconRegister.registerIcon("MoreNotch:notchica");
}
}