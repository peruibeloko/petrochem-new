package com.peruibeloko.petrochem.init;

import com.peruibeloko.petrochem.item.ItemAssembler;
import com.peruibeloko.petrochem.item.ItemPlateSteel;
import com.peruibeloko.petrochem.item.ItemDustCoal;
import com.peruibeloko.petrochem.item.ItemFilter;
import com.peruibeloko.petrochem.item.ItemIngotSteel;
import com.peruibeloko.petrochem.reference.ItemReferences;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemDustCoal dustCoal = new ItemDustCoal();
    public static final ItemFilter filter = new ItemFilter();
    public static final ItemIngotSteel ingotSteel = new ItemIngotSteel();
    public static final ItemPlateSteel plateSteel = new ItemPlateSteel();
    public static final ItemAssembler assembler = new ItemAssembler();

    public static void init() {
        GameRegistry.registerItem(ItemReferences.DUST_COAL_ITEM, ItemReferences.DUST_COAL);
        GameRegistry.registerItem(ItemReferences.FILTER_ITEM, ItemReferences.FILTER);
        GameRegistry.registerItem(ItemReferences.INGOT_STEEL_ITEM, ItemReferences.INGOT_STEEL);
        GameRegistry.registerItem(ItemReferences.PLATE_STEEL_ITEM, ItemReferences.PLATE_STEEL);
        GameRegistry.registerItem(ItemReferences.ASSEMBLER_ITEM, ItemReferences.ASSEMBLER);
    }
}
