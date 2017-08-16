package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.handler.ItemsHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ToolArmorTab extends CreativeTabs{

	public ToolArmorTab() {
		super("tabToolArmor");
	}

	@Override
	public Item getTabIconItem() {
		return ItemsHandler.terilliumchestplate;
	}

}
