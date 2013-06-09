package mods.MoreNotch;

import ibxm.Player;

import java.awt.print.Book;
import java.util.ArrayList;

import mods.MoreNotch.FinalBlade.DigiBlade;
import mods.MoreNotch.NCE.Amulet;
import mods.MoreNotch.NCE.CraftHandler;
import mods.MoreNotch.NCE.CraftingNCE;
import mods.MoreNotch.NM.BlockMagic;
import mods.MoreNotch.NM.FireBall;
import mods.MoreNotch.NM.TileEntityMagic;
import mods.MoreNotch.NM.Wand;
import mods.MoreNotch.NM.WaterWalk;
import mods.MoreNotch.armor.NHelmet;
import mods.MoreNotch.dimension.BiomeGenHeaven;
import mods.MoreNotch.dimension.BlockCloud;
import mods.MoreNotch.dimension.Corrupt;
import mods.MoreNotch.dimension.EntityAngle;
import mods.MoreNotch.dimension.EntityGod;
import mods.MoreNotch.dimension.God;
import mods.MoreNotch.dimension.GodSpawn;
import mods.MoreNotch.dimension.HeavenPortal;
import mods.MoreNotch.dimension.MoreNotchWorldProvider;
import mods.MoreNotch.dimension.Transposer;
import mods.MoreNotch.dimension.WitherSpawn;
import mods.MoreNotch.forge.TileEntityForge;
import mods.MoreNotch.generation.BlockNotchica;
import mods.MoreNotch.generation.WorldGenHandle;
import mods.MoreNotch.hell.BiomeGenHell;
import mods.MoreNotch.hell.HellBrick;
import mods.MoreNotch.hell.HellPortal;
import mods.MoreNotch.hell.HellSpider;
import mods.MoreNotch.hell.HellWorldProvider;
import mods.MoreNotch.hell.Key;
import mods.MoreNotch.hell.ModelHellSpider;
import mods.MoreNotch.hell.NetherCreeper;
import mods.MoreNotch.hell.RenderHellSpider;
import mods.MoreNotch.ingots.Butter;
import mods.MoreNotch.ingots.ButterSword;
import mods.MoreNotch.ingots.CreeperIngot;
import mods.MoreNotch.ingots.GhostIngot;
import mods.MoreNotch.ingots.HellIngot;
import mods.MoreNotch.ingots.NotchicaIngot;
import mods.MoreNotch.ingots.SkeletonIngot;
import mods.MoreNotch.ingots.SlenderIngot;
import mods.MoreNotch.ingots.WitherIngot;
import mods.MoreNotch.ingots.ZombieIngot;
import mods.MoreNotch.items.Books;
import mods.MoreNotch.items.CheatSword;
import mods.MoreNotch.items.CreeperSword;
import mods.MoreNotch.items.GhostSword;
import mods.MoreNotch.items.GodSword;
import mods.MoreNotch.items.HellSword;
import mods.MoreNotch.items.Note;
import mods.MoreNotch.items.SkeletonSword;
import mods.MoreNotch.items.SlenderSword;
import mods.MoreNotch.items.WitherSword;
import mods.MoreNotch.items.ZombieSword;
import mods.MoreNotch.mana.BlockMana;
import mods.MoreNotch.mobs.ButterNotch;
import mods.MoreNotch.mobs.CreeperNotch;
import mods.MoreNotch.mobs.EntityFriendlyWitherSkeleton;
import mods.MoreNotch.mobs.FriendlyNotch;
import mods.MoreNotch.mobs.GhostNotch;
import mods.MoreNotch.mobs.GiantNotch;
import mods.MoreNotch.mobs.Herobrine;
import mods.MoreNotch.mobs.NetherNotch;
import mods.MoreNotch.mobs.Notch;
import mods.MoreNotch.mobs.ShavedNotch;
import mods.MoreNotch.mobs.SkeletonNotch;
import mods.MoreNotch.mobs.SlenderNotch;
import mods.MoreNotch.mobs.SquidNotch;
import mods.MoreNotch.mobs.WitherNotch;
import mods.MoreNotch.mobs.ZombieNotch;
import mods.MoreNotch.tools.NAxe;
import mods.MoreNotch.tools.NPickaxe;
import mods.MoreNotch.tools.NShovel;
import mods.MoreNotch.tools.NSword;
import net.minecraft.block.Block;
import net.minecraft.block.BlockMelon;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.Icon;
import net.minecraft.world.WorldManager;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="MoreNotch", name="More Notches", version="1.5.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class MoreNotch {

        // The instance of your mod that Forge uses.
        @Instance("MoreNotch")
        
        
        public static MoreNotch instance;
    	public static Block notchica;
    	public static Block forge;
    	public static Block cloud;
    	public static Block god;
    	public static Block hellBrick;
    	
        public static final BiomeGenBase heaven = (new BiomeGenHeaven(17)).setColor(353825).setBiomeName("Heaven").func_76733_a(5159473).setTemperatureRainfall(0.7F, 0.8F);
        public static final BiomeGenBase hell2 = (new BiomeGenHell(18)).setColor(353825).setBiomeName("Hell").func_76733_a(5159473).setTemperatureRainfall(0.7F, 0.8F);

        
    	public final static Item hellsword = new HellSword(6521, EnumToolMaterial.EMERALD, "Hell Sword");
    	public final static Item ghostsword = new GhostSword(6522, EnumToolMaterial.EMERALD, "Ghost Sword");
    	public final static Item slendersword = new SlenderSword(6523, EnumToolMaterial.EMERALD, "Slender Sword");
    	public final static Item zombiesword = new ZombieSword(6524, EnumToolMaterial.EMERALD, "Zombie Sword");
    	public final static Item skeletonsword = new SkeletonSword(6525, EnumToolMaterial.EMERALD, "Skeleton Sword");
    	public final static Item creepersword = new CreeperSword(6526, EnumToolMaterial.EMERALD, "Creeper Sword");
    	public final static Item withersword = new WitherSword(6527, EnumToolMaterial.EMERALD, "Wither Sword");
    	public final static Item gsword = new GodSword(6528, EnumToolMaterial.EMERALD, "God Sword");

    	public final static Item cheat = new CheatSword(7941, EnumToolMaterial.EMERALD, "Cheat Sword");

    	public final static Item amulet = new Amulet(6941);
    	public final static Item trans = new Transposer(6942);
    	public final static Item wither = new WitherSpawn(6943);
    	public final static Item gods = new GodSpawn(6944);
    	public final static Item note = new Note(6945);
    	public final static Item book = new Books(6946);
    	public final static Item butter = new Butter(6947, 4, 4F, false).setFull3D();    	
    	public final static Item buttersword = new ButterSword(6948, EnumToolMaterial.EMERALD, "Butter Sword");

    	public final static Item key = new Key(6949);

    	//Ore Items
    	public final static Item nsword = new NSword(8183, EnumToolMaterial.EMERALD, "Notchica Sword");
        public static Item naxe;
        public static Item npickaxe;
        public static Item nshovel;

        //ingots
        public final static Item i1 = new CreeperIngot(8280);
        public final static Item i2 = new GhostIngot(8281);
        public final static Item i3 = new HellIngot(8282);
        public final static Item i4 = new SkeletonIngot(8283);
        public final static Item i5 = new SlenderIngot(8284);
        public final static Item i6 = new WitherIngot(8285);
        public final static Item i7 = new ZombieIngot(8286);

        public final static Item notchicaingot = new NotchicaIngot(8287);
        
        //Magic
    	public static Block mana;
        public final static Item wand = new Wand(8288);
        public final static Item fireball = new FireBall(8289);
        //public final static Item waterw = new WaterWalk(8290);
    	public static Block core;

        //portal
    	public static Block portal;
    	public static Block portal2;

    	//DigiTool
    	public static Item digi = new DigiBlade(8291, EnumToolMaterial.EMERALD);
    	
        @SidedProxy(clientSide="mods.MoreNotch.client.ClientProxy", serverSide="mods.MoreNotch.CommonProxy")
        public static CommonProxy proxy;
        
        //Creative Tab
    	public static final CreativeTabs tabCustom = new CreativeTabCustom(12,
    			"MoreNotch");
    	
        static int startEntityId = 300;

        @PreInit
        public void preInit(FMLPreInitializationEvent event) {

        }
        
   
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();

                //forge
        		mana = new Forge(747);
        		GameRegistry.registerBlock(mana, "Mana");
        		LanguageRegistry.addName(mana, "Wand Charger");
        		GameRegistry.registerTileEntity(TileEntityForge.class, "Mana");
        		
            	core = new BlockMana(748, Material.iron);
        		GameRegistry.registerBlock(core, "core");
        		LanguageRegistry.addName(core, "Core");

                //dimension
            	DimensionManager.registerProviderType(20, MoreNotchWorldProvider.class, true);
            	DimensionManager.registerDimension(20 , 20);
               
                //dimension
            	DimensionManager.registerProviderType(19, HellWorldProvider.class, true);
            	DimensionManager.registerDimension(19 , 19);
            	
            	portal = new HeavenPortal(835);
        		GameRegistry.registerBlock(portal, "Heaven");
        		LanguageRegistry.addName(portal, "Heaven Portal");
        		
            	god = new God(836);
        		GameRegistry.registerBlock(god, "god");
        		LanguageRegistry.addName(god, "Call of Notch");
        		
            	portal2 = new HellPortal(837);
        		GameRegistry.registerBlock(portal2, "Hell");
        		LanguageRegistry.addName(portal2, "Hell Portal");
        		
            	hellBrick = new HellBrick(2838);
        		GameRegistry.registerBlock(hellBrick, "HellBrick");
        		LanguageRegistry.addName(hellBrick, "Hell Brick");
        		

            	//tools
        		npickaxe = new NPickaxe(8180, EnumToolMaterial.IRON).setUnlocalizedName("MoreNotch:npickaxe").setCreativeTab(CreativeTabs.tabTools);
        		GameRegistry.registerItem(npickaxe, "npick");
        		LanguageRegistry.addName(npickaxe, "Notchica Pickaxe");
        		
        		naxe = new NAxe(8181, EnumToolMaterial.IRON).setUnlocalizedName("MoreNotch:naxe").setCreativeTab(CreativeTabs.tabTools);
        		GameRegistry.registerItem(naxe, "naxe");
        		LanguageRegistry.addName(naxe, "Notchica Axe");
        		
        		nshovel = new NShovel(8182, EnumToolMaterial.IRON).setUnlocalizedName("MoreNotch:nshovel").setCreativeTab(CreativeTabs.tabTools);
        		GameRegistry.registerItem(nshovel, "nshovel");
        		LanguageRegistry.addName(nshovel, "Notchica Shovel");
        		
                GameRegistry.registerItem(nsword, "nsword");
                LanguageRegistry.addName(nsword, "Notchica Sword");
        		
                GameRegistry.registerItem(gsword, "gsword");
                LanguageRegistry.addName(gsword, "God Sword");
                
                //ingots
                GameRegistry.registerItem(i1, "CreeperIngot");
                LanguageRegistry.addName(i1, "Creeper Ingot");

                GameRegistry.registerItem(i2, "GhostIngot");
                LanguageRegistry.addName(i2, "Ghost Ingot");
               
                GameRegistry.registerItem(i3, "HellIngot");
                LanguageRegistry.addName(i3, "Hell Ingot");
                
                GameRegistry.registerItem(i4, "SkeletonIngot");
                LanguageRegistry.addName(i4, "Skeleton Ingot");
                
                GameRegistry.registerItem(i5, "SlenderIngot");
                LanguageRegistry.addName(i5, "Slender Ingot");
                
                GameRegistry.registerItem(i6, "WitherIngot");
                LanguageRegistry.addName(i6, "Wither Ingot");
                
                GameRegistry.registerItem(i7, "ZombieIngot");
                LanguageRegistry.addName(i7, "Zombie Ingot");
                
                GameRegistry.registerItem(notchicaingot, "NotchicaIngot");
                LanguageRegistry.addName(notchicaingot, "Notchica Ingot");
                
                GameRegistry.registerItem(note, "Note");
                LanguageRegistry.addName(note, "Note");
                
                GameRegistry.registerItem(book, "Part");
                LanguageRegistry.addName(book, "Part 2");
                
                GameRegistry.registerItem(fireball, "Fireball");
                LanguageRegistry.addName(fireball, "Wand");
                
                GameRegistry.registerItem(wand, "Wand");
                LanguageRegistry.addName(wand, "Wand");
             
                GameRegistry.registerItem(digi, "DigiTool");
                LanguageRegistry.addName(digi, "DigiTool");

                //GameRegistry.registerItem(waterw, "WaterWalk");
                //LanguageRegistry.addName(waterw, "Water Walk");
                                
                //Creative Tab
        		LanguageRegistry.instance().addStringLocalization("itemGroup.MoreNotch",
        				"More Notches");
        		
                //Ore
        		notchica = new BlockNotchica(645);
        		GameRegistry.registerBlock(notchica, "Notchica");
        		LanguageRegistry.addName(notchica, "Notchica Ore");
        		GameRegistry.registerWorldGenerator(new WorldGenHandle());
        		
        		//cloud
        		cloud = new BlockCloud(646);
        		GameRegistry.registerBlock(cloud, "Cloud");
        		LanguageRegistry.addName(cloud, "Cloud");
        		GameRegistry.registerWorldGenerator(new WorldGenHandle());
             
        		//Make's the amulet return after crafting.
                GameRegistry.registerCraftingHandler(new CraftHandler());
                
                //Recipes NCE
        		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond), Item.ingotGold,Item.ingotGold, Item.ingotGold, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold,3), Item.diamond,  MoreNotch.amulet);                

        		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold), Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, Item.ingotIron, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotIron, 5), Item.ingotGold, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Block.cobblestone), Block.dirt, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Block.dirt), Block.grass, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Block.grass), Block.sand, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Block.sand), Block.cobblestone, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Item.redstone), Item.lightStoneDust, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Item.lightStoneDust), Item.redstone, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Block.lever), Block.stoneButton, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Block.stoneButton), Block.woodenButton, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Block.stone), Block.stoneBrick, MoreNotch.amulet);                
        		GameRegistry.addShapelessRecipe(new ItemStack(Block.stoneBrick), Block.stone, MoreNotch.amulet);                

        		GameRegistry.addRecipe(new ItemStack(creepersword), 
        				" B ", 
        				" B ", 
        				" S ",
        				'B', i1,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(ghostsword), 
        				" B ", 
        				" B ", 
        				" S ",
        				'B', i2,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(hellsword), 
        				" B ", 
        				" B ", 
        				" S ",
        				'B', i3,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(skeletonsword), 
        				" B ", 
        				" B ", 
        				" S ",
        				'B', i4,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(slendersword), 
        				" B ", 
        				" B ", 
        				" S ",
        				'B', i5,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(withersword), 
        				" B ", 
        				" B ", 
        				" S ",
        				'B', i6,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(zombiesword), 
        				" B ", 
        				" B ", 
        				" S ",
        				'B', i7,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(trans), 
        				" D ", 
        				" G ", 
        				" D ",
        				'D', Item.diamond,
        				'G', Item.ingotGold);
        		
        		GameRegistry.addRecipe(new ItemStack(key), 
        				" D ", 
        				" G ", 
        				" D ",
        				'D', notchicaingot,
        				'G', i5);
        		
        		GameRegistry.addRecipe(new ItemStack(npickaxe), 
        				"DDD", 
        				" S ", 
        				" S ",
        				'D', notchicaingot,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(naxe), 
        				" DD", 
        				" SD", 
        				" S ",
        				'D', notchicaingot,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(naxe), 
        				"DD ", 
        				"DS ", 
        				" S ",
        				'D', notchicaingot,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(nsword), 
        				" D ", 
        				" D ", 
        				" S ",
        				'D', notchicaingot,
        				'S', Item.stick);
        		
        		GameRegistry.addRecipe(new ItemStack(nshovel), 
        				" D ", 
        				" S ", 
        				" S ",
        				'D', notchicaingot,
        				'S', Item.stick);
        		
        		GameRegistry.addSmelting(notchica.blockID, new ItemStack(notchicaingot), 2);
        		
        		//Gui
        		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());

                //Notch Normal
                EntityRegistry.registerModEntity(Notch.class, "Notch", 1,
        				this, 70, 3, true);
        		EntityRegistry.addSpawn(Notch.class, 10, 2, 4, EnumCreatureType.monster,
        						BiomeGenBase.beach, BiomeGenBase.extremeHills,
        						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
        						BiomeGenBase.forestHills, BiomeGenBase.jungle,
        						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
        						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
        						BiomeGenBase.plains, BiomeGenBase.river,
        						BiomeGenBase.swampland);
        		
        		//Notch Ghost
        		EntityRegistry.registerModEntity(GhostNotch.class, "GhostNotch", 2,
        				this, 70, 3, true);
        		EntityRegistry
        				.addSpawn(GhostNotch.class, 8, 2, 4, EnumCreatureType.monster,
        						BiomeGenBase.forest, BiomeGenBase.swampland);
                
        		//Notch Nether
        		EntityRegistry.registerModEntity(NetherNotch.class, "DevilNotch", 3,
        				this, 70, 3, true);
        		EntityRegistry
        				.addSpawn(NetherNotch.class, 8, 2, 4, EnumCreatureType.monster,
        						BiomeGenBase.hell);
        		
        		//Notch Slender
        		EntityRegistry.registerModEntity(SlenderNotch.class, "SlenderNotch", 4,
        				this, 70, 3, true);
        		
        		//Zombie Notch
                EntityRegistry.registerModEntity(ZombieNotch.class, "ZombieNotch", 5,
         				this, 70, 3, true);
         		EntityRegistry
         				.addSpawn(ZombieNotch.class, 9, 2, 4, EnumCreatureType.monster,
         						BiomeGenBase.beach, BiomeGenBase.extremeHills,
         						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
         						BiomeGenBase.forestHills, BiomeGenBase.jungle,
         						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
         						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
         						BiomeGenBase.plains, BiomeGenBase.river,
         						BiomeGenBase.swampland);
         		
         		//Creeper Notch
                EntityRegistry.registerModEntity(CreeperNotch.class, "CreeperNotch", 6,
         				this, 70, 3, true);
         		EntityRegistry
         				.addSpawn(CreeperNotch.class, 6, 2, 4, EnumCreatureType.monster,
         						BiomeGenBase.beach, BiomeGenBase.extremeHills,
         						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
         						BiomeGenBase.forestHills, BiomeGenBase.jungle,
         						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
         						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
         						BiomeGenBase.plains, BiomeGenBase.river,
         						BiomeGenBase.swampland);
         		
         		//Skeleton Notch
                EntityRegistry.registerModEntity(SkeletonNotch.class, "SkeletonNotch", 7,
         				this, 70, 3, true);
         		EntityRegistry
         				.addSpawn(SkeletonNotch.class, 9, 2, 4, EnumCreatureType.monster,
         						BiomeGenBase.beach, BiomeGenBase.extremeHills,
         						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
         						BiomeGenBase.forestHills, BiomeGenBase.jungle,
         						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
         						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
         						BiomeGenBase.plains, BiomeGenBase.river,
         						BiomeGenBase.swampland);
         		
         		//Shaved Notch
                EntityRegistry.registerModEntity(ShavedNotch.class, "ShavedNotch", 8,
         				this, 70, 3, true);
         		EntityRegistry
         				.addSpawn(ShavedNotch.class, 10, 2, 4, EnumCreatureType.monster,
         						BiomeGenBase.beach, BiomeGenBase.extremeHills,
         						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
         						BiomeGenBase.forestHills, BiomeGenBase.jungle,
         						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
         						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
         						BiomeGenBase.plains, BiomeGenBase.river,
         						BiomeGenBase.swampland);
         		
         		//Friendly Notch
                EntityRegistry.registerModEntity(FriendlyNotch.class, "FriendlyNotch", 9,
         				this, 70, 3, true);
         		EntityRegistry
         				.addSpawn(FriendlyNotch.class, 8, 2, 4, EnumCreatureType.monster,
         						BiomeGenBase.beach, BiomeGenBase.extremeHills,
         						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
         						BiomeGenBase.forestHills, BiomeGenBase.jungle,
         						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
         						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
         						BiomeGenBase.plains, BiomeGenBase.river,
         						BiomeGenBase.swampland);
         		
         		//Friendly Notch
                EntityRegistry.registerModEntity(ButterNotch.class, "ButterNotch", 10,
         				this, 70, 3, true);
         		EntityRegistry
         				.addSpawn(ButterNotch.class, 5, 2, 4, EnumCreatureType.monster,
         						BiomeGenBase.beach, BiomeGenBase.extremeHills,
         						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
         						BiomeGenBase.forestHills, BiomeGenBase.jungle,
         						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
         						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
         						BiomeGenBase.plains, BiomeGenBase.river,
         						BiomeGenBase.swampland);
         		
         		//Wither Notch
                EntityRegistry.registerModEntity(WitherNotch.class, "WitherNotch", 11,
            				this, 70, 3, true);
            		
            		//Angel
                    EntityRegistry.registerModEntity(EntityAngle.class, "Angle", 12,
            				this, 70, 3, true);
             		EntityRegistry
     				.addSpawn(EntityAngle.class, 6, 2, 4, EnumCreatureType.creature,
     						this.heaven);
             		
             		//God
                    EntityRegistry.registerModEntity(EntityGod.class, "GodNotch", 13,
            				this, 70, 3, true);
                    
                    //Squid Notch
                    EntityRegistry.registerModEntity(SquidNotch.class, "SquidNotch", 14,
             				this, 70, 3, true);
             		EntityRegistry
             				.addSpawn(SquidNotch.class, 5, 2, 4, EnumCreatureType.creature,
             						BiomeGenBase.beach, BiomeGenBase.extremeHills,
             						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
             						BiomeGenBase.forestHills, BiomeGenBase.jungle,
             						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
             						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
             						BiomeGenBase.plains, BiomeGenBase.river,
             						BiomeGenBase.swampland);
             		
             		//Corrupted Angel
                    EntityRegistry.registerModEntity(Corrupt.class, "Corrupt", 15,
            				this, 70, 3, true);
             		EntityRegistry
     				.addSpawn(EntityAngle.class, 6, 2, 4, EnumCreatureType.creature,
     						this.heaven);
             		
             		//Hell Spider
                    EntityRegistry.registerModEntity(HellSpider.class, "Hell", 16,
            				this, 70, 3, true);
             		EntityRegistry
     				.addSpawn(HellSpider.class, 6, 2, 4, EnumCreatureType.creature,
     						this.hell2);
            		RenderingRegistry.registerEntityRenderingHandler(HellSpider.class,
        					new RenderHellSpider(new ModelHellSpider(), 0.3F));
            		
            		//Hell Creeper
                    EntityRegistry.registerModEntity(NetherCreeper.class, "HellCreeper", 17,
            				this, 70, 3, true);
             		EntityRegistry.addSpawn(NetherCreeper.class, 6, 2, 4, EnumCreatureType.creature,
     						this.hell2);
             		
             		//Giant Notch
                    EntityRegistry.registerModEntity(GiantNotch.class, "GiantNotch", 18,
            				this, 70, 3, true);
                    
                    //Herobrine
                    EntityRegistry.registerModEntity(Herobrine.class, "Herobrine", 19,
            				this, 70, 3, true);
                //Items
                GameRegistry.registerItem(hellsword, "HellSword");
                LanguageRegistry.addName(hellsword, "Hell Sword");
                
                GameRegistry.registerItem(ghostsword, "GhostSword");
                LanguageRegistry.addName(ghostsword, "Ghost Sword"); 
                
                GameRegistry.registerItem(slendersword, "SlenderSword");
                LanguageRegistry.addName(slendersword, "Slender Sword"); 
                
                GameRegistry.registerItem(zombiesword, "ZombieSword");
                LanguageRegistry.addName(zombiesword, "Zombie Sword"); 
                
                GameRegistry.registerItem(skeletonsword, "SkeletonSword");
                LanguageRegistry.addName(skeletonsword, "Skeleton Sword"); 
                
                GameRegistry.registerItem(creepersword, "CreeperSword");
                LanguageRegistry.addName(creepersword, "Creeper Sword"); 
                
                GameRegistry.registerItem(withersword, "WitherSword");
                LanguageRegistry.addName(withersword, "Wither Sword"); 
                
                GameRegistry.registerItem(amulet, "Amulet");
                LanguageRegistry.addName(amulet, "Amulet of Notch"); 
                
                GameRegistry.registerItem(trans, "Transporter");
                LanguageRegistry.addName(trans, "Transporter"); 
                
                GameRegistry.registerItem(wither, "Wither");
                LanguageRegistry.addName(wither, "Call of The Wither Notch"); 
                
                GameRegistry.registerItem(gods, "Gods");
                LanguageRegistry.addName(gods, "Call of God"); 
                
                GameRegistry.registerItem(butter, "Butter");
                LanguageRegistry.addName(butter, "Butter"); 
                
                GameRegistry.registerItem(buttersword, "ButterSword");
                LanguageRegistry.addName(buttersword, "Butter Sword"); 
                
                GameRegistry.registerItem(cheat, "CheatSword");
                LanguageRegistry.addName(cheat, "Cheat Sword"); 
                
                GameRegistry.registerItem(key, "Key");
                LanguageRegistry.addName(key, "Hell Transporter"); 
                
                
                //entity egg
        		registerEntityEgg(Notch.class, 0xffffff, 0x000000);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.Notch.name", "Notch");
        	
        		registerEntityEgg(GhostNotch.class, 0xffffff, 0xffffff);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.GhostNotch.name", "Ghost Notch");
        		
        		registerEntityEgg(NetherNotch.class, 0x990000, 0x990000);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.DevilNotch.name", "Devil Notch");
        		
        		registerEntityEgg(SlenderNotch.class, 0x000000, 0xffffff);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.SlenderNotch.name", "Slender Notch");
        		
           		registerEntityEgg(ZombieNotch.class, 0x339900, 0x669900);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.ZombieNotch.name", "Zombie Notch");
        
           		registerEntityEgg(SkeletonNotch.class, 0xFFFFCC, 0xFFFFCC);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.SkeletonNotch.name", "Skeleton Notch");
        		
           		registerEntityEgg(CreeperNotch.class, 0x99FF33, 0x99FF33);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.CreeperNotch.name", "Creeper Notch");
        		
           		registerEntityEgg(ShavedNotch.class, 0xffffff, 0xFF99CC);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.ShavedNotch.name", "Shaved Notch");
        		
           		registerEntityEgg(FriendlyNotch.class, 0xFF99CC, 0xFF99CC);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.FriendlyNotch.name", "Friendly Notch");
        		
           		registerEntityEgg(ButterNotch.class, 0xFFFF00, 0xFFFF00);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.ButterNotch.name", "Butter Notch");
        		
           		registerEntityEgg(WitherNotch.class, 0x330099, 0x330099);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.WitherNotch.name", "Wither Notch");
        		
           		registerEntityEgg(EntityAngle.class, 0xffffff, 0xffffff);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.Angle.name", "Angel");
        		
           		registerEntityEgg(EntityGod.class, 0xffffff, 0xffffff);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.GodNotch.name", "God Notch");
        		
           		registerEntityEgg(SquidNotch.class, 0xffffff,  0xFFFF00);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.SquidNotch.name", "Squid Notch");
        		
           		registerEntityEgg(Corrupt.class, 0x330099, 0xffffff);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.Corrupt.name", "Corrupted Angel");
        		
           		registerEntityEgg(HellSpider.class, 0xFF0000, 0x990000);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.Hell.name", "Hell Spider");
        		
           		registerEntityEgg(NetherCreeper.class, 0x00FF66, 0x990000);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.HellCreeper.name", "Hell Creeper");
        		
           		registerEntityEgg(GiantNotch.class, 0x00FF66, 0x330099);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.GiantNotch.name", "Giant Notch");
        		
           		registerEntityEgg(Herobrine.class, 0x3399CC, 0x3399CC);
        		LanguageRegistry.instance().addStringLocalization(
        				"entity.MoreNotch.Herobrine.name", "Herobrine");
        }
        		public static int getUniqueEntityId() {
        			do {
        				startEntityId++;
        			} while (EntityList.getStringFromID(startEntityId) != null);

        			return startEntityId;
        		}

        		public static int registerEntityEgg(Class<? extends Entity> entity,
        				int primaryColor, int secondaryColor) {
        			int id = getUniqueEntityId();
        			EntityList.IDtoClassMapping.put(id, entity);
        			EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor,
        					secondaryColor));
        			return id;
        		}
        		
        		ArrayList<BiomeGenBase> biomeList = new ArrayList<BiomeGenBase>();{
        		for(int i = 0; i < BiomeGenBase.biomeList.length; i++)
        		{
        		if(BiomeGenBase.biomeList[i] != null && BiomeGenBase.biomeList[i].biomeID != 17)
        		{
        		biomeList.add(BiomeGenBase.biomeList[i]);
        		}
        		}
        		}
        		
        		        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
        
}
        