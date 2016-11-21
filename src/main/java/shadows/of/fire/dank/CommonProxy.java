package shadows.of.fire.dank;

import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.event.*;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		// Initialization of blocks and items typically goes here:
		ModRegistry.init();
		RecipeManager.initRecipes();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}

	public World getLocalWorld() {
		return DimensionManager.getWorld(0);
	}

}