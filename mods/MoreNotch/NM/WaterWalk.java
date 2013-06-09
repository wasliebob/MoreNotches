package mods.MoreNotch.NM;

import java.util.Random;

import mods.MoreNotch.MoreNotch;
import mods.MoreNotch.mobs.SlenderNotch;
import mods.MoreNotch.mobs.WitherNotch;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.Event;

public class WaterWalk extends Item {

        public WaterWalk(int id) {
                super(id);
                
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("MoreNotch:waterw");
                setFull3D();
                shouldRotateAroundWhenRendering();
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon("MoreNotch:waterw");
            
        }
        
        public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int x, int y, int z)
        {
        	if(par2World.getBlockId(x, y, z) == Block.waterStill.blockID){
        		par2World.setBlock(x, y, z, Block.ice.blockID);
        		
        	}
			return par1ItemStack;
           
}
}