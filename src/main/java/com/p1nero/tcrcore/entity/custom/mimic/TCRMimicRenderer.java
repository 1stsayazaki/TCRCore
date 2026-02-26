package com.p1nero.tcrcore.entity.custom.mimic;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class TCRMimicRenderer extends HumanoidMobRenderer<TCRMimic, HumanoidModel<TCRMimic>> {

    public TCRMimicRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel<>(context.bakeLayer(ModelLayers.PLAYER)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull TCRMimic pEntity) {
        if(Minecraft.getInstance().player != null) {
            return Minecraft.getInstance().player.getSkinTextureLocation();
        }
        return ResourceLocation.fromNamespaceAndPath("", "");
    }

}
