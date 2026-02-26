package com.p1nero.tcrcore.network.packet.clientbound;

import com.p1nero.dialog_lib.network.packet.BasePacket;
import com.p1nero.tcrcore.network.packet.clientbound.helper.TCRClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;

public record SetThirdPersonPacket() implements BasePacket {

    @Override
    public void encode(FriendlyByteBuf buf) {
    }

    public static SetThirdPersonPacket decode(FriendlyByteBuf buf){
        return new SetThirdPersonPacket();
    }

    @Override
    public void execute(Player player) {
        if(Minecraft.getInstance().player != null && Minecraft.getInstance().level != null){
            TCRClientHandler.setThirdPerson();
        }
    }
}
