package gy.fox.hobnob.HobMod2.creativetab;


import gy.fox.hobnob.HobMod2.init.ModItems;
import gy.fox.hobnob.HobMod2.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabHM2
{
    public static final CreativeTabs HM2_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }
    };
}
