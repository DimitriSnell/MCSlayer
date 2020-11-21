package com.meach.mcslayer.setup;

import com.meach.mcslayer.Entity.CaveHorror;
import com.meach.mcslayer.mcslayer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, mcslayer.MOD_ID);
    public static final RegistryObject<EntityType<CaveHorror>> CAVE_HORROR = ENTITY_TYPES.register("cave_horror",
            ()->EntityType.Builder.<CaveHorror>create(CaveHorror::new, EntityClassification.CREATURE).size(1.0f,1.0f).build(
                    String.valueOf(new ResourceLocation(mcslayer.MOD_ID, "cave_horror"))
    ));
}
