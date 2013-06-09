package mods.MoreNotch.dimension;

import java.util.Random;

import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenHouse extends WorldGenerator {


public WorldGenHouse() {
}

@Override
public boolean generate(World par3World, Random random, int i, int j, int k) {
	
  	par3World.setBlock(i +2, j, k, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k, Block.wood.blockID);
	par3World.setBlock(i +2, j +2, k, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k, Block.wood.blockID);
	
	par3World.setBlock(i +1, j, k, Block.planks.blockID);
	par3World.setBlock(i +1, j +1, k, Block.planks.blockID);
	par3World.setBlock(i +1, j +2, k, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k, Block.planks.blockID);
	
	//planks 2
	par3World.setBlock(i -2, j, k, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k, Block.wood.blockID);
	par3World.setBlock(i -2, j +2, k, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k, Block.wood.blockID);
	
	par3World.setBlock(i -1, j, k, Block.planks.blockID);
	par3World.setBlock(i -1, j +1, k, Block.planks.blockID);
	par3World.setBlock(i -1, j +2, k, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k, Block.planks.blockID);
	
	par3World.setBlock(i, j, k, Block.planks.blockID);
	par3World.setBlock(i, j +1, k, 0);
	par3World.setBlock(i, j +2, k, 0);
	par3World.setBlock(i, j +3, k, Block.planks.blockID);
	
	par3World.setBlock(i -1, j +3, k , Block.wood.blockID);
	par3World.setBlock(i +1, j +3, k , Block.wood.blockID);
	par3World.setBlock(i, j +3, k , Block.wood.blockID);


		//second layer
	par3World.setBlock(i +2, j, k +1, Block.planks.blockID);
	par3World.setBlock(i +2, j +1, k +1, Block.planks.blockID);
	par3World.setBlock(i +2, j +2, k +1, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +1, Block.planks.blockID);
	
	par3World.setBlock(i -2, j, k +1, Block.planks.blockID);
	par3World.setBlock(i -2, j +1, k +1, Block.planks.blockID);
	par3World.setBlock(i -2, j +2, k +1, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +1, Block.planks.blockID);

	par3World.setBlock(i -1, j +4, k +1, Block.wood.blockID);
	par3World.setBlock(i +1, j +4, k +1, Block.wood.blockID);
	par3World.setBlock(i, j +4, k +1, Block.wood.blockID);
	
		//Third layer
	//planks 4
	par3World.setBlock(i +2, j, k +2, Block.planks.blockID);
	par3World.setBlock(i +2, j +1, k +2, Block.planks.blockID);
	par3World.setBlock(i +2, j +2, k +2, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +2, Block.planks.blockID);
	
	par3World.setBlock(i -2, j, k +2, Block.planks.blockID);
	par3World.setBlock(i -2, j +1, k +2, Block.planks.blockID);
	par3World.setBlock(i -2, j +2, k +2, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +2, Block.planks.blockID);

	par3World.setBlock(i -1, j +4, k +2, Block.wood.blockID);
	par3World.setBlock(i +1, j +4, k +2, Block.wood.blockID);
	par3World.setBlock(i, j +4, k +2, Block.wood.blockID);
	
	//planks 5
	par3World.setBlock(i +2, j, k +3, Block.planks.blockID);
	par3World.setBlock(i +2, j +1, k +3, Block.planks.blockID);
	par3World.setBlock(i +2, j +2, k +3, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +3, Block.planks.blockID);
	
	par3World.setBlock(i -2, j, k +3, Block.planks.blockID);
	par3World.setBlock(i -2, j +1, k +3, Block.planks.blockID);
	par3World.setBlock(i -2, j +2, k +3, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +3, Block.planks.blockID);

	par3World.setBlock(i -1, j +4, k +3, Block.wood.blockID);
	par3World.setBlock(i +1, j +4, k +3, Block.wood.blockID);
	par3World.setBlock(i, j +4, k +3, Block.wood.blockID);
	
	//planks 6
	par3World.setBlock(i +2, j, k +4, Block.planks.blockID);
	par3World.setBlock(i +2, j +1, k +4, Block.planks.blockID);
	par3World.setBlock(i +2, j +2, k +4, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +4, Block.planks.blockID);
	
	par3World.setBlock(i -2, j, k +4, Block.planks.blockID);
	par3World.setBlock(i -2, j +1, k +4, Block.planks.blockID);
	par3World.setBlock(i -2, j +2, k +4, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +4, Block.planks.blockID);

	par3World.setBlock(i -1, j +4, k +4, Block.wood.blockID);
	par3World.setBlock(i +1, j +4, k +4, Block.wood.blockID);
	par3World.setBlock(i, j +4, k +4, Block.wood.blockID);
	
	
	//planks 7
	par3World.setBlock(i +2, j, k +5, Block.planks.blockID);
	par3World.setBlock(i +2, j +1, k +5, Block.planks.blockID);
	par3World.setBlock(i +2, j +2, k +5, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +5, Block.planks.blockID);
	
	par3World.setBlock(i -2, j, k +5, Block.planks.blockID);
	par3World.setBlock(i -2, j +1, k +5, Block.planks.blockID);
	par3World.setBlock(i -2, j +2, k +5, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +5, Block.planks.blockID);

	par3World.setBlock(i -1, j +4, k +5, Block.wood.blockID);
	par3World.setBlock(i +1, j +4, k +5, Block.wood.blockID);
	par3World.setBlock(i, j +4, k +5, Block.wood.blockID);
	
	//planks 8
	par3World.setBlock(i +2, j, k +6, Block.planks.blockID);
	par3World.setBlock(i +2, j +1, k +6, Block.planks.blockID);
	par3World.setBlock(i +2, j +2, k +6, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +6, Block.planks.blockID);
	
	par3World.setBlock(i -2, j, k +6, Block.planks.blockID);
	par3World.setBlock(i -2, j +1, k +6, Block.planks.blockID);
	par3World.setBlock(i -2, j +2, k +6, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +6, Block.planks.blockID);

	par3World.setBlock(i -1, j +4, k +6, Block.wood.blockID);
	par3World.setBlock(i +1, j +4, k +6, Block.wood.blockID);
	par3World.setBlock(i, j +4, k +6, Block.wood.blockID);
	
	
	//planks 10
	par3World.setBlock(i +2, j, k +7, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k +7, Block.wood.blockID);
	par3World.setBlock(i +2, j +2, k +7, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k +7, Block.wood.blockID);
	
	par3World.setBlock(i +1, j, k +7, Block.planks.blockID);
	par3World.setBlock(i +1, j +1, k +7, Block.planks.blockID);
	par3World.setBlock(i +1, j +2, k +7, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +7, Block.planks.blockID);
	
	par3World.setBlock(i -2, j, k +7, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k +7, Block.wood.blockID);
	par3World.setBlock(i -2, j +2, k +7, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k +7, Block.wood.blockID);
	
	par3World.setBlock(i -1, j, k +7, Block.planks.blockID);
	par3World.setBlock(i -1, j +1, k +7, Block.planks.blockID);
	par3World.setBlock(i -1, j +2, k +7, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +7, Block.planks.blockID);
	
	par3World.setBlock(i, j, k +7, Block.planks.blockID);
	par3World.setBlock(i, j +1, k +7, Block.planks.blockID);
	par3World.setBlock(i, j +2, k +7, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +7, Block.planks.blockID);
	
	par3World.setBlock(i -1, j +3, k +7, Block.wood.blockID);
	par3World.setBlock(i +1, j +3, k +7, Block.wood.blockID);
	par3World.setBlock(i, j +3, k +7, Block.wood.blockID);
	
	par3World.setBlock(i -1, j +1, k +7, Block.wood.blockID);
	par3World.setBlock(i +1, j +1, k +7, Block.wood.blockID);
	par3World.setBlock(i, j +1, k +7, Block.wood.blockID);
	
	//floor
	par3World.setBlock(i, j, k, Block.planks.blockID);
	par3World.setBlock(i, j, k +1, Block.planks.blockID);
	par3World.setBlock(i, j, k +2, Block.planks.blockID);
	par3World.setBlock(i, j, k +3, Block.planks.blockID);
	par3World.setBlock(i, j, k +4, Block.planks.blockID);
	par3World.setBlock(i, j, k +5, Block.planks.blockID);
	par3World.setBlock(i, j, k +6, Block.planks.blockID);
	par3World.setBlock(i, j, k +7, Block.planks.blockID);

	par3World.setBlock(i, j, k, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +1, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +2, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +3, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +4, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +5, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +6, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +7, Block.planks.blockID);
	
	par3World.setBlock(i -1, j, k, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +1, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +2, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +3, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +4, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +5, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +6, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +7, Block.planks.blockID);
	
	
	par3World.setBlock(i -1, j +1, k, Block.wood.blockID);
	par3World.setBlock(i +1, j +1, k, Block.wood.blockID);
	//final

	par3World.setBlock(i -2, j +1, k +1, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k +2, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k +3, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k +4, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k +5, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k +6, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k +7, Block.wood.blockID);

	par3World.setBlock(i +2, j +1, k +1, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k +2, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k +3, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k +4, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k +5, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k +6, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k +7, Block.wood.blockID);

	//+3
	par3World.setBlock(i -2, j +3, k +1, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k +2, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k +3, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k +4, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k +5, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k +6, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k +7, Block.wood.blockID);

	par3World.setBlock(i +2, j +3, k +1, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k +2, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k +3, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k +4, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k +5, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k +6, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k +7, Block.wood.blockID);
	
	//Decoration
	par3World.setBlock(i +1, j +3, k +1, Block.torchWood.blockID);
	par3World.setBlock(i +1, j +3, k +6, Block.torchWood.blockID);
	par3World.setBlock(i -1, j +3, k +1, Block.torchWood.blockID);
	par3World.setBlock(i -1, j +3, k +6, Block.torchWood.blockID);

	par3World.setBlock(i, j +1, k +6, Block.chest.blockID);
	par3World.setBlock(i +1, j +1, k +6, MoreNotch.forge.blockID);
	par3World.setBlock(i -1, j +1, k +6, Block.workbench.blockID);

	//glass
	par3World.setBlock(i -2, j +2, k +2, Block.glass.blockID);
	par3World.setBlock(i -2, j +2, k +3, Block.glass.blockID);
	par3World.setBlock(i -2, j +2, k +4, Block.glass.blockID);
	par3World.setBlock(i -2, j +2, k +5, Block.glass.blockID);

	
	par3World.setBlock(i +2, j +2, k +2, Block.glass.blockID);
	par3World.setBlock(i +2, j +2, k +3, Block.glass.blockID);
	par3World.setBlock(i +2, j +2, k +4, Block.glass.blockID);
	par3World.setBlock(i +2, j +2, k +5, Block.glass.blockID);

	
	par3World.setBlock(i, j +2, k +7, Block.glass.blockID);


       return true;
	
}
}
