package net.hiccough.craftedreality.datagen;

import net.hiccough.craftedreality.CraftedReality;
import net.hiccough.craftedreality.block.ModBlocks;
import net.hiccough.craftedreality.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CryingObsidianBlock;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CraftedReality.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AQUARI_BLOCK.get())
                .add(ModBlocks.RAW_AQUARI_BLOCK.get())
                .add(ModBlocks.AQUARI_ORE.get())
                .add(ModBlocks.AQUARI_DEEPSLATE_ORE.get())
                .add(ModBlocks.MAGIC_BLOCK.get())
                .add(ModBlocks.LUMITITE_BLOCK.get())
                .add(ModBlocks.LUMITITE_BLOCK.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.LEAD_DEEPSLATE_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_DEEPSLATE_ORE.get())
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.TITANIUM_DEEPSLATE_ORE.get())
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.PLATINUM_DEEPSLATE_ORE.get())
                .add(ModBlocks.VOIDSTONE.get())

                .add(ModBlocks.LUMITITE_BLOCK.get())
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.TITANIUM_BLOCK.get())
                .add(ModBlocks.RAW_TITANIUM_BLOCK.get())
                .add(ModBlocks.PLATINUM_BLOCK.get())
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.LUMITITE_BLOCK.get())
                .add(ModBlocks.LUMITITE_BLOCK.get())
                .add(ModBlocks.LEAD_ORE.get())
                .add(ModBlocks.LEAD_DEEPSLATE_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_DEEPSLATE_ORE.get())
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.TITANIUM_DEEPSLATE_ORE.get())
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.PLATINUM_DEEPSLATE_ORE.get())
                .add(ModBlocks.LUMITITE_BLOCK.get())
                .add(ModBlocks.LEAD_BLOCK.get())
                .add(ModBlocks.RAW_LEAD_BLOCK.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())
                .add(ModBlocks.TITANIUM_BLOCK.get())
                .add(ModBlocks.RAW_TITANIUM_BLOCK.get())
                .add(ModBlocks.PLATINUM_BLOCK.get())
                .add(ModBlocks.RAW_PLATINUM_BLOCK.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.AQUARI_DEEPSLATE_ORE.get())
                .add(ModBlocks.AQUARI_ORE.get());

        //adds what blocks the tool can mine
        tag(ModTags.Blocks.NEEDS_AQUARI_TOOL)
                .add((ModBlocks.RAW_AQUARI_BLOCK.get()))
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .add((ModBlocks.VOIDSTONE.get()))
                .add((ModBlocks.LUMITITE_ORE.get()))
                .add((ModBlocks.LUMITITE_DEEPSLATE_ORE.get()));

        //removes blocks that would be restricted by iron tools that tylerite can mine
        tag(ModTags.Blocks.INCORRECT_FOR_AQUARI_TOOL);

    }
}
