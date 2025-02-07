package net.hiccough.craftedreality.item;

import net.hiccough.craftedreality.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier TYLERITE = new ForgeTier(1400, 4, 3f, 20,
            ModTags.Blocks.NEEDS_AQUARI_TOOL, ()-> Ingredient.of(ModItems.AQUARI_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_AQUARI_TOOL);
}
