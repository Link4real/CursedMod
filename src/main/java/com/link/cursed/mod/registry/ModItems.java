package com.link.cursed.mod.registry;

import com.link.cursed.mod.Main;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
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
    public static final Item ALEX = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item HOT_ALEX = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(69).snack().saturationModifier(69f).build()));
    public static final Item CRAFTING_MENU = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).alwaysEdible().snack().build()));
    public static final BlockItem PERSONAL_ENTERTAINMENT_DEVICE = new BlockItem(ModBlocks.PERSONAL_ENTERTAINMENT_DEVICE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item TWO_GOLDEN_SWORDS = new Item(new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item FOUR_DIAMONDS = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final BlockItem SMOOTH_DIAMOND_ORE = new BlockItem(ModBlocks.SMOOTH_DIAMOND_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Registry
    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "infinite_fuel"), INFINITE_FUEL);
        FuelRegistry.INSTANCE.add(INFINITE_FUEL, 32767);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "iron_carrot"), IRON_CARROT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "alex"), ALEX);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hot_alex"), HOT_ALEX);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crafting_menu"), CRAFTING_MENU);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "personal_entertainment_device"), PERSONAL_ENTERTAINMENT_DEVICE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "two_golden_swords"), TWO_GOLDEN_SWORDS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "four_diamonds"), FOUR_DIAMONDS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "smooth_diamond_ore"), SMOOTH_DIAMOND_ORE);

    }
}
