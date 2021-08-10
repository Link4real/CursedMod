package com.link.cursed.mod.mixin;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Item.class)
public interface ItemAccessor {
    @Accessor("foodComponent")
    FoodComponent getFoodComponent();

    @Accessor("foodComponent")
    FoodComponent setFoodComponent();
}
