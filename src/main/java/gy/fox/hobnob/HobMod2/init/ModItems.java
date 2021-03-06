package gy.fox.hobnob.HobMod2.init;

import cpw.mods.fml.common.registry.GameRegistry;
import gy.fox.hobnob.HobMod2.item.ItemCustomRecord;
import gy.fox.hobnob.HobMod2.item.ItemHM2;
import gy.fox.hobnob.HobMod2.item.ItemMapleLeaf;
import gy.fox.hobnob.HobMod2.utility.LogHelper;
import net.minecraft.item.ItemRecord;

public class ModItems {

    public static final ItemHM2 mapleLeaf = new ItemMapleLeaf();
    public static ItemCustomRecord rbc;

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        GameRegistry.registerItem(rbc = new ItemCustomRecord("rbc", "Baker Cat :D", new String[]{"Improves productivity 20%!", "Only if you are pusheen"}).setDomain("hobmod2"), "rbc");
        LogHelper.info(rbc.getRecordNameLocal());
    }

}
