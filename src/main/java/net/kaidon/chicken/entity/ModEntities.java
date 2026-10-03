package net.kaidon.chicken.entity;

import net.kaidon.chicken.KaidonIronChickenGolem;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ModEntities {
    public static final EntityType<PinkGarnetProjectile> PINK_GARNET_PROJECTILE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(KaidonIronChickenGolem.MOD_ID, "pink_garnet_projectile"),
            EntityType.Builder.<PinkGarnetProjectile>create(PinkGarnetProjectile::new, SpawnGroup.MISC)
                    .dimensions(0.25F, 0.25F)
                    .maxTrackingRange(4)
                    .trackingTickInterval(10)
                    .build()
    );

    private ModEntities() {}

    public static void registerModEntities() {
        KaidonIronChickenGolem.LOGGER.info("Registering Mod Entities for " + KaidonIronChickenGolem.MOD_ID);
    }
}
