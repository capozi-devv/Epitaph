package net.capozi.epitaph;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import eu.midnightdust.lib.config.MidnightConfig;
import eu.midnightdust.lib.util.PlatformFunctions;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public class EpitaphConfig extends MidnightConfig {
    Path path = Path.of(PlatformFunctions.getConfigDirectory().toString() + "\\epitaph\\epitaph" + "_profile_" + profile + ".json");
    Gson gson = (new GsonBuilder()).excludeFieldsWithModifiers(new int[]{128}).excludeFieldsWithModifiers(new int[]{2}).addSerializationExclusionStrategy(new HiddenAnnotationExclusionStrategy()).setPrettyPrinting().create();
    private static final String MESSAGES = "message_keys";
    private static final String CLIENT = "client_options";
    private static final String SERVER = "server_options";

    @Entry(category = CLIENT, min = 0, max = 9) @Client
    public static Integer profile = 0;

    @Entry(category = MESSAGES)
    public static String death_attack_anvil = "%1$s was squashed by a falling anvil";
    @Entry(category = MESSAGES)
    public static String death_attack_anvil_player = "%1$s was squashed by a falling anvil whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_arrow = "%1$s was shot by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_arrow_item = "%1$s was shot by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_badRespawnPoint_link = "Intentional Game Design";
    @Entry(category = MESSAGES)
    public static String death_attack_badRespawnPoint_message = "%1$s was killed by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_cactus = "%1$s was pricked to death";
    @Entry(category = MESSAGES)
    public static String death_attack_cactus_player = "%1$s walked into a cactus whilst trying to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_cramming = "%1$s was squished too much";
    @Entry(category = MESSAGES)
    public static String death_attack_cramming_player = "%1$s was squashed by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_dragonBreath = "%1$s was roasted in dragon's breath";
    @Entry(category = MESSAGES)
    public static String death_attack_dragonBreath_player = "%1$s was roasted in dragon's breath by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_drown = "%1$s drowned";
    @Entry(category = MESSAGES)
    public static String death_attack_drown_player = "%1$s drowned whilst trying to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_dryout = "%1$s died from dehydration";
    @Entry(category = MESSAGES)
    public static String death_attack_dryout_player = "%1$s died from dehydration whilst trying to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_even_more_magic = "%1$s was killed by even more magic";
    @Entry(category = MESSAGES)
    public static String death_attack_explosion = "%1$s blew up";
    @Entry(category = MESSAGES)
    public static String death_attack_explosion_player = "%1$s was blown up by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_explosion_player_item = "%1$s was blown up by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_fall = "%1$s hit the ground too hard";
    @Entry(category = MESSAGES)
    public static String death_attack_fall_player = "%1$s hit the ground too hard whilst trying to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_fallingBlock = "%1$s was squashed by a falling block";
    @Entry(category = MESSAGES)
    public static String death_attack_fallingBlock_player = "%1$s was squashed by a falling block whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_fallingStalactite = "%1$s was skewered by a falling stalactite";
    @Entry(category = MESSAGES)
    public static String death_attack_fallingStalactite_player = "%1$s was skewered by a falling stalactite whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_fireball = "%1$s was fireballed by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_fireball_item = "%1$s was fireballed by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_fireworks = "%1$s went off with a bang";
    @Entry(category = MESSAGES)
    public static String death_attack_fireworks_item = "%1$s went off with a bang due to a firework fired from %3$s by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_fireworks_player = "%1$s went off with a bang whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_flyIntoWall = "%1$s experienced kinetic energy";
    @Entry(category = MESSAGES)
    public static String death_attack_flyIntoWall_player = "%1$s experienced kinetic energy whilst trying to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_freeze = "%1$s froze to death";
    @Entry(category = MESSAGES)
    public static String death_attack_freeze_player = "%1$s was frozen to death by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_generic = "%1$s died";
    @Entry(category = MESSAGES)
    public static String death_attack_genericKill = "%1$s was killed";
    @Entry(category = MESSAGES)
    public static String death_attack_genericKill_player = "%1$s was killed whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_generic_player = "%1$s died because of %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_hotFloor = "%1$s discovered the floor was lava";
    @Entry(category = MESSAGES)
    public static String death_attack_hotFloor_player = "%1$s walked into the danger zone due to %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_indirectMagic = "%1$s was killed by %2$s using magic";
    @Entry(category = MESSAGES)
    public static String death_attack_indirectMagic_item = "%1$s was killed by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_inFire = "%1$s went up in flames";
    @Entry(category = MESSAGES)
    public static String death_attack_inFire_player = "%1$s walked into fire whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_inWall = "%1$s suffocated in a wall";
    @Entry(category = MESSAGES)
    public static String death_attack_inWall_player = "%1$s suffocated in a wall whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_lava = "%1$s tried to swim in lava";
    @Entry(category = MESSAGES)
    public static String death_attack_lava_player = "%1$s tried to swim in lava to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_lightningBolt = "%1$s was struck by lightning";
    @Entry(category = MESSAGES)
    public static String death_attack_lightningBolt_player = "%1$s was struck by lightning whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_magic = "%1$s was killed by magic";
    @Entry(category = MESSAGES)
    public static String death_attack_magic_player = "%1$s was killed by magic whilst trying to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_message_too_long = "Actually, the message was too long to deliver fully. Sorry! Here's stripped version: %s";
    @Entry(category = MESSAGES)
    public static String death_attack_mob = "%1$s was slain by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_mob_item = "%1$s was slain by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_onFire = "%1$s burned to death";
    @Entry(category = MESSAGES)
    public static String death_attack_onFire_item = "%1$s was burnt to a crisp whilst fighting %2$s wielding %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_onFire_player = "%1$s was burnt to a crisp whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_outsideBorder = "%1$s left the confines of this world";
    @Entry(category = MESSAGES)
    public static String death_attack_outsideBorder_player = "%1$s left the confines of this world whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_outOfWorld = "%1$s fell out of the world";
    @Entry(category = MESSAGES)
    public static String death_attack_outOfWorld_player = "%1$s didn't want to live in the same world as %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_player = "%1$s was slain by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_player_item = "%1$s was slain by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_sonic_boom = "%1$s was obliterated by a sonically-charged shriek";
    @Entry(category = MESSAGES)
    public static String death_attack_sonic_boom_item = "%1$s was obliterated by a sonically-charged shriek whilst trying to escape %2$s wielding %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_sonic_boom_player = "%1$s was obliterated by a sonically-charged shriek whilst trying to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_stalagmite = "%1$s was impaled on a stalagmite";
    @Entry(category = MESSAGES)
    public static String death_attack_stalagmite_player = "%1$s was impaled on a stalagmite whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_starve = "%1$s starved to death";
    @Entry(category = MESSAGES)
    public static String death_attack_starve_player = "%1$s starved to death whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_sting = "%1$s was stung to death";
    @Entry(category = MESSAGES)
    public static String death_attack_sting_item = "%1$s was stung to death by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_sting_player = "%1$s was stung to death by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_sweetBerryBush = "%1$s was poked to death by a sweet berry bush";
    @Entry(category = MESSAGES)
    public static String death_attack_sweetBerryBush_player = "%1$s was poked to death by a sweet berry bush whilst trying to escape %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_thorns = "%1$s was killed trying to hurt %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_thorns_item = "%1$s was killed by %3$s trying to hurt %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_thrown = "%1$s was pummeled by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_thrown_item = "%1$s was pummeled by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_trident = "%1$s was impaled by %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_trident_item = "%1$s was impaled by %2$s with %3$s";
    @Entry(category = MESSAGES)
    public static String death_attack_wither = "%1$s withered away";
    @Entry(category = MESSAGES)
    public static String death_attack_wither_player = "%1$s withered away whilst fighting %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_witherSkull = "%1$s was shot by a skull from %2$s";
    @Entry(category = MESSAGES)
    public static String death_attack_witherSkull_item = "%1$s was shot by a skull from %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_fell_accident_generic = "%1$s fell from a high place";
    @Entry(category = MESSAGES)
    public static String death_fell_accident_ladder = "%1$s fell off a ladder";
    @Entry(category = MESSAGES)
    public static String death_fell_accident_other_climbable = "%1$s fell while climbing";
    @Entry(category = MESSAGES)
    public static String death_fell_accident_scaffolding = "%1$s fell off scaffolding";
    @Entry(category = MESSAGES)
    public static String death_fell_accident_twisting_vines = "%1$s fell off some twisting vines";
    @Entry(category = MESSAGES)
    public static String death_fell_accident_vines = "%1$s fell off some vines";
    @Entry(category = MESSAGES)
    public static String death_fell_accident_weeping_vines = "%1$s fell off some weeping vines";
    @Entry(category = MESSAGES)
    public static String death_fell_assist = "%1$s was doomed to fall by %2$s";
    @Entry(category = MESSAGES)
    public static String death_fell_assist_item = "%1$s was doomed to fall by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_fell_finish = "%1$s fell too far and was finished by %2$s";
    @Entry(category = MESSAGES)
    public static String death_fell_finish_item = "%1$s fell too far and was finished by %2$s using %3$s";
    @Entry(category = MESSAGES)
    public static String death_fell_killer = "%1$s was doomed to fall";

    @Override
    public void writeChanges(String modid) {
        try {
            if (!Files.exists(path, new LinkOption[0])) {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
            }
            Files.write(path, gson.toJson(getClass(modid)).getBytes(), new OpenOption[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
