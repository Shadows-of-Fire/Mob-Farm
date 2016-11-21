package shadows.of.fire.dank;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemModSeed extends ItemSeeds{

	
	public String regname;
	public ItemModSeed(String name, Block crops) {
		super(crops, Blocks.FARMLAND);
		regname = name;
		setUnlocalizedName(CancerPlants.MODID + "." + name);
		setRegistryName(name);
		GameRegistry.register(this);
		this.setCreativeTab(CreativeTabs.MATERIALS);

	}
	

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
    	Block plant = Block.getBlockFromName("cancerplants:crop" + regname.substring(4));
        return plant.getDefaultState();
    }	
	
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	
	
	
}
