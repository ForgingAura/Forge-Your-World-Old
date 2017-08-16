package forgingaura.forgeyourworld.category.resource;

import forgingaura.forgeyourworld.handler.ItemsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ResouceTab extends CreativeTabs{
	
	public ResouceTab() {
		super("tabResource");
	}

	@Override
	public Item getTabIconItem() {
		return ItemsHandler.rawterillium;
	}

}
