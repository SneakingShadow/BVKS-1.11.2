package com.sneakingshadow.bvks.item;

import com.sneakingshadow.bvks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import java.util.ArrayList;

public class ItemBVKS extends Item {

    public ArrayList<CreativeTabs> creativeTabs = new ArrayList<CreativeTabs>();

    public ItemBVKS(String name)
    {
        setUnlocalizedName(Reference.getResourceName(name));
        setRegistryName(Reference.getResourceLocation(name));
    }

    @Override
    public ItemBVKS setCreativeTab(CreativeTabs tab)
    {
        if (!creativeTabs.contains(tab)) {
            creativeTabs.add(tab);
        }

        return this;
    }

    public ItemBVKS setCreativeTab(CreativeTabs... tabs)
    {
        for (CreativeTabs tab : tabs) {
            setCreativeTab(tab);
        }

        return this;
    }

    /**
     * Gets a list of tabs that items belonging to this class can display on,
     * combined properly with getSubItems allows for a single item to span
     * many sub-items across many tabs.
     *
     * @return A list of all tabs that this item could possibly be one.
     */
    public CreativeTabs[] getCreativeTabs()
    {
        return (creativeTabs.isEmpty() ? new CreativeTabs[]{ getCreativeTab() }
        : creativeTabs.toArray(new CreativeTabs[]{ }));
    }

}
