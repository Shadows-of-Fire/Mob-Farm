package shadows.of.fire.dank;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModRegistry {

	
	//public ItemModSeed(String name, Block crops)
	
	public static BlockModCrop cropBone;
	public static ItemModSeed seedBone;
	public static BlockModCrop cropGold;
	public static ItemModSeed seedGold;
	public static BlockModCrop cropP455;
	public static ItemModSeed seedP455;
	
	ItemStack itemstack = new ItemStack(Items.SKULL, 1, 3);
    NBTTagCompound nbt = new NBTTagCompound();
    nbt.setTag("SkullOwner", new NBTTagString("TheRealp455w0rd"));
    itemstack.setTagCompound(nbt);
	
	public static void init() {
		cropBone = new BlockModCrop("cropBone", ModRegistry.seedBone, Items.BONE); 
		seedBone = new ItemModSeed("seedBone", ModRegistry.cropBone);
		cropGold = new BlockModCrop("cropGold", ModRegistry.seedGold, Items.GOLD_NUGGET);
		seedGold = new ItemModSeed("seedGold", ModRegistry.cropGold);
		cropP455 = new BlockModCrop("cropP455", ModRegistry.seedGold, Items.SKULL);
		seedP455 = new ItemModSeed("seedP455", ModRegistry.cropGold);
	}
		
	
	@SideOnly(Side.CLIENT)
	public static void initModels(){//this is only needed for seeds, but why?
		seedBone.initModel();
		seedGold.initModel();
		seedP455.initModel();
	}
	
	
}
