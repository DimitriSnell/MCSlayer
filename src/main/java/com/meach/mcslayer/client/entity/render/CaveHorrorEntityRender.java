package com.meach.mcslayer.client.entity.render;

import com.meach.mcslayer.Entity.CaveHorror;
import com.meach.mcslayer.client.entity.model.CaveHorrorEntityModel;
import com.meach.mcslayer.mcslayer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CaveHorrorEntityRender extends GeoEntityRenderer<CaveHorror> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(mcslayer.MOD_ID,"textures/entity/cave_horror.png");

    public CaveHorrorEntityRender(EntityRendererManager renderManagerIn, CaveHorrorEntityModel<CaveHorror> entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, new CaveHorrorEntityModel<>());
    }

    @Override
    public ResourceLocation getEntityTexture(CaveHorror entity) {
        return TEXTURE;
    }

    public static class RenderFactor implements IRenderFactory<CaveHorror>{


        @Override
        public EntityRenderer<? super CaveHorror> createRenderFor(EntityRendererManager manager) {
            return new CaveHorrorEntityRender(manager,new CaveHorrorEntityModel<>(),.7f);
        }
    }
}
