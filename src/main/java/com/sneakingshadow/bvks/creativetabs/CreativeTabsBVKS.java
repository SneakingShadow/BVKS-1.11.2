package com.sneakingshadow.bvks.creativetabs;

import com.sneakingshadow.bvks.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabsBVKS {

    public static CreativeTabs itemTab = new CreativeTabs(Reference.ITEM_TAB_LABEL) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.APPLE);
        }

        public boolean hasSearchBar() {
            return true;
        }

        /**
         * Gets the width of the search bar of the creative tab, use this if your
         * creative tab name overflows together with a custom texture.
         *
         * @return The width of the search bar, 89 by default
         */
        public int getSearchbarWidth()
        {
            return 89;
        }

        public String getBackgroundImageName() {
            return Reference.ITEM_TAB_IMAGE;
        }
    };

    public static CreativeTabs blockTab = new CreativeTabs(Reference.BLOCK_TAB_LABEL) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Blocks.COBBLESTONE);
        }

        public boolean hasSearchBar() {
            return true;
        }

        /**
         * Gets the width of the search bar of the creative tab, use this if your
         * creative tab name overflows together with a custom texture.
         *
         * @return The width of the search bar, 89 by default
         */
        public int getSearchbarWidth()
        {
            return 89;
        }

        public String getBackgroundImageName() {
            return Reference.BLOCK_TAB_IMAGE;
        }
    };

    public static void init() {

    }

}
