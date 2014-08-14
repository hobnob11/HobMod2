package gy.fox.hobnob.HobMod2.init;

import cpw.mods.fml.common.registry.GameRegistry;
import gy.fox.hobnob.HobMod2.item.ItemHM2;
import gy.fox.hobnob.HobMod2.item.ItemMapleLeaf;

public class ModItems {

    public static final ItemHM2 mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }

}
