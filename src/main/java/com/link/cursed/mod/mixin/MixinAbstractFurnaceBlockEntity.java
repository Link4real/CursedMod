package com.link.cursed.mod.mixin;

import com.link.cursed.mod.registry.ModItems;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * @author Vento
 * @since 0.1.alpha
 */
@Mixin(AbstractFurnaceBlockEntity.class)
public class MixinAbstractFurnaceBlockEntity {

    @Unique
    private AbstractFurnaceBlockEntity parent = (AbstractFurnaceBlockEntity) (Object) this;

    /**
     * @author Vento
     * @since 0.1.alpha
     */
    @Inject(
            method = "isBurning",
            at = @At("HEAD"),
            cancellable = true
    )
    private void onIsBurning(CallbackInfoReturnable<Boolean> cir) {
        if (parent.getStack(1).getItem() == ModItems.INFINITE_FUEL) {
            cir.setReturnValue(true);
            cir.cancel();
        }
    }
}
