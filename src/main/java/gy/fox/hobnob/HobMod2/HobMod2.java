package gy.fox.hobnob.HobMod2;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import gy.fox.hobnob.HobMod2.handler.ConfigHandler;
import gy.fox.hobnob.HobMod2.handler.HM2EventHandler;
import gy.fox.hobnob.HobMod2.init.ModBlocks;
import gy.fox.hobnob.HobMod2.init.ModItems;
import gy.fox.hobnob.HobMod2.init.ModTileEntitys;
import gy.fox.hobnob.HobMod2.init.Recipes;
import gy.fox.hobnob.HobMod2.proxy.IProxy;
import gy.fox.hobnob.HobMod2.reference.Reference;
import gy.fox.hobnob.HobMod2.utility.LogHelper;
import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)

public class HobMod2
{

    @Mod.Instance(Reference.MOD_ID)
    public static HobMod2 instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        MinecraftForge.EVENT_BUS.register(new HM2EventHandler());
        ModItems.init();
        ModBlocks.init();
        ModTileEntitys.init();
        LogHelper.info("Pre initialization Complete!");


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete!");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInit Complete!");
    }

}

