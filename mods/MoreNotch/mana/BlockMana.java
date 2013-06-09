package mods.MoreNotch.mana;

import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMana extends Block{
       
        public BlockMana(int id, Material material){
        super(id, material);
        this.setCreativeTab(MoreNotch.tabCustom);
        setUnlocalizedName("MoreNotch:mana");
        }
        
        @Override
        public void onNeighborBlockChange(World world, int x, int y, int z, int par5){
                if(world.getBlockId(x, y -1, z) == MoreNotch.hellBrick.blockID)
                    if(world.getBlockId(x +1, y -1, z) == MoreNotch.hellBrick.blockID)
                        if(world.getBlockId(x -1, y -1, z) == MoreNotch.hellBrick.blockID)
                            if(world.getBlockId(x, y -1, z -1) == MoreNotch.hellBrick.blockID)
                                if(world.getBlockId(x +1, y -1, z -1) == MoreNotch.hellBrick.blockID)
                                    if(world.getBlockId(x -1, y -1, z -1) == MoreNotch.hellBrick.blockID)
                                        if(world.getBlockId(x, y -1, z +1) == MoreNotch.hellBrick.blockID)
                                            if(world.getBlockId(x +1, y -1, z +1) == MoreNotch.hellBrick.blockID)
                                                if(world.getBlockId(x -1, y -1, z +1) == MoreNotch.hellBrick.blockID)
                                                    if(world.getBlockId(x +1, y, z +1) == MoreNotch.hellBrick.blockID)
                                                        if(world.getBlockId(x +1, y, z -1) == MoreNotch.hellBrick.blockID)
                                                        	if(world.getBlockId(x -1, y, z +1) == MoreNotch.hellBrick.blockID)
                                                                if(world.getBlockId(x -1, y, z -1) == MoreNotch.hellBrick.blockID)
                                                                    if(world.getBlockId(x, y +1, z) == MoreNotch.hellBrick.blockID)

                                                {

                	world.setBlock(x, y, z, MoreNotch.mana.blockID);
                }

        }


}