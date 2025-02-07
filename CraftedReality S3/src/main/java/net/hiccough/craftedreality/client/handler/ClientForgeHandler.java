package net.hiccough.craftedreality.client.handler;

import net.hiccough.craftedreality.CraftedReality;
import net.hiccough.craftedreality.client.Keybindings;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CraftedReality.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    private static final Component EXAMPLE_KEY_PRESSED =
            Component.translatable("message."+ CraftedReality.MOD_ID + ".example_key_press");

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event){
        Minecraft minecraft = Minecraft.getInstance();
        if (Keybindings.INSTANCE.attributesKey.isDown() && minecraft.player !=null){
            Keybindings.INSTANCE.attributesKey.consumeClick();
            minecraft.player.displayClientMessage(EXAMPLE_KEY_PRESSED, true);
        }
    }
}
