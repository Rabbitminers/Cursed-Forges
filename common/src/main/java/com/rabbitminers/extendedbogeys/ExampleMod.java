package com.rabbitminers.extendedbogeys;

public class ExampleMod {
    public static final String MOD_ID = "extendedcogwheels";

    public static void init() {
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
