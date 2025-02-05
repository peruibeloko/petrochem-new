package com.peruibeloko.petrochem.handler;

import com.peruibeloko.petrochem.reference.ModReferences;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile) {

        // Creates the configuration object from loaded config file
        if (configuration == null) {

            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){

        if(event.modID.equalsIgnoreCase(ModReferences.MOD_ID)){

            loadConfiguration();
        }
    }

    private static void loadConfiguration() {

        boolean testValue = configuration.getBoolean("", Configuration.CATEGORY_GENERAL, true, "This sentence is false.");

        if(configuration.hasChanged()) {

            configuration.save();
        }
    }
}
