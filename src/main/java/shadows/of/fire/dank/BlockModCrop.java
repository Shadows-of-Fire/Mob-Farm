package shadows.of.fire.dank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockModCrop extends BlockCrops{
	public ItemModSeed seed;
	public Item crop;
	public BlockModCrop(String unlocname, String regname, ItemModSeed seedIn, Item cropIn) {
		seed = seedIn;
		crop = cropIn;
		setUnlocalizedName(CancerPlants.MODID + unlocname);
		setRegistryName(regname);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		
	}
	@Override
	protected Item getSeed() {
		return (ItemModSeed) seed;
	}
	@Override
	protected Item getCrop() {
		return (Item) crop;
	}
	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state){
	return true;
	}
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
    @Override
    public java.util.List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        java.util.List<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this.getSeed()));
        int age = getAge(state);

        if (age >= getMaxAge())
        {
        ret.add(new ItemStack(this.getCrop()));
        }
        
        return ret;
    }
}