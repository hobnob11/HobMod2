package gy.fox.hobnob.HobMod2.block;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gy.fox.hobnob.HobMod2.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.client.renderer.texture.IIconRegister;
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
        if(side==2&&meta==1)
        {
            return blockIconFront;
        }
        else
        {
            return blockIcon;
        }
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block para5)
    {
        if(FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
            if (world.isBlockIndirectlyGettingPowered(x,y,z) && world.getBlockMetadata(x,y,z)==0) {
                world.setBlockMetadataWithNotify(x,y,z, 1, 2);
                LogHelper.info("Metadata 1");
                //world.playSoundEffect(x, y, z, "hobmod2:baker.cat", 0.2f, 1.0f);
                world.playRecord("hobmod2:records.rbc",x, y, z);

            }
            else if(!world.isBlockIndirectlyGettingPowered(x,y,z)&& world.getBlockMetadata(x,y,z)==1) {
                world.setBlockMetadataWithNotify(x,y,z, 0, 2);
                world.playRecord(null, x, y, z);
                LogHelper.info("Metadata 0");

            }
        }
    }

}
