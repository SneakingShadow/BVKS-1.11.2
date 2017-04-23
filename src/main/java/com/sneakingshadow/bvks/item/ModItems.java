package com.sneakingshadow.bvks.item;

import com.sneakingshadow.bvks.creativetabs.CreativeTabsBVKS;
import com.sneakingshadow.bvks.reference.ItemReference;
import net.minecraft.creativetab.CreativeTabs;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

public class ModItems {

    public static ItemBVKS DEVIL_GEM = new ItemBVKS(ItemReference.DEVIL_GEM);

    public static void init() {
        register(DEVIL_GEM);

        DEVIL_GEM.setCreativeTab(CreativeTabs.SEARCH, CreativeTabsBVKS.itemTab);
    }

}
