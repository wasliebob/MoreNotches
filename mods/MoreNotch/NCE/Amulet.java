package mods.MoreNotch.NCE;

import java.util.List;

import org.bouncycastle.util.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.Event;

public class Amulet extends Item {

        public Amulet(int id) {
                super(id);
                
             // Constructor Configuration
                setMaxStackSize(1);
                setCreativeTab(CreativeTabs.tabTools);
                setUnlocalizedName("MoreNotch:amulet");
                setFull3D();
                shouldRotateAroundWhenRendering();
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon("MoreNotch:amulet");
            
        }
        
        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean i)
        {
        list.add("Work in Progress");
        list.add("Notch Currency Exchange");
        }
        

}