package com.meach.mcslayer.setup;

import com.meach.mcslayer.item.SlayerJournalItem;
import com.meach.mcslayer.mcslayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Sounds{
   public static final RegistryObject<SoundEvent> BOOKOPEN;

    public Sounds() {
    }

    static void register() {
    }

    static {
        BOOKOPEN = Registration.SOUNDS.register("item.slayer_journal.open", () -> {
            return new SoundEvent((new ResourceLocation(mcslayer.MOD_ID,"item.slayer_journal.open")));
        });

    }
}
