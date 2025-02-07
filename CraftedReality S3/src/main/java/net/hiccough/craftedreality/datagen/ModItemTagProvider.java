package net.hiccough.craftedreality.datagen;

import net.hiccough.craftedreality.CraftedReality;
import net.hiccough.craftedreality.item.ModItems;
import net.hiccough.craftedreality.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                              CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, CraftedReality.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.AQUARI_INGOT.get())
                .add(ModItems.RAW_AQUARI.get())
                .add(Items.STICK);

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TYLERITE_HELMET.get())
                .add(ModItems.TYLERITE_CHESTPLATE.get())
                .add(ModItems.TYLERITE_LEGGINGS.get())
                .add(ModItems.TYLERITE_BOOTS.get());

        tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.AQUARI_INGOT.get());

        tag(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.HICCOUGH_SMITHING_TEMPLATE.get());
    }
}
