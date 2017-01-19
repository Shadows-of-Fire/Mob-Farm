package shadows.mobfarm;


import java.util.Iterator;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.dragon.phase.PhaseList;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Util {

	//Spawns an EntityLiving in world at position.
    public static void spawnCreature(World world, Entity entity, double x, double y, double z)
    {
    if (entity instanceof EntityDragon){
    	
        world.getChunkFromBlockCoords(new BlockPos(0, 128, 0));
        EntityDragon entitydragon = new EntityDragon(world);
        entitydragon.getPhaseManager().setPhase(PhaseList.HOLDING_PATTERN);
        entitydragon.setPosition(x, y + 50, z);
        world.spawnEntity(entitydragon);
    }
        
    else if (!(entity instanceof EntityDragon) && entity instanceof EntityLivingBase)
    {
        EntityLiving entityliving = (EntityLiving)entity;
        entity.setLocationAndAngles(x, y, z, MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
        entityliving.rotationYawHead = entityliving.rotationYaw;
        entityliving.renderYawOffset = entityliving.rotationYaw;
        entityliving.onInitialSpawn(world.getDifficultyForLocation(new BlockPos(entityliving)), (IEntityLivingData)null);
        world.spawnEntity(entity);
        entityliving.playLivingSound();
    
	
    }
    }
	
    //Returns true if an item is found in a mob drop list.
    public static boolean dropSearchFinder(List<EntityItem> list, ItemStack stack){
    	Iterator<EntityItem> iterator = list.iterator();
    	while (iterator.hasNext()){
    		EntityItem item = iterator.next();
    		if (item.getEntityItem().getItem() == stack.getItem()) {
        		//System.out.println("item is " + item.getEntityItem().toString() + " while target = " + stack.toString() + " result: true");
    			return true;

    		}
    		//System.out.println("item is " + item.getEntityItem().toString() + " while target = " + stack.toString() + " result: false");
    	}
    	
    	return false;
    	
    }
    
	
}
