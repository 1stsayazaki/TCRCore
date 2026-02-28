package com.p1nero.tcrcore.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class StoneOfReincarnationItem extends SimpleDescriptionItem{
    public StoneOfReincarnationItem(Properties properties) {
        super(properties, true);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand hand) {
        //TODO 弹出对话选项是否开启下一周目，单人模式血量加倍，多人无法生效
        return super.use(level, player, hand);
    }
}
