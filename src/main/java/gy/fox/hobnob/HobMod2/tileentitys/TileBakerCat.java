package gy.fox.hobnob.HobMod2.tileentitys;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import gy.fox.hobnob.HobMod2.init.ModItems;
import gy.fox.hobnob.HobMod2.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileBakerCat extends TileEntity
{
    public boolean musicBool = false;

    @Override
    public void writeToNBT(NBTTagCompound par1)
    {
        super.writeToNBT(par1);
        par1.setBoolean("musicBool", musicBool);
    }

    @Override
    public void readFromNBT(NBTTagCompound par1)
    {
        super.readFromNBT(par1);
        this.musicBool = par1.getBoolean("musicBool");
    }

    public void redstoneChnaged(boolean powered, World world, int x, int y, int z)
    {
        if (powered)
        {
            if(!musicBool)
            {
                musicBool=true;
                world.playAuxSFXAtEntity((EntityPlayer)null, 1005, x,y,z, Item.getIdFromItem(ModItems.rbc));
                LogHelper.info("Go Music!");
            }
        }
        else
        {
            musicBool=false;
            world.playRecord(null, x, y, z);
            world.playAuxSFXAtEntity((EntityPlayer)null, 1005, x,y,z,1005);
        }
    }
}
