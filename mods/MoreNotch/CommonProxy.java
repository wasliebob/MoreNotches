package mods.MoreNotch;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import mods.MoreNotch.FinalBlade.DigiBlade;
import mods.MoreNotch.NM.TileEntityMagic;
import mods.MoreNotch.NM.TileEntityRender;
import mods.MoreNotch.forge.TileEntityForge;
import mods.MoreNotch.hell.HellSpider;
import mods.MoreNotch.hell.ModelHellSpider;
import mods.MoreNotch.hell.RenderHellSpider;
import mods.MoreNotch.mobs.CreeperNotch;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.IconRegister;


public class CommonProxy {
    public static String NOTCH_PNG = "/mods/MoreNotch/textures/mobs/notch.png";
    public static String GHOSTNOTCH_PNG = "/mods/MoreNotch/textures/mobs/ghostnotch.png";
    public static String HELLNOTCH_PNG = "/mods/MoreNotch/textures/mobs/hellnotch.png";
    public static String SLENDERNOTCH_PNG = "/mods/MoreNotch/textures/mobs/slendernotch.png";
    public static String ZOMBIENOTCH_PNG = "/mods/MoreNotch/textures/mobs/zombienotch.png";
    public static String CREEPERNOTCH_PNG = "/mods/MoreNotch/textures/mobs/creepernotch.png";
    public static String SKELETONNOTCH_PNG = "/mods/MoreNotch/textures/mobs/skeletonnotch.png";
    public static String FRIENDLYNOTCH_PNG = "/mods/MoreNotch/textures/mobs/friendlynotch.png";
    public static String SHAVEDNOTCH_PNG = "/mods/MoreNotch/textures/mobs/shavednotch.png";
    public static String BUTTERNOTCH_PNG = "/mods/MoreNotch/textures/mobs/butternotch.png";
    public static String WITHERNOTCH_PNG = "/mods/MoreNotch/textures/mobs/withernotch.png";
    public static String ANGELNOTCH_PNG = "/mods/MoreNotch/textures/mobs/angel.png";
    public static String GODNOTCH_PNG = "/mods/MoreNotch/textures/mobs/notchgod.png";
    public static String SQUIDNOTCH_PNG = "/mods/MoreNotch/textures/mobs/squidgod.png";
    public static String CORRUPT_PNG = "/mods/MoreNotch/textures/mobs/corrupted.png";
    public static String HELL_PNG = "/mods/MoreNotch/textures/mobs/hellspider.png";
    public static String HELLCREEPER_PNG = "/mods/MoreNotch/textures/mobs/hellcreeper.png";
    public static String GIANTNOTCH_PNG = "/mods/MoreNotch/textures/mobs/giantnotch.png";
    public static String HEROBRINE_PNG = "/mods/MoreNotch/textures/mobs/herobrine.png";

    public static String HELLSWORD_PNG = "/mods/MoreNotch/textures/items/hellsword.png";
    public static String GHOSTSWORD_PNG = "/mods/MoreNotch/textures/items/ghostsword.png";
    public static String SLENDERSWORD_PNG = "/mods/MoreNotch/textures/items/slendersword.png";
    public static String ZOMBIESWORD_PNG = "/mods/MoreNotch/textures/items/zombiesword.png";
    public static String SKELETONSWORD_PNG = "/mods/MoreNotch/textures/items/skeletonsword.png";
    public static String CREEPERSWORD_PNG = "/mods/MoreNotch/textures/items/creepersword.png";
    public static String WITHERSWORD_PNG = "/mods/MoreNotch/textures/items/withersword.png";
    public static String GODSWORD_PNG = "/mods/MoreNotch/textures/items/godsword.png";

    public static String NORE_PNG = "/mods/MoreNotch/textures/blocks/notchica.png";
    public static String NSWORD_PNG = "/mods/MoreNotch/textures/items/nsword.png";
    public static String NPICK_PNG = "/mods/MoreNotch/textures/items/npick.png";
    public static String NAXE_PNG = "/mods/MoreNotch/textures/items/naxe.png";
    public static String NSHOVEL_PNG = "/mods/MoreNotch/textures/items/nshovel.png";

    public static String GOD_PNG = "/mods/MoreNotch/textures/blocks/god.png";

    public static String CLOUD_PNG = "/mods/MoreNotch/textures/blocks/cloud.png";
    public static String PORTAL_PNG = "/mods/MoreNotch/textures/blocks/portal.png";
    public static String PORTAL2_PNG = "/mods/MoreNotch/textures/blocks/portal2.png";
    public static String HELLB_PNG = "/mods/MoreNotch/textures/blocks/hellbrick.png";

    
    public static String AMULET_PNG = "/mods/MoreNotch/textures/items/amulet.png";
    public static String TRANS_PNG = "/mods/MoreNotch/textures/items/trans.png";
    public static String WITHER_PNG = "/mods/MoreNotch/textures/items/wither.png";
    public static String GODS_PNG = "/mods/MoreNotch/textures/items/god.png";
    public static String NOTE_PNG = "/mods/MoreNotch/textures/items/note.png";
    public static String BOOK_PNG = "/mods/MoreNotch/textures/items/book.png";
    public static String BUTTER_PNG = "/mods/MoreNotch/textures/items/butter.png";
    public static String BUTTERSWORD_PNG = "/mods/MoreNotch/textures/items/buttersword.png";
    public static String KEY_PNG = "/mods/MoreNotch/textures/items/key.png";

    
    
    public static String CHEAT_PNG = "/mods/MoreNotch/textures/items/cheat.png";

    
    public static String I1_PNG = "/mods/MoreNotch/textures/items/creeperingot.png";
    public static String I2_PNG = "/mods/MoreNotch/textures/items/ghostingot.png";
    public static String I3_PNG = "/mods/MoreNotch/textures/items/hellingot.png";
    public static String I4_PNG = "/mods/MoreNotch/textures/items/skeletoningot.png";
    public static String I5_PNG = "/mods/MoreNotch/textures/items/slenderingot.png";
    public static String I6_PNG = "/mods/MoreNotch/textures/items/witheringot.png";
    public static String I7_PNG = "/mods/MoreNotch/textures/items/zombieingot.png";

    public static String NOTCHICAINGOT_PNG = "/mods/MoreNotch/textures/items/nothcicaingot.png";
    public static String DIGI_PNG = "/mods/MoreNotch/textures/items/digiblade.png";

    
    //Spell System
    public static String FIREBALL_PNG = "/mods/MoreNotch/textures/items/fireball.png";
    public static String MANA_PNG = "/mods/MoreNotch/textures/blocks/mana.png";
    public static String WAND_PNG = "/mods/MoreNotch/textures/blocks/wand.png";

        public void registerRenderers() {
        	RenderingRegistry.registerEntityRenderingHandler(HellSpider.class, new RenderHellSpider(new ModelHellSpider(), 0.3F));
        	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMagic.class, new TileEntityRender());
        	GameRegistry.registerTileEntity(TileEntityForge.class, "Infuser");
        	GameRegistry.registerTileEntity(TileEntityMagic.class, "Magic");
}
}