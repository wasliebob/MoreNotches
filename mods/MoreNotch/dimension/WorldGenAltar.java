package mods.MoreNotch.dimension;

import java.util.Random;

import mods.MoreNotch.MoreNotch;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenAltar extends WorldGenerator {


public WorldGenAltar() {
}

@Override
public boolean generate(World par3World, Random random, int i, int j, int k) {
	
  	par3World.setBlock(i +2, j, k, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +2, k, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k, Block.stoneBrick.blockID);
	
	par3World.setBlock(i +1, j, k, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +1, k, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +2, k, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +3, k, Block.stoneBrick.blockID);
	
	//stoneBrick 2
	par3World.setBlock(i -2, j, k, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +2, k, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -1, j, k, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j +1, k, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j +2, k, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j +3, k, Block.stoneBrick.blockID);
	
	par3World.setBlock(i, j, k, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +1, k, 0);
	par3World.setBlock(i, j +2, k, 0);
	par3World.setBlock(i, j +3, k, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -1, j +3, k , Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +3, k , Block.stoneBrick.blockID);
	par3World.setBlock(i, j +3, k , Block.stoneBrick.blockID);


		//second layer
	par3World.setBlock(i +2, j, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +2, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +1, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -2, j, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +2, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +1, Block.stoneBrick.blockID);

	par3World.setBlock(i -1, j +4, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +4, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +4, k +1, Block.stoneBrick.blockID);
	
		//Third layer
	//stoneBrick 4
	par3World.setBlock(i +2, j, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +2, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +2, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -2, j, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +2, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +2, Block.stoneBrick.blockID);

	par3World.setBlock(i -1, j +4, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +4, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +4, k +2, Block.stoneBrick.blockID);
	
	//stoneBrick 5
	par3World.setBlock(i +2, j, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +2, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +3, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -2, j, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +2, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +3, Block.stoneBrick.blockID);

	par3World.setBlock(i -1, j +4, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +4, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +4, k +3, Block.stoneBrick.blockID);
	
	//stoneBrick 6
	par3World.setBlock(i +2, j, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +2, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +4, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -2, j, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +2, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +4, Block.stoneBrick.blockID);

	par3World.setBlock(i -1, j +4, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +4, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +4, k +4, Block.stoneBrick.blockID);
	
	
	//stoneBrick 7
	par3World.setBlock(i +2, j, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +2, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +5, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -2, j, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +2, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +5, Block.stoneBrick.blockID);

	par3World.setBlock(i -1, j +4, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +4, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +4, k +5, Block.stoneBrick.blockID);
	
	//stoneBrick 8
	par3World.setBlock(i +2, j, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +2, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +6, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -2, j, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +2, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +6, Block.stoneBrick.blockID);

	par3World.setBlock(i -1, j +4, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +4, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +4, k +6, Block.stoneBrick.blockID);
	
	
	//stoneBrick 10
	par3World.setBlock(i +2, j, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +2, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +7, Block.stoneBrick.blockID);
	
	par3World.setBlock(i +1, j, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +1, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +2, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +3, k +7, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -2, j, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +2, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +7, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -1, j, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j +1, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j +2, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j +3, k +7, Block.stoneBrick.blockID);
	
	par3World.setBlock(i, j, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +1, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +2, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +3, k +7, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -1, j +3, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +3, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +3, k +7, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -1, j +1, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +1, k +7, Block.stoneBrick.blockID);
	par3World.setBlock(i, j +1, k +7, Block.stoneBrick.blockID);
	//floor
	par3World.setBlock(i, j, k, Block.stoneBrick.blockID);
	par3World.setBlock(i, j, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i, j, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i, j, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i, j, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i, j, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i, j, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i, j, k +7, Block.stoneBrick.blockID);

	par3World.setBlock(i, j, k, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j, k +7, Block.stoneBrick.blockID);
	
	par3World.setBlock(i -1, j, k, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i -1, j, k +7, Block.stoneBrick.blockID);
	
	
	par3World.setBlock(i -1, j +1, k, Block.stoneBrick.blockID);
	par3World.setBlock(i +1, j +1, k, Block.stoneBrick.blockID);
	//final

	par3World.setBlock(i -2, j +1, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +1, k +7, Block.stoneBrick.blockID);

	par3World.setBlock(i +2, j +1, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +1, k +7, Block.stoneBrick.blockID);

	//+3
	par3World.setBlock(i -2, j +3, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i -2, j +3, k +7, Block.stoneBrick.blockID);

	par3World.setBlock(i +2, j +3, k +1, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +2, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +3, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +4, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +5, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +6, Block.stoneBrick.blockID);
	par3World.setBlock(i +2, j +3, k +7, Block.stoneBrick.blockID);
	
	//Decoration
	par3World.setBlock(i +1, j +3, k +1, Block.torchWood.blockID);
	par3World.setBlock(i +1, j +3, k +6, Block.torchWood.blockID);
	par3World.setBlock(i -1, j +3, k +1, Block.torchWood.blockID);
	par3World.setBlock(i -1, j +3, k +6, Block.torchWood.blockID);

	par3World.setBlock(i, j +1, k +6, MoreNotch.god.blockID);

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
