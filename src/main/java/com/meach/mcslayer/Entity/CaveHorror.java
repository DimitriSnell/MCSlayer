package com.meach.mcslayer.Entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class CaveHorror extends MonsterEntity {
    public CaveHorror(EntityType<? extends MonsterEntity> type, World worldIn) {
        super(type, worldIn);
    }
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_().func_233815_a_(Attributes.field_233818_a_, (double)0.5F).func_233815_a_(Attributes.field_233818_a_, 20.0D).func_233815_a_(Attributes.field_233823_f_, 5.0D);
    }
}
