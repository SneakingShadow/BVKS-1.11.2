package com.sneakingshadow.bvks.reference;

import net.minecraft.util.ResourceLocation;

public class Reference
{

    public static final String MOD_ID = "bvks";
    public static final String MOD_NAME = "Bearvalley's Killing Set";
    public static final String VERSION = "1.11.2-0.1.1";
    public static final String ROOT_FOLDER = "com.sneakingshadow.bvks";
    public static final String SERVER_PROXY_CLASS = ROOT_FOLDER+".proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = ROOT_FOLDER+".proxy.ClientProxy";
    public static final String GUI_FACTORY_CLASS = ROOT_FOLDER+".client.gui.GuiFactory";
    public static final String RESOURCE_PREFIX = MOD_ID+":";

    //Folder locations
    public static final String MODEL_LOCATION = "models/";
    public static final String MODEL_TEXTURE_LOCATION = "textures/models/";

    //Creative tabs
    public static final String ITEM_TAB_LABEL = RESOURCE_PREFIX + "item";
    public static final String ITEM_TAB_IMAGE = MOD_ID + ".png";
    public static final String BLOCK_TAB_LABEL = RESOURCE_PREFIX + "block";
    public static final String BLOCK_TAB_IMAGE = MOD_ID + ".png";

    public static ResourceLocation getResourceLocation(String location) {
        return new ResourceLocation(MOD_ID, location);
    }
}