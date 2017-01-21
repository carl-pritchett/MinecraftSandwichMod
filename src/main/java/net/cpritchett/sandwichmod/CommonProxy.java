package net.cpritchett.sandwichmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Common Proxy Init");
        ModItems.init();
    }
    
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("Common Proxy PreInit");
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("Common Proxy PostInit");
    }
}
