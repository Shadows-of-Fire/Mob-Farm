package shadows.of.fire.dank;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModRegistry {

	
	//public ItemModSeed(String unlocname, String regname, Block crops)
	//public BlockModCrop(String unlocname, String regname, ItemModSeed seedIn, Item cropIn)
	
	public static ItemModSeed seedBone;
	public static BlockModCrop cropBone;
	
	public static void init() {
		seedBone = new ItemModSeed("seedBone", "seedBone", ModRegistry.cropBone);
		cropBone = new BlockModCrop("cropBone", "cropBone", ModRegistry.seedBone, Items.BONE);

	}
		
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		seedBone.initModel();
		cropBone.initModel();
	}
	
	
}
