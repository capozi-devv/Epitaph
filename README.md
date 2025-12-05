# Introduction
Allows you to customize your own death messages for others to see! You can customize each death message individually, and you can make them _**Anything!**_


# Instructions
In your config folder, find the ```epitaph``` folder. If it does not exist, create it. Then, with this folder create a ```death_messages``` folder if it does not already exist. Within ```death_messages```, create a ```.json``` file withe the name format of ```<your_uuid_here>.json```, replacing "<your_uuid_here>" with your Minecraft account's uuid. If you do not know your own uuid, you can check [here](https://namemc.com/) by searching your minecraft username. Once your file is named, you can go into it and start replacing the values of the normal minecraft death messages. You can find an template json structure below.

```
{
  "death.attack.anvil": "example message",
  "death.attack.drown": "swam with the fishes",
}
```
Each death message is replaced by filling out it's own message key on a new line within the json. A list of all the minecraft keys can be found below. In death message keys, "%1$s" is the player or entity who died, "%2$s" is the player or entity who killed %1$s, and  "%3$s" is the item the killer used. Once finished, the final file structure should look like this: ```config/epitaph/death_messages/<your_uuid_here>.json```. After that, make sure Epitaph is also installed server side, and enjoy your new death messages!


<details>
<summary>Example Message Json Keys</summary>

  ```
"death.attack.anvil": "%1$s was squashed by a falling anvil",
  
  "death.attack.anvil.player": "%1$s was squashed by a falling anvil whilst fighting %2$s",
  
  "death.attack.arrow": "%1$s was shot by %2$s",
  
  "death.attack.arrow.item": "%1$s was shot by %2$s using %3$s",
  
  "death.attack.badRespawnPoint.link": "Intentional Game Design",
  
  "death.attack.badRespawnPoint.message": "%1$s was killed by %2$s",
 
  "death.attack.cactus": "%1$s was pricked to death",
  
  "death.attack.cactus.player": "%1$s walked into a cactus whilst trying to escape %2$s",
  
  "death.attack.cramming": "%1$s was squished too much",
  
  "death.attack.cramming.player": "%1$s was squashed by %2$s",
 
  "death.attack.dragonBreath": "%1$s was roasted in dragon's breath",
 
  "death.attack.dragonBreath.player": "%1$s was roasted in dragon's breath by %2$s",
 
  "death.attack.drown": "%1$s drowned",
  
  "death.attack.drown.player": "%1$s drowned whilst trying to escape %2$s",
  
  "death.attack.dryout": "%1$s died from dehydration",
  
  "death.attack.dryout.player": "%1$s died from dehydration whilst trying to escape %2$s",
  
  "death.attack.even_more_magic": "%1$s was killed by even more magic",
  
  "death.attack.explosion": "%1$s blew up",
  
  "death.attack.explosion.player": "%1$s was blown up by %2$s",
  
  "death.attack.explosion.player.item": "%1$s was blown up by %2$s using %3$s",
  
  "death.attack.fall": "%1$s hit the ground too hard",
  
  "death.attack.fall.player": "%1$s hit the ground too hard whilst trying to escape %2$s",
 
  "death.attack.fallingBlock": "%1$s was squashed by a falling block",
  
  "death.attack.fallingBlock.player": "%1$s was squashed by a falling block whilst fighting %2$s",
 
  "death.attack.fallingStalactite": "%1$s was skewered by a falling stalactite",

  "death.attack.fallingStalactite.player": "%1$s was skewered by a falling stalactite whilst fighting %2$s",
  
  "death.attack.fireball": "%1$s was fireballed by %2$s",
  
  "death.attack.fireball.item": "%1$s was fireballed by %2$s using %3$s",
  
  "death.attack.fireworks": "%1$s went off with a bang",
  
  "death.attack.fireworks.item": "%1$s went off with a bang due to a firework fired from %3$s by %2$s",
  
  "death.attack.fireworks.player": "%1$s went off with a bang whilst fighting %2$s",
 
  "death.attack.flyIntoWall": "%1$s experienced kinetic energy",
  
  "death.attack.flyIntoWall.player": "%1$s experienced kinetic energy whilst trying to escape %2$s",
 
  "death.attack.freeze": "%1$s froze to death",
 
  "death.attack.freeze.player": "%1$s was frozen to death by %2$s",
  
  "death.attack.generic": "%1$s died",
 
  "death.attack.genericKill": "%1$s was killed",
 
  "death.attack.genericKill.player": "%1$s was killed whilst fighting %2$s",
  
  "death.attack.generic.player": "%1$s died because of %2$s",
  
  "death.attack.hotFloor": "%1$s discovered the floor was lava",
  
  "death.attack.hotFloor.player": "%1$s walked into the danger zone due to %2$s",
 
  "death.attack.indirectMagic": "%1$s was killed by %2$s using magic",
 
  "death.attack.indirectMagic.item": "%1$s was killed by %2$s using %3$s",
  
  "death.attack.inFire": "%1$s went up in flames",
 
  "death.attack.inFire.player": "%1$s walked into fire whilst fighting %2$s",
  
  "death.attack.inWall": "%1$s suffocated in a wall",
  
  "death.attack.inWall.player": "%1$s suffocated in a wall whilst fighting %2$s",
  
  "death.attack.lava": "%1$s tried to swim in lava",
  
  "death.attack.lava.player": "%1$s tried to swim in lava to escape %2$s",
  
  "death.attack.lightningBolt": "%1$s was struck by lightning",
 
  "death.attack.lightningBolt.player": "%1$s was struck by lightning whilst fighting %2$s",
 
  "death.attack.magic": "%1$s was killed by magic",
 
  "death.attack.magic.player": "%1$s was killed by magic whilst trying to escape %2$s",
  
  "death.attack.message_too_long": "Actually, the message was too long to deliver fully. Sorry! Here's stripped version: %s",
  
  "death.attack.mob": "%1$s was slain by %2$s",
  
  "death.attack.mob.item": "%1$s was slain by %2$s using %3$s",
  
  "death.attack.onFire": "%1$s burned to death",
  
  "death.attack.onFire.item": "%1$s was burnt to a crisp whilst fighting %2$s wielding %3$s",
  
  "death.attack.onFire.player": "%1$s was burnt to a crisp whilst fighting %2$s",
  
  "death.attack.outsideBorder": "%1$s left the confines of this world",
  
  "death.attack.outsideBorder.player": "%1$s left the confines of this world whilst fighting %2$s",
  
  "death.attack.outOfWorld": "%1$s fell out of the world",
  
  "death.attack.outOfWorld.player": "%1$s didn't want to live in the same world as %2$s",
 
  "death.attack.player": "%1$s was slain by %2$s",
  
  "death.attack.player.item": "%1$s was slain by %2$s using %3$s",
  
  "death.attack.sonic_boom": "%1$s was obliterated by a sonically-charged shriek",
  
  "death.attack.sonic_boom.item": "%1$s was obliterated by a sonically-charged shriek whilst trying to escape %2$s wielding %3$s",
 
  "death.attack.sonic_boom.player": "%1$s was obliterated by a sonically-charged shriek whilst trying to escape %2$s",
  
  "death.attack.stalagmite": "%1$s was impaled on a stalagmite",
 
  "death.attack.stalagmite.player": "%1$s was impaled on a stalagmite whilst fighting %2$s",
 
  "death.attack.starve": "%1$s starved to death",
  
  "death.attack.starve.player": "%1$s starved to death whilst fighting %2$s",
  
  "death.attack.sting": "%1$s was stung to death",
  
  "death.attack.sting.item": "%1$s was stung to death by %2$s using %3$s",
  
  "death.attack.sting.player": "%1$s was stung to death by %2$s",
 
  "death.attack.sweetBerryBush": "%1$s was poked to death by a sweet berry bush",
 
  "death.attack.sweetBerryBush.player": "%1$s was poked to death by a sweet berry bush whilst trying to escape %2$s",
  
  "death.attack.thorns": "%1$s was killed trying to hurt %2$s",
 
  "death.attack.thorns.item": "%1$s was killed by %3$s trying to hurt %2$s",
 
  "death.attack.thrown": "%1$s was pummeled by %2$s",
 
  "death.attack.thrown.item": "%1$s was pummeled by %2$s using %3$s",
  
  "death.attack.trident": "%1$s was impaled by %2$s",
  
  "death.attack.trident.item": "%1$s was impaled by %2$s with %3$s",
  
  "death.attack.wither": "%1$s withered away",
 
  "death.attack.wither.player": "%1$s withered away whilst fighting %2$s",
 
  "death.attack.witherSkull": "%1$s was shot by a skull from %2$s",
 
  "death.attack.witherSkull.item": "%1$s was shot by a skull from %2$s using %3$s",
 
  "death.fell.accident.generic": "%1$s fell from a high place",
 
  "death.fell.accident.ladder": "%1$s fell off a ladder",
 
  "death.fell.accident.other_climbable": "%1$s fell while climbing",
 
  "death.fell.accident.scaffolding": "%1$s fell off scaffolding",
 
  "death.fell.accident.twisting_vines": "%1$s fell off some twisting vines",
  
  "death.fell.accident.vines": "%1$s fell off some vines",
  
  "death.fell.accident.weeping_vines": "%1$s fell off some weeping vines",
 
  "death.fell.assist": "%1$s was doomed to fall by %2$s",

  "death.fell.assist.item": "%1$s was doomed to fall by %2$s using %3$s",
  
  "death.fell.finish": "%1$s fell too far and was finished by %2$s",
 
  "death.fell.finish.item": "%1$s fell too far and was finished by %2$s using %3$s",
 
  "death.fell.killer": "%1$s was doomed to fall"
```
</details>

