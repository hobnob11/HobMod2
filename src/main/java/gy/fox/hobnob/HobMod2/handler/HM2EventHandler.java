package gy.fox.hobnob.HobMod2.handler;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import gy.fox.hobnob.HobMod2.init.ModItems;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

public class HM2EventHandler {

    @SubscribeEvent
    public void onLeafBlockBrokenEvent(BlockEvent.HarvestDropsEvent event) {

        if(event.block == Blocks.leaves || event.block == Blocks.leaves2) {

            //Drops
            if(Math.random()<=ConfigHandler.mapleDropChance) {
                event.world.spawnEntityInWorld(new EntityItem(event.world, event.x, event.y, event.z, new ItemStack(ModItems.mapleLeaf)));
            }

        }

    }


}
