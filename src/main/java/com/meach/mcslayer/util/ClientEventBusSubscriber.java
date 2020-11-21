package com.meach.mcslayer.util;

import com.meach.mcslayer.client.entity.render.CaveHorrorEntityRender;
import com.meach.mcslayer.mcslayer;
import com.meach.mcslayer.setup.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = mcslayer.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clinetSetup(FMLClientSetupEvent event){
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CAVE_HORROR.get(), new CaveHorrorEntityRender.RenderFactor());

    }
}
