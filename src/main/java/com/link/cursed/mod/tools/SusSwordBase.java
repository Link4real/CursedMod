package com.link.cursed.mod.tools;

import com.link.cursed.mod.Main;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;

public class SusSwordBase extends SwordItem {
    public SusSwordBase(ToolMaterial toolmaterial_1) {
        super(toolmaterial_1, 1, 69f, new Item.Settings().group(Main.ITEM_GROUP).food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(Main.SwordEffect, 250, 1), 1f).build()));
    }
}
