package net.azuremods.mtiwta.item;

import net.azuremods.mtiwta.MTIWTA;
import net.azuremods.mtiwta.tool.AccurateShearsItem;
import net.azuremods.mtiwta.tool.ModTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MTIWTA.MOD_ID);

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModTiers.COPPER, 3, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.MTIWTA_TAB)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModTiers.COPPER, 1.5F, -3F,
                    new Item.Properties().tab(ModCreativeModeTab.MTIWTA_TAB)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, 1, -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.MTIWTA_TAB)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModTiers.COPPER, 7, -3.2F,
                    new Item.Properties().tab(ModCreativeModeTab.MTIWTA_TAB)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModTiers.COPPER, -1, -2.0F,
                    new Item.Properties().tab(ModCreativeModeTab.MTIWTA_TAB)));

    public static final RegistryObject<Item> DIAMOND_SHEARS = ITEMS.register("diamond_shears",
            () -> new AccurateShearsItem(new Item.Properties().stacksTo(1).durability(1549).tab(ModCreativeModeTab.MTIWTA_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
