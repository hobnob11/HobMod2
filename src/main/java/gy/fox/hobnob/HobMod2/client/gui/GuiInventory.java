package gy.fox.hobnob.HobMod2.client.gui;

import gy.fox.hobnob.HobMod2.reference.Reference;
import gy.fox.hobnob.HobMod2.te.CookieBankTE;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiInventory extends GuiContainer
{
    private static final ResourceLocation backgroundimage = new ResourceLocation(Reference.MOD_ID.toLowerCase() + ":" + "textures/gui/TestGui.png");

    public GuiInventory(InventoryPlayer inventoryPlayer, CookieBankTE cookieBankTE)
    {
        super(new InventoryTest(InventoryPlayer, CookieBankTE));
        xSize = 176;
        ySize = 214;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        this.mc.getTextureManager().bindTexture(backgroundimage);
        par2 = (this.width - xSize) / 2;
        int j = (this.height - ySize) / 2;
        drawTexturedModalRect(par2, j, 0, 0, xSize, ySize);
    }
}
