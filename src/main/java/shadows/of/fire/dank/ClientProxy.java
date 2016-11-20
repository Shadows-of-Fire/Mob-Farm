package shadows.of.fire.dank;


import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	ModItems.initModels();
	ModBlocks.initModels();
	}
	


	
	
	
	
}
