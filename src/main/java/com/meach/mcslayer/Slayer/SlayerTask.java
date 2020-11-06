package com.meach.mcslayer.Slayer;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.PlayerEntity;
import java.util.HashMap;
import java.util.Map;


public class SlayerTask {
    private Class<? extends Entity> TaskType;
    private int TaskNum;
    private String TaskTitle;
    private PlayerEntity Player;
    private HashMap<Class<? extends Entity>,Float> EntityListWeight;
    private HashMap<Class<? extends Entity>,Float> EntityListProbability;

    public SlayerTask(){
        EntityListWeight = new HashMap<Class<? extends Entity>,Float>();
        EntityListProbability = new HashMap<Class<? extends Entity>,Float>();
        EntityListWeight.put(CreeperEntity.class,10F);
        EntityListWeight.put(SpiderEntity.class,10F);
        EntityListWeight.put(ZombieEntity.class,10F);
        EntityListWeight.put(BlazeEntity.class,5F);
        EntityListWeight.put(GhastEntity.class,3F);
        EntityListWeight.put(CaveSpiderEntity.class,3F);
        EntityListWeight.put(SlimeEntity.class,3F);

        float allTaskWeights =0;
        for(Map.Entry<Class<? extends Entity>,Float> entry : this.EntityListWeight.entrySet()){
            allTaskWeights += entry.getValue();
        }
        for(Map.Entry<Class<? extends Entity>,Float> entry : this.EntityListWeight.entrySet()){
            float p = entry.getValue()/allTaskWeights;
            EntityListProbability.put(entry.getKey(), p);
        }
    }

    public void InitTask(){
        double p = Math.random();
        double cumulativeProbability = 0.0;
        for(Map.Entry<Class<? extends Entity>,Float> entry : this.EntityListProbability.entrySet()){
            cumulativeProbability += entry.getValue();
            if(p<=cumulativeProbability){
                TaskType = entry.getKey();
                break;
            }
        }

    }

    public Class<? extends Entity> getTaskType(){return TaskType;}

}
