package shadows.of.fire.dank;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ModRegistry.initModels();
	}

	@Override
	public World getLocalWorld() {
		return Minecraft.getMinecraft().theWorld;
	}

}
