package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 12/09/2017.
 */
public class WoolPinkHelmet extends ItemArmor {

    public WoolPinkHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLPINKHELMET.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLPINKHELMET.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
