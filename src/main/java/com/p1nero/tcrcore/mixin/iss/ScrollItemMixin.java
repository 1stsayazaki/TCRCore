package com.p1nero.tcrcore.mixin.iss;

import com.p1nero.tcrcore.TCRCoreMod;
import io.redspace.ironsspellbooks.item.Scroll;
import net.minecraft.ChatFormatting;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Scroll.class)
public class ScrollItemMixin {

    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    private void tcr$use(Level level, Player player, @NotNull InteractionHand hand, CallbackInfoReturnable<InteractionResultHolder<ItemStack>> cir) {
        ItemStack stack = player.getItemInHand(hand);
        if(level.isClientSide) {
            player.displayClientMessage(TCRCoreMod.getInfo("can_not_use_scroll_directly").withStyle(ChatFormatting.GOLD), true);
        }
        cir.setReturnValue(InteractionResultHolder.sidedSuccess(stack, level.isClientSide));
    }

}
