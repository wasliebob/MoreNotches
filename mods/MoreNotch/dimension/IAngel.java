package mods.MoreNotch.dimension;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public interface IAngel
{
    void setCustomer(EntityPlayer entityplayer);

    EntityPlayer getCustomer();

    MerchantRecipeList getRecipes(EntityPlayer entityplayer);

    void setRecipes(MerchantRecipeList merchantrecipelist);

    void useRecipe(MerchantRecipe merchantrecipe);
}
