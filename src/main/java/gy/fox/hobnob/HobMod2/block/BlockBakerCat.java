package gy.fox.hobnob.HobMod2.block;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gy.fox.hobnob.HobMod2.HobMod2;
import gy.fox.hobnob.HobMod2.init.ModItems;
import gy.fox.hobnob.HobMod2.te.BakerCatTE;
import gy.fox.hobnob.HobMod2.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBakerCat extends BlockHM2 {

    public BlockBakerCat()
    {
        super();
        this.setBlockName("bakercat");
        this.setStepSound(Block.soundTypeMetal);
    }
    protected IIcon blockIcon;
    protected IIcon blockIconFront;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon("hobmod2:catBakerBlock");
        blockIconFront = iconRegister.registerIcon("hobmod2:catBakerActiveBlock");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        if(side==2)
        {
            return blockIconFront;
        }
        else
        {
            return blockIcon;
        }
    }
    @Override
    public boolean hasTileEntity(int meta)
    {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int meta)
    {
        return new BakerCatTE();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer,int par1, float par2, float par3, float par4)
    {
        entityPlayer.openGui(HobMod2.instance,0,world,x,y,z);
        return true;
    }

}
/*
dis how make sounds work
world.playAuxSFXAtEntity((EntityPlayer)null, 1005, x,y,z, Item.getIdFromItem(ModItems.rbc));
dis how stahp sounds
            world.playRecord(null, x, y, z);
            world.playAuxSFXAtEntity((EntityPlayer)null, 1005, x,y,z,1005);

 */