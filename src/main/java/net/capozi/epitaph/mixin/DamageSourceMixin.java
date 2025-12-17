package net.capozi.epitaph.mixin;

import com.google.gson.JsonObject;
import net.capozi.epitaph.Epitaph;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DamageSource.class)
public class DamageSourceMixin {
    @Inject(method = "getDeathMessage", at = @At("HEAD"), cancellable = true)
    private void customizeVictimDeathMessage(LivingEntity killed, CallbackInfoReturnable<Text> cir) {
        if (!(killed instanceof ServerPlayerEntity player)) return;
        DamageSource source = (DamageSource)(Object)this;
        JsonObject playerKeys = Epitaph.getPlayerMessages(player);
        if (playerKeys != null) {
            RegistryEntry<DamageType> entry = source.getTypeRegistryEntry();
            RegistryKey<DamageType> key = entry.getKey().orElse(null);
            if (key != null) {
                Text text = Text.literal(playerKeys.get(key.toString()).toString());
                cir.setReturnValue(text);
            }
        }
    }
}
