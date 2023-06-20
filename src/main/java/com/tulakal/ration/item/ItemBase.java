package com.tulakal.ration.item;

import com.tulakal.ration.init.ModItems;
import com.tulakal.ration.proxy.ClientProxy;
import com.tulakal.ration.tab.ModTabs;
import com.tulakal.ration.util.IHasModel;
import com.tulakal.ration.util.Reference;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        super();
        Reference.initItem(this, name);
        setCreativeTab(ModTabs.GROUP_ITEM);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModel() {
        new ClientProxy().modelItemRenderer(this, 0);
    }
}
