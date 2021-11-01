package com.link.cursed.mod.registry.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

/**
 * @author vento
 * @since 0.1.alpha
 */
public class EntertainmentBlock extends HorizontalFacingBlock {
    public EntertainmentBlock(Settings settings) {
        super(FabricBlockSettings.of(Material.WOOL).nonOpaque().sounds(BlockSoundGroup.WOOL).strength(0.6f));
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    /**
     * @author vento
     * @since 0.1.alpha
     */
    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        MinecraftClient.getInstance().stop();
    }
    /**
     * @author Link4real
     * @since 1.0
     */

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.1f, 1f);
            case SOUTH:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1f, 1f);
            case EAST:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.11f, 1f);
            case WEST:
                return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.111f, 1f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
    }

}
