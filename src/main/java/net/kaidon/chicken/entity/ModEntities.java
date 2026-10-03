package net.kaidon.chicken.entity;

import net.kaidon.chicken.KaidonIronChickenGolem;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
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
    public static final EntityType<ChickenGolemEntity> CHICKEN_GOLEM = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(KaidonIronChickenGolem.MOD_ID, "chicken_golem"),
            EntityType.Builder.<ChickenGolemEntity>create(ChickenGolemEntity::new, SpawnGroup.MISC)
                    .dimensions(1.4F, 2.7F)
                    .maxTrackingRange(10)
                    .trackingTickInterval(3)
                    .build()
    );

    private ModEntities() {}

    public static void registerModEntities() {
        KaidonIronChickenGolem.LOGGER.info("Registering Mod Entities for " + KaidonIronChickenGolem.MOD_ID);
        FabricDefaultAttributeRegistry.register(CHICKEN_GOLEM, ChickenGolemEntity.createIronGolemAttributes());
    }
}
