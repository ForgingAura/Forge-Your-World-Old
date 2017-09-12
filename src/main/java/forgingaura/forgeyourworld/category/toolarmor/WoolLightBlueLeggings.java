package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 11/09/2017.
 */
public class WoolLightBlueLeggings extends ItemArmor {

    public WoolLightBlueLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLLIGHTBLUELEGGINGS.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLLIGHTBLUELEGGINGS.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
