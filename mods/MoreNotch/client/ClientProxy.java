package mods.MoreNotch.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import mods.MoreNotch.CommonProxy;
import mods.MoreNotch.FinalBlade.DigiBlade;
import mods.MoreNotch.NM.TileEntityMagic;
import mods.MoreNotch.NM.TileEntityRender;
import mods.MoreNotch.forge.TileEntityForge;
import mods.MoreNotch.hell.HellSpider;
import mods.MoreNotch.hell.ModelHellSpider;
import mods.MoreNotch.hell.RenderHellSpider;
import mods.MoreNotch.mobs.CreeperNotch;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
        @Override
        public void registerRenderers() {
            MinecraftForgeClient.preloadTexture(NOTCH_PNG);
            MinecraftForgeClient.preloadTexture(GHOSTNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(HELLNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(SLENDERNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(ZOMBIENOTCH_PNG);
            MinecraftForgeClient.preloadTexture(CREEPERNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(SKELETONNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(FRIENDLYNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(SHAVEDNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(BUTTERNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(WITHERNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(GODNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(CORRUPT_PNG);
            MinecraftForgeClient.preloadTexture(GIANTNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(HEROBRINE_PNG);

            MinecraftForgeClient.preloadTexture(HELLSWORD_PNG);
            MinecraftForgeClient.preloadTexture(GHOSTSWORD_PNG);
            MinecraftForgeClient.preloadTexture(SLENDERSWORD_PNG);
            MinecraftForgeClient.preloadTexture(ZOMBIESWORD_PNG);
            MinecraftForgeClient.preloadTexture(SKELETONSWORD_PNG);
            MinecraftForgeClient.preloadTexture(CREEPERSWORD_PNG);
            MinecraftForgeClient.preloadTexture(WITHERSWORD_PNG);
            MinecraftForgeClient.preloadTexture(GODSWORD_PNG);
          
            MinecraftForgeClient.preloadTexture(NORE_PNG);
            MinecraftForgeClient.preloadTexture(NSWORD_PNG);
            MinecraftForgeClient.preloadTexture(NPICK_PNG);
            MinecraftForgeClient.preloadTexture(NSHOVEL_PNG);
            MinecraftForgeClient.preloadTexture(NAXE_PNG);

            MinecraftForgeClient.preloadTexture(I1_PNG);
            MinecraftForgeClient.preloadTexture(I2_PNG);
            MinecraftForgeClient.preloadTexture(I3_PNG);
            MinecraftForgeClient.preloadTexture(I4_PNG);
            MinecraftForgeClient.preloadTexture(I5_PNG);
            MinecraftForgeClient.preloadTexture(I6_PNG);
            MinecraftForgeClient.preloadTexture(I7_PNG);
            MinecraftForgeClient.preloadTexture(NOTCHICAINGOT_PNG);

            MinecraftForgeClient.preloadTexture(CLOUD_PNG);
            MinecraftForgeClient.preloadTexture(PORTAL_PNG);
            MinecraftForgeClient.preloadTexture(PORTAL2_PNG);
            MinecraftForgeClient.preloadTexture(HELLB_PNG);

            MinecraftForgeClient.preloadTexture(AMULET_PNG);
            MinecraftForgeClient.preloadTexture(TRANS_PNG);
            MinecraftForgeClient.preloadTexture(GOD_PNG);
            MinecraftForgeClient.preloadTexture(WITHER_PNG);
            MinecraftForgeClient.preloadTexture(NOTE_PNG);
            MinecraftForgeClient.preloadTexture(BOOK_PNG);

            
            MinecraftForgeClient.preloadTexture(CHEAT_PNG);

            MinecraftForgeClient.preloadTexture(BUTTERSWORD_PNG);
            MinecraftForgeClient.preloadTexture(BUTTER_PNG);
            MinecraftForgeClient.preloadTexture(SQUIDNOTCH_PNG);
            MinecraftForgeClient.preloadTexture(KEY_PNG);
            MinecraftForgeClient.preloadTexture(HELL_PNG);
            MinecraftForgeClient.preloadTexture(HELLCREEPER_PNG);

            //magic
            MinecraftForgeClient.preloadTexture(FIREBALL_PNG);
            MinecraftForgeClient.preloadTexture(MANA_PNG);
            MinecraftForgeClient.preloadTexture(WAND_PNG);

            //DigiBlade
            MinecraftForgeClient.preloadTexture(DIGI_PNG);

        	RenderingRegistry.registerEntityRenderingHandler(HellSpider.class, new RenderHellSpider(new ModelHellSpider(), 0.3F));
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMagic.class, new TileEntityRender());
        	GameRegistry.registerTileEntity(TileEntityMagic.class, "Magic");
        	GameRegistry.registerTileEntity(TileEntityForge.class, "Infuser");	
        }
}