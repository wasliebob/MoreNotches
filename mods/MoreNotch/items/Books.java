package mods.MoreNotch.items;

import java.util.Random;

import mods.MoreNotch.MoreNotch;
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

public class Books extends Item {

        public Books(int id) {
                super(id);
                
             // Constructor Configuration
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMisc);
                setUnlocalizedName("MoreNotch:book");
                setFull3D();
                shouldRotateAroundWhenRendering();
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon("MoreNotch:book");
            
        }
        
        public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
        {
                 if(!par3World.isRemote)
                 {
                             player.sendChatToPlayer("Devil Notch: You killed him but i am still alive");
                             player.sendChatToPlayer("You: I will kill you to!");
                             player.sendChatToPlayer("Devil Notch: Before you can kill me you first need to defeat 5 Guardians");
                             player.sendChatToPlayer("You: Just four to go this isn't going to be that hard!");
                             player.sendChatToPlayer("Devil Notch: We will see");
                             player.sendChatToPlayer(" ");
                             player.sendChatToPlayer("This note looks like it has something to do with a enderman.");
                             player.sendChatToPlayer("I think it will spawn something!");
                             player.sendChatToPlayer("I should go home");
                             player.sendChatToPlayer(" ");
                             player.sendChatToPlayer("God Notch: Wait, I have something for you!");
                             player.sendChatToPlayer("God Notch: I think this will come really handy in your journey to defeat Devil Notch");
                             player.sendChatToPlayer("You: What is it i didnt get anything!?");
                             player.sendChatToPlayer("God Notch: You will see as soon as you return to the Overworld!");
                             player.inventory.addItemStackToInventory(new ItemStack(MoreNotch.gsword));
                             player.inventory.getCurrentItem().stackSize--;
                         }
				return bFull3D;
                 }
}