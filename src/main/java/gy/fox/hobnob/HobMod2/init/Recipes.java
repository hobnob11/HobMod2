package gy.fox.hobnob.HobMod2.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf)," s ","sss"," s ", new ItemStack(Items.stick));
    }
}
