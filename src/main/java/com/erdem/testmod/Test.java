package com.erdem.testmod;

import com.erdem.testmod.registry.ModBlocks;
import com.erdem.testmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Test implements ModInitializer {

    public static final String MOD_ID = "testm";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerItems();

    }
}
