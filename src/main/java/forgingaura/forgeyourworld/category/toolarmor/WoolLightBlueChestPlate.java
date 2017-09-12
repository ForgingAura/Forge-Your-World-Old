package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 11/09/2017.
 */
public class WoolLightBlueChestPlate extends ItemArmor{

    public WoolLightBlueChestPlate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLLIGHTBLUECHESTPLATE.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLLIGHTBLUECHESTPLATE.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
