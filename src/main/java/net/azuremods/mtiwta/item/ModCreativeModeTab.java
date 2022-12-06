package net.azuremods.mtiwta.item;

import net.azuremods.mtiwta.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MTIWTA_TAB = new CreativeModeTab("mtiwta_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.POLISHED_ANDESITE_BRICKS.get());
        }
    };
}
