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

import static com.link.cursed.mod.Main.MOD_ID;

public class ModBlocks {
    public static final Block PERSONAL_ENTERTAINMENT_DEVICE = new EntertainmentBlock(FabricBlockSettings.of(Material.STONE).breakByHand(true).strength(1.0f, 5f).sounds(BlockSoundGroup.STONE));
    public static final Block SMOOTH_DIAMOND_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByHand(true).strength(1.0f, 5f).sounds(BlockSoundGroup.STONE));
    public static final Block COOKIE_BLOCK = new Block(FabricBlockSettings.of(Material.CAKE).breakByHand(true).strength(1f, 5f).sounds(BlockSoundGroup.ANVIL));
    public static final Block APPLE_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).breakByHand(true).strength(1f, 5f).sounds(BlockSoundGroup.AMETHYST_BLOCK));
    public static final Block COMPUTER = new ComputerBlock(FabricBlockSettings.of(Material.EGG).strength(200f).nonOpaque().sounds(BlockSoundGroup.SCULK_SENSOR));
    public static final Block ADNAP = new PandaBlock(FabricBlockSettings.of(Material.GLASS).strength(2f).nonOpaque().sounds(BlockSoundGroup.POINTED_DRIPSTONE));
    public static final Block DIRT = new DirtCake(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(1, 5).sounds(BlockSoundGroup.GRASS));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "personal_entertainment_device"), PERSONAL_ENTERTAINMENT_DEVICE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "smooth_diamond_ore"), SMOOTH_DIAMOND_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cookie_block"), COOKIE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_block"), APPLE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "adnap"), ADNAP);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "computer"), COMPUTER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "computer"), new BlockItem(COMPUTER, new FabricItemSettings().maxCount(16).group(Main.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dirt"), DIRT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dirt"), new BlockItem(DIRT, new FabricItemSettings().group(Main.ITEM_GROUP)));
    }
}