package net.capozi.epitaph.client;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.UUID;

public class JsonLoader {
    protected static final Gson GSON = new Gson();
    // Reads this client's own file and returns it.
    public static JsonObject loadClientKeys() {
        UUID uuid = MinecraftClient.getInstance().getSession().getUuidOrNull();
        if (uuid == null) return new JsonObject();
        // Path: config/epitaph/death_messages/<uuid>.json
        File file = new File(FabricLoader.getInstance().getConfigDir().toFile(), "epitaph/death_messages/" + uuid + ".json");
        if (!file.exists()) {
            // create file if missing
            file.getParentFile().mkdirs();
            try (FileWriter w = new FileWriter(file)) {
                w.write("{}");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new JsonObject();
        }
        try (FileReader reader = new FileReader(file)) {
            return GSON.fromJson(reader, JsonObject.class);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonObject();
        }
    }
}
