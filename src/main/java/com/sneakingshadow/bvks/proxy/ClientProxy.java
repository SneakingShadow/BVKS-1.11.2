package com.sneakingshadow.bvks.proxy;

import com.sneakingshadow.bvks.item.ItemBVKS;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(ItemBVKS item, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getUnlocalizedName()));
    }

    @Override
    public void registerItemRenderer(ItemBVKS item, int metadata, ResourceLocation location, String variantIn) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(location, variantIn));
    }

    @Override
    public void registerItemRenderer(ItemBVKS item, int metadata, ResourceLocation location) {
        registerItemRenderer(item, metadata, location, null);
    }

}
