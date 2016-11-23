package shadows.of.fire.dank;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RecipeManager {

	public static void initRecipes(){
		
		
		
		
		
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedBat), new Object[] {" L ", "FSF", " L ", 'F', Items.FEATHER, 'L', Items.LEATHER, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedBlaze), new Object[] {" B ", " S ", " B ", 'B', Items.BLAZE_ROD, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedCaveSpider), new Object[] {" F ", "ESE", " F ", 'F', Items.FERMENTED_SPIDER_EYE, 'E', Items.SPIDER_EYE, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedChicken), new Object[] {"FCF", " S ", "FCF", 'F', Items.FEATHER, 'C', Items.CHICKEN, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedCow), new Object[] {"LBL", "BSB", "LBL", 'L', Items.LEATHER, 'B', Items.BEEF, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedCreeper), new Object[] {" G ", "GSG", " G ", 'G', Items.GUNPOWDER, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedEnderman), new Object[] {" E ", " S ", " E ", 'E', Items.ENDER_PEARL, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedEndermite), new Object[] {" E ", " S ", "   ", 'E', Items.ENDER_PEARL, 'S', ModRegistry.seedSilverfish});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedEntityHorse), new Object[] {"LLL", "LSL", "LLL", 'L', Items.LEATHER, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedGhast), new Object[] {"GTG", "GSG", "GTG", 'G', Items.GUNPOWDER, 'T', Items.GHAST_TEAR, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedGuardian), new Object[] {"PPP", "PSP", "PPP", 'P', Items.PRISMARINE_SHARD, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedLavaSlime), new Object[] {"CBC", "BSB", "CBC", 'C', Items.MAGMA_CREAM, 'B', Items.SLIME_BALL, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedMushroomCow), new Object[] {"BRB", "RSR", "BRB", 'R', Blocks.RED_MUSHROOM, 'B', Blocks.BROWN_MUSHROOM, 'S', ModRegistry.seedCow});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedOzelot), new Object[] {"FFF", " S ", "FFF", 'F', Items.FISH, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ShapedOreRecipe(ModRegistry.seedP455, "   ", "HSH", "   ", 'H', "itemSkull", 'S', Items.WHEAT_SEEDS));
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedPig), new Object[] {"PPP", "PSP", "PPP", 'P', Items.PORKCHOP, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedPigZombie), new Object[] {"FPF", "FSF", "FPF", 'F', Items.ROTTEN_FLESH, 'P', Items.COOKED_PORKCHOP, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedPolarBear), new Object[] {"BFB", "LSL", "BFB", 'L', Items.LEATHER, 'B', Items.SNOWBALL, 'F', Items.FISH, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedRabbit), new Object[] {"RRR", " S ", "RRR", 'R', Items.RABBIT_HIDE, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedSheep), new Object[] {"WWW", "WSW", "WWW", 'W', Blocks.WOOL, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedShulker), new Object[] {"PPP", "PSP", "PPP", 'P', Blocks.PURPUR_BLOCK, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedSilverfish), new Object[] {"CCC", "CSC", "CCC", 'C', Blocks.COBBLESTONE, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedSkeleton), new Object[] {"BAB", "BSB", "BAB", 'B', Items.BONE, 'A', Items.ARROW, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedSlime), new Object[] {"BBB", " S ", "BBB", 'B', Items.SLIME_BALL, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedSpider), new Object[] {"TET", "TST", "TET", 'T', Items.STRING, 'E', Items.SPIDER_EYE, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedSquid), new Object[] {" I ", "ISI", " I ", 'I', Items.DYE, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedVillager), new Object[] {" E ", "ESE", " E ", 'E', Items.EMERALD, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedWitch), new Object[] {"GRP", "TST", "PRG", 'T', Items.STICK, 'G', Items.GLOWSTONE_DUST, 'R', Items.REDSTONE, 'P', Items.GLASS_BOTTLE, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedWolf), new Object[] {" B ", "BSB", " B ", 'B', Items.BONE, 'S', Items.WHEAT_SEEDS});
		GameRegistry.addRecipe(new ItemStack(ModRegistry.seedZombie), new Object[] {"FFF", "FSF", "FFF", 'F', Items.ROTTEN_FLESH, 'S', Items.WHEAT_SEEDS});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
