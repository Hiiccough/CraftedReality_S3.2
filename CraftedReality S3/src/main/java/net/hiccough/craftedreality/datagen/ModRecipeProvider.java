package net.hiccough.craftedreality.datagen;

import net.hiccough.craftedreality.CraftedReality;
import net.hiccough.craftedreality.block.ModBlocks;
import net.hiccough.craftedreality.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }



    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> AQUARI_SMELTABLES = List.of(ModItems.RAW_AQUARI.get(), ModBlocks.AQUARI_ORE.get(), ModBlocks.AQUARI_DEEPSLATE_ORE.get());

        List<ItemLike> LUMITITE_SMELTABLES = List.of(ModItems.RAW_LUMITITE.get(), ModBlocks.LUMITITE_ORE.get(), ModBlocks.LUMITITE_DEEPSLATE_ORE.get());

        List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM.get(),  ModBlocks.PLATINUM_ORE.get(), ModBlocks.PLATINUM_DEEPSLATE_ORE.get());

        List<ItemLike> TITANIUM_SMELTABLES = List.of(ModItems.RAW_TITANIUM.get(), ModBlocks.TITANIUM_ORE.get(), ModBlocks.TITANIUM_DEEPSLATE_ORE.get());

        List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD.get(), ModBlocks.LEAD_ORE.get(), ModBlocks.LEAD_DEEPSLATE_ORE.get());

        List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER.get(), ModBlocks.SILVER_ORE.get(), ModBlocks.SILVER_DEEPSLATE_ORE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AQUARI_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AQUARI_INGOT.get())
                .unlockedBy(getHasName(ModItems.AQUARI_INGOT.get()), has(ModItems.AQUARI_INGOT.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_AQUARI_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_AQUARI.get())
                .unlockedBy(getHasName(ModItems.RAW_AQUARI.get()), has(ModItems.RAW_AQUARI.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(ModItems.SILVER_INGOT.get()), has(ModItems.SILVER_INGOT.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_SILVER.get())
                .unlockedBy(getHasName(ModItems.RAW_SILVER.get()), has(ModItems.RAW_SILVER.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLATINUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PLATINUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.PLATINUM_INGOT.get()), has(ModItems.PLATINUM_INGOT.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PLATINUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_PLATINUM.get())
                .unlockedBy(getHasName(ModItems.RAW_PLATINUM.get()), has(ModItems.RAW_PLATINUM.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LEAD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LEAD_INGOT.get())
                .unlockedBy(getHasName(ModItems.LEAD_INGOT.get()), has(ModItems.LEAD_INGOT.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_LEAD_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_LEAD.get())
                .unlockedBy(getHasName(ModItems.RAW_LEAD.get()), has(ModItems.RAW_LEAD.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TITANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.TITANIUM_INGOT.get()), has(ModItems.TITANIUM_INGOT.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_TITANIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_TITANIUM.get())
                .unlockedBy(getHasName(ModItems.RAW_TITANIUM.get()), has(ModItems.RAW_TITANIUM.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LUMITITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.LUMITITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.LUMITITE_INGOT.get()), has(ModItems.LUMITITE_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AQUARI_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AQUARI_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.AQUARI_INGOT.get()), has(ModItems.AQUARI_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AQUARI_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AQUARI_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.AQUARI_INGOT.get()), has(ModItems.AQUARI_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AQUARI_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.AQUARI_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.AQUARI_INGOT.get()), has(ModItems.AQUARI_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AQUARI_HOE.get())
                .pattern(" AA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AQUARI_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.AQUARI_INGOT.get()), has(ModItems.AQUARI_INGOT.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AQUARI_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.AQUARI_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.AQUARI_INGOT.get()), has(ModItems.AQUARI_INGOT.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AQUARI_INGOT.get(), 9)
                .requires(ModBlocks.AQUARI_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AQUARI_BLOCK.get()), has(ModBlocks.AQUARI_BLOCK.get())).save(pRecipeOutput);



        oreSmelting(pRecipeOutput, AQUARI_SMELTABLES, RecipeCategory.MISC, ModItems.AQUARI_INGOT.get(), 0.25f, 200, "aquari");
        oreBlasting(pRecipeOutput, AQUARI_SMELTABLES, RecipeCategory.MISC, ModItems.AQUARI_INGOT.get(), 0.25f, 100, "aquari");

        oreSmelting(pRecipeOutput, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 200, "lead");
        oreBlasting(pRecipeOutput, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT.get(), 0.25f, 100, "lead");

        oreSmelting(pRecipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.25f, 200, "platinum");
        oreBlasting(pRecipeOutput, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.25f, 100, "platinum");

        oreSmelting(pRecipeOutput, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.25f, 200, "titanium");
        oreBlasting(pRecipeOutput, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.25f, 100, "titanium");

        oreSmelting(pRecipeOutput, LUMITITE_SMELTABLES, RecipeCategory.MISC, ModItems.LUMITITE_INGOT.get(), 0.25f, 200, "lumitite");
        oreBlasting(pRecipeOutput, LUMITITE_SMELTABLES, RecipeCategory.MISC, ModItems.LUMITITE_INGOT.get(), 0.25f, 100, "lumitite");

        oreSmelting(pRecipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 200, "silver");
        oreBlasting(pRecipeOutput, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT.get(), 0.25f, 100, "silver");


    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, CraftedReality.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}