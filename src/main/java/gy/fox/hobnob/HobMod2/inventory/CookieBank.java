package gy.fox.hobnob.HobMod2.inventory;

import gy.fox.hobnob.HobMod2.te.CookieBankTE;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;


public class CookieBank extends Container
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
        // Hotbar (Slot 0 - 8)
        for(int i = 0; i < 9; i++)
        {
            addSlotToContainer(new Slot(inventoryPlayer, i, i * 18 + 8, 189));
        }

        // Player Inventory (Slot 9 - 35)
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                addSlotToContainer(new Slot(inventoryPlayer, i * 9 + j + 9, j * 18 + 8, i * 18 + 131));
            }
        }

        // Block Inventory
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                addSlotToContainer(new SlotTest(tile, i * 3 + j, j * 18 + 62, i * 18 + 21));
            }
        }

        addSlotToContainer(new SlotTest(tile, 6, 81, 95));
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
