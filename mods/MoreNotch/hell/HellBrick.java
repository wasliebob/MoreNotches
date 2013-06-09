package mods.MoreNotch.hell;

import java.util.Random;


import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class HellBrick extends Block
{

public HellBrick(int par1)
{
super(par1, Material.ground);
this.setCreativeTab(MoreNotch.tabCustom);
this.setHardness(1.0F);
this.setUnlocalizedName("MoreNotch:hellbrick");
this.setLightValue(1);
}

public void updateIcons(IconRegister par1IconRegister) {
    this.blockIcon = par1IconRegister.registerIcon("MoreNotch:hellbrick");
    
}  
}
