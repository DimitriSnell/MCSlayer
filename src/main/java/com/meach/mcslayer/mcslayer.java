//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.meach.mcslayer;

import com.meach.mcslayer.Entity.CaveHorror;
import com.meach.mcslayer.capabilities.PlayerPropertyEvents;
import com.meach.mcslayer.capabilities.PlayerSlayer;
import com.meach.mcslayer.capabilities.SlayerStorage;
import com.meach.mcslayer.setup.ModEntityTypes;
import com.meach.mcslayer.setup.Registration;
import java.util.stream.Collectors;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mcslayer")
public class mcslayer {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mcslayer";

    public mcslayer() {

        Registration.register();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);


    }

    private void setup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(FMLClientSetupEvent event) {
        LOGGER.info("Got game settings {}", ((Minecraft)event.getMinecraftSupplier().get()).gameSettings);
        DeferredWorkQueue.runLater(()->{
            GlobalEntityTypeAttributes.put(ModEntityTypes.CAVE_HORROR.get(), CaveHorror.setCustomAttributes().func_233813_a_());
        });
    }

    private void enqueueIMC(InterModEnqueueEvent event) {
        InterModComms.sendTo("examplemod", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(InterModProcessEvent event) {
        LOGGER.info("Got IMC {}", event.getIMCStream().map((m) -> {
            return m.getMessageSupplier().get();
        }).collect(Collectors.toList()));
    }


    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent e) {

        CapabilityManager.INSTANCE.register(PlayerSlayer.class,new SlayerStorage(), ()->null);
    }
}
