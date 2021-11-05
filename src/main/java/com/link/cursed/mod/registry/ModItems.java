package com.link.cursed.mod.registry;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import com.link.cursed.mod.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    //Items
    public static final Item INFINITE_FUEL = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item IRON_CARROT = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().hunger(10).snack().saturationModifier(12f).build()));
    public static final Item ALEX = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item HOT_ALEX = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().hunger(69).snack().saturationModifier(69f).build()));
    public static final Item CRAFTING_MENU = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).alwaysEdible().snack().build()));
    public static final BlockItem PERSONAL_ENTERTAINMENT_DEVICE = new BlockItem(ModBlocks.PERSONAL_ENTERTAINMENT_DEVICE, new Item.Settings().maxCount(65).group(Main.ITEM_GROUP).food(new FoodComponent.Builder().build()));
    public static final Item TWO_GOLDEN_SWORDS = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item FOUR_DIAMONDS = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final BlockItem SMOOTH_DIAMOND_ORE = new BlockItem(ModBlocks.SMOOTH_DIAMOND_ORE, new Item.Settings().maxCount(65).group(Main.ITEM_GROUP).food(new FoodComponent.Builder().build()));
    public static final Item SIXTEEN_DIAMONDS = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().hunger(4).snack().alwaysEdible().saturationModifier(5f).build()));
    public static final Item DIAMOND_NUGGET = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item CHICKEN_NUGGETS = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().hunger(1000).saturationModifier(10000).snack().build()));
    public static final Item BURNED_CHICKEN_NUGGET = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item HEART = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 10000, 249), 1).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 10000, 254), 1).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 10000, 254), 1).hunger(2).saturationModifier(3f).alwaysEdible().snack().build()));
    public static final Item GAPPLE = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().saturationModifier(3f).alwaysEdible().snack().hunger(4).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1986, 1), 1).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1092, 2), 1).build()));
    public static final BlockItem COOKIE_BLOCK = new BlockItem(ModBlocks.COOKIE_BLOCK, new Item.Settings().maxCount(65).group(Main.ITEM_GROUP).food(new FoodComponent.Builder().build()));
    public static final BlockItem APPLE_BLOCK = new BlockItem(ModBlocks.APPLE_BLOCK, new Item.Settings().maxCount(65).group(Main.ITEM_GROUP).food(new FoodComponent.Builder().build()));
    public static final Item DIAMOND_STACK = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item ONE_THOUSAND_AND_TWENTY_FOUR_DIAMONDS = new Item(new Item.Settings().maxCount(65).group(Main.ITEM_GROUP).food(new FoodComponent.Builder().build()));
    public static final Item TWO_HUNDRED_AND_FIFTY_SIX_DIAMONDS = new Item(new Item.Settings().maxCount(65).group(Main.ITEM_GROUP).food(new FoodComponent.Builder().build()));
    public static final Item SNAIL = new Item(new Item.Settings().maxCount(65).food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 240, 6), 0.7f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 230, 2), 1).build()));
    public static final Item DIAMOND_PUFFERFISH = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 240, 0), 1).build()));
    public static final Item NETHERITE_PUFFERFISH = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6034, 4), 1).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 420, 3), 1).build()));
    public static final Item APPLE_INGOT = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().build()));
    public static final Item CARROT_NUGGET = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(65).food(new FoodComponent.Builder().hunger(1).saturationModifier(5f).build()));
    public static final Item TURTLE_CAKE = new Item(new Item.Settings().group(Main.ITEM_GROUP).maxCount(1).food(new FoodComponent.Builder().hunger(3).saturationModifier(5f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 5),1).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400,3),1).build()));
    public static final BlockItem ADNAP = new PandaItem(ModBlocks.ADNAP, new Item.Settings().maxCount(11).group(Main.ITEM_GROUP));
    public static final Item CURSED_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(2500).group(Main.ITEM_GROUP), 10, 13, ModItems.ONE_THOUSAND_AND_TWENTY_FOUR_DIAMONDS);
    public static final Item COMPUTA_CHIP = new Item(new FabricItemSettings().maxCount(1).group(Main.ITEM_GROUP));
    //Registry
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "infinite_fuel"), INFINITE_FUEL);
        FuelRegistry.INSTANCE.add(INFINITE_FUEL, 1);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "iron_carrot"), IRON_CARROT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "alex"), ALEX);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "hot_alex"), HOT_ALEX);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "crafting_menu"), CRAFTING_MENU);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "personal_entertainment_device"), PERSONAL_ENTERTAINMENT_DEVICE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "two_golden_swords"), TWO_GOLDEN_SWORDS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "four_diamonds"), FOUR_DIAMONDS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "smooth_diamond_ore"), SMOOTH_DIAMOND_ORE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sixteen_diamonds"), SIXTEEN_DIAMONDS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "diamond_nugget"), DIAMOND_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "chicken_nuggets"), CHICKEN_NUGGETS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "burned_chicken_nuggets"), BURNED_CHICKEN_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "heart"), HEART);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gapple"), GAPPLE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cookie_block"), COOKIE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "diamond_stack"), DIAMOND_STACK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "one_thousand_and_twenty_four_diamonds"), ONE_THOUSAND_AND_TWENTY_FOUR_DIAMONDS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "two_hundred_and_fifty_six_diamonds"), TWO_HUNDRED_AND_FIFTY_SIX_DIAMONDS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "snail"), SNAIL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "diamond_pufferfish"), DIAMOND_PUFFERFISH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "netherite_pufferfish"), NETHERITE_PUFFERFISH);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "apple_ingot"), APPLE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "apple_block"), APPLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "carrot_nugget"), CARROT_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "turtle_cake"), TURTLE_CAKE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "adnap"), ADNAP);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "cursed_shield"), CURSED_SHIELD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "computa_chip"), COMPUTA_CHIP);
    }
}
