package mods.MoreNotch.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class NAxe extends ItemAxe
{

public NAxe(int par1, EnumToolMaterial par2EnumToolMaterial)
{
super(par1, par2EnumToolMaterial);
this.setUnlocalizedName("MoreNotch:naxe");
}

    /**
* Return whether this item is repairable in an anvil.
*/
@Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return false;
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
    	itemIcon = par1IconRegister.registerIcon("MoreNotch:naxe");
    }
}