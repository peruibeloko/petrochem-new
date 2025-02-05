package com.peruibeloko.petrochem.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init(){

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.assembler), "i i"," i ","s i", 's', new ItemStack(Items.stick), 'i', new ItemStack(Items.iron_ingot));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pressurePipe), "iii","ggg","iii", 'i', new ItemStack(ModItems.ingotSteel), 'g', new ItemStack(Blocks.glass));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.boilerFrame), "ppp", "ppp", "ppp", 'p', new ItemStack(ModItems.plateSteel));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.boilerHeater), "ppp", "ppp", "pfp", 'p', new ItemStack(ModItems.plateSteel), 'f', new ItemStack(Blocks.furnace));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.refineryFrame), "ppp", "p p", "ppp", 'p', new ItemStack(ModItems.plateSteel));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.refineryFilter), "pfp", "pfp", "pfp", 'p', new ItemStack(ModItems.plateSteel), 'f', new ItemStack(ModItems.filter));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.refineryGauge), "ppp", "ggg", "ppp", 'p', new ItemStack(ModItems.plateSteel), 'g', new ItemStack(Blocks.glass));
    }
}
