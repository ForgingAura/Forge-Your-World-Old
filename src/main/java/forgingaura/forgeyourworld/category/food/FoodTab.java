package forgingaura.forgeyourworld.category.food;

import forgingaura.forgeyourworld.handler.ItemsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FoodTab extends CreativeTabs{
	
	public FoodTab() {
		super("tabFood");
	}

	@Override
	public Item getTabIconItem() {
		return ItemsHandler.toast;
	}

}
