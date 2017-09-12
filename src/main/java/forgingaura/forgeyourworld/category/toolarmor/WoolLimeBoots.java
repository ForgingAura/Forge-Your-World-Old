package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 12/09/2017.
 */
public class WoolLimeBoots extends ItemArmor {

    public WoolLimeBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLLIMEBOOTS.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLLIMEBOOTS.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
