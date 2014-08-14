package gy.fox.hobnob.HobMod2.init;

import cpw.mods.fml.common.registry.GameRegistry;
import gy.fox.hobnob.HobMod2.handler.ConfigHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void init() {


        OreDictionary.registerOre("cloth", new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE));

        if(ConfigHandler.mapleCraftingToggle==true) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ", "sss", " s ", 's', "treeSapling"));
        }
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag),"stickWood","cloth", new ItemStack(ModItems.mapleLeaf)));
    }
}
