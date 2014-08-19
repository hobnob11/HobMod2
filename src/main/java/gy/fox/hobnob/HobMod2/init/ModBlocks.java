package gy.fox.hobnob.HobMod2.init;

import cpw.mods.fml.common.registry.GameRegistry;
import gy.fox.hobnob.HobMod2.block.BlockBakerCat;
import gy.fox.hobnob.HobMod2.block.BlockCookieBank;
import gy.fox.hobnob.HobMod2.block.BlockFlag;
import gy.fox.hobnob.HobMod2.block.BlockHM2;
import net.minecraft.block.Block;

public class ModBlocks {
    public static final BlockHM2 flag = new BlockFlag();
    public static final BlockHM2 bakercat = new BlockBakerCat();
    public static Block cookieBank;

    public static void init(){

        cookieBank = new BlockCookieBank();

        GameRegistry.registerBlock(flag,"flag");
        GameRegistry.registerBlock(bakercat,"bakercat");
    }
}
