package com.rabbitminers.extendedbogeys.fabric;

import com.rabbitminers.extendedbogeys.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.init();
    }
}
