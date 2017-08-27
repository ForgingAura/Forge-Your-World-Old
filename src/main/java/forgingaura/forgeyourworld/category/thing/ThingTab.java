package forgingaura.forgeyourworld.category.thing;

import forgingaura.forgeyourworld.handler.BlocksHandler;
import forgingaura.forgeyourworld.handler.ItemsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ThingTab extends CreativeTabs {

	public ThingTab() {
		super("tabThings");
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlocksHandler.andesitebrick);
	}

}
