package net.hiccough.craftedreality.datagen;

import net.hiccough.craftedreality.block.ModBlocks;
import net.hiccough.craftedreality.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        //normal block drops
        dropSelf(ModBlocks.AQUARI_BLOCK.get());
        dropSelf(ModBlocks.RAW_AQUARI_BLOCK.get());
        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TITANIUM_BLOCK.get());

        dropSelf(ModBlocks.SILVER_BLOCK.get());
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        dropSelf(ModBlocks.LUMITITE_BLOCK.get());
        dropSelf(ModBlocks.MAGIC_BLOCK.get());

        //drops that are like normal ores
        this.add(ModBlocks.AQUARI_ORE.get(),
                block -> createOreDrop(ModBlocks.AQUARI_ORE.get(), ModItems.RAW_AQUARI.get()));
        this.add(ModBlocks.LUMITITE_ORE.get(),
                block -> createOreDrop(ModBlocks.LUMITITE_ORE.get(), ModItems.RAW_LUMITITE.get()));
        this.add(ModBlocks.FROSTIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.FROSTIUM_ORE.get(), ModItems.FROSTIUM_SHARD.get()));
        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        this.add(ModBlocks.LEAD_ORE.get(),
                block -> createOreDrop(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.TITANIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));

        this.add(ModBlocks.AQUARI_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.AQUARI_DEEPSLATE_ORE.get(), ModItems.RAW_AQUARI.get(), 2,6));
        this.add(ModBlocks.SILVER_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_DEEPSLATE_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.PLATINUM_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.PLATINUM_DEEPSLATE_ORE.get(), ModItems.RAW_PLATINUM.get()));
        this.add(ModBlocks.LEAD_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.LEAD_DEEPSLATE_ORE.get(), ModItems.RAW_LEAD.get()));
        this.add(ModBlocks.TITANIUM_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.TITANIUM_DEEPSLATE_ORE.get(), ModItems.RAW_TITANIUM.get()));
        this.add(ModBlocks.LUMITITE_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.LUMITITE_DEEPSLATE_ORE.get(), ModItems.RAW_LUMITITE.get()));

              dropSelf(ModBlocks.VOIDSTONE.get());
    }

    //creating ore drops that have multiple items
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}