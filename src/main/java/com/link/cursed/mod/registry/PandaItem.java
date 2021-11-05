package com.link.cursed.mod.registry;

import com.link.cursed.mod.Main;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class PandaItem extends BlockItem {
    public PandaItem(Block adnap, Settings settings) {
        super(ModBlocks.ADNAP, new Item.Settings().maxCount(11).group(Main.ITEM_GROUP));
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.cursed.adnap.tooltip").formatted(Formatting.BLUE));
    }
}
