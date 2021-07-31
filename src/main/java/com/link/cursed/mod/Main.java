package com.link.cursed.mod;

import com.link.cursed.mod.registry.ModBlocks;
import com.link.cursed.mod.registry.ModItems;
import com.link.cursed.mod.registry.RegisterHalfDiamondArmor;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

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
                stacks.add(new ItemStack(ModItems.DIAMOND_NUGGET));
                stacks.add(new ItemStack(ModItems.FOUR_DIAMONDS));
                stacks.add(new ItemStack(ModItems.SIXTEEN_DIAMONDS));
                stacks.add(new ItemStack(ModItems.IRON_CARROT));
                stacks.add(new ItemStack(ModItems.PERSONAL_ENTERTAINMENT_DEVICE));
                stacks.add(new ItemStack(ModItems.SMOOTH_DIAMOND_ORE));
                stacks.add(new ItemStack(ModItems.TWO_GOLDEN_SWORDS));
                stacks.add(new ItemStack(RegisterHalfDiamondArmor.HALF_DIAMOND_BOOTS));
                stacks.add(new ItemStack(ModItems.GAPPLE));
                stacks.add(new ItemStack(ModItems.HEART));
                stacks.add(new ItemStack(ModItems.COOKIE_BLOCK));
            })
            .build();
    // ...


    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        RegisterHalfDiamondArmor.register();
    }
}
