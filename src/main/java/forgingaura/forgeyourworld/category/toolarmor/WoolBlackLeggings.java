package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 03/09/2017.
 */
public class WoolBlackLeggings extends ItemArmor{

    public WoolBlackLeggings(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLBLACKLEGGINGS.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLBLACKLEGGINGS.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
