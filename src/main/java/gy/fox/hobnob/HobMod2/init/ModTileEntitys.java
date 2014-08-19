package gy.fox.hobnob.HobMod2.init;


import cpw.mods.fml.common.registry.GameRegistry;
import gy.fox.hobnob.HobMod2.HobMod2;

public class ModTileEntitys {

    public static void init()
    {
        GameRegistry.registerTileEntity(gy.fox.hobnob.HobMod2.tileentitys.TileBakerCat.class, "HobTileBakerCat");
    }
}
