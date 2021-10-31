package com.link.cursed.mod.tools;

import com.link.cursed.mod.Main;
import net.minecraft.item.*;

public class SusSwordBase extends SwordItem {
    public SusSwordBase(ToolMaterial toolmaterial_1) {
        super(toolmaterial_1, 0, 1f, new Item.Settings().group(Main.ITEM_GROUP).food(new FoodComponent.Builder().build()));
    }
}
