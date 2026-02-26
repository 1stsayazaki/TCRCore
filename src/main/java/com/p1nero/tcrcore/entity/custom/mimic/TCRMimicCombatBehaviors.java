package com.p1nero.tcrcore.entity.custom.mimic;

import com.merlin204.avalon.entity.ai.AvalonCombatBehaviors;
import com.merlin204.avalon.entity.condition.TargetInGirdCondition;
import org.merlin204.mimic.entity.MimicPatch;
import org.merlin204.mimic.entity.ai.MimicConsumers;
import org.merlin204.mimic.epicfight.MimicAnimations;

@SuppressWarnings({"unchecked"})
public class TCRMimicCombatBehaviors {

    public static final AvalonCombatBehaviors.Builder<MimicPatch<?>> PHASE1 = AvalonCombatBehaviors.<MimicPatch>builder()

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(50).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(5, -5, -5, 5))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(1).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1).withinDistance(0, 50))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(50).cooldown(50).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(20, -20, -20, 20))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(10).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(5, -5, -5, 5))))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(10).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.TRY_PLAY_COMBO))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.TRY_PLAY_COMBO))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.TRY_PLAY_COMBO))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(3, -3, -3, 3))))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(10).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(3, -3, -3, 3))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(10).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(3, -3, -3, 3))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(10).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(3, -3, -3, 3))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            );

    public static final AvalonCombatBehaviors.Builder<MimicPatch<?>> PHASE3 = AvalonCombatBehaviors.<MimicPatch>builder()

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(500).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(5, -5, -5, 5))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(500).cooldown(50).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(20, -20, -20, 20))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(500).cooldown(50).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(20, -20, -20, 20))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.TRY_PLAY_COMBO))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(100).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.TRY_PLAY_COMBO))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(100).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.TRY_PLAY_COMBO))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.TRY_PLAY_COMBO))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.TRY_PLAY_COMBO))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(100).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(3, -3, -3, 3))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            )

            .newBehaviorSeries(
                    AvalonCombatBehaviors.BehaviorSeries.<MimicPatch>builder().weight(100).cooldown(10).canBeInterrupted(false).looping(false)
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY)
                                    .predicate(new TargetInGirdCondition(new TargetInGirdCondition.Rectangle(3, -3, -3, 3))))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_CAN_HIT_COPY))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().behavior(MimicConsumers.PLAY_RANDOM_COPY_WITHOUT_HIT))
                            .nextBehavior(AvalonCombatBehaviors.Behavior.<MimicPatch>builder().animationBehavior(MimicAnimations.SKILL_1))
            );

}