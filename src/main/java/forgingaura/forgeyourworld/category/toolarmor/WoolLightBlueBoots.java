package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 11/09/2017.
 */
public class WoolLightBlueBoots extends ItemArmor {

    public WoolLightBlueBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLLIGHTBLUEBOOTS.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLLIGHTBLUEBOOTS.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
