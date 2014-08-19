package gy.fox.hobnob.HobMod2.inventory;

import gy.fox.hobnob.HobMod2.te.CookieBankTE;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;


public class CookieBank extends net.minecraft.inventory.Container
{
    private CookieBankTE tile;

    public CookieBank(InventoryPlayer inventory, CookieBankTE CookieBankTE)
    {
        tile = CookieBankTE;
        bindPlayerInventory(inventory);
    }


    /*
    Add slots to our GUI.
    The id's are for the slotnumbers.
    For the rest, the i * 18 and j * 18 is always the same.
    The other numbers can change, depending on your gui.
     */

    private void bindPlayerInventory(InventoryPlayer inventoryPlayer)
    {
        int id = 0; //player inv id
        int id2 =0;

        for(int i =0; i<9; i++)
        {
            addSlotToContainer(new Slot(inventoryPlayer, id, i*18 +8,189)); //adds the hotbar apperntly
            id++;
        }
        for(int i =0; i < 3; i++)
        {
            for(int j=0; j<9;j++)
            {
                addSlotToContainer(new Slot(inventoryPlayer,id,j*18+8,i*18+131));//adds the whole inventory soemhow
            }
        }
        for(int i = 0; i < 3; i ++)
        {
            for(int j = 0; j < 2; j++)
            {
                addSlotToContainer(new SlotTest(tile, id2, i * 18 + 62, j * 18 + 21)); //Adds custon slots
                id2++;
            }
        }
        addSlotToContainer(new SlotTest(tile, id2, 81, 95));
    }
    @Override
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int slotIndex)
    {
        return null;
    }
    @Override
    public boolean canInteractWith(EntityPlayer var1)
    {
        return true;
    }

}
