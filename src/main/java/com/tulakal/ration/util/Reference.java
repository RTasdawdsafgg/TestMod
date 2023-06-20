package com.tulakal.ration.util;

import net.minecraft.item.Item;

public class Reference {

    public static final String MOD_ID = "ration";
    public static final String NAME ="Ration";
    public static final String VERSION = "0.0.0";
    public static final String ACCEPTED_VERSION = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.tulakal.ration.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.tulakal.ration.proxy.CommonProxy";

    public static void initItem(Item item, String name) {
        item.setUnlocalizedName(name);
        item.setRegistryName(name);
    }

}
