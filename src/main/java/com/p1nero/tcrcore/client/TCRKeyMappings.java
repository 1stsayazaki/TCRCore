package com.p1nero.tcrcore.client;

import com.p1nero.battle_field1.worldgen.PBF1Dimensions;
import com.p1nero.fast_tpa.network.PacketRelay;
import com.p1nero.tcrcore.TCRCoreMod;
import com.p1nero.tcrcore.client.gui.screen.TCRQuestScreen;
import com.p1nero.tcrcore.network.TCRPacketHandler;
import com.p1nero.tcrcore.network.packet.serverbound.ExecuteRiptidePacket;
import com.p1nero.tcrcore.network.packet.serverbound.ExitSpectatorPacket;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid = TCRCoreMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TCRKeyMappings {

	public static final KeyMapping RIPTIDE = new KeyMapping(buildKey("riptide"), GLFW.GLFW_KEY_LEFT_ALT, "key.categories." + TCRCoreMod.MOD_ID);
    public static final KeyMapping SHOW_QUESTS = new KeyMapping(buildKey("show_quests"), GLFW.GLFW_KEY_J, "key.categories." + TCRCoreMod.MOD_ID);
    public static final KeyMapping EXIT_SPECTATOR = new KeyMapping(buildKey("exit_spectator"), GLFW.GLFW_KEY_ESCAPE, "key.categories." + TCRCoreMod.MOD_ID);

	public static String buildKey(String name){
		return "key." + TCRCoreMod.MOD_ID + "." + name;
	}

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(RIPTIDE);
        event.register(SHOW_QUESTS);
        event.register(EXIT_SPECTATOR);
	}

	@Mod.EventBusSubscriber(modid = TCRCoreMod.MOD_ID, value = Dist.CLIENT)
	public static class KeyPressHandler {

		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if(event.phase == TickEvent.Phase.END) {
                while (RIPTIDE.consumeClick()) {
                    if(Minecraft.getInstance().player != null && Minecraft.getInstance().player.isUnderWater()) {
                        PacketRelay.sendToServer(TCRPacketHandler.INSTANCE, new ExecuteRiptidePacket());
                    }
                }
                while (SHOW_QUESTS.consumeClick()) {
                    Minecraft.getInstance().setScreen(new TCRQuestScreen());
                }
                while (EXIT_SPECTATOR.consumeClick()) {
                    if(Minecraft.getInstance().player != null && Minecraft.getInstance().player.level().dimension() == PBF1Dimensions.SANCTUM_OF_THE_BATTLE_LEVEL_KEY) {
                        PacketRelay.sendToServer(TCRPacketHandler.INSTANCE, new ExitSpectatorPacket());
                    }
                }
			}
		}

	}

}
