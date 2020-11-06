package com.meach.mcslayer.capabilities;

import com.meach.mcslayer.mcslayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PlayerPropertyEvents {
    public static PlayerPropertyEvents instance = new PlayerPropertyEvents();

    @SubscribeEvent
    public void onEntityConstruction(AttachCapabilitiesEvent<Entity> event){
        if(event.getObject() instanceof PlayerEntity){
            event.addCapability(new ResourceLocation(mcslayer.MOD_ID, "capabilities"), new PlayerProperties());
        }

    }
}
