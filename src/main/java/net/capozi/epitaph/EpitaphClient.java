package net.capozi.epitaph;

import com.google.gson.JsonObject;
import net.capozi.epitaph.client.JsonLoader;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;

public class EpitaphClient implements ClientModInitializer {
    public static final Identifier SEND_PLAYER_KEYS = new Identifier("epitaph", "send_player_keys");
    @Override
    public void onInitializeClient() {
        ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
            JsonObject json = JsonLoader.loadClientKeys();
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeString(json.toString()); // send full JSON text
            ClientPlayNetworking.send(SEND_PLAYER_KEYS, buf);
        });
    }
}
