package gy.fox.hobnob.HobMod2.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import gy.fox.hobnob.HobMod2.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration configuration;
    public static boolean mapleCraftingToggle = false;
    public static float mapleDropChance = 0.9f;

    public static void init(File configFile)
    {
        //Create the object from the given file
        if(configuration==null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        mapleCraftingToggle = configuration.getBoolean("mapleCraftingToggle", Configuration.CATEGORY_GENERAL,false,"If the maple leaf can be crafted via 5 saplings in a cross shape");
        mapleDropChance = configuration.getFloat("mapleDropChance", Configuration.CATEGORY_GENERAL,0.1f,0.0f,1.0f,"How often the maple leaf drops from leaf blocks, 0.0f is never, 1.0f is always");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
