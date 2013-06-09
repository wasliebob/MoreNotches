package mods.MoreNotch.hell;

import java.util.Random;

import mods.MoreNotch.MoreNotch;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenerator;


public class BiomeGenHell extends BiomeGenBase
{
public WorldGenerator forestGenerator;
public WorldGenerator glowstoneGenerator;

public short sTopBlock;
public short sFillerBlock;

    public BiomeGenHell(int par1)
    {
        super(par1);
        this.spawnableCreatureList.clear();
        forestGenerator = new WorldGenForest();
        glowstoneGenerator = new WorldGenGlowstone();
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(HellSpider.class, 8, 4, 4));
        this.spawnableMonsterList.add(new SpawnListEntry(NetherCreeper.class, 8, 4, 4));
    }


    /**
* Allocate a new BiomeDecorator for this BiomeGenBase
*/
    @Override
    public BiomeDecorator createBiomeDecorator()
    {
        return new HellDecorator(this);
    }


    @Override
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        long time;


        
        if (par2Random.nextInt(125) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            time = System.nanoTime();
            (new WorldGenForest()).generate(par1World, par2Random, k, par1World.getHeightValue(k, l), l);
        }
        
        
    }
}