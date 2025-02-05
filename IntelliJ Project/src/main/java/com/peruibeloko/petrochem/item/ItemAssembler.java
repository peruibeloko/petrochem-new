package com.peruibeloko.petrochem.item;

import com.peruibeloko.petrochem.reference.ItemReferences;

public class ItemAssembler extends ItemPetroChem {
    public ItemAssembler() {

        super();
        this.setUnlocalizedName(ItemReferences.ASSEMBLER);
        this.maxStackSize = 1;
    }
}
