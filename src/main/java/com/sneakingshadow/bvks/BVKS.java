package com.sneakingshadow.bvks;

import com.sneakingshadow.bvks.block.ModBlocks;
import com.sneakingshadow.bvks.creativetabs.CreativeTabsBVKS;
import com.sneakingshadow.bvks.item.ModItems;
import com.sneakingshadow.bvks.proxy.IProxy;
import com.sneakingshadow.bvks.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, acceptedMinecraftVersions = "[1.11.2]")
public class BVKS {

    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println(Reference.MOD_ID + " pre-initialization");

        ModBlocks.init();

        ModItems.init();

        CreativeTabsBVKS.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println(Reference.MOD_ID + " initialization");

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println(Reference.MOD_ID + "pre-initialization");

    }

}
