package gy.fox.hobnob.HobMod2.te;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class CookieBankTE extends TileEntity implements IInventory
{
    //loads of methods, gota make dem all
    private ItemStack[] inventory;
    private int INVENTORY_SIZE = 7;

    //inits our inv
    public CookieBankTE()
    {
        inventory = new ItemStack[INVENTORY_SIZE];
    }

    //returns size of inv
    @Override
    public int getSizeInventory()
    {
        return inventory.length;
    }

    //returns the ItemStack in a slot
    @Override
    public ItemStack getStackInSlot(int slotIndex)
    {
        return inventory[slotIndex];
    }
    //decreases stack size
    //if stack not null and ammount to dec is more then slot has, set to else if the stack is not null, splut the stack. if that makes inv 0, makes it null.
    //yeah idk either

    @Override
    public ItemStack decrStackSize(int slotIndex, int decrementAmount)
    {
        ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null)
        {
            if (itemStack.stackSize <= decrementAmount)
            {
                setInventorySlotContents(slotIndex, null);
            }
            else
            {
                itemStack = itemStack.splitStack(decrementAmount);
                if (itemStack.stackSize == 0)
                {
                    setInventorySlotContents(slotIndex, null);
                }
            }
        }
        return itemStack;
    }

    /*
Sets the stack on closing.
If the stack is not null, set it to null
 */
    @Override
    public ItemStack getStackInSlotOnClosing(int slotIndex)
    {
        ItemStack itemStack = getStackInSlot(slotIndex);
        if (itemStack != null)
        {
            setInventorySlotContents(slotIndex, null);
        }
        return itemStack;
    }
    /*
    Sets the Inventory content.
    If the stack you place exeeds the maxStackSize, set the size to maxStacksize.
     */
    @Override
    public void setInventorySlotContents(int slotIndex, ItemStack itemStack)
    {
        inventory[slotIndex] = itemStack;
        if (itemStack != null && itemStack.stackSize > getInventoryStackLimit())
        {
            itemStack.stackSize = getInventoryStackLimit();
        }
    }
    /*
Returns the Inv name, not req.
 */
    @Override
    public String getInventoryName()
    {
        return "aString";
    }
    /*
     IF you want, return true. Not req.
      */
    @Override
    public boolean hasCustomInventoryName()
    {
        return true;
    }

    /*
    Max stacksize in slot.
     */
    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    /*
    return true, or you wont be able to use it.
     */
    @Override
    public boolean isUseableByPlayer(EntityPlayer var1)
    {
        return true;
    }

    /*
    Do very little
     */
    @Override
    public void openInventory()
    {

    }

    /*
    Do as little as.
     */
    @Override
    public void closeInventory()
    {

    }

    /*
    You can put your custom items here, if you want
     */
    @Override
    public boolean isItemValidForSlot(int var1, ItemStack var2)
    {
        //TODO
        return true;
    }
}
