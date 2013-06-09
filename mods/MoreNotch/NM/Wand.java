package mods.MoreNotch.NM;

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

public class Wand extends Item {

        public Wand(int id) {
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
        
        public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player)
        {
                if (!par2World.isRemote)
                {
                	player.sendChatToPlayer("Maybe i need to infuse my wand with something!");
                	
                }

                return par1ItemStack;
            }
        }