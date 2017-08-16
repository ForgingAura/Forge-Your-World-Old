package forgingaura.forgeyourworld.category.resource;

import java.util.Random;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.ItemsHandler;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TerilliumOre extends Block {

	public TerilliumOre() {
		super(Material.IRON);
		setUnlocalizedName(MainHandler.FYWBlocks.TERILLIUMORE.getRegistryName());
		setRegistryName(MainHandler.FYWBlocks.TERILLIUMORE.getRegistryName());
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ForgeYourWorld.RESOURCE_TAB);
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 1;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return new ItemStack(ItemsHandler.rawterillium).getItem();
	}

}
