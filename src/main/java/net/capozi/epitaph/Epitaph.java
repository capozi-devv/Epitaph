package net.capozi.epitaph;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import eu.midnightdust.lib.config.MidnightConfig;
import net.capozi.epitaph.common.packet.serverbound.ClientKeyJsonC2SPacket;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.networking.v1.*;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.GameRules;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.UUID;

public class Epitaph implements ModInitializer {
    public static final String MOD_ID = "epitaph";
    public static Map<UUID, JsonObject> publicKeys;
    public static final GameRules.Key<GameRules.BooleanRule> DEATH_COORDS = GameRuleRegistry.register("death_coords_include", GameRules.Category.CHAT, GameRuleFactory.createBooleanRule(true));
    @Override
    public void onInitialize() {
        MidnightConfig.init(MOD_ID, EpitaphConfig.class);
        PayloadTypeRegistry.playC2S().register(ClientKeyJsonC2SPacket.ID, ClientKeyJsonC2SPacket.CODEC);
        ServerPlayNetworking.registerGlobalReceiver(ClientKeyJsonC2SPacket.ID, new ClientKeyJsonC2SPacket.Receiver());
    }
}
