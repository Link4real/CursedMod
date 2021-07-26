package com.link.cursed.mod.armor;

import com.link.cursed.mod.registry.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class HalfDiamondArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final HalfDiamondArmorMaterial D = new HalfDiamondArmorMaterial();
    private static final HalfDiamondArmorMaterial[] PROTECTION_VALUES = new HalfDiamondArmorMaterial[]{D};
    public HalfDiamondArmorMaterial(Item.Settings group) {

    }

    public HalfDiamondArmorMaterial() {

    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 214;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        Ingredient.ofItems();
        return Ingredient.ofItems(Items.DIAMOND);
    }

    @Override
    public String getName() {
        return "half_armor";
    }

    @Override
    public float getToughness() {
        return 5f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
