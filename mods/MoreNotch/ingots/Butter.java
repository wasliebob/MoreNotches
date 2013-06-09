package mods.MoreNotch.ingots;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;


public class Butter extends ItemFood {

	 	public Butter(int par1, int par2, float par3, boolean par4) {
	 		super(par1, par2, par3, par4);
                
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabFood);
                setUnlocalizedName("MoreNotch:butter");
                setFull3D();
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon("MoreNotch:butter");
            
        }
        
}