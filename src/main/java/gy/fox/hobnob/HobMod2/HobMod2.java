package gy.fox.hobnob.HobMod2;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import gy.fox.hobnob.HobMod2.proxy.IProxy;
import gy.fox.hobnob.HobMod2.reference.Reference;

@Mod(modid= Reference.MOD_ID, Reference.MOD_NAME, version="1.7.10-1.0")

public class HobMod2
{

    @Mod.Instance("HobMod2")
    public static HobMod2 instance;

    @SidedProxy(clientSide = "gy.fox.hobnob.HobMod2.proxy.ClientProxy", serverSide = "gy.fox.hobnob.HobMod2.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
