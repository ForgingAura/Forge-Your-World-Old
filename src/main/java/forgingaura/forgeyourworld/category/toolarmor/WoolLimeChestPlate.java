package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 12/09/2017.
 */
public class WoolLimeChestPlate extends ItemArmor {

    public WoolLimeChestPlate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLLIMECHESTPLATE.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLLIMECHESTPLATE.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
