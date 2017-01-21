package net.cpritchett.sandwichmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SandwichMod.MODID, version = SandwichMod.VERSION, name = SandwichMod.NAME, dependencies = SandwichMod.DEPENDENCIES)
public class SandwichMod
{
    public static final String MODID = "sandwichmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Sandwich Mod";
//    public static final String DEPENDENCIES = "required-after:forge@[-13.19.1.2189]";
    public static final String DEPENDENCIES = "";
    public static final String RESOUCE_PREFIX = MODID.toLowerCase().concat(":");
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code call the 
        System.out.println("Init");
        commonProxy.init(event);
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // some example code
        System.out.println("PreInit");
        commonProxy.preInit(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // some example code
        System.out.println("PostInit");
        commonProxy.postInit(event);
    }
    
    // Not sure if this is required
    @Instance(MODID)
    public static SandwichMod instance;
    
    @SidedProxy(clientSide = "net.cpritchett.sandwichmod.ClientProxy", serverSide = "net.cpritchett.sandwichmod.CommonProxy")
    public static CommonProxy commonProxy;
}
