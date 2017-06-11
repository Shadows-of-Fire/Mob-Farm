package shadows.mobfarm;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.command.ICommandManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCommandCrop extends BlockCrops {
	public Item seed;
	public String regname;
	public String crop;

	IBlockState state;

	public BlockCommandCrop(String name, String command) {
		regname = name.toLowerCase();
		crop = command;
		setUnlocalizedName(MobFarm.MODID + "." + regname);
		setRegistryName(regname);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());

	}

	@Override
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		if (!world.isRemote) {
			int age = getAge(state);
			if (age >= getMaxAge()) {
				this.sendMessage(crop, world);
			}
		}

	}

	public boolean sendMessage(String command, World world) {
		MinecraftServer minecraftserver = world.getMinecraftServer();

		ICommandManager icommandmanager = minecraftserver.getCommandManager();
		return icommandmanager.executeCommand(minecraftserver, command) > 0;
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
		return false;
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
				new ModelResourceLocation(regname, "inventory"));
	}

	@Override
	public java.util.List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state,
			int fortune) {
		java.util.List<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(getSeed()));
		int age = getAge(state);

		if (age >= getMaxAge()) {

		}

		return ret;
	}
}