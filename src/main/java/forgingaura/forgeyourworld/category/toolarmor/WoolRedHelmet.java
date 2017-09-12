package forgingaura.forgeyourworld.category.toolarmor;

import forgingaura.forgeyourworld.ForgeYourWorld;
import forgingaura.forgeyourworld.handler.MainHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by AlasDiablo on 12/09/2017.
 */
public class WoolRedHelmet extends ItemArmor {

    public WoolRedHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(MainHandler.FYWItems.WOOLREDHELMET.getUnlocalizedName());
        setRegistryName(MainHandler.FYWItems.WOOLREDHELMET.getRegistryName());
        setCreativeTab(ForgeYourWorld.TOOL_TAB);
    }
}
