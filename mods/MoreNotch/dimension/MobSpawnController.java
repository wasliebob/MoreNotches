package mods.MoreNotch.dimension;

import java.util.List;

import cpw.mods.fml.common.registry.EntityRegistry;

import mods.MoreNotch.mobs.Notch;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.WorldEvent.PotentialSpawns;

public class MobSpawnController
{
@ForgeSubscribe
public void getPotentialSpawns(PotentialSpawns event)
{
List<SpawnListEntry> list = event.list;
int time = (int) (event.world.getWorldTime() % 48000);
System.out.println(time);
for(int i = 0; i < list.size(); i++)
{
System.out.println(time);
EntityRegistry.registerModEntity(EntityAngle.class, "Angel", 12, this, 70, 3, true);
EntityRegistry.registerModEntity(Corrupt.class, "Corrupt", 15, this, 70, 3, true);

{
list.remove(i);
i--;
}
}
}
}