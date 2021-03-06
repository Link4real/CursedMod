package com.link.cursed.mod;

import com.link.cursed.mod.registry.ModBlocks;
import com.link.cursed.mod.registry.ModItems;
import com.link.cursed.mod.registry.RegisterHalfDiamondArmor;
import com.link.cursed.mod.registry.SwordEffect;
import com.link.cursed.mod.tools.SusMaterial;
import com.link.cursed.mod.tools.SusSwordBase;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    public static final StatusEffect SwordEffect = new SwordEffect();
public static final String MOD_ID = "cursed";


    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier("cursed", "main"))
            .icon(() -> new ItemStack(ModItems.INFINITE_FUEL))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.INFINITE_FUEL));
                stacks.add(new ItemStack(ModItems.ALEX));
                stacks.add(new ItemStack(ModItems.HOT_ALEX));
                stacks.add(new ItemStack(ModItems.CRAFTING_MENU));
                stacks.add(new ItemStack(ModItems.CHICKEN_NUGGETS));
                stacks.add(new ItemStack(ModItems.BURNED_CHICKEN_NUGGET));
                stacks.add(new ItemStack(ModItems.IRON_CARROT));
                stacks.add(new ItemStack(ModItems.PERSONAL_ENTERTAINMENT_DEVICE));
                stacks.add(new ItemStack(ModItems.TWO_GOLDEN_SWORDS));
                stacks.add(new ItemStack(ModItems.GAPPLE));
                stacks.add(new ItemStack(ModItems.HEART));
                stacks.add(new ItemStack(ModItems.COOKIE_BLOCK));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.NETHERITE_PUFFERFISH));
                stacks.add(new ItemStack(ModItems.APPLE_INGOT));
                stacks.add(new ItemStack(ModItems.APPLE_BLOCK));
                stacks.add(new ItemStack(ModItems.CARROT_NUGGET));
                stacks.add(new ItemStack(ModItems.TURTLE_CAKE));
                stacks.add(new ItemStack(ModItems.DIAMOND_NUGGET));
                stacks.add(new ItemStack(ModItems.FOUR_DIAMONDS));
                stacks.add(new ItemStack(ModItems.SIXTEEN_DIAMONDS));
                stacks.add(new ItemStack(ModItems.DIAMOND_STACK));
                stacks.add(new ItemStack(ModItems.TWO_HUNDRED_AND_FIFTY_SIX_DIAMONDS));
                stacks.add(new ItemStack(ModItems.ONE_THOUSAND_AND_TWENTY_FOUR_DIAMONDS));
                stacks.add(new ItemStack(ModItems.SMOOTH_DIAMOND_ORE));
                stacks.add(new ItemStack(RegisterHalfDiamondArmor.HALF_DIAMOND_BOOTS));
                stacks.add(new ItemStack(RegisterHalfDiamondArmor.DIAMOND_SHORTS));
                stacks.add(new ItemStack(RegisterHalfDiamondArmor.DIAMOND_TOP));
                stacks.add(new ItemStack(RegisterHalfDiamondArmor.DIAMOND_BERET));
                stacks.add(new ItemStack(ModItems.DIAMOND_PUFFERFISH));
                stacks.add(new ItemStack(ModBlocks.COMPUTER));
                stacks.add(new ItemStack(ModItems.ADNAP));
                stacks.add(new ItemStack(ModItems.COMPUTA_CHIP));
                stacks.add(new ItemStack(ModBlocks.DIRT));
            })
            .build();
    // ...

    public static final ItemGroup SNAIL_GROUP = FabricItemGroupBuilder.create(
            new Identifier("cursed", "snail"))
            .icon(() -> new ItemStack(ModItems.SNAIL))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));
                stacks.add(new ItemStack(ModItems.SNAIL));

            })
            .build();

    // ...
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        RegisterHalfDiamondArmor.register();
        //Tools
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "sus_sword"), new SusSwordBase(new SusMaterial()));
        Registry.register(Registry.STATUS_EFFECT, new Identifier("cursed", "sword"), SwordEffect);
    }
}
