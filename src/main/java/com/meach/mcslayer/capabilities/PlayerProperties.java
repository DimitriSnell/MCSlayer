package com.meach.mcslayer.capabilities;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

public class PlayerProperties implements ICapabilitySerializable<INBT> {
    @CapabilityInject(PlayerSlayer.class)

    public static Capability<PlayerSlayer> PLAYER_SLAYER = null;
    private static final LazyOptional<PlayerSlayer> holder = LazyOptional.of(PlayerSlayer::new);

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        return cap == PLAYER_SLAYER ? holder.cast() : LazyOptional.empty();
    }

    @Override
    public INBT serializeNBT() {
        CompoundNBT tag = new CompoundNBT();
        return tag;
    }

    @Override
    public void deserializeNBT(INBT nbt) {

    }
}
