package shadows.mobfarm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.*;
import net.minecraft.entity.boss.EntityWither;

public class ModRegistry {

	//public ItemModSeed(String name, Block crops)

	//public static BlockModCrop cropBone;
	//public static ItemModSeed seedBone;
	//public static BlockModCrop cropGold;
	//public static ItemModSeed seedGold;
	public static BlockModCrop cropP455;
	public static ItemModSeed seedP455;
	public static BlockEntityCrop cropCreeper;
	public static ItemModSeed seedCreeper;
	public static BlockEntityCrop cropSkeleton;
	public static ItemModSeed seedSkeleton;
	public static BlockEntityCrop cropSpider;
	public static ItemModSeed seedSpider;
//	public static BlockEntityCrop cropGiant;
//	public static ItemModSeed seedGiant;
	public static BlockEntityCrop cropZombie;
	public static ItemModSeed seedZombie;
	public static BlockEntityCrop cropSlime;
	public static ItemModSeed seedSlime;
	public static BlockEntityCrop cropGhast;
	public static ItemModSeed seedGhast;
	public static BlockEntityCrop2 cropPigZombie;
	public static ItemModSeed seedPigZombie;
	public static BlockEntityCrop cropEnderman;
	public static ItemModSeed seedEnderman;
	public static BlockEntityCrop2 cropCaveSpider;
	public static ItemModSeed seedCaveSpider;
	public static BlockEntityCrop cropSilverfish;
	public static ItemModSeed seedSilverfish;
	public static BlockEntityCrop cropBlaze;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop2 cropLavaSlime;
	public static ItemModSeed seedLavaSlime;
	public static BlockEntityCrop2 cropEnderDragon;
	public static ItemModSeed seedEnderDragon;
	public static BlockEntityCrop2 cropWitherBoss;
	public static ItemModSeed seedWitherBoss;
	public static BlockEntityCrop cropBat;
	public static ItemModSeed seedBat;
	public static BlockEntityCrop cropWitch;
	public static ItemModSeed seedWitch;
	public static BlockEntityCrop cropEndermite;
	public static ItemModSeed seedEndermite;
	public static BlockEntityCrop cropGuardian;
	public static ItemModSeed seedGuardian;
	public static BlockEntityCrop cropShulker;
	public static ItemModSeed seedShulker;
	public static BlockEntityCrop cropPig;
	public static ItemModSeed seedPig;
	public static BlockEntityCrop cropSheep;
	public static ItemModSeed seedSheep;
	public static BlockEntityCrop cropCow;
	public static ItemModSeed seedCow;
	public static BlockEntityCrop cropChicken;
	public static ItemModSeed seedChicken;
	public static BlockEntityCrop cropSquid;
	public static ItemModSeed seedSquid;
	public static BlockEntityCrop cropWolf;
	public static ItemModSeed seedWolf;
	public static BlockEntityCrop2 cropMushroomCow;
	public static ItemModSeed seedMushroomCow;
//	public static BlockEntityCrop cropSnowMan;
//	public static ItemModSeed seedSnowMan;
	public static BlockEntityCrop2 cropOzelot;
	public static ItemModSeed seedOzelot;
//	public static BlockEntityCrop cropVillagerGolem;
//	public static ItemModSeed seedVillagerGolem;
	public static BlockEntityCrop2 cropEntityHorse;
	public static ItemModSeed seedEntityHorse;
	public static BlockEntityCrop cropRabbit;
	public static ItemModSeed seedRabbit;
	public static BlockEntityCrop2 cropPolarBear;
	public static ItemModSeed seedPolarBear;
	public static BlockEntityCrop cropVillager;
	public static ItemModSeed seedVillager;
//	public static BlockCommandCrop cropCoded;
//	public static ItemModSeed seedCoded;
    public static final CreativeTabs MOBFARM = new CreativeTabs("mobfarm")
    {
        @SideOnly(Side.CLIENT) @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(seedP455);
        }
    };

	public static void init() {
	//	cropBone = new BlockModCrop("cropBone", ModRegistry.seedBone, Items.BONE);
	//	seedBone = new ItemModSeed("seedBone", ModRegistry.cropBone);
	//	cropGold = new BlockModCrop("cropGold", ModRegistry.seedGold, Items.GOLD_NUGGET);
	//	seedGold = new ItemModSeed("seedGold", ModRegistry.cropGold);
		cropP455 = new BlockModCrop("cropP455", Items.SKULL, "TheRealp455w0rd");
		seedP455 = new ItemModSeed("seedP455");
		cropCreeper = new BlockEntityCrop("cropCreeper");
		seedCreeper = new ItemModSeed("seedCreeper");
		cropSkeleton = new BlockEntityCrop("cropSkeleton");
		seedSkeleton = new ItemModSeed("seedSkeleton");
		cropSpider = new BlockEntityCrop("cropSpider");
		seedSpider = new ItemModSeed("seedSpider");
	//	cropGiant = new BlockEntityCrop("cropGiant");  These don't work anyhow.  Sad day.
	//	seedGiant = new ItemModSeed("seedGiant");
		cropZombie = new BlockEntityCrop("cropZombie");
		seedZombie = new ItemModSeed("seedZombie");
		cropSlime = new BlockEntityCrop("cropSlime");
		seedSlime = new ItemModSeed("seedSlime");
		cropGhast = new BlockEntityCrop("cropGhast");
		seedGhast = new ItemModSeed("seedGhast");
		cropPigZombie = new BlockEntityCrop2("cropPigZombie", 6);
		seedPigZombie = new ItemModSeed("seedPigZombie");
		cropEnderman = new BlockEntityCrop("cropEnderman");
		seedEnderman = new ItemModSeed("seedEnderman");
		cropCaveSpider = new BlockEntityCrop2("cropCaveSpider", 3);
		seedCaveSpider = new ItemModSeed("seedCaveSpider");
		cropSilverfish = new BlockEntityCrop("cropSilverfish");
		seedSilverfish = new ItemModSeed("seedSilverfish");
		cropBlaze = new BlockEntityCrop("cropBlaze");
		seedBlaze = new ItemModSeed("seedBlaze");
		cropLavaSlime = new BlockEntityCrop2("cropLavaSlime", 8);
		seedLavaSlime = new ItemModSeed("seedLavaSlime");
		cropEnderDragon = new BlockEntityCrop2("cropEnderDragon", 1);
		seedEnderDragon = new ItemModSeed("seedEnderDragon");
		cropWitherBoss = new BlockEntityCrop2("cropWitherBoss", 2);
		seedWitherBoss = new ItemModSeed("seedWitherBoss");
		cropBat = new BlockEntityCrop("cropBat");
		seedBat = new ItemModSeed("seedBat");
		cropWitch = new BlockEntityCrop("cropWitch");
		seedWitch = new ItemModSeed("seedWitch");
		cropEndermite = new BlockEntityCrop("cropEndermite");
		seedEndermite = new ItemModSeed("seedEndermite");
		cropGuardian = new BlockEntityCrop("cropGuardian");
		seedGuardian = new ItemModSeed("seedGuardian");
		cropShulker = new BlockEntityCrop("cropShulker");
		seedShulker = new ItemModSeed("seedShulker");
		cropPig = new BlockEntityCrop("cropPig");
		seedPig = new ItemModSeed("seedPig");
		cropSheep = new BlockEntityCrop("cropSheep");
		seedSheep = new ItemModSeed("seedSheep");
		cropCow = new BlockEntityCrop("cropCow");
		seedCow = new ItemModSeed("seedCow");
		cropChicken = new BlockEntityCrop("cropChicken");
		seedChicken = new ItemModSeed("seedChicken");
		cropSquid = new BlockEntityCrop("cropSquid");
		seedSquid = new ItemModSeed("seedSquid");
		cropWolf = new BlockEntityCrop("cropWolf");
		seedWolf = new ItemModSeed("seedWolf");
		cropMushroomCow = new BlockEntityCrop2("cropMushroomCow", 7);
		seedMushroomCow = new ItemModSeed("seedMushroomCow");
	//	cropSnowMan = new BlockEntityCrop("cropSnowMan");
	//	seedSnowMan = new ItemModSeed("seedSnowMan");
		cropOzelot = new BlockEntityCrop2("cropOzelot", 5);
		seedOzelot = new ItemModSeed("seedOzelot");
	//	cropVillagerGolem = new BlockEntityCrop("cropVillagerGolem");  These don't work anyhow.  Sad day.
	//	seedVillagerGolem = new ItemModSeed("seedVillagerGolem");
		cropEntityHorse = new BlockEntityCrop2("cropEntityHorse", 4);
		seedEntityHorse = new ItemModSeed("seedEntityHorse");
		cropRabbit = new BlockEntityCrop("cropRabbit");
		seedRabbit = new ItemModSeed("seedRabbit");
		cropPolarBear = new BlockEntityCrop2("cropPolarBear", 9);
		seedPolarBear = new ItemModSeed("seedPolarBear");
		cropVillager = new BlockEntityCrop("cropVillager");
		seedVillager = new ItemModSeed("seedVillager");	
//		cropCoded = new BlockCommandCrop("cropCoded", "say @TheCodedOne");
//		seedCoded = new ItemModSeed("seedCoded");
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {//this is only needed for seeds, but why?
	//	seedBone.initModel();
	//	seedGold.initModel();
		cropP455.initModel();
		seedP455.initModel();  //forgot
		cropCreeper.initModel();
		seedCreeper.initModel();  //Green +100
		cropSkeleton.initModel();
		seedSkeleton.initModel();  //-100; +73; +70
		cropSpider.initModel();
		seedSpider.initModel();  //Lightness -34
	//	cropGiant.initModel();
	//	seedGiant.initModel();
		cropZombie.initModel();
		seedZombie.initModel();  //-42; -29; -36
		cropSlime.initModel();
		seedSlime.initModel();  //-100, +100, -100
		cropGhast.initModel();
		seedGhast.initModel();  //-100; -15; 10
		cropPigZombie.initModel();
		seedPigZombie.initModel();  //+44; -40; 0
		cropEnderman.initModel();
		seedEnderman.initModel();  //Gamma Correction 0.3
		cropCaveSpider.initModel();
		seedCaveSpider.initModel();  //-37; -47; +39
		cropSilverfish.initModel();  
		seedSilverfish.initModel();  //-100
		cropBlaze.initModel();  
		seedBlaze.initModel();  //forgot
		cropLavaSlime.initModel();
		seedLavaSlime.initModel();  //+100
		cropEnderDragon.initModel();
		seedEnderDragon.initModel();
		cropWitherBoss.initModel();
		seedWitherBoss.initModel();
		cropBat.initModel();
		seedBat.initModel();  //Channel Mixer +200; -142; -19; -70
		cropWitch.initModel();
		seedWitch.initModel();  //-100; -100; +100
		cropEndermite.initModel();
		seedEndermite.initModel();  //0; -58; 0
		cropGuardian.initModel();
		seedGuardian.initModel();  //Green Channel Mixer +67; +95; -88; +9
		cropShulker.initModel();
		seedShulker.initModel();  //0; -74; +70
		cropPig.initModel();
		seedPig.initModel();  //+40; +7
		cropSheep.initModel();
		seedSheep.initModel();  //-100; +15; -3
		cropCow.initModel();
		seedCow.initModel();  //+51; +18; +1
		cropChicken.initModel();
		seedChicken.initModel();  //Blue Channel Mixer +21; -39; +126
		cropSquid.initModel();
		seedSquid.initModel();  //0; -100; +100
		cropWolf.initModel();
		seedWolf.initModel(); //-100; -15
		cropMushroomCow.initModel();
		seedMushroomCow.initModel();  //100; 19; 48
	//	cropSnowMan.initModel();
	//	seedSnowMan.initModel();
		cropOzelot.initModel();
		seedOzelot.initModel();  //0; 48; -49
	//	cropVillagerGolem.initModel();
	//	seedVillagerGolem.initModel();
		cropEntityHorse.initModel();
		seedEntityHorse.initModel();  //-72; -48; 68
		cropRabbit.initModel();
		seedRabbit.initModel();  //-39; 3
		cropPolarBear.initModel();
		seedPolarBear.initModel(); //Lightness +57
		cropVillager.initModel();
		seedVillager.initModel();  //0; 100; -58
	//	cropCoded.initModel();
	//	seedCoded.initModel();
	}

}



/* We need a crop for each one.  Damn that's a lot.'
addMapping(EntityCreeper.class, "Creeper", 50, 894731, 0);
addMapping(EntitySkeleton.class, "Skeleton", 51, 12698049, 4802889);
addMapping(EntitySpider.class, "Spider", 52, 3419431, 11013646);
addMapping(EntityGiantZombie.class, "Giant", 53);
addMapping(EntityZombie.class, "Zombie", 54, 44975, 7969893);
addMapping(EntitySlime.class, "Slime", 55, 5349438, 8306542);
addMapping(EntityGhast.class, "Ghast", 56, 16382457, 12369084);
addMapping(EntityPigZombie.class, "PigZombie", 57, 15373203, 5009705);
addMapping(EntityEnderman.class, "Enderman", 58, 1447446, 0);
addMapping(EntityCaveSpider.class, "CaveSpider", 59, 803406, 11013646);
addMapping(EntitySilverfish.class, "Silverfish", 60, 7237230, 3158064);
addMapping(EntityBlaze.class, "Blaze", 61, 16167425, 16775294);
addMapping(EntityMagmaCube.class, "LavaSlime", 62, 3407872, 16579584);
addMapping(EntityDragon.class, "EnderDragon", 63);
addMapping(EntityWither.class, "WitherBoss", 64);
addMapping(EntityBat.class, "Bat", 65, 4996656, 986895);
addMapping(EntityWitch.class, "Witch", 66, 3407872, 5349438);
addMapping(EntityEndermite.class, "Endermite", 67, 1447446, 7237230);
addMapping(EntityGuardian.class, "Guardian", 68, 5931634, 15826224);
addMapping(EntityShulker.class, "Shulker", 69, 9725844, 5060690);
addMapping(EntityPig.class, "Pig", 90, 15771042, 14377823);
addMapping(EntitySheep.class, "Sheep", 91, 15198183, 16758197);
addMapping(EntityCow.class, "Cow", 92, 4470310, 10592673);
addMapping(EntityChicken.class, "Chicken", 93, 10592673, 16711680);
addMapping(EntitySquid.class, "Squid", 94, 2243405, 7375001);
addMapping(EntityWolf.class, "Wolf", 95, 14144467, 13545366);
addMapping(EntityMooshroom.class, "MushroomCow", 96, 10489616, 12040119);
addMapping(EntitySnowman.class, "SnowMan", 97);
addMapping(EntityOcelot.class, "Ozelot", 98, 15720061, 5653556);
addMapping(EntityIronGolem.class, "VillagerGolem", 99);
addMapping(EntityHorse.class, "EntityHorse", 100, 12623485, 15656192);
addMapping(EntityRabbit.class, "Rabbit", 101, 10051392, 7555121);
addMapping(EntityPolarBear.class, "PolarBear", 102, 15921906, 9803152);
addMapping(EntityVillager.class, "Villager", 120, 5651507, 12422002);
*/