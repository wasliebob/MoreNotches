package mods.MoreNotch.hell;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenForest extends WorldGenerator {


public WorldGenForest() {
}

@Override
public boolean generate(World world, Random random, int x, int y, int z) {
	
	world.setBlock(x, y, z, Block.netherBrick.blockID);
	world.setBlock(x, y+1, z, Block.netherBrick.blockID);
	world.setBlock(x, y+2, z, Block.netherBrick.blockID);
	world.setBlock(x, y+3, z, Block.netherBrick.blockID);
	world.setBlock(x, y+4, z, Block.netherBrick.blockID);

	return false;
	
}
}
