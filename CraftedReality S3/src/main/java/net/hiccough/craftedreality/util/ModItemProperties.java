package net.hiccough.craftedreality.util;

import net.hiccough.craftedreality.CraftedReality;
import net.hiccough.craftedreality.component.ModDataComponentTypes;
import net.hiccough.craftedreality.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItemProperties {
    public static void addCustomItemProperties(){
        ItemProperties.register(ModItems.CHISEL.get(), ResourceLocation.fromNamespaceAndPath(CraftedReality.MOD_ID, "used"),
                (pStack, pLevel, pEntity, pSeed) -> pStack.get(ModDataComponentTypes.COORDINATES.get()) !=null ? 1f:0f);

        makeCustomBow(ModItems.HICCOUGH_BOW.get());

    }

    private static void makeCustomBow(Item item){
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), (p_340951_, p_340952_, p_340953_, p_340954_) -> {
            if (p_340953_ == null) {
                return 0.0F;
            } else {
                return p_340953_.getUseItem() != p_340951_ ? 0.0F : (float)(p_340951_.getUseDuration(p_340953_) - p_340953_.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) ->
                p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F
        );
    }
}
