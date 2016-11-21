package shadows.of.fire.dank;

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
	public static BlockEntityCrop cropBlaze;
	public static ItemModSeed seedBlaze;

	public static void init() {
	//	cropBone = new BlockModCrop("cropBone", ModRegistry.seedBone, Items.BONE);
	//	seedBone = new ItemModSeed("seedBone", ModRegistry.cropBone);
	//	cropGold = new BlockModCrop("cropGold", ModRegistry.seedGold, Items.GOLD_NUGGET);
	//	seedGold = new ItemModSeed("seedGold", ModRegistry.cropGold);
		cropP455 = new BlockModCrop("cropP455", ModRegistry.seedP455, Items.SKULL, "TheRealp455w0rd");
		seedP455 = new ItemModSeed("seedP455", ModRegistry.cropP455);
		cropBlaze = new BlockEntityCrop("cropBlaze", ModRegistry.seedBlaze);
		seedBlaze = new ItemModSeed("seedBlaze", ModRegistry.cropBlaze);
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {//this is only needed for seeds, but why?
	//	seedBone.initModel();
	//	seedGold.initModel();
		seedP455.initModel();
		seedBlaze.initModel();
	}

}
