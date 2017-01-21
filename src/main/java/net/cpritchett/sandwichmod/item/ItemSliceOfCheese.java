package net.cpritchett.sandwichmod.item;

import net.cpritchett.sandwichmod.Constants;
import net.cpritchett.sandwichmod.SandwichMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemSliceOfCheese extends ItemFood {

	public ItemSliceOfCheese(int healAmount) {
		super(healAmount, false);
		this.setAlwaysEdible();
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + SandwichMod.RESOUCE_PREFIX + Constants.SLICE_OF_CHEESE;
	}
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		if (worldIn.isRemote) {
			playerIn.sendMessage(new TextComponentString("You are eatting a slice of cheese!"));
		}
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
