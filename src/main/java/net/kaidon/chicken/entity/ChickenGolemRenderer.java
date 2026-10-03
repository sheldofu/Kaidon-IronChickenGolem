package net.kaidon.chicken.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.IronGolemEntityRenderer;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.util.Identifier;

public class ChickenGolemRenderer extends IronGolemEntityRenderer {
    private static final Identifier TEXTURE = Identifier.of("kaidon-iron-chicken-golem", "textures/entity/chicken_golem.png");

    public ChickenGolemRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(IronGolemEntity entity) {
        return TEXTURE;
    }
}
