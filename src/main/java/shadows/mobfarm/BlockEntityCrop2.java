package shadows.mobfarm;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockEntityCrop2 extends BlockCrops {
	public Item seed;
	public String regname;
	private int crop;
	public Entity entity;

	IBlockState state;

	public BlockEntityCrop2(String name, int index/*int r, int g, int b*/) {
		regname = name.toLowerCase();
		crop = index;
		setUnlocalizedName(MobFarm.MODID + "." + regname);
		setRegistryName(regname);
		DataLists.BLOCKS.add(this);
		DataLists.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
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
		return ConfigFile.allowBonemeal;
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
				new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	@Override
	public java.util.List<ItemStack> getDrops(net.minecraft.world.IBlockAccess worldIBA, BlockPos pos,
			IBlockState state, int fortune) {
		java.util.List<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(getSeed()));
		int age = getAge(state);
		World world = (World) worldIBA;
		if (age >= getMaxAge()) {
			switch (crop) {
			case (1):
				entity = new EntityDragon(world);
				break;
			case (2):
				entity = new EntityWither(world);
				break;
			case (3):
				entity = new EntityCaveSpider(world);
				break;
			case (4):
				entity = new EntityHorse(world);
				break;
			case (5):
				entity = new EntityOcelot(world);
				break;
			case (6):
				entity = new EntityPigZombie(world);
				break;
			case (7):
				entity = new EntityMooshroom(world);
				break;
			case (8):
				entity = new EntityMagmaCube(world);
				break;
			case (9):
				entity = new EntityPolarBear(world);
				break;
			case (10):
				entity = new EntityWitherSkeleton(world);
				break;
			default:
				entity = null;
				break;
			}
			Util.spawnCreature((World) world, entity, pos.getX(), pos.getY(), pos.getZ());
		}

		return ret;
	}
}