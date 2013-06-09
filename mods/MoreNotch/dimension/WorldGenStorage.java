package mods.MoreNotch.dimension;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStorage extends WorldGenerator {


public WorldGenStorage() {
}

@Override
public boolean generate(World par3World, Random random, int i, int j, int k) {
	
	par3World.setBlock(i +1, j +1, k, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k, Block.wood.blockID);
	par3World.setBlock(i +3, j +1, k, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k, Block.wood.blockID);

	par3World.setBlock(i -1, j +1, k, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k, Block.wood.blockID);
	par3World.setBlock(i -3, j +1, k, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k, Block.wood.blockID);

	//2
	
	par3World.setBlock(i -1, j +1, k +10, Block.wood.blockID);
	par3World.setBlock(i -2, j +1, k +10, Block.wood.blockID);
	par3World.setBlock(i -3, j +1, k +10, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +10, Block.wood.blockID);
	par3World.setBlock(i , j +1, k +10, Block.wood.blockID);

	
	par3World.setBlock(i +1, j +1, k +10, Block.wood.blockID);
	par3World.setBlock(i +2, j +1, k +10, Block.wood.blockID);
	par3World.setBlock(i +3, j +1, k +10, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +10, Block.wood.blockID);

	
	//3
	par3World.setBlock(i -4, j +1, k +1, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +2, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +3, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +4, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +5, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +6, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +7, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +8, Block.wood.blockID);
	par3World.setBlock(i -4, j +1, k +9, Block.wood.blockID);

	par3World.setBlock(i +4, j +1, k +1, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +2, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +3, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +4, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +5, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +6, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +7, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +8, Block.wood.blockID);
	par3World.setBlock(i +4, j +1, k +9, Block.wood.blockID);

	//par 2
	par3World.setBlock(i +1, j +2, k, Block.wood.blockID);
	par3World.setBlock(i +2, j +2, k, Block.wood.blockID);
	par3World.setBlock(i +3, j +2, k, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k, Block.wood.blockID);

	par3World.setBlock(i -1, j +2, k, Block.wood.blockID);
	par3World.setBlock(i -2, j +2, k, Block.wood.blockID);
	par3World.setBlock(i -3, j +2, k, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k, Block.wood.blockID);

	//2
	
	par3World.setBlock(i -1, j +2, k +10, Block.wood.blockID);
	par3World.setBlock(i -2, j +2, k +10, Block.wood.blockID);
	par3World.setBlock(i -3, j +2, k +10, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +10, Block.wood.blockID);
	par3World.setBlock(i , j +2, k +10, Block.wood.blockID);

	
	par3World.setBlock(i +1, j +2, k +10, Block.wood.blockID);
	par3World.setBlock(i +2, j +2, k +10, Block.wood.blockID);
	par3World.setBlock(i +3, j +2, k +10, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +10, Block.wood.blockID);

	
	//3
	par3World.setBlock(i -4, j +2, k +1, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +2, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +3, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +4, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +5, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +6, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +7, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +8, Block.wood.blockID);
	par3World.setBlock(i -4, j +2, k +9, Block.wood.blockID);

	par3World.setBlock(i +4, j +2, k +1, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +2, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +3, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +4, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +5, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +6, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +7, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +8, Block.wood.blockID);
	par3World.setBlock(i +4, j +2, k +9, Block.wood.blockID);

	//par 3
		par3World.setBlock(i, j +3, k, Block.wood.blockID);
		par3World.setBlock(i +1, j +3, k, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k, Block.wood.blockID);
	par3World.setBlock(i +3, j +3, k, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k, Block.wood.blockID);

	par3World.setBlock(i -1, j +3, k, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k, Block.wood.blockID);
	par3World.setBlock(i -3, j +3, k, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k, Block.wood.blockID);

	//2
	
	par3World.setBlock(i -1, j +3, k +10, Block.wood.blockID);
	par3World.setBlock(i -2, j +3, k +10, Block.wood.blockID);
	par3World.setBlock(i -3, j +3, k +10, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +10, Block.wood.blockID);
	par3World.setBlock(i , j +3, k +10, Block.wood.blockID);

	
	par3World.setBlock(i +1, j +3, k +10, Block.wood.blockID);
	par3World.setBlock(i +2, j +3, k +10, Block.wood.blockID);
	par3World.setBlock(i +3, j +3, k +10, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +10, Block.wood.blockID);

	
	//3
	par3World.setBlock(i -4, j +3, k +1, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +2, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +3, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +4, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +5, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +6, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +7, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +8, Block.wood.blockID);
	par3World.setBlock(i -4, j +3, k +9, Block.wood.blockID);

	par3World.setBlock(i +4, j +3, k +1, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +2, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +3, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +4, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +5, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +6, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +7, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +8, Block.wood.blockID);
	par3World.setBlock(i +4, j +3, k +9, Block.wood.blockID);
	
	
	//floor
	par3World.setBlock(i -3, j, k +1, Block.planks.blockID);
	par3World.setBlock(i -3, j, k +2, Block.planks.blockID);
	par3World.setBlock(i -3, j, k +3, Block.planks.blockID);
	par3World.setBlock(i -3, j, k +4, Block.planks.blockID);
	par3World.setBlock(i -3, j, k +5, Block.planks.blockID);
	par3World.setBlock(i -3, j, k +6, Block.planks.blockID);
	par3World.setBlock(i -3, j, k +7, Block.planks.blockID);
	par3World.setBlock(i -3, j, k +8, Block.planks.blockID);
	par3World.setBlock(i -3, j, k +9, Block.planks.blockID);

	par3World.setBlock(i -2, j, k +1, Block.planks.blockID);
	par3World.setBlock(i -2, j, k +2, Block.planks.blockID);
	par3World.setBlock(i -2, j, k +3, Block.planks.blockID);
	par3World.setBlock(i -2, j, k +4, Block.planks.blockID);
	par3World.setBlock(i -2, j, k +5, Block.planks.blockID);
	par3World.setBlock(i -2, j, k +6, Block.planks.blockID);
	par3World.setBlock(i -2, j, k +7, Block.planks.blockID);
	par3World.setBlock(i -2, j, k +8, Block.planks.blockID);
	par3World.setBlock(i -2, j, k +9, Block.planks.blockID);
   
	par3World.setBlock(i -1, j, k +1, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +2, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +3, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +4, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +5, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +6, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +7, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +8, Block.planks.blockID);
	par3World.setBlock(i -1, j, k +9, Block.planks.blockID);
	
	par3World.setBlock(i, j, k +1, Block.planks.blockID);
	par3World.setBlock(i, j, k +2, Block.planks.blockID);
	par3World.setBlock(i, j, k +3, Block.planks.blockID);
	par3World.setBlock(i, j, k +4, Block.planks.blockID);
	par3World.setBlock(i, j, k +5, Block.planks.blockID);
	par3World.setBlock(i, j, k +6, Block.planks.blockID);
	par3World.setBlock(i, j, k +7, Block.planks.blockID);
	par3World.setBlock(i, j, k +8, Block.planks.blockID);
	par3World.setBlock(i, j, k +9, Block.planks.blockID);
	
	par3World.setBlock(i +1, j, k +1, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +2, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +3, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +4, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +5, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +6, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +7, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +8, Block.planks.blockID);
	par3World.setBlock(i +1, j, k +9, Block.planks.blockID);
	
	par3World.setBlock(i +2, j, k +1, Block.planks.blockID);
	par3World.setBlock(i +2, j, k +2, Block.planks.blockID);
	par3World.setBlock(i +2, j, k +3, Block.planks.blockID);
	par3World.setBlock(i +2, j, k +4, Block.planks.blockID);
	par3World.setBlock(i +2, j, k +5, Block.planks.blockID);
	par3World.setBlock(i +2, j, k +6, Block.planks.blockID);
	par3World.setBlock(i +2, j, k +7, Block.planks.blockID);
	par3World.setBlock(i +2, j, k +8, Block.planks.blockID);
	par3World.setBlock(i +2, j, k +9, Block.planks.blockID);
	
	par3World.setBlock(i +3, j, k +1, Block.planks.blockID);
	par3World.setBlock(i +3, j, k +2, Block.planks.blockID);
	par3World.setBlock(i +3, j, k +3, Block.planks.blockID);
	par3World.setBlock(i +3, j, k +4, Block.planks.blockID);
	par3World.setBlock(i +3, j, k +5, Block.planks.blockID);
	par3World.setBlock(i +3, j, k +6, Block.planks.blockID);
	par3World.setBlock(i +3, j, k +7, Block.planks.blockID);
	par3World.setBlock(i +3, j, k +8, Block.planks.blockID);
	par3World.setBlock(i +3, j, k +9, Block.planks.blockID);

	
	//second floor
	par3World.setBlock(i -3, j +3, k +1, Block.planks.blockID);
	par3World.setBlock(i -3, j +3, k +2, Block.planks.blockID);
	par3World.setBlock(i -3, j +3, k +3, Block.planks.blockID);
	par3World.setBlock(i -3, j +3, k +4, Block.planks.blockID);
	par3World.setBlock(i -3, j +3, k +5, Block.planks.blockID);
	par3World.setBlock(i -3, j +3, k +6, Block.planks.blockID);
	par3World.setBlock(i -3, j +3, k +7, Block.planks.blockID);
	par3World.setBlock(i -3, j +3, k +8, Block.planks.blockID);
	par3World.setBlock(i -3, j +3, k +9, Block.planks.blockID);

	par3World.setBlock(i -2, j +3, k +1, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +2, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +3, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +4, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +5, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +6, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +7, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +8, Block.planks.blockID);
	par3World.setBlock(i -2, j +3, k +9, Block.planks.blockID);
   
	par3World.setBlock(i -1, j +3, k +1, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +2, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +3, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +4, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +5, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +6, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +7, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +8, Block.planks.blockID);
	par3World.setBlock(i -1, j +3, k +9, Block.planks.blockID);
	
	par3World.setBlock(i, j +3, k +1, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +2, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +3, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +4, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +5, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +6, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +7, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +8, Block.planks.blockID);
	par3World.setBlock(i, j +3, k +9, Block.planks.blockID);
	
	par3World.setBlock(i +1, j +3, k +1, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +2, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +3, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +4, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +5, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +6, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +7, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +8, Block.planks.blockID);
	par3World.setBlock(i +1, j +3, k +9, Block.planks.blockID);
	
	par3World.setBlock(i +2, j +3, k +1, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +2, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +3, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +4, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +5, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +6, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +7, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +8, Block.planks.blockID);
	par3World.setBlock(i +2, j +3, k +9, Block.planks.blockID);
	
	par3World.setBlock(i +3, j +3, k +1, Block.planks.blockID);
	par3World.setBlock(i +3, j +3, k +2, Block.planks.blockID);
	par3World.setBlock(i +3, j +3, k +3, Block.planks.blockID);
	par3World.setBlock(i +3, j +3, k +4, Block.planks.blockID);
	par3World.setBlock(i +3, j +3, k +5, Block.planks.blockID);
	par3World.setBlock(i +3, j +3, k +6, Block.planks.blockID);
	par3World.setBlock(i +3, j +3, k +7, Block.planks.blockID);
	par3World.setBlock(i +3, j +3, k +8, Block.planks.blockID);
	par3World.setBlock(i +3, j +3, k +9, Block.planks.blockID);

	//decoration
	par3World.setBlock(i, j, k, Block.planks.blockID);

	par3World.setBlock(i -3, j +2, k +1, Block.torchWood.blockID);
	par3World.setBlock(i +3, j +2, k +1, Block.torchWood.blockID);

	par3World.setBlock(i -3, j +2, k +9, Block.torchWood.blockID);
	par3World.setBlock(i +3, j +2, k +9, Block.torchWood.blockID);
	
	par3World.setBlock(i -3, j +1, k +1, Block.chest.blockID);
	par3World.setBlock(i -3, j +1, k +2, Block.chest.blockID);

	par3World.setBlock(i -3, j +1, k +4, Block.chest.blockID);
	par3World.setBlock(i -3, j +1, k +5, Block.chest.blockID);

	par3World.setBlock(i -3, j +1, k +7, Block.chest.blockID);
	par3World.setBlock(i -3, j +1, k +8, Block.chest.blockID);


	par3World.setBlock(i +3, j +1, k +1, Block.chest.blockID);
	par3World.setBlock(i +3, j +1, k +2, Block.chest.blockID);

	par3World.setBlock(i +3, j +1, k +4, Block.chest.blockID);
	par3World.setBlock(i +3, j +1, k +5, Block.chest.blockID);

	par3World.setBlock(i +3, j +1, k +7, Block.chest.blockID);
	par3World.setBlock(i +3, j +1, k +8, Block.chest.blockID);
	
	
	return true;

}
}
