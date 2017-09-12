package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 12/09/2017.
 */
public class WoolPinkBoots extends ItemArmor {

    public WoolPinkBoots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLPINKBOOTS.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLPINKBOOTS.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
