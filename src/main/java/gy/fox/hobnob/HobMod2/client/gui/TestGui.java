package gy.fox.hobnob.HobMod2.client.gui;

import gy.fox.hobnob.HobMod2.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class TestGui extends GuiScreen
{

    int xSize = 176;
    int ySize = 214;
    private static final ResourceLocation backgroundimage = new ResourceLocation(Reference.MOD_ID.toLowerCase()+":"+"textures/gui/TestGui.png");

    public TestGui()
    {

    }

    @Override
    public void drawScreen(int par1, int par2, float par3)
    {
        //texture
        this.mc.getTextureManager().bindTexture(backgroundimage);
        //set x for texture
        par2 = (this.width -xSize)/2;
        //set y for texture
        int j = (this.height - ySize -30)/2;
        //do the drawing yo
        drawTexturedModalRect(par2,j,0,0,xSize,ySize);
    }

    public boolean doesGuiPauseGame()
    {
        return false;
    }
}
