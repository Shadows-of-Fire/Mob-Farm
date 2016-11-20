package shadows.of.fire.dank;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemModSeed extends ItemSeeds{
	
	
	
	
	
	
	
	public ItemModSeed(String unlocname, String regname, Block crops) {
		super(crops, Blocks.FARMLAND);
		setUnlocalizedName(CancerPlants.MODID + "unlocname");
		setRegistryName(regname);
		GameRegistry.register(this);
		this.setCreativeTab(CreativeTabs.MATERIALS);
	}
	

	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
	
	
}
