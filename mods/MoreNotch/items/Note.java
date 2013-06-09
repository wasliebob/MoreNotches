package mods.MoreNotch.items;

import java.util.Random;

import mods.MoreNotch.mobs.SlenderNotch;
import mods.MoreNotch.mobs.WitherNotch;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
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

public class Note extends Item {

        public Note(int id) {
                super(id);
                
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("MoreNotch:note");
                setFull3D();
                shouldRotateAroundWhenRendering();
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon("MoreNotch:note");
            
        }
        
        public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
        {
                 if(!par3World.isRemote)
                 {
                		Random rand = new Random();
                		SlenderNotch ewp = new SlenderNotch(par3World);
                		ewp.setLocationAndAngles(par4+0.5, par5+1, par6+ 0.5,(float)(rand.nextInt(15)* 360) / 16f,0f);
                		par3World.spawnEntityInWorld(ewp); 
                        par2EntityPlayer.inventory.getCurrentItem().stackSize--;
                 }
			return bFull3D;
        }
}