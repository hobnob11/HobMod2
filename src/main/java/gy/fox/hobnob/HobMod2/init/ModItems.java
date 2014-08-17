package gy.fox.hobnob.HobMod2.init;

import cpw.mods.fml.common.registry.GameRegistry;
import gy.fox.hobnob.HobMod2.item.ItemCustomRecord;
import gy.fox.hobnob.HobMod2.item.ItemHM2;
import gy.fox.hobnob.HobMod2.item.ItemMapleLeaf;
import net.minecraft.item.ItemRecord;

public class ModItems {

    public static final ItemHM2 mapleLeaf = new ItemMapleLeaf();
    public static ItemCustomRecord bakerCatRecord;

    @SuppressWarnings("RedundantCast")
    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(bakerCatRecord = new ItemCustomRecord("bakercat", "Baker Cat :D", new String[]{"Improves productivity 20%!", "Only if you are pusheen"}).setDomain("hobmod2"), "bakercat");
    }

}
