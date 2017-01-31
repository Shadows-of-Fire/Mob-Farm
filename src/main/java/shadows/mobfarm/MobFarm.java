package shadows.mobfarm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MobFarm.MODID, name = MobFarm.MODNAME, version = MobFarm.VERSION)
public class MobFarm
{
    public static final String MODID = "mobfarm";
    public static final String MODNAME = "Mob Farm";
    public static final String VERSION = "1.2.0";
    
    @SidedProxy(clientSide = "shadows.mobfarm.ClientProxy", serverSide = "shadows.mobfarm.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static MobFarm instance;
    
    
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
