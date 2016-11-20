package shadows.of.fire.dank;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	
	//public ItemModSeed(String name, Block crops)
	
	public static ItemModSeed seedBone;
	
	public static void init() {
		seedBone = new ItemModSeed("seedBone", ModBlocks.cropBone);
	}
		
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){
		seedBone.initModel();
	}
	
	
}
