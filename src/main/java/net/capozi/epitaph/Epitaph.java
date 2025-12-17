package net.capozi.epitaph;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.GameRules;

import java.util.Map;
import java.util.UUID;



public class Epitaph implements ModInitializer {
    public static Map<UUID, JsonObject> publicKeys;
    public static final Gson GSON = new Gson();
    public static JsonObject getPlayerMessages(ServerPlayerEntity player) {
        return publicKeys.get(player.getUuid());
    }
    public static final GameRules.Key<GameRules.BooleanRule> DEATH_COORDS = GameRuleRegistry.register("death_coords_include", GameRules.Category.CHAT, GameRuleFactory.createBooleanRule(true));
    @Override
    public void onInitialize() {
        ServerPlayNetworking.registerGlobalReceiver(
                EpitaphClient.SEND_PLAYER_KEYS,
                (server, player, handler, buf, responseSender) -> {
                    String jsonText = buf.readString();
                    JsonObject json = GSON.fromJson(jsonText, JsonObject.class);
                    server.execute(() -> {
                        publicKeys.put(player.getUuid(), json);
                        System.out.println("Loaded custom messages for " + player.getName().getString());
                    });
                }
        );
        ServerPlayConnectionEvents.JOIN.register((handler, server, sender) -> {
            System.out.println("Retrieved message keys for: " + getPlayerMessages(handler.getPlayer()));
        });
    }
}
