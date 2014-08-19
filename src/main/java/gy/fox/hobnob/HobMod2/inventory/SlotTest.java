package gy.fox.hobnob.HobMod2.inventory;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInvBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotTest extends Slot
{
    public SlotTest(IInventory inventory, int slotIndex, int x, int y)
    {
        super(inventory, slotIndex, x,y);
    }

    /*
    in this case, you can only place this item
     */
    @Override
    public boolean isItemValid(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItem() == Items.wheat;
    }
}
