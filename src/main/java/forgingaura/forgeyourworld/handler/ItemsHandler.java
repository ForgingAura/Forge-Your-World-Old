package forgingaura.forgeyourworld.handler;

import forgingaura.forgeyourworld.category.food.AppleJam;
import forgingaura.forgeyourworld.category.food.AppleToast;
import forgingaura.forgeyourworld.category.food.Cereals;
import forgingaura.forgeyourworld.category.food.CerealsBowl;
import forgingaura.forgeyourworld.category.food.ChocolateCereals;
import forgingaura.forgeyourworld.category.food.ChocolateCerealsBowl;
import forgingaura.forgeyourworld.category.food.Flour;
import forgingaura.forgeyourworld.category.food.Toast;
import forgingaura.forgeyourworld.category.resource.BlazeCoal;
import forgingaura.forgeyourworld.category.resource.RawTerillium;
import forgingaura.forgeyourworld.category.resource.Terillium;
import forgingaura.forgeyourworld.category.toolarmor.KitchenKnife;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumAxe;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumBoots;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumChestPlate;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumHelmet;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumHoe;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumLeggings;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumPickaxe;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumShovel;
import forgingaura.forgeyourworld.category.toolarmor.TerilliumSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

public class ItemsHandler {
	
	public static Item flour;
	public static Item toast;
	public static Item applejam;
	public static Item appletoast;
	public static Item rawterillium;
	public static Item terillium;
	public static Item cereals;
	public static Item chocolatecereals;
	public static Item cerealsbowl;
	public static Item chocolatecerealsbowl;
	public static Item terilliumhelmet;
	public static Item terilliumchestplate;
	public static Item terilliumleggings;
	public static Item terilliumboots;
	public static Item terilliumaxe;
	public static Item terilliumhoe;
	public static Item terilliumpickaxe;
	public static Item terilliumshovel;
	public static Item terilliumsword;
	public static Item blazecoal;
	public static Item kitchenknife;
	
	public static void init() {
		flour = new Flour();
		toast = new Toast();
		applejam = new AppleJam();
		appletoast = new AppleToast();
		rawterillium = new RawTerillium();
		terillium = new Terillium();
		cereals = new Cereals();
		chocolatecereals = new ChocolateCereals();
		cerealsbowl = new CerealsBowl();
		chocolatecerealsbowl = new ChocolateCerealsBowl();
		terilliumhelmet = new TerilliumHelmet(ArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.HEAD);
		terilliumchestplate = new TerilliumChestPlate(ArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.CHEST);
		terilliumleggings = new TerilliumLeggings(ArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.LEGS);
		terilliumboots = new TerilliumBoots(ArmorMaterials.terilliumMat, 3, EntityEquipmentSlot.FEET);
		terilliumaxe = new TerilliumAxe(null, ToolMaterials.terilliumMat);
		terilliumhoe = new TerilliumHoe(null, ToolMaterials.terilliumMat);
		terilliumpickaxe = new TerilliumPickaxe(null, ToolMaterials.terilliumMat);
		terilliumshovel = new TerilliumShovel(null, ToolMaterials.terilliumMat);
		terilliumsword = new TerilliumSword(null, ToolMaterials.terilliumMat);
		blazecoal = new BlazeCoal();
		kitchenknife = new KitchenKnife(null, ToolMaterial.STONE);
		
	}
	
	public static void register() {
		GameRegistry.register(flour);
		GameRegistry.register(toast);
		GameRegistry.register(applejam);
		GameRegistry.register(appletoast);
		GameRegistry.register(rawterillium);
		GameRegistry.register(terillium);
		GameRegistry.register(cereals);
		GameRegistry.register(chocolatecereals);
		GameRegistry.register(cerealsbowl);
		GameRegistry.register(chocolatecerealsbowl);
		GameRegistry.register(terilliumhelmet);
		GameRegistry.register(terilliumchestplate);
		GameRegistry.register(terilliumleggings);
		GameRegistry.register(terilliumboots);
		GameRegistry.register(terilliumaxe);
		GameRegistry.register(terilliumhoe);
		GameRegistry.register(terilliumpickaxe);
		GameRegistry.register(terilliumshovel);
		GameRegistry.register(terilliumsword);
		GameRegistry.register(blazecoal);
		GameRegistry.register(kitchenknife);
	}
	
	public static void registerRenders() {
		registerRender(flour);
		registerRender(toast);
		registerRender(applejam);
		registerRender(appletoast);
		registerRender(rawterillium);
		registerRender(terillium);
		registerRender(cereals);
		registerRender(chocolatecereals);
		registerRender(cerealsbowl);
		registerRender(chocolatecerealsbowl);
		registerRender(terilliumhelmet);
		registerRender(terilliumchestplate);
		registerRender(terilliumleggings);
		registerRender(terilliumboots);
		registerRender(terilliumaxe);
		registerRender(terilliumhoe);
		registerRender(terilliumpickaxe);
		registerRender(terilliumshovel);
		registerRender(terilliumsword);
		registerRender(blazecoal);
		registerRender(kitchenknife);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static class ArmorMaterials {
		
		public static final ItemArmor.ArmorMaterial terilliumMat = EnumHelper.addArmorMaterial("terilliumMat", MainHandler.MODID + ":terilliumarmor", 25, new int[]{2, 5, 7 ,2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	}
	
	public static class ToolMaterials {
		
		public static final Item.ToolMaterial terilliumMat = EnumHelper.addToolMaterial("terilliumMat", 3, 768, 8.0F, 2.0F, 25);
	}
}
