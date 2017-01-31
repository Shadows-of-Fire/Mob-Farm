package shadows.mobfarm;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigFile {

	public static boolean allowBonemeal = false;
	public static boolean dragon = false;
	public static boolean wither = true;

	public static void syncConfig() { // Gets called from preInit
	    try {
	        // Load config
	    	CommonProxy.config.load();

	        // Read props from config
	        Property allowBonemealProp = CommonProxy.config.get(Configuration.CATEGORY_GENERAL, // What category will it be saved to, can be any string
	                "Allow Bonemeal", // Property name
	                "false", // Default value
	                "If crops can be bonemealed"); // Comment
	        Property dragonProp = CommonProxy.config.get(Configuration.CATEGORY_GENERAL, // What category will it be saved to, can be any string
	                "Enable Ender Dragon", // Property name
	                "false", // Default value
	                "If the Ender Dragon crop is enabled."); // Comment
	        Property witherProp = CommonProxy.config.get(Configuration.CATEGORY_GENERAL, // What category will it be saved to, can be any string
	                "Enable Wither (Boss)", // Property name
	                "true", // Default value
	                "If the Wither (Boss) crop is enabled."); // Comment
	        
	        allowBonemeal = allowBonemealProp.getBoolean(); // Get the boolean value, also set the property value to boolean
	        dragon = dragonProp.getBoolean();
	        wither = witherProp.getBoolean();
	    } catch (Exception e) {
	        // Failed reading/writing, just continue
	    } finally {
	        // Save props to config IF config changed
	        if (CommonProxy.config.hasChanged()) CommonProxy.config.save();
	    }
	}
	
	
}
