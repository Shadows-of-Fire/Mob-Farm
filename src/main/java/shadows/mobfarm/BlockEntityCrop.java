package shadows.mobfarm;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockEntityCrop extends BlockCrops {
	public Item seed;
	public String regname;
	public ResourceLocation crop;

	IBlockState state;

	public BlockEntityCrop(String name/*int r, int g, int b*/) {
		regname = name.toLowerCase();
		crop = new ResourceLocation(name.substring(4));
		setUnlocalizedName(MobFarm.MODID + "." + regname);
		setRegistryName(regname);
		DataLists.BLOCKS.add(this);
		DataLists.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

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
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (this.isMaxAge(state)) {
			Entity entity = EntityList.createEntityByIDFromName(crop, world);
			Util.spawnCreature(world, entity, pos.getX(), pos.getY(), pos.getZ());
			world.setBlockState(pos, state.withProperty(AGE, 0));
			return true;
		}

		return false;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> ret, IBlockAccess iworld, BlockPos pos, IBlockState state, int fortune) {
		ret.add(new ItemStack(getSeed()));
		if (iworld instanceof World) {
			World world = (World) iworld;
			int age = getAge(state);

			if (age >= getMaxAge()) {
				Entity entity = EntityList.createEntityByIDFromName(crop, world);
				Util.spawnCreature(world, entity, pos.getX(), pos.getY(), pos.getZ());
			}
		}
	}
}