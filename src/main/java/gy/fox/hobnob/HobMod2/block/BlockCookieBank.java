

package gy.fox.hobnob.HobMod2.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gy.fox.hobnob.HobMod2.HobMod2;
import gy.fox.hobnob.HobMod2.creativetab.CreativeTabHM2;
import gy.fox.hobnob.HobMod2.reference.Reference;
import gy.fox.hobnob.HobMod2.te.CookieBankTE;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCookieBank extends BlockContainer
{
    //this was protected, if it breaks now its ShadowBlades fault
   public BlockCookieBank()
   {
       super(Material.rock);
       this.setCreativeTab(CreativeTabHM2.HM2_TAB);
       this.setBlockName(Reference.MOD_ID+":"+"BlockCookieBank");
       GameRegistry.registerBlock(this, this.getUnlocalizedName());
   }

    @Override
    public boolean hasTileEntity(int meta)
    {
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2)
    {
        return new CookieBankTE();
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int par1, float par2, float par3, float par4)
    {
        entityPlayer.openGui(HobMod2.instance,1,world,x,y,z);
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(this.getUnlocalizedName());
    }
}

