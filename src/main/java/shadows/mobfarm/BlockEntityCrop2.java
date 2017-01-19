package shadows.mobfarm;


import java.util.*;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.*;

public class BlockEntityCrop2 extends BlockCrops {
	public Item seed;
	public String regname;
	public String crop;
	public Entity entity;

	IBlockState state;

	public BlockEntityCrop2(String name/*int r, int g, int b*/) {
		regname = name.toLowerCase();
		crop = name.substring(4);
		setUnlocalizedName(MobFarm.MODID + "." + regname);
		setRegistryName(regname);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		//int endermanEggColor1 = new Color(r, g, b).getRGB(); 
		//For if I ever try to use the automatic color system.
	}

	//@Override
	//public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
	//	if (!world.isRemote) {
	//		int age = getAge(state);
	//		if (age >= getMaxAge()) {
				//ItemMonsterPlacer.spawnCreature(world, crop, pos.getX(), pos.getY(), pos.getZ());
				
	//		}
	//	}
	//}

	
	
	
	@Override
	protected Item getSeed() {
		return Item.getByNameOrId("mobfarm:seed" + regname.substring(4));
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
			entity = EntityList.createEntityByIDFromName(new ResourceLocation(crop), (World) world);	
			
			
			Util.spawnCreature((World) world, entity, pos.getX(), pos.getY(), pos.getZ());
		}

		return ret;
	}
}