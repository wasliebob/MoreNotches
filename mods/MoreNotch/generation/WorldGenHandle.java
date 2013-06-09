package mods.MoreNotch.generation;

import java.util.Random;

import mods.MoreNotch.MoreNotch;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenHandle implements IWorldGenerator { 
	@Override
public void generate(Random random, int chunkX, int chunkZ, World world, 
IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		if(world.provider.terrainType.equals(world.provider.terrainType.FLAT)){
			return;
		}else
	if (world.provider.isSurfaceWorld()){
generateSurface(random,chunkX*16,chunkZ*16,world);
}
	}

public void generateSurface(Random random, int x, int z, World w){
for(int i = 0;i<4;i++){ 
for(int ii=0;ii<100;ii++){  
int posX = x + random.nextInt(16); 
int posY = random.nextInt(40);
int posZ = z + random.nextInt(16); 
new WorldGenMinable(MoreNotch.notchica.blockID,i,random.nextInt(9)).generate(w, random, posX, posY, posZ);
}
}
}
}