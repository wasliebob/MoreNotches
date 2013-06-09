package mods.MoreNotch;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

final class CreativeTabCustom extends CreativeTabs
{
    CreativeTabCustom(int par1, String par2Str)
    {
        super(par1, par2Str);
    }


    /**
     * the itemID for the item to be displayed on the tab
     */
    public int getTabIconItemIndex()
    {
        return MoreNotch.hellsword.itemID;
    }
}
