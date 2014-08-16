package gy.fox.hobnob.HobMod2.block;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gy.fox.hobnob.HobMod2.utility.LogHelper;
import net.minecraft.block.Block;
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

    private boolean powered;
    @Override
    public void onNeighborBlockChange(World para1_world, int para2, int para3, int para4, Block para5)
    {
        if(FMLCommonHandler.instance().getEffectiveSide() == Side.SERVER) {
            if (para1_world.isBlockIndirectlyGettingPowered(para2, para3, para4) && !powered) {
                powered=true;
                para1_world.setBlockMetadataWithNotify(para2, para3, para4, 1, 2);
                LogHelper.info("Metadata 1");
            }
            else if(!para1_world.isBlockIndirectlyGettingPowered(para2,para3,para4)&& powered) {
                powered=false;
                para1_world.setBlockMetadataWithNotify(para2, para3, para4, 0, 2);
                LogHelper.info("Metadata 0");
            }
        }
    }

}
