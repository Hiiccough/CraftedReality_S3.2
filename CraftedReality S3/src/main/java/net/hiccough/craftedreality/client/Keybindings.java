package net.hiccough.craftedreality.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.hiccough.craftedreality.CraftedReality;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;

public final class Keybindings {
    public static final Keybindings INSTANCE = new Keybindings();

    private Keybindings(){}


    private static final String CATEGORY = "key.categories." + CraftedReality.MOD_ID;

    public final KeyMapping attributesKey = new KeyMapping(
            "key." + CraftedReality.MOD_ID + ".attributeskey",
            KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_G, -1),
            CATEGORY

    );
}
