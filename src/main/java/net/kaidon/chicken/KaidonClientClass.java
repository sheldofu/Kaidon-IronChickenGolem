package net.kaidon.chicken;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.kaidon.chicken.entity.ModEntities;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class KaidonClientClass implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.PINK_GARNET_PROJECTILE, FlyingItemEntityRenderer::new);
    }
}
