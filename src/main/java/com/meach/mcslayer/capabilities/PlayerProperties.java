package com.meach.mcslayer.capabilities;

import com.ibm.icu.impl.IllegalIcuArgumentException;
import net.minecraft.command.arguments.NBTTagArgument;
import net.minecraft.entity.player.PlayerEntity;
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
    //public static LazyOptional<PlayerSlayer> getPlayerSlayer(PlayerEntity player){return player.getCapability(PLAYER_SLAYER,null);}
    //private PlayerSlayer playerSlayer  = new PlayerSlayer();
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
