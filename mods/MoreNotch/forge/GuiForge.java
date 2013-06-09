package mods.MoreNotch.forge;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

public class GuiForge extends GuiContainer
{
    private TileEntityForge furnaceInventory;

    public GuiForge(InventoryPlayer par1InventoryPlayer, TileEntityForge par2TileEntityForge)
    {
        super(new ContainerForge(par1InventoryPlayer, par2TileEntityForge));
        this.furnaceInventory = par2TileEntityForge;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = this.furnaceInventory.isInvNameLocalized() ? this.furnaceInventory.getInvName() : StatCollector.translateToLocal(this.furnaceInventory.getInvName());
        this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture("/gui/furnace.png");
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int i1;

        if (this.furnaceInventory.isBurning())
        {
            i1 = this.furnaceInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = this.furnaceInventory.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
    
    @Override
    public void initGui() {
            super.initGui();

            	//id, x, y, width, height, text
            buttonList.add(new GuiButton(1, 30, 10, 80, 20, "Recipes"));
    }

    public void actionPerformed(GuiButton button)
    {
    	this.mc.thePlayer.closeScreen();
    	this.mc.thePlayer.sendChatToPlayer("Mechanisme");
    	this.mc.thePlayer.sendChatToPlayer("In the top you put the item you need");
    	this.mc.thePlayer.sendChatToPlayer("In the bottom you put your wand");
    	this.mc.thePlayer.sendChatToPlayer(" ");

    	this.mc.thePlayer.sendChatToPlayer("Recipe's");
    	this.mc.thePlayer.sendChatToPlayer("Fire Charge = Fire Wand");
    	this.mc.thePlayer.sendChatToPlayer(" ");
    	this.mc.thePlayer.sendChatToPlayer(" ");
    	this.mc.thePlayer.sendChatToPlayer("Interface coming in a later snapshot!");

    	
    }
}
