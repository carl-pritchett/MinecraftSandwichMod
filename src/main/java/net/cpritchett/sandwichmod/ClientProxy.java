package net.cpritchett.sandwichmod;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void init(FMLInitializationEvent event)
    {
		super.init(event);
        System.out.println("Client Proxy Init");
        ModItems.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
    }
    
	@Override
    public void preInit(FMLPreInitializationEvent event)
    {
    	super.preInit(event);
        System.out.println("Client Proxy PreInit");
    }

	@Override
    public void postInit(FMLPostInitializationEvent event)
    {
    	super.postInit(event);
        System.out.println("Client Proxy PostInit");
    }
}
