package supersaix.modpack;

import java.util.Random;

import net.daveyx0.primitivemobs.entity.monster.EntityBabySpider;
import net.daveyx0.primitivemobs.entity.monster.EntityMotherSpider;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import panda.venomousfangs.VenomousFangs;

@Mod.EventBusSubscriber(modid = ModPack.MODID)
public class EventHandler {
	
	Random rand = new Random();
	
	@SubscribeEvent
    public void Drops(LivingDropsEvent event)
    {
	    if(event.getEntityLiving() instanceof EntitySpider)
	    {
	    	if (rand.nextInt(8) == 1) {
	    		event.getEntityLiving().dropItem(VenomousFangs.venemousfang, 1);
	    	}
	    }
	    
	    if(event.getEntityLiving() instanceof EntityBabySpider )
	    {
	    	if (rand.nextInt(4) == 1) {
	    		event.getEntityLiving().dropItem(panda.venomousfangs.VenomousFangs.venemousfang, 1);
	    	}
	    }
	    
	    if (event.getEntityLiving() instanceof EntityMotherSpider ) {
	    	if (rand.nextInt(8) == 1) {
	    		event.getEntityLiving().dropItem(VenomousFangs.venemousfang, 1);
	    	}
	    }
	    
    }
}
