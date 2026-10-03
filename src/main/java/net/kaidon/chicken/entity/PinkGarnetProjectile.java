package net.kaidon.chicken.entity;

import net.kaidon.chicken.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class PinkGarnetProjectile extends ThrownItemEntity {
    public PinkGarnetProjectile(EntityType<? extends PinkGarnetProjectile> entityType, World world) {
        super(entityType, world);
    }

    public PinkGarnetProjectile(EntityType<? extends PinkGarnetProjectile> entityType, LivingEntity owner, World world) {
        super(entityType, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.RAW_PINK_GARNET;
    }

    @Override
    protected void onEntityHit(EntityHitResult hit) {
        super.onEntityHit(hit);
        if (!getWorld().isClient && hit.getEntity() instanceof LivingEntity livingEntity) {
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0));
        }
    }
}
