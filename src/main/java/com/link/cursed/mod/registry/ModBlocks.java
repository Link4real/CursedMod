package com.link.cursed.mod.registry;

import com.link.cursed.mod.Main;
import com.link.cursed.mod.registry.custom.EntertainmentBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.system.CallbackI;

import static com.link.cursed.mod.Main.MOD_ID;

public class ModBlocks {
    public static final Block PERSONAL_ENTERTAINMENT_DEVICE = new EntertainmentBlock(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.0f, 5f).sounds(BlockSoundGroup.STONE));
    public static final Block SMOOTH_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1.0f, 5f).sounds(BlockSoundGroup.STONE));
    public static final Block COOKIE_BLOCK = new Block(FabricBlockSettings.of(Material.CAKE).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1f, 5f).sounds(BlockSoundGroup.ANVIL));
    public static final Block APPLE_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).breakByTool(FabricToolTags.PICKAXES, 0).requiresTool().strength(1f, 5f).sounds(BlockSoundGroup.AMETHYST_BLOCK));
    public static final Block COMPUTER = new ComputerBlock(FabricBlockSettings.of(Material.EGG).strength(200f).nonOpaque().sounds(BlockSoundGroup.SCULK_SENSOR));
    public static final Block WATER_BOTTLE = new Block(FabricBlockSettings.of(Material.WOOL).strength(2f).nonOpaque().sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "personal_entertainment_device"), PERSONAL_ENTERTAINMENT_DEVICE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "smooth_diamond_ore"), SMOOTH_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cookie_block"), COOKIE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_block"), APPLE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "computer"), COMPUTER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "computer"), new BlockItem(COMPUTER, new FabricItemSettings().maxCount(16).group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "water_bottle"), WATER_BOTTLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "water_bottle"), new BlockItem(WATER_BOTTLE, new FabricItemSettings().maxCount(16).group(ItemGroup.DECORATIONS)));
    }
}