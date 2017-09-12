package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 08/09/2017.
 */
public class WoolBlackBoots extends ItemArmor{

    public WoolBlackBoots(ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLBLACKBOOTS.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLBLACKBOOTS.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
