package gy.fox.hobnob.HobMod2.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import gy.fox.hobnob.HobMod2.inventory.CookieBank;
import gy.fox.hobnob.HobMod2.te.CookieBankTE;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
    public GuiHandler(){}

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID==1)
        {
            CookieBankTE CookieBankTE = (CookieBankTE) world.getTileEntity(x,y,z);
            return new CookieBank(player.inventory, CookieBankTE);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID==0)
            return new TestGui();
        if(ID==1)
        {
            CookieBankTE CookieBankTE = (CookieBankTE) world.getTileEntity(x,y,z);
            return new GuiInventory(player.inventory, CookieBankTE);
        }
        return null;
    }
}
