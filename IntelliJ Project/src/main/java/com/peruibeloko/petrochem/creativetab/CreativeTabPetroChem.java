package com.peruibeloko.petrochem.creativetab;

import com.peruibeloko.petrochem.reference.ItemReferences;
import com.peruibeloko.petrochem.reference.ModReferences;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabPetroChem {

    public static final CreativeTabs PETROCHEM_TAB = new CreativeTabs(ModReferences.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ItemReferences.ASSEMBLER_ITEM;
        }
    };
}