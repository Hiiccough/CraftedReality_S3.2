package net.hiccough.craftedreality;

import net.hiccough.craftedreality.block.ModBlocks;
import net.hiccough.craftedreality.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    //Registry for the new creative mode tabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CraftedReality.MOD_ID);

    //Registry for all new Items added for the mod
    public static final RegistryObject<CreativeModeTab> CRAFTED_REALITY_ITEMS_TAB = CREATIVE_MODE_TABS.register("crafted_reality_items_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.AQUARI_INGOT.get()))
                    .title(Component.translatable("creativetab.tutorialmod.crafted_reality_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHISEL.get());
                        output.accept(ModItems.KOHLRABI.get());
                        output.accept(ModItems.AURORA_ASHES.get());

                        output.accept(ModItems.AQUARI_HOE.get());
                        output.accept(ModItems.AQUARI_SWORD.get());
                        output.accept(ModItems.AQUARI_AXE.get());
                        output.accept(ModItems.AQUARI_PICKAXE.get());
                        output.accept(ModItems.AQUARI_SHOVEL.get());

                        output.accept(ModItems.AQUARI_HOE.get());

                        output.accept(ModItems.AQUARI_HAMMER.get());

                        output.accept(ModItems.AQUARI_HELMET.get());
                        output.accept(ModItems.AQUARI_CHESTPLATE.get());
                        output.accept(ModItems.AQUARI_LEGGINGS.get());
                        output.accept(ModItems.AQUARI_BOOTS.get());

                        output.accept(ModItems.AQUARI_HORSE_ARMOR.get());

                        output.accept(ModItems.LEAD_INGOT.get());
                        output.accept(ModItems.RAW_LEAD.get());
                        output.accept(ModItems.SILVER_INGOT.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.TITANIUM_INGOT.get());
                        output.accept(ModItems.RAW_TITANIUM.get());
                        output.accept(ModItems.PLATINUM_INGOT.get());
                        output.accept(ModItems.RAW_PLATINUM.get());
                        output.accept(ModItems.FROSTIUM_SHARD.get());
                        output.accept(ModItems.LUMITITE_INGOT.get());
                        output.accept(ModItems.RAW_LUMITITE.get());
                        output.accept(ModItems.AQUARI_INGOT.get());
                        output.accept(ModItems.RAW_AQUARI.get());

                    }).build());

    //Creative tab for all new blocks for the mod
    public static final RegistryObject<CreativeModeTab> CRAFTED_REALITY_BLOCKS_TAB = CREATIVE_MODE_TABS.register("crafted_realtiy_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.AQUARI_BLOCK.get()))
                    .withTabsBefore(CRAFTED_REALITY_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.tutorialmod.crafted_realtiy_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.AQUARI_BLOCK.get());
                        output.accept(ModBlocks.RAW_AQUARI_BLOCK.get());
                        output.accept(ModBlocks.AQUARI_ORE.get());
                        output.accept(ModBlocks.AQUARI_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.LUMITITE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.LUMITITE_ORE.get());
                        output.accept(ModBlocks.VOIDSTONE.get());
                        output.accept(ModBlocks.FROSTIUM_ORE.get());
                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.SILVER_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.TITANIUM_ORE.get());
                        output.accept(ModBlocks.TITANIUM_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.PLATINUM_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.PLATINUM_ORE.get());
                        output.accept(ModBlocks.LEAD_ORE.get());
                        output.accept(ModBlocks.LEAD_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.SILVER_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_TITANIUM_BLOCK.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        output.accept(ModBlocks.RAW_LEAD_BLOCK.get());

                        output.accept(ModBlocks.PLATINUM_BLOCK.get());
                        output.accept(ModBlocks.TITANIUM_BLOCK.get());
                        output.accept(ModBlocks.SILVER_BLOCK.get());
                        output.accept(ModBlocks.LEAD_BLOCK.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
