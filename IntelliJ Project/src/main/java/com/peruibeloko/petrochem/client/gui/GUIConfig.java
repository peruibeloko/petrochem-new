package com.peruibeloko.petrochem.client.gui;

import com.peruibeloko.petrochem.handler.ConfigurationHandler;
import com.peruibeloko.petrochem.reference.ModReferences;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class GUIConfig extends GuiConfig {

    public GUIConfig(GuiScreen guiScreen) {

        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                ModReferences.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
