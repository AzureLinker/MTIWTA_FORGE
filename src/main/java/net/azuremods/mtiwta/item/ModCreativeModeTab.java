package net.azuremods.mtiwta.item;

import net.azuremods.mtiwta.block.ModBlocks;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;


public class ModCreativeModeTab {

    public static final CreativeModeTab MTIWTA_TAB = new CreativeModeTab("mtiwta_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.POLISHED_ANDESITE_BRICKS.get());
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> itemStacks) {

            Object[] listOfItems =
                    ModItems.ITEMS.getEntries().stream().map(RegistryObject::get).toArray();
            List<Item> items = new ArrayList<Item>();
            for (int y = 0;y < listOfItems.length;y++){
                items.add(((Item)(listOfItems[y])));
            }
            itemStacks.clear();

            for (Item item : items) {
                if (item.getCreativeTabs().contains(MTIWTA_TAB)) {
                    itemStacks.add(new ItemStack(item));
                }
            }
        }
    };



}
