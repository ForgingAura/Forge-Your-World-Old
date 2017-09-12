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
import forgingaura.forgeyourworld.category.toolarmor.*;
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
	public static Item woolblackhelmet;
	public static Item woolblackchestplate;
	public static Item woolblackleggings;
	public static Item woolblackboots;
	public static Item woollightbluehelmet;
	public static Item woollightbluechestplate;
	public static Item woollightblueleggings;
	public static Item woollightblueboots;
	public static Item woollimehelmet;
	public static Item woollimechestplate;
	public static Item woollimeleggings;
	public static Item woollimeboots;
	public static Item woolpinkhelmet;
	public static Item woolpinkchestplate;
	public static Item woolpinkleggings;
	public static Item woolpinkboots;
	public static Item woolredhelmet;
	public static Item woolredchestplate;
	public static Item woolredleggings;
	public static Item woolredboots;
	
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
		woolblackhelmet = new WoolBlackHelmet(ArmorMaterials.woolblackMat, 3, EntityEquipmentSlot.HEAD);
		woolblackchestplate = new WoolBlackChestPlate(ArmorMaterials.woolblackMat, 3,EntityEquipmentSlot.CHEST);
		woolblackleggings = new WoolBlackLeggings(ArmorMaterials.woolblackMat, 3, EntityEquipmentSlot.LEGS);
		woolblackboots = new WoolBlackBoots(ArmorMaterials.woolblackMat, 3, EntityEquipmentSlot.FEET);
		woollightbluehelmet = new WoolLightBlueHelmet(ArmorMaterials.woollightblueMat, 3, EntityEquipmentSlot.HEAD);
		woollightbluechestplate = new WoolLightBlueChestPlate(ArmorMaterials.woollightblueMat, 3, EntityEquipmentSlot.CHEST);
		woollightblueleggings = new WoolLightBlueLeggings(ArmorMaterials.woollightblueMat, 3, EntityEquipmentSlot.LEGS);
		woollightblueboots = new WoolLightBlueBoots(ArmorMaterials.woollightblueMat, 3, EntityEquipmentSlot.FEET);
		woollimehelmet = new WoolLimeHelmet(ArmorMaterials.woollimeMat, 3, EntityEquipmentSlot.HEAD);
		woollimechestplate = new WoolLimeChestPlate(ArmorMaterials.woollimeMat, 3, EntityEquipmentSlot.CHEST);
		woollimeleggings = new WoolLimeLeggings(ArmorMaterials.woollimeMat, 3, EntityEquipmentSlot.LEGS);
		woollimeboots = new WoolLimeBoots(ArmorMaterials.woollimeMat, 3, EntityEquipmentSlot.FEET);
		woolpinkhelmet = new WoolPinkHelmet(ArmorMaterials.woolpinkMat, 3, EntityEquipmentSlot.HEAD);
		woolpinkchestplate = new WoolPinkChestPlate(ArmorMaterials.woolpinkMat, 3, EntityEquipmentSlot.CHEST);
		woolpinkleggings = new WoolPinkLeggings(ArmorMaterials.woolpinkMat, 3, EntityEquipmentSlot.LEGS);
		woolpinkboots = new WoolPinkBoots(ArmorMaterials.woolpinkMat, 3, EntityEquipmentSlot.FEET);
		woolredhelmet = new WoolRedHelmet(ArmorMaterials.woolredMat, 3, EntityEquipmentSlot.HEAD);
		woolredchestplate = new WoolRedChestPlate(ArmorMaterials.woolredMat, 3, EntityEquipmentSlot.CHEST);
		woolredleggings = new WoolRedLeggings(ArmorMaterials.woolredMat, 3, EntityEquipmentSlot.LEGS);
		woolredboots = new WoolRedBoots(ArmorMaterials.woolredMat, 3, EntityEquipmentSlot.FEET);
		
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
		GameRegistry.register(woolblackhelmet);
		GameRegistry.register(woolblackchestplate);
		GameRegistry.register(woolblackleggings);
		GameRegistry.register(woolblackboots);
		GameRegistry.register(woollightbluehelmet);
		GameRegistry.register(woollightbluechestplate);
		GameRegistry.register(woollightblueleggings);
		GameRegistry.register(woollightblueboots);
		GameRegistry.register(woollimehelmet);
		GameRegistry.register(woollimechestplate);
		GameRegistry.register(woollimeleggings);
		GameRegistry.register(woollimeboots);
		GameRegistry.register(woolpinkhelmet);
		GameRegistry.register(woolpinkchestplate);
		GameRegistry.register(woolpinkleggings);
		GameRegistry.register(woolpinkboots);
		GameRegistry.register(woolredhelmet);
		GameRegistry.register(woolredchestplate);
		GameRegistry.register(woolredleggings);
		GameRegistry.register(woolredboots);
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
		registerRender(woolblackhelmet);
		registerRender(woolblackchestplate);
		registerRender(woolblackleggings);
		registerRender(woolblackboots);
		registerRender(woollightbluehelmet);
		registerRender(woollightbluechestplate);
		registerRender(woollightblueleggings);
		registerRender(woollightblueboots);
		registerRender(woollimehelmet);
		registerRender(woollimechestplate);
		registerRender(woollimeleggings);
		registerRender(woollimeboots);
		registerRender(woolpinkhelmet);
		registerRender(woolpinkchestplate);
		registerRender(woolpinkleggings);
		registerRender(woolpinkboots);
		registerRender(woolredhelmet);
		registerRender(woolredchestplate);
		registerRender(woolredleggings);
		registerRender(woolredboots);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static class ArmorMaterials {
		
		public static final ItemArmor.ArmorMaterial terilliumMat = EnumHelper.addArmorMaterial("terilliumMat", MainHandler.MODID + ":terilliumarmor", 25, new int[]{2, 5, 7 ,2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
		public static final ItemArmor.ArmorMaterial woolwhiteMat = EnumHelper.addArmorMaterial("woolwhiteMat", MainHandler.MODID + ":white_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolorangeMat = EnumHelper.addArmorMaterial("woolorangeMat", MainHandler.MODID + ":orange_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolmagentaMat = EnumHelper.addArmorMaterial("woolmagentaMat", MainHandler.MODID + ":magenta_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woollightblueMat = EnumHelper.addArmorMaterial("woollightblueMat", MainHandler.MODID + ":light_blue_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolyellowMat = EnumHelper.addArmorMaterial("woolyellowMat", MainHandler.MODID + ":yellow_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woollimeMat = EnumHelper.addArmorMaterial("woollimeMat", MainHandler.MODID + ":lime_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolpinkMat = EnumHelper.addArmorMaterial("woolpinkMat", MainHandler.MODID + ":pink_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolgrayMat = EnumHelper.addArmorMaterial("woolgrayMat", MainHandler.MODID + ":gray_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woollightgrayMat = EnumHelper.addArmorMaterial("woollightgrayMat", MainHandler.MODID + ":light_gray_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolcyanMat = EnumHelper.addArmorMaterial("woolcyanMat", MainHandler.MODID + ":cyan_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolpurpleMat = EnumHelper.addArmorMaterial("woolpurpleMat", MainHandler.MODID + ":purple_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolblueMat = EnumHelper.addArmorMaterial("woolblueMat", MainHandler.MODID + ":blue_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolbrownMat = EnumHelper.addArmorMaterial("woolbrownMat", MainHandler.MODID + ":brown_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolgreenMat = EnumHelper.addArmorMaterial("woolgreenMat", MainHandler.MODID + ":green_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolredMat = EnumHelper.addArmorMaterial("woolredMat", MainHandler.MODID + ":red_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);
		public static final ItemArmor.ArmorMaterial woolblackMat = EnumHelper.addArmorMaterial("woolblackMat", MainHandler.MODID + ":black_wool_armor", 25, new int[]{1, 2, 4 ,1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.5F);

	}
	
	public static class ToolMaterials {
		
		public static final Item.ToolMaterial terilliumMat = EnumHelper.addToolMaterial("terilliumMat", 3, 768, 8.0F, 2.0F, 25);
	}
}
