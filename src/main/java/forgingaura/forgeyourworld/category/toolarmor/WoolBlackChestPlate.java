package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 03/09/2017.
 */
public class WoolBlackChestPlate extends ItemArmor {

    public WoolBlackChestPlate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLBLACKCHESTPLATE.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLBLACKCHESTPLATE.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
