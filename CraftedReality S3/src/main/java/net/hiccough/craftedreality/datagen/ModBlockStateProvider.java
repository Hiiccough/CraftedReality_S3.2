package net.hiccough.craftedreality.datagen;

import net.hiccough.craftedreality.CraftedReality;
import net.hiccough.craftedreality.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CraftedReality.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AQUARI_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.LUMITITE_BLOCK);

        blockWithItem(ModBlocks.RAW_AQUARI_BLOCK);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.RAW_TITANIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);


        blockWithItem(ModBlocks.AQUARI_ORE);
        blockWithItem(ModBlocks.LUMITITE_ORE);

        blockWithItem(ModBlocks.AQUARI_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.LUMITITE_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.SILVER_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.PLATINUM_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.LEAD_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.LEAD_ORE);
        blockWithItem(ModBlocks.TITANIUM_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.FROSTIUM_ORE);
        blockWithItem(ModBlocks.VOIDSTONE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("crafted_reality:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("crafted_reality:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

}