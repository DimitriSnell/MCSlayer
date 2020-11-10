package com.meach.mcslayer.events;

import com.meach.mcslayer.Slayer.SlayerTask;
import com.meach.mcslayer.capabilities.PlayerProperties;
import com.meach.mcslayer.capabilities.PlayerSlayer;
import com.meach.mcslayer.mcslayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.ParameterizedType;

@Mod.EventBusSubscriber(modid = mcslayer.MOD_ID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SlayerEvents {
    @SubscribeEvent
    public static void SlayerKillEvent(LivingDeathEvent event) {
        if (event.getSource().getTrueSource() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)(event.getSource().getTrueSource());
            LazyOptional<PlayerSlayer> holder = player.getCapability(PlayerProperties.PLAYER_SLAYER, null);
            if (holder.isPresent()) {
                try {
                    PlayerSlayer st = holder.orElseThrow(()-> new Exception("pointless"));
                    SlayerTask task = st.getCurrentTask();
                    Class<? extends Entity> entity = task.getTaskType();
                    if(event.getEntity().getClass() == entity){
                        task.setTaskNum(task.getTaskNum() - 1);
                        if(task.getTaskNum() < 1){
                            st.SetCurrentTask(null);
                            player.sendMessage(new StringTextComponent("Congratulations! Your Task is complete"), player.getGameProfile().getId());
                        }

                        st.CalcXpForKill(40);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
