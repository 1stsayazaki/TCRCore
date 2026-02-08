package com.p1nero.tcrcore.item.custom;

import com.p1nero.tcrcore.TCRCoreMod;
import net.magister.bookofdragons.entity.base.dragon.DragonBase;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class DragonBallItem extends SimpleDescriptionItem {

    public DragonBallItem(Properties properties) {
        super(properties, false);
    }

    public @NotNull InteractionResult useOn(UseOnContext onContext) {
        if (!onContext.getLevel().isClientSide) {
            releaseEntity(onContext.getItemInHand(), onContext.getLevel(), onContext.getClickLocation());
        }
        return super.useOn(onContext);
    }

    @Override
    public @NotNull InteractionResult interactLivingEntity(@NotNull ItemStack itemStack, Player player, @NotNull LivingEntity entity, @NotNull InteractionHand hand) {
        if (!player.level().isClientSide) {
            if(entity instanceof DragonBase) {
                saveToItem(player.getItemInHand(hand), entity);
            } else {
                player.displayClientMessage(TCRCoreMod.getInfo("only_work_on_dragon"), true);
            }
        }
        return super.interactLivingEntity(itemStack, player, entity, hand);
    }

    public void releaseEntity(ItemStack itemStack, Level level, Vec3 spawnPos) {
        CompoundTag tag = itemStack.getOrCreateTag();
        EntityType<?> entityType = EntityType.byString(tag.getString("entity")).orElse(null);
        if (entityType != null && entityType.create(level) instanceof LivingEntity livingEntity) {
            livingEntity.load(tag);
            livingEntity.setPos(spawnPos);
            level.addFreshEntity(livingEntity);
            itemStack.setHoverName(Component.translatable(itemStack.getDescriptionId()));
        }
    }

    public void saveToItem(ItemStack itemStack, LivingEntity entity) {
        entity.removeEffect(MobEffects.GLOWING);
        CompoundTag tag = itemStack.getOrCreateTag();
        tag.putString("entity", EntityType.getKey(entity.getType()).toString());
        entity.saveWithoutId(tag);
        itemStack.setHoverName(itemStack.getDisplayName().copy().append(Component.literal("[")).append(entity.getDisplayName()).append(Component.literal("]")));
        entity.discard();
    }

}
