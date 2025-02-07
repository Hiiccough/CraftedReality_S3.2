package net.hiccough.craftedreality.worldgen;

import net.hiccough.craftedreality.CraftedReality;
import net.hiccough.craftedreality.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

//AQUARI LUMITITE VOIDSTONE FROSTIUM SILVER PLATINUM LEAD TITANIUM
public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AQUARI_ORE_KEY = registerKey("aquari");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LUMITITE_ORE_KEY = registerKey("lumitite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_VOIDSTONE_ORE_KEY = registerKey("voidstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FROSTIUM_ORE_KEY = registerKey("frostium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_ORE_KEY = registerKey("titanium");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldAquariOres = List.of(
                OreConfiguration.target(stoneReplacables, ModBlocks.AQUARI_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.AQUARI_DEEPSLATE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldLumititeOres = List.of(
                OreConfiguration.target(stoneReplacables, ModBlocks.LUMITITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.LUMITITE_DEEPSLATE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldVoidstone = List.of(
                OreConfiguration.target(stoneReplacables, ModBlocks.VOIDSTONE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.VOIDSTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldFrostiumOres = List.of(
                OreConfiguration.target(stoneReplacables, ModBlocks.FROSTIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.FROSTIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(
                OreConfiguration.target(stoneReplacables, ModBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.SILVER_DEEPSLATE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(
                OreConfiguration.target(stoneReplacables, ModBlocks.PLATINUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.PLATINUM_DEEPSLATE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldLeadOres = List.of(
                OreConfiguration.target(stoneReplacables, ModBlocks.LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.LEAD_DEEPSLATE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTitaniumOres = List.of(
                OreConfiguration.target(stoneReplacables, ModBlocks.TITANIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.TITANIUM_DEEPSLATE_ORE.get().defaultBlockState()));


        register(context, OVERWORLD_AQUARI_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAquariOres, 4));
        register(context, OVERWORLD_LUMITITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLumititeOres, 5));
        register(context, OVERWORLD_VOIDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldVoidstone, 2));
        register(context, OVERWORLD_FROSTIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldFrostiumOres, 3));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres, 5));
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres, 8));
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres, 7));
        register(context, OVERWORLD_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTitaniumOres, 6));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(CraftedReality.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}