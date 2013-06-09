package mods.MoreNotch.dimension;

import java.util.Random;

import mods.MoreNotch.MoreNotch;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;


public class BiomeGenHeaven extends BiomeGenBase
{
public WorldGenerator treeGenerator;
public WorldGenerator houseGenerator;
public WorldGenerator altarGenerator;
public WorldGenerator storageGenerator;

public short sTopBlock;
public short sFillerBlock;

    public BiomeGenHeaven(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        this.theBiomeDecorator.treesPerChunk = 5;
        this.treeGenerator = new WorldGenTree(true);
        altarGenerator = new WorldGenAltar();
        houseGenerator = new WorldGenHouse();
        storageGenerator = new WorldGenStorage();
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityAngle.class, 8, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(Corrupt.class, 8, 4, 4));

    }


    /**
* Allocate a new BiomeDecorator for this BiomeGenBase
*/
    @Override
    public BiomeDecorator createBiomeDecorator()
    {
        return new BiomeDecoratorHeaven(this);
    }

    /**
* Gets a WorldGen appropriate for this biome.
*/
    @Override
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return treeGenerator;
    }

    @Override
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        long time;

        if (par2Random.nextInt(500) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenAltar()).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }


        if (par2Random.nextInt(7) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            int height = par2Random.nextInt(4) + 4;
            time = System.nanoTime();
            (new WorldGenTree(true)).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        
        if (par2Random.nextInt(125) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenStorage()).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        
    }
}