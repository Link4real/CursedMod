package com.link.cursed.mod.registry;

import com.link.cursed.mod.Main;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.FileOutputStream;

public class ModItems {





    //Items
    public static final Item INFINITE_FUEL = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item IRON_CARROT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).snack().saturationModifier(12f).build()));


    //Registry
    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "infinite_fuel"), INFINITE_FUEL);
        FuelRegistry.INSTANCE.add(INFINITE_FUEL, 32767);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "iron_carrot"), IRON_CARROT);

    }
}
