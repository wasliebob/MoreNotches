package mods.MoreNotch.NM;

import java.util.List;
import java.util.Random;

import mods.MoreNotch.MoreNotch;
import mods.MoreNotch.mobs.SlenderNotch;
import mods.MoreNotch.mobs.WitherNotch;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.Event;

public class FireBall extends Item {

        public FireBall(int id) {
                super(id);
                
             // Constructor Configuration
                setMaxStackSize(1);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("MoreNotch:wand");
                setFull3D();
                shouldRotateAroundWhenRendering();
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon("MoreNotch:wand");
            
        }
        
        public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
        {
            if (par3EntityPlayer.ridingEntity != null)
            {
                return par1ItemStack;
            }
            else
            {
                par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

                if (!par2World.isRemote)
                {
                    par2World.spawnEntityInWorld(new EntityFireball2(par2World, par3EntityPlayer));
                }

                return par1ItemStack;
            }
        }
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean i)
        {
        list.add("Fire");
        }
}