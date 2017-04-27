package com.sneakingshadow.bvks.proxy;

import com.sneakingshadow.bvks.item.ItemBVKS;
import net.minecraft.util.ResourceLocation;

public interface IProxy {

    void registerItemRenderer(ItemBVKS item, int metadata, ResourceLocation location, String variantIn);

    void registerItemRenderer(ItemBVKS item, int metadata, ResourceLocation location);

    void registerItemRenderer(ItemBVKS item, int metadata);

}
