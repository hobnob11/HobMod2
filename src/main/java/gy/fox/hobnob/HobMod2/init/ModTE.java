package gy.fox.hobnob.HobMod2.init;


import cpw.mods.fml.common.registry.GameRegistry;
import gy.fox.hobnob.HobMod2.te.BakerCatTE;
import gy.fox.hobnob.HobMod2.te.CookieBankTE;

public class ModTE {

    public static void init()
    {
        GameRegistry.registerTileEntity(BakerCatTE.class, "BakerCatTE");
        GameRegistry.registerTileEntity(CookieBankTE.class, "CookieBankTE");
    }
}
