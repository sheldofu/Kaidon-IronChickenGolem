package net.kaidon.chicken.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.world.World;

public class ChickenGolemEntity extends IronGolemEntity {
    public ChickenGolemEntity(EntityType<? extends ChickenGolemEntity> entityType, World world) {
        super(entityType, world);
    }
}
