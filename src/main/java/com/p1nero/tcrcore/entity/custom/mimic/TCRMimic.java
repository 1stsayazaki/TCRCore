package com.p1nero.tcrcore.entity.custom.mimic;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import org.merlin204.mimic.entity.proteus.ProteusEntity;
import yesman.epicfight.world.entity.ai.attribute.EpicFightAttributes;

public class TCRMimic extends ProteusEntity {
    public TCRMimic(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier setAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 1000)
                .add(Attributes.ATTACK_DAMAGE, 5)
                .add(Attributes.ARMOR, 20)
                .add(Attributes.FOLLOW_RANGE, 72)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1000)
                .add(Attributes.ATTACK_SPEED,1.5F)
                .add(EpicFightAttributes.IMPACT.get(), 5)
                .add(EpicFightAttributes.ARMOR_NEGATION.get(), 50.0F)
                .add(EpicFightAttributes.MAX_STRIKES.get(), 50.0F)
                .add(EpicFightAttributes.WEIGHT.get(), 0).build();
    }

}
