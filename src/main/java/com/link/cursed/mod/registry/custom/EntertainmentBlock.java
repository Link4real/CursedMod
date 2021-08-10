package com.link.cursed.mod.registry.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

/**
 * @author vento
 * @since 0.1.alpha
 */
public class EntertainmentBlock extends Block {
    public EntertainmentBlock(Settings settings) {
        super(settings);
    }

    /**
     * @author vento
     * @since 0.1.alpha
     */
    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        MinecraftClient.getInstance().stop();
    }
}
