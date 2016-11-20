package shadows.of.fire.dank;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	
	//public BlockModCrop(String name, Item seedIn, Item cropIn)
	
	public static BlockModCrop cropBone;
	
	public static void init() {
		cropBone = new BlockModCrop("cropBone", ModItems.seedBone, Items.BONE); 
	}
		
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		cropBone.initModel();
	}
	
	
}
