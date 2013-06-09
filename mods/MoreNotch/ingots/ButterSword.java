package mods.MoreNotch.ingots;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ButterSword extends Item
{
private int weaponDamage;
private final EnumToolMaterial toolMaterial;

public ButterSword(int ID, EnumToolMaterial material,  String name)
{
super(ID); //The super constructor
this.toolMaterial = material; //The material to be used
this.maxStackSize = 1; //The max size of the itemstack
this.setMaxDamage(material.getMaxUses()); //The durability
this.setCreativeTab(CreativeTabs.tabCombat);
this.weaponDamage = 7 + toolMaterial.getDamageVsEntity(); //How strong it is on enemies
this.setUnlocalizedName("MoreNotch:buttersword");
}

public int func_82803_g()
{
return this.toolMaterial.getDamageVsEntity();
}

//Gets how well it works on the block
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
if (par2Block.blockID == Block.web.blockID)
{
return 15.0F;
}
else
{
Material var3 = par2Block.blockMaterial;
return var3 != Material.plants && var3 != Material.vine && var3 != Material.coral && var3 != Material.leaves && var3 != Material.pumpkin ? 1.0F : 1.5F;
}
}

//What must happen when you hit an entity
public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
{
par1ItemStack.damageItem(1, par3EntityLiving);
return true;
}

//How much damage the sword deals
public int getDamageVsEntity(Entity par1Entity)
{
return this.weaponDamage;
}


//Makes it render nicely
public boolean isFull3D()
{
return true;
}

//Allows you to block on right click
public EnumAction getItemUseAction(ItemStack par1ItemStack)
{
return EnumAction.block;
}

//The max use time of the action
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
return 1200;
}

//Called on right clicking anywhere
public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
return par1ItemStack;
}

//Can it harvest the block type?
public boolean canHarvestBlock(Block par1Block)
{
return par1Block.blockID == Block.web.blockID;
}

//How easy it is to enchant
public int getItemEnchantability()
{
return this.toolMaterial.getEnchantability();
}

//Returns the java name of the material
public String func_77825_f()
{
return this.toolMaterial.toString();
}


public void updateIcons(IconRegister par1IconRegister) {
    this.itemIcon = par1IconRegister.registerIcon("MoreNotch:buttersword");
    
}
public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean i)
{
list.add("7 Damage");
}
}