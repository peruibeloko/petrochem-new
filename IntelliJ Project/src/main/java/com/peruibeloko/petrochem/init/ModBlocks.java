package com.peruibeloko.petrochem.init;

import com.peruibeloko.petrochem.block.*;
import com.peruibeloko.petrochem.reference.BlockReferences;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static final BlockPetroChem refineryFrame = new BlockRefineryFrame();
    public static final BlockPetroChem refineryGauge = new BlockRefineryGauge();
    public static final BlockPetroChem refineryFilter = new BlockRefineryFilter();
    public static final BlockPetroChem refineryValve = new BlockRefineryValve();
    public static final BlockPetroChem boilerHeater = new BlockBoilerHeater();
    public static final BlockPetroChem boilerFrame = new BlockBoilerFrame();
    public static final BlockPetroChem boilerValve = new BlockBoilerValve();
    public static final BlockPetroChem pressurePipe = new BlockHighPressurePipe();

    public static void init(){

        GameRegistry.registerBlock(BlockReferences.REFINERY_FRAME_BLOCK, BlockReferences.REFINERY_FRAME);
        GameRegistry.registerBlock(BlockReferences.REFINERY_GAUGE_BLOCK, BlockReferences.REFINERY_GAUGE);
        GameRegistry.registerBlock(BlockReferences.REFINERY_FILTER_BLOCK, BlockReferences.REFINERY_FILTER);
        GameRegistry.registerBlock(BlockReferences.REFINERY_VALVE_BLOCK, BlockReferences.REFINERY_VALVE);
        GameRegistry.registerBlock(BlockReferences.BOILER_HEATER_BLOCK, BlockReferences.BOILER_HEATER);
        GameRegistry.registerBlock(BlockReferences.BOILER_FRAME_BLOCK, BlockReferences.BOILER_FRAME);
        GameRegistry.registerBlock(BlockReferences.BOILER_VALVE_BLOCK, BlockReferences.BOILER_VALVE);
        GameRegistry.registerBlock(BlockReferences.PRESSURE_PIPE_BLOCK, BlockReferences.PRESSURE_PIPE);
    }
}
