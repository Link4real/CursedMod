package com.link.cursed.mod.tools;

import com.link.cursed.mod.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SusMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 69;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2f;
    }

    @Override
    public float getAttackDamage() {
        return 420;
    }

    @Override
    public int getMiningLevel() {
        return 6;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.INFINITE_FUEL);
    }
}
