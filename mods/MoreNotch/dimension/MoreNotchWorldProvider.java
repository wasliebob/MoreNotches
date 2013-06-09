package mods.MoreNotch.dimension;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.MoreNotch.MoreNotch;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class MoreNotchWorldProvider extends WorldProvider
{

@Override
public String getDimensionName()
{
return "Heaven";
}

    /**
* creates a new world chunk manager for WorldProvider
*/
    @Override
    protected void registerWorldChunkManager()
    {
        worldChunkMgr = new WorldChunkManagerHell(MoreNotch.heaven, 0.8F, 0.1F);
        this.dimensionId = 20;
    }

    /**
* Returns a new chunk provider which generates chunks for this world
*/
    @Override
    public IChunkProvider createChunkGenerator()
    {
        return new MoreNotchChunkProvider(this.worldObj, worldObj.getSeed(), true);
    }

    /**
* Creates the light to brightness table
*/
    @Override
    protected void generateLightBrightnessTable()
    {
        float f = 0.0F;

        for (int i = 0; i <= 15; ++i)
        {
         float scaledBrightness = i / 15.0F;
            float f1 = 1.0F - scaledBrightness;
            if(i < 5)
             this.lightBrightnessTable[i] = 0.5F * scaledBrightness / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
            else
             this.lightBrightnessTable[i] = scaledBrightness / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
            
            
        }
    }

    /**
* Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
*/
    @Override
    public float calculateCelestialAngle(long par1, float par3)
    {
        int j = (int)(par1 % 48000L);
        float f1 = ((float)j + par3) / 48000.0F - 0.25F;

        if (f1 < 0.0F)
        {
            ++f1;
        }

        if (f1 > 1.0F)
        {
            --f1;
        }

        float f2 = f1;
        f1 = 1.0F - (float)((Math.cos((double)f1 * Math.PI) + 1.0D) / 2.0D);
        f1 = f2 + (f1 - f2) / 3.0F;
        return f1;
        //return (float) Math.sin(f2);
        //return 1F;
    }
    

    
    @Override
    public String getWelcomeMessage()
    {
     return "Welcome To The Heaven";
    }
    
    @Override
    public String getDepartMessage()
    {
     return "Good Luck In The Overwold";
    }

}