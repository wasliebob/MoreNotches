package mods.MoreNotch.NCE;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;
public class GUINCE extends GuiContainer
{
public GUINCE(InventoryPlayer inventory, World world, int x, int y, int z)
{
         super(new ContainerNCE(inventory, world, x, y, z));
}
/**
         * Draw the foreground layer for the GuiContainer (everything in front of the items)
         */
protected void drawGuiContainerForegroundLayer(int par1, int par2)
{
         this.fontRenderer.drawString("Notch Currency Exchange", 28, 6, 4210752);
         this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
}
/**
         * Draw the background layer for the GuiContainer (everything behind the items)
         */
protected void drawGuiContainerBackgroundLayer(float f, int x, int y)
{
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.mc.renderEngine.bindTexture("/gui/crafting.png");
         int var5 = (this.width - this.xSize) / 2;
         int var6 = (this.height - this.ySize) / 2;
         this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
}
}