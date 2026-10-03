package net.kaidon.chicken.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.EvokerFangsEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class TsuSwordItem extends SwordItem {
    public TsuSwordItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean hit = super.postHit(stack, target, attacker);
        World world = target.getWorld();
        if (!world.isClient) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), attacker);

            float yaw = (float) (MathHelper.atan2(target.getZ() - attacker.getZ(), target.getX() - attacker.getX()) * (180.0 / Math.PI)) - 90.0F;
            EvokerFangsEntity fangs = new EvokerFangsEntity(world, target.getX(), target.getY(), target.getZ(), yaw, 0, attacker);
            world.spawnEntity(fangs);
        }
        return hit;
    }
}
