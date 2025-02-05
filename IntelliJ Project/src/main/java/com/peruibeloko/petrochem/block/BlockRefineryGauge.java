package com.peruibeloko.petrochem.block;

import com.peruibeloko.petrochem.init.ModBlocks;
import com.peruibeloko.petrochem.reference.BlockReferences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;

public class BlockRefineryGauge extends BlockPetroChem {

    private boolean selfReference;

    public BlockRefineryGauge() {

        super(Material.glass);
        this.setBlockName(BlockReferences.REFINERY_GAUGE);
    }

    // Transparency
    public boolean shouldSideBeRendered(IBlockAccess BlockID, int x, int y, int z, int side)
    {
        Block block = BlockID.getBlock(x, y, z);

        if (this == ModBlocks.refineryGauge)
        {
            if (BlockID.getBlockMetadata(x, y, z) != BlockID.getBlockMetadata(x - Facing.offsetsXForSide[side], y - Facing.offsetsYForSide[side], z - Facing.offsetsZForSide[side]))
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
        }

        return !this.selfReference && block == this ? false : super.shouldSideBeRendered(BlockID, x, y, z, side);
    }
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
}