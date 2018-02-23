package shadows.mobfarm;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockModCrop extends BlockCrops {
	public Item seed;
	public Item crop;
	public String regname;
	private String skullName;

	public BlockModCrop(String name, Item cropIn) {
		regname = name.toLowerCase();
		crop = cropIn;
		setUnlocalizedName(MobFarm.MODID + "." + regname);
		setRegistryName(regname);
		DataLists.BLOCKS.add(this);
		DataLists.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));

	}

	public BlockModCrop(String name, Item cropIn, String skullName) {
		regname = name.toLowerCase();
		crop = cropIn;
		setUnlocalizedName(MobFarm.MODID + "." + regname);
		setRegistryName(regname);
		DataLists.BLOCKS.add(this);
		DataLists.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
		this.skullName = skullName;
	}

	@Override
	protected Item getSeed() {
		return Item.getByNameOrId("mobfarm:seed" + regname.substring(4));
	}

	@Override
	protected Item getCrop() {
		return crop;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	@Override
	public void getDrops(NonNullList<ItemStack> ret, IBlockAccess iworld, BlockPos pos, IBlockState state, int fortune) {
		ret.add(new ItemStack(getSeed()));
		int age = getAge(state);

		if (age >= getMaxAge()) {
			if (getCrop() instanceof ItemSkull) {
				ItemStack itemstack = new ItemStack(Items.SKULL, 1, 3);
				NBTTagCompound nbt = new NBTTagCompound();
				nbt.setTag("SkullOwner", new NBTTagString(skullName != "" ? skullName : "Notch"));
				itemstack.setTagCompound(nbt);
				ret.add(itemstack);
			} else {
				ret.add(new ItemStack(getCrop()));
			}
		}
	}
}