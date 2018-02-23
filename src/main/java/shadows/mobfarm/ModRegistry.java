package shadows.mobfarm;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@SuppressWarnings("deprecation")
public class ModRegistry {

	public static final BlockEntityCrop cropCreeper = new BlockEntityCrop("cropCreeper");
	public static final ItemModSeed seedCreeper = new ItemModSeed("seedCreeper");
	public static final BlockEntityCrop cropSkeleton = new BlockEntityCrop("cropSkeleton");
	public static final ItemModSeed seedSkeleton = new ItemModSeed("seedSkeleton");
	public static final BlockEntityCrop cropSpider = new BlockEntityCrop("cropSpider");
	public static final ItemModSeed seedSpider = new ItemModSeed("seedSpider");
	public static final BlockEntityCrop cropZombie = new BlockEntityCrop("cropZombie");
	public static final ItemModSeed seedZombie = new ItemModSeed("seedZombie");
	public static final BlockEntityCrop cropSlime = new BlockEntityCrop("cropSlime");
	public static final ItemModSeed seedSlime = new ItemModSeed("seedSlime");
	public static final BlockEntityCrop cropGhast = new BlockEntityCrop("cropGhast");
	public static final ItemModSeed seedGhast = new ItemModSeed("seedGhast");
	public static final BlockEntityCrop2 cropPigZombie = new BlockEntityCrop2("cropPigZombie", 6);
	public static final ItemModSeed seedPigZombie = new ItemModSeed("seedPigZombie");
	public static final BlockEntityCrop cropEnderman = new BlockEntityCrop("cropEnderman");
	public static final ItemModSeed seedEnderman = new ItemModSeed("seedEnderman");
	public static final BlockEntityCrop2 cropCaveSpider = new BlockEntityCrop2("cropCaveSpider", 3);
	public static final ItemModSeed seedCaveSpider = new ItemModSeed("seedCaveSpider");
	public static final BlockEntityCrop cropSilverfish = new BlockEntityCrop("cropSilverfish");
	public static final ItemModSeed seedSilverfish = new ItemModSeed("seedSilverfish");
	public static final BlockEntityCrop cropBlaze = new BlockEntityCrop("cropBlaze");
	public static final ItemModSeed seedBlaze = new ItemModSeed("seedBlaze");
	public static final BlockEntityCrop2 cropLavaSlime = new BlockEntityCrop2("cropLavaSlime", 8);
	public static final ItemModSeed seedLavaSlime = new ItemModSeed("seedLavaSlime");
	public static final BlockEntityCrop2 cropEnderDragon = new BlockEntityCrop2("cropEnderDragon", 1);
	public static final ItemModSeed seedEnderDragon = new ItemModSeed("seedEnderDragon");
	public static final BlockEntityCrop2 cropWitherBoss = new BlockEntityCrop2("cropWitherBoss", 2);
	public static final ItemModSeed seedWitherBoss = new ItemModSeed("seedWitherBoss");
	public static final BlockEntityCrop cropBat = new BlockEntityCrop("cropBat");
	public static final ItemModSeed seedBat = new ItemModSeed("seedBat");
	public static final BlockEntityCrop cropWitch = new BlockEntityCrop("cropWitch");
	public static final ItemModSeed seedWitch = new ItemModSeed("seedWitch");
	public static final BlockEntityCrop cropEndermite = new BlockEntityCrop("cropEndermite");
	public static final ItemModSeed seedEndermite = new ItemModSeed("seedEndermite");
	public static final BlockEntityCrop cropGuardian = new BlockEntityCrop("cropGuardian");
	public static final ItemModSeed seedGuardian = new ItemModSeed("seedGuardian");
	public static final BlockEntityCrop cropShulker = new BlockEntityCrop("cropShulker");
	public static final ItemModSeed seedShulker = new ItemModSeed("seedShulker");
	public static final BlockEntityCrop cropPig = new BlockEntityCrop("cropPig");
	public static final ItemModSeed seedPig = new ItemModSeed("seedPig");
	public static final BlockEntityCrop cropSheep = new BlockEntityCrop("cropSheep");
	public static final ItemModSeed seedSheep = new ItemModSeed("seedSheep");
	public static final BlockEntityCrop cropCow = new BlockEntityCrop("cropCow");
	public static final ItemModSeed seedCow = new ItemModSeed("seedCow");
	public static final BlockEntityCrop cropChicken = new BlockEntityCrop("cropChicken");
	public static final ItemModSeed seedChicken = new ItemModSeed("seedChicken");
	public static final BlockEntityCrop cropSquid = new BlockEntityCrop("cropSquid");
	public static final ItemModSeed seedSquid = new ItemModSeed("seedSquid");
	public static final BlockEntityCrop cropWolf = new BlockEntityCrop("cropWolf");
	public static final ItemModSeed seedWolf = new ItemModSeed("seedWolf");
	public static final BlockEntityCrop2 cropMushroomCow = new BlockEntityCrop2("cropMushroomCow", 7);
	public static final ItemModSeed seedMushroomCow = new ItemModSeed("seedMushroomCow");
	public static final BlockEntityCrop2 cropWitherSkeleton = new BlockEntityCrop2("cropWitherSkeleton", 10);
	public static final ItemModSeed seedWitherSkeleton = new ItemModSeed("seedWitherSkeleton");
	public static final BlockEntityCrop2 cropOzelot = new BlockEntityCrop2("cropOzelot", 5);
	public static final ItemModSeed seedOzelot = new ItemModSeed("seedOzelot");
	public static final BlockEntityCrop2 cropEntityHorse = new BlockEntityCrop2("cropEntityHorse", 4);
	public static final ItemModSeed seedEntityHorse = new ItemModSeed("seedEntityHorse");
	public static final BlockEntityCrop cropRabbit = new BlockEntityCrop("cropRabbit");
	public static final ItemModSeed seedRabbit = new ItemModSeed("seedRabbit");
	public static final BlockEntityCrop2 cropPolarBear = new BlockEntityCrop2("cropPolarBear", 9);
	public static final ItemModSeed seedPolarBear = new ItemModSeed("seedPolarBear");
	public static final BlockEntityCrop cropVillager = new BlockEntityCrop("cropVillager");
	public static final ItemModSeed seedVillager = new ItemModSeed("seedVillager");

	public static final CreativeTabs MOBFARM = new CreativeTabs("mobfarm") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(seedEnderDragon);
		}

		@Override
		public void displayAllRelevantItems(NonNullList<ItemStack> list) {
			for (Item item : DataLists.ITEMS) {
				if (item instanceof ItemModSeed) list.add(new ItemStack(item));
			}
		}
	};

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		cropCreeper.initModel();
		seedCreeper.initModel(); //Green +100
		cropSkeleton.initModel();
		seedSkeleton.initModel(); //-100; +73; +70
		cropSpider.initModel();
		seedSpider.initModel(); //Lightness -34
		cropZombie.initModel();
		seedZombie.initModel(); //-42; -29; -36
		cropSlime.initModel();
		seedSlime.initModel(); //-100, +100, -100
		cropGhast.initModel();
		seedGhast.initModel(); //-100; -15; 10
		cropPigZombie.initModel();
		seedPigZombie.initModel(); //+44; -40; 0
		cropEnderman.initModel();
		seedEnderman.initModel(); //Gamma Correction 0.3
		cropCaveSpider.initModel();
		seedCaveSpider.initModel(); //-37; -47; +39
		cropSilverfish.initModel();
		seedSilverfish.initModel(); //-100
		cropBlaze.initModel();
		seedBlaze.initModel(); //forgot
		cropLavaSlime.initModel();
		seedLavaSlime.initModel(); //+100
		cropEnderDragon.initModel();
		seedEnderDragon.initModel();
		cropWitherBoss.initModel();
		seedWitherBoss.initModel();
		cropBat.initModel();
		seedBat.initModel(); //Channel Mixer +200; -142; -19; -70
		cropWitch.initModel();
		seedWitch.initModel(); //-100; -100; +100
		cropEndermite.initModel();
		seedEndermite.initModel(); //0; -58; 0
		cropGuardian.initModel();
		seedGuardian.initModel(); //Green Channel Mixer +67; +95; -88; +9
		cropShulker.initModel();
		seedShulker.initModel(); //0; -74; +70
		cropPig.initModel();
		seedPig.initModel(); //+40; +7
		cropSheep.initModel();
		seedSheep.initModel(); //-100; +15; -3
		cropCow.initModel();
		seedCow.initModel(); //+51; +18; +1
		cropChicken.initModel();
		seedChicken.initModel(); //Blue Channel Mixer +21; -39; +126
		cropSquid.initModel();
		seedSquid.initModel(); //0; -100; +100
		cropWolf.initModel();
		seedWolf.initModel(); //-100; -15
		cropMushroomCow.initModel();
		seedMushroomCow.initModel(); //100; 19; 48
		cropWitherSkeleton.initModel();
		seedWitherSkeleton.initModel();
		seedMushroomCow.initModel();
		cropOzelot.initModel();
		seedOzelot.initModel(); //0; 48; -49
		cropEntityHorse.initModel();
		seedEntityHorse.initModel(); //-72; -48; 68
		cropRabbit.initModel();
		seedRabbit.initModel(); //-39; 3
		cropPolarBear.initModel();
		seedPolarBear.initModel(); //Lightness +57
		cropVillager.initModel();
		seedVillager.initModel(); //0; 100; -58
	}

	private void initRecipes() {

		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedBat), new Object[] { " L ", "FSF", " L ", 'F', Items.FEATHER, 'L', Items.LEATHER, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedBlaze), new Object[] { " B ", " S ", " B ", 'B', Items.BLAZE_ROD, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedCaveSpider), new Object[] { " F ", "ESE", " F ", 'F', Items.FERMENTED_SPIDER_EYE, 'E', Items.SPIDER_EYE, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedChicken), new Object[] { "FCF", " S ", "FCF", 'F', Items.FEATHER, 'C', Items.CHICKEN, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedCow), new Object[] { "LBL", "BSB", "LBL", 'L', Items.LEATHER, 'B', Items.BEEF, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedCreeper), new Object[] { " G ", "GSG", " G ", 'G', Items.GUNPOWDER, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedEnderman), new Object[] { " E ", " S ", " E ", 'E', Items.ENDER_PEARL, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedEndermite), new Object[] { " E ", " S ", "   ", 'E', Items.ENDER_PEARL, 'S', ModRegistry.seedSilverfish });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedEntityHorse), new Object[] { "LLL", "LSL", "LLL", 'L', Items.LEATHER, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedGhast), new Object[] { "GTG", "GSG", "GTG", 'G', Items.GUNPOWDER, 'T', Items.GHAST_TEAR, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedGuardian), new Object[] { "PPP", "PSP", "PPP", 'P', Items.PRISMARINE_SHARD, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedLavaSlime), new Object[] { "CBC", "BSB", "CBC", 'C', Items.MAGMA_CREAM, 'B', Items.SLIME_BALL, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedMushroomCow), new Object[] { "BRB", "RSR", "BRB", 'R', Blocks.RED_MUSHROOM, 'B', Blocks.BROWN_MUSHROOM, 'S', ModRegistry.seedCow });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedOzelot), new Object[] { "FFF", " S ", "FFF", 'F', Items.FISH, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedPig), new Object[] { "PPP", "PSP", "PPP", 'P', Items.PORKCHOP, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedPigZombie), new Object[] { "FPF", "FSF", "FPF", 'F', Items.ROTTEN_FLESH, 'P', Items.COOKED_PORKCHOP, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedPolarBear), new Object[] { "BFB", "LSL", "BFB", 'L', Items.LEATHER, 'B', Items.SNOWBALL, 'F', Items.FISH, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedRabbit), new Object[] { "RRR", " S ", "RRR", 'R', Items.RABBIT_HIDE, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedSheep), new Object[] { "WWW", "WSW", "WWW", 'W', Blocks.WOOL, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedShulker), new Object[] { "PPP", "PSP", "PPP", 'P', Blocks.PURPUR_BLOCK, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedSilverfish), new Object[] { "CCC", "CSC", "CCC", 'C', Blocks.COBBLESTONE, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedSkeleton), new Object[] { "BAB", "BSB", "BAB", 'B', Items.BONE, 'A', Items.ARROW, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedSlime), new Object[] { "BBB", " S ", "BBB", 'B', Items.SLIME_BALL, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedSpider), new Object[] { "TET", "TST", "TET", 'T', Items.STRING, 'E', Items.SPIDER_EYE, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedSquid), new Object[] { " I ", "ISI", " I ", 'I', Items.DYE, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedVillager), new Object[] { " E ", "ESE", " E ", 'E', Items.EMERALD, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedWitch), new Object[] { "GRP", "TST", "PRG", 'T', Items.STICK, 'G', Items.GLOWSTONE_DUST, 'R', Items.REDSTONE, 'P', Items.GLASS_BOTTLE, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedWolf), new Object[] { " B ", "BSB", " B ", 'B', Items.BONE, 'S', Items.WHEAT_SEEDS });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedZombie), new Object[] { "FFF", "FSF", "FFF", 'F', Items.ROTTEN_FLESH, 'S', Items.WHEAT_SEEDS });
		if (ConfigFile.dragon) RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedEnderDragon), new Object[] { " F ", " S ", "   ", 'F', Blocks.DRAGON_EGG, 'S', ModRegistry.seedEnderman });
		RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedWitherSkeleton), " F ", "FSF", " F ", 'F', new ItemStack(Items.SKULL, 1, 1), 'S', new ItemStack(ModRegistry.seedSkeleton));
		if (ConfigFile.wither) RecipeHelper.addOldShaped(new ItemStack(ModRegistry.seedWitherBoss), new Object[] { " F ", "FSF", " F ", 'F', Items.NETHER_STAR, 'S', ModRegistry.seedWitherSkeleton });

	}

	@SubscribeEvent
	public void onBlockRegistry(RegistryEvent.Register<Block> e) {
		IForgeRegistry<Block> reg = e.getRegistry();
		for (Block block : DataLists.BLOCKS) {
			reg.register(block);
		}
	}

	@SubscribeEvent
	public void onItemRegistry(RegistryEvent.Register<Item> e) {
		IForgeRegistry<Item> reg = e.getRegistry();
		for (Item item : DataLists.ITEMS) {
			reg.register(item);
		}
	}

	@SubscribeEvent
	public void onRecipeRegistry(RegistryEvent.Register<IRecipe> e) {
		initRecipes();
		IForgeRegistry<IRecipe> reg = e.getRegistry();
		for (IRecipe rec : RecipeHelper.recipeList) {
			reg.register(rec);
		}
	}

}