package com.p1nero.tcrcore.entity.custom.mimic;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.EntityType;
import yesman.epicfight.api.asset.AssetAccessor;
import yesman.epicfight.api.client.model.Meshes;
import yesman.epicfight.client.mesh.HumanoidMesh;
import yesman.epicfight.client.renderer.patched.entity.PHumanoidRenderer;

public class PTCRMimicRenderer extends PHumanoidRenderer {

    public PTCRMimicRenderer(AssetAccessor mesh, EntityRendererProvider.Context context, EntityType entityType) {
        super(mesh, context, entityType);
    }

    @Override
    public AssetAccessor<HumanoidMesh> getDefaultMesh() {
        if(Minecraft.getInstance().player == null) {
            return Meshes.BIPED;
        }
        return Minecraft.getInstance().player.getModelName().equals("slim") ? Meshes.ALEX : Meshes.BIPED;
    }
}
