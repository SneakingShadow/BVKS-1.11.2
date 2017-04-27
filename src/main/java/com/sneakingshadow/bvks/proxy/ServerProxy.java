package com.sneakingshadow.bvks.proxy;

import com.sneakingshadow.bvks.item.ItemBVKS;
import net.minecraft.util.ResourceLocation;

public class ServerProxy extends CommonProxy {



    //Client-side

    @Override
    public void registerItemRenderer(ItemBVKS item, int metadata, ResourceLocation location, String variantIn) {}

    @Override
    public void registerItemRenderer(ItemBVKS item, int metadata, ResourceLocation location) {}

    @Override
    public void registerItemRenderer(ItemBVKS item, int metadata) {}
}
