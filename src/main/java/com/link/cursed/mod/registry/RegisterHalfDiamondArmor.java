package com.link.cursed.mod.registry;

import com.link.cursed.mod.Main;
import com.link.cursed.mod.armor.HalfDiamondArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterHalfDiamondArmor {
    public static final ArmorMaterial ARMOR_MATERIAL = new HalfDiamondArmorMaterial();
    public static final Item HALF_DIAMOND_BOOTS = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Main.DIAMOND_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item DIAMOND_SHORTS = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Main.DIAMOND_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item DIAMOND_TOP = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Main.DIAMOND_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item DIAMOND_BERET = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Main.DIAMOND_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final String MOD_ID = Main.MOD_ID;

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "half_diamond_boots"), HALF_DIAMOND_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_shorts"), DIAMOND_SHORTS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_top"), DIAMOND_TOP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_beret"), DIAMOND_BERET);
    }
}
