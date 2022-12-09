package net.azuremods.mtiwta.block;

import net.azuremods.mtiwta.MTIWTA;
import net.azuremods.mtiwta.item.ModCreativeModeTab;
import net.azuremods.mtiwta.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MTIWTA.MOD_ID);

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS_STAIRS = registerBlock("polished_granite_bricks_stairs",
            ()-> new StairBlock(() -> ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState() ,
                    BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)),
            ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS_SLAB = registerBlock("polished_granite_bricks_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS_WALL = registerBlock("polished_granite_bricks_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS_STAIRS = registerBlock("polished_andesite_bricks_stairs",
            ()-> new StairBlock(() -> ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState() ,
                    BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)),
            ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS_SLAB = registerBlock("polished_andesite_bricks_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS_WALL = registerBlock("polished_andesite_bricks_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);


    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS_STAIRS = registerBlock("polished_diorite_bricks_stairs",
            ()-> new StairBlock(() -> ModBlocks.POLISHED_GRANITE_BRICKS.get().defaultBlockState() ,
                    BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)),
            ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS_SLAB = registerBlock("polished_diorite_bricks_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS_WALL = registerBlock("polished_diorite_bricks_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);
    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MTIWTA_TAB);



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
