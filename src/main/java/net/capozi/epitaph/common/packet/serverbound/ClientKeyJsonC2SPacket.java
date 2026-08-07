package net.capozi.epitaph.common.packet.serverbound;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import eu.midnightdust.lib.config.MidnightConfig;
import eu.midnightdust.lib.util.PlatformFunctions;
import net.capozi.epitaph.Epitaph;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.text.Style;
import net.minecraft.util.Identifier;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.UUID;

public record ClientKeyJsonC2SPacket(String player, byte[] json) implements CustomPayload {
    public static final CustomPayload.Id<ClientKeyJsonC2SPacket> ID = new CustomPayload.Id<>(Identifier.of(Epitaph.MOD_ID, "client_key_json"));
    public static final PacketCodec<PacketByteBuf, ClientKeyJsonC2SPacket> CODEC = PacketCodec.tuple(PacketCodecs.STRING, ClientKeyJsonC2SPacket::player, PacketCodecs.BYTE_ARRAY, ClientKeyJsonC2SPacket::json, ClientKeyJsonC2SPacket::new);
    @Override
    public Id<? extends CustomPayload> getId() { return ID; }
    public static class Receiver implements ServerPlayNetworking.PlayPayloadHandler<ClientKeyJsonC2SPacket> {
        @Override
        public void receive(ClientKeyJsonC2SPacket packet, ServerPlayNetworking.Context context) {
            Path path = PlatformFunctions.getConfigDirectory().resolve("\\epitaph\\" + packet.player() + ".json");
            try {
                if (!Files.exists(path, new LinkOption[0])) {
                    Files.createFile(path);
                }
                Files.write(path, packet.json(), new OpenOption[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
