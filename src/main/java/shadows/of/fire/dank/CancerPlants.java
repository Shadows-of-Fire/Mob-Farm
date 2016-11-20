package shadows.of.fire.dank;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CancerPlants.MODID, name = CancerPlants.MODNAME, version = CancerPlants.VERSION)
public class CancerPlants
{
    public static final String MODID = "cancerplants";
    public static final String MODNAME = "Random Plants";
    public static final String VERSION = "dank01";
    
    @SidedProxy(clientSide = "shadows.of.fire.dank.ClientProxy", serverSide = "shadows.of.fire.dank.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static CancerPlants instance;
    
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
    	proxy.init(e);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	proxy.postInit(e);
    }

}
