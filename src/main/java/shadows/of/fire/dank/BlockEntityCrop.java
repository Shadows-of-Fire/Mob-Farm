package shadows.of.fire.dank;

import java.awt.Color;
import java.util.*;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.*;

public class BlockEntityCrop extends BlockCrops {
	public Item seed;
	public String regname;
	public String crop;

	IBlockState state;

	public BlockEntityCrop(String name, Item seedIn /*int r, int g, int b*/) {
		regname = name;
		crop = name.substring(4);
		setUnlocalizedName(CancerPlants.MODID + "." + name);
		setRegistryName(regname);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		
		//int endermanEggColor1 = new Color(r, g, b).getRGB(); 
		//For if I ever try to use the automatic color system.
	}

	@Override
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (!world.isRemote) {
			int age = getAge(state);
			if (age >= getMaxAge()) {
				ItemMonsterPlacer.spawnCreature(world, crop, pos.getX(), pos.getY(), pos.getZ());
				
			}
		}
	}

	@Override
	protected Item getSeed() {
		return Item.getByNameOrId("cancerplants:seed" + regname.substring(4));
	}

	@Override
	protected Item getCrop() {
		return null;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(regname, "inventory"));
	}

	@Override
	public java.util.List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		java.util.List<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(getSeed()));
		int age = getAge(state);

		if (age >= getMaxAge()) {

		}

		return ret;
	}
}