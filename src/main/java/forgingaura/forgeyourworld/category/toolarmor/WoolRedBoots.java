package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 12/09/2017.
 */
public class WoolRedBoots extends ItemArmor {

    public WoolRedBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLREDBOOTS.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLREDBOOTS.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
