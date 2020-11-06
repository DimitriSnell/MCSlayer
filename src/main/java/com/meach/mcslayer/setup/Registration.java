//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.meach.mcslayer.setup;

import com.meach.mcslayer.capabilities.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS;
    public static final DeferredRegister<Item> ITEMS;

    public Registration() {
    }

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(new PlayerPropertyEvents());
        ModItems.register();
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "mcslayer");
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "mcslayer");
    }
}
