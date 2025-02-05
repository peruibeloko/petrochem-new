package com.peruibeloko.petrochem;

import com.peruibeloko.petrochem.handler.ConfigurationHandler;
import com.peruibeloko.petrochem.init.ModBlocks;
import com.peruibeloko.petrochem.init.ModItems;
import com.peruibeloko.petrochem.init.Recipes;
import com.peruibeloko.petrochem.proxy.IProxy;
import com.peruibeloko.petrochem.reference.ModReferences;
import com.peruibeloko.petrochem.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@cpw.mods.fml.common.Mod(modid= ModReferences.MOD_ID, name= ModReferences.MOD_NAME, version= ModReferences.VERSION)
public class PetroChem {

    @cpw.mods.fml.common.Mod.Instance(ModReferences.MOD_ID)
    public static PetroChem instance;

    @SidedProxy(clientSide = "com.peruibeloko.petrochem.proxy.ClientProxy", serverSide = "com.peruibeloko.petrochem.proxy.ServerProxy")
    public static IProxy proxy;

    @cpw.mods.fml.common.Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Pre-Init Complete! Whats up Buildcraft API, how is it going?");
    }

    @cpw.mods.fml.common.Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        Recipes.init();
        LogHelper.info("Init Complete! Damn, these are some serious recipes!");
    }

    @cpw.mods.fml.common.Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("Post-Init Complete! Lets roll, you oil maniac.");
    }
}
