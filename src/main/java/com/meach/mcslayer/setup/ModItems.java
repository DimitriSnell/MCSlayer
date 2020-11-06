//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.meach.mcslayer.setup;

import com.meach.mcslayer.capabilities.PlayerSlayer;
import com.meach.mcslayer.capabilities.SlayerStorage;
import com.meach.mcslayer.item.SlayerJournalItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> SLAYER_JOURNAL;

    public ModItems() {
    }

    static void register() {
    }

    static {
        SLAYER_JOURNAL = Registration.ITEMS.register("slayer_journal", () -> {
            return new SlayerJournalItem((new Properties()).group(ItemGroup.MISC).maxStackSize(1));
        });

    }
}
