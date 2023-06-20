package com.tulakal.ration.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModTabs {
    public static final CreativeTabs GROUP_ITEM = new CreativeTabs(CreativeTabs.getNextID(),"ration_item") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.APPLE);
        }
    };
}
