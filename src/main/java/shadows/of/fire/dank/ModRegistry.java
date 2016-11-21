package shadows.of.fire.dank;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Items;
import net.minecraftforge.fml.relauncher.*;

public class ModRegistry {

	//public ItemModSeed(String name, Block crops)

	//public static BlockModCrop cropBone;
	//public static ItemModSeed seedBone;
	//public static BlockModCrop cropGold;
	//public static ItemModSeed seedGold;
	public static BlockModCrop cropP455;
	public static ItemModSeed seedP455;
	public static BlockEntityCrop cropCreeper;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropSkeleton;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropSpider;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropGiant;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropZombie;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropSlime;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropGhast;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropPigZombie;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropEnderman;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropCaveSpider;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropSilverfish;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropBlaze;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropLavaSlime;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropEnderDragon;
	public static ItemModSeed seedBlaze;
	public static BlockEntityCrop cropWitherBoss;
	public static ItemModSeed seedBlaze;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void init() {
	//	cropBone = new BlockModCrop("cropBone", ModRegistry.seedBone, Items.BONE);
	//	seedBone = new ItemModSeed("seedBone", ModRegistry.cropBone);
	//	cropGold = new BlockModCrop("cropGold", ModRegistry.seedGold, Items.GOLD_NUGGET);
	//	seedGold = new ItemModSeed("seedGold", ModRegistry.cropGold);
		cropP455 = new BlockModCrop("cropP455", Items.SKULL, "TheRealp455w0rd");
		seedP455 = new ItemModSeed("seedP455");
		cropBlaze = new BlockEntityCrop("cropBlaze");
		seedBlaze = new ItemModSeed("seedBlaze");
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {//this is only needed for seeds, but why?
	//	seedBone.initModel();
	//	seedGold.initModel();
		seedP455.initModel();
		seedBlaze.initModel();
	}

}


/* We need a crop for each one.  Damn that's alot.'
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
addMapping(EntityEnderCrystal.class, "EnderCrystal", 200);
*/