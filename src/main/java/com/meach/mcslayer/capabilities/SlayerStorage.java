package com.meach.mcslayer.capabilities;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.event.world.NoteBlockEvent;

public class SlayerStorage implements Capability.IStorage<PlayerSlayer> {

    @Override
    public INBT writeNBT(Capability<PlayerSlayer> capability, PlayerSlayer instance, Direction side) {
        CompoundNBT tag = new CompoundNBT();
        //tag.put("SlayerTask", );
        System.out.println("testing written to nbt");
        return tag;
    }

    @Override
    public void readNBT(Capability<PlayerSlayer> capability, PlayerSlayer instance, Direction side, INBT nbt) {

    }
}
