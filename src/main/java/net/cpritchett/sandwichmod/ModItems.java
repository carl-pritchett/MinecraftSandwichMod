package net.cpritchett.sandwichmod;

import java.util.HashMap;
import java.util.Map;

import net.cpritchett.sandwichmod.item.ItemCheeseSandwich;
import net.cpritchett.sandwichmod.item.ItemPieceOfBread;
import net.cpritchett.sandwichmod.item.ItemSliceOfCheese;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems {


	private static Map<String, Item> nameToItem = new HashMap<String, Item>();
	
	public static Item getItem(String unlocalizedName) {
		return nameToItem.get(unlocalizedName);
	}
	
	public static void init() {		
		registerItem(new ItemPieceOfBread(2), SandwichMod.MODID, Constants.PIECE_OF_BREAD);
		registerItem(new ItemSliceOfCheese(2), SandwichMod.MODID, Constants.SLICE_OF_CHEESE);
		registerItem(new ItemCheeseSandwich(4), SandwichMod.MODID, Constants.CHEESE_SANDWICH);

		
        GameRegistry.addRecipe(new ItemStack(nameToItem.get(Constants.CHEESE_SANDWICH)), new Object[] {" B ", " C ", " B ", 'B', nameToItem.get(Constants.PIECE_OF_BREAD), 'C', nameToItem.get(Constants.SLICE_OF_CHEESE)});

		
//        manager.addRecipe(new ItemStack(Items.COOKIE, 8), new Object[] {"#X#", 'X', new ItemStack(Items.DYE, 1, EnumDyeColor.BROWN.getDyeDamage()), '#', Items.WHEAT});
//
//        manager.addRecipe(new ItemStack(Items.RABBIT_STEW), new Object[] {" R ", "CPD", " B ", 'R', new ItemStack(Items.COOKED_RABBIT), 'C', Items.CARROT, 'P', Items.BAKED_POTATO, 'D', Blocks.RED_MUSHROOM, 'B', Items.BOWL});
//        manager.addRecipe(new ItemStack(Blocks.MELON_BLOCK), new Object[] {"MMM", "MMM", "MMM", 'M', Items.MELON});
//        manager.addRecipe(new ItemStack(Items.BEETROOT_SOUP), new Object[] {"OOO", "OOO", " B ", 'O', Items.BEETROOT, 'B', Items.BOWL});

		
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		registerModel(mesher, SandwichMod.RESOUCE_PREFIX, Constants.PIECE_OF_BREAD);
		registerModel(mesher, SandwichMod.RESOUCE_PREFIX, Constants.SLICE_OF_CHEESE);
		registerModel(mesher, SandwichMod.RESOUCE_PREFIX, Constants.CHEESE_SANDWICH);
	}
	
	private static void registerItem(Item item, String modId, String itemUnlocalizedName) {
		item.setRegistryName(modId, itemUnlocalizedName);
		GameRegistry.register(item);
		nameToItem.put(itemUnlocalizedName, item);
	}
	
	private static void registerModel(ItemModelMesher mesher, String resourcePrefix, String unlocalisedName) {
		Item item = nameToItem.get(unlocalisedName);
		
		ModelResourceLocation model = new ModelResourceLocation(resourcePrefix + unlocalisedName, "inventory");
		ModelLoader.registerItemVariants(item, model);
		mesher.register(item, 0, model);
	}
}
