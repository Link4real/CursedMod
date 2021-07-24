package com.link.cursed.mod;

import com.link.cursed.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

public static final String MOD_ID = "cursed";




    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
