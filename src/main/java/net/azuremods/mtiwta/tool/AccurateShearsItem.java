package net.azuremods.mtiwta.tool;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;

public class AccurateShearsItem extends ShearsItem {
    public AccurateShearsItem(Item.Properties properties){
        super(properties);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        ItemStack container = itemStack.copy();
        container.setDamageValue(container.getDamageValue() + 1);
        if (container.getDamageValue() > container.getMaxDamage()){
            return ItemStack.EMPTY;
        } else {
            return container;
        }
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
}
