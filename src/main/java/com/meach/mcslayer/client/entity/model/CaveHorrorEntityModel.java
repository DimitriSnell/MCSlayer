package com.meach.mcslayer.client.entity.model;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.meach.mcslayer.Entity.CaveHorror;
import com.meach.mcslayer.mcslayer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CaveHorrorEntityModel<T extends CaveHorror> extends AnimatedGeoModel<CaveHorror> {

    @Override
    public ResourceLocation getModelLocation(CaveHorror caveHorror) {
        return new ResourceLocation(mcslayer.MOD_ID, "geo/cave_horror.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CaveHorror caveHorror) {
        return new ResourceLocation(mcslayer.MOD_ID, "textures/entity/cave_horror.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CaveHorror caveHorror) {
        return new ResourceLocation(mcslayer.MOD_ID, "animations/model.animation.json");
    }
}