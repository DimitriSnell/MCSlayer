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
    private HashMap<Class<? extends Entity>,Integer> EntityListTaskNum;
    private HashMap<Class<? extends Entity>,String> EntityListName;
    public SlayerTask(){
        EntityListWeight = new HashMap<Class<? extends Entity>,Float>();
        EntityListProbability = new HashMap<Class<? extends Entity>,Float>();
        EntityListTaskNum = new HashMap<Class<? extends Entity>,Integer>();
        EntityListName = new HashMap<Class<? extends Entity>,String>();

        EntityListWeight.put(CreeperEntity.class,10F);
        EntityListName.put(CreeperEntity.class,"Creeper");
        EntityListWeight.put(SpiderEntity.class,10F);
        EntityListName.put(SpiderEntity.class,"Spider");
        EntityListWeight.put(ZombieEntity.class,10F);
        EntityListName.put(ZombieEntity.class,"Zombie");
        EntityListWeight.put(BlazeEntity.class,5F);
        EntityListName.put(BlazeEntity.class,"Blaze");
        EntityListWeight.put(GhastEntity.class,3F);
        EntityListName.put(GhastEntity.class,"Ghast");
        EntityListWeight.put(CaveSpiderEntity.class,3F);
        EntityListName.put(CaveSpiderEntity.class,"Cave Spider");
        EntityListWeight.put(SlimeEntity.class,3F);
        EntityListName.put(SlimeEntity.class,"Slime");
        EntityListWeight.put(DrownedEntity.class,2F);
        EntityListName.put(DrownedEntity.class,"Drowned");
        EntityListWeight.put(GuardianEntity.class,2F);
        EntityListName.put(GuardianEntity.class,"Guardian");
        EntityListWeight.put(WitherSkeletonEntity.class,3F);
        EntityListName.put(WitherSkeletonEntity.class,"Wither");
        EntityListWeight.put(SilverfishEntity.class,1F);
        EntityListName.put(SilverfishEntity.class,"Silver Fish");
        EntityListWeight.put(SkeletonEntity.class,15F);
        EntityListName.put(SkeletonEntity.class,"Skeleton");
        EntityListWeight.put(HoglinEntity.class,3F);
        EntityListName.put(HoglinEntity.class,"Hoglin");
        EntityListWeight.put(MagmaCubeEntity.class,3F);
        EntityListName.put(MagmaCubeEntity.class,"Magma Cube");

        float allTaskWeights =0;
        for(Map.Entry<Class<? extends Entity>,Float> entry : this.EntityListWeight.entrySet()){
            allTaskWeights += entry.getValue();
        }
        for(Map.Entry<Class<? extends Entity>,Float> entry : this.EntityListWeight.entrySet()){
            float p = entry.getValue()/allTaskWeights;
            EntityListProbability.put(entry.getKey(), p);
        }
        InitTaskNums();
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
        double p2 = Math.random();
        System.out.println(TaskType.toString());
        TaskNum = (int)(EntityListTaskNum.get(TaskType) * p2);
        TaskNum += (EntityListTaskNum.get(TaskType)/3);
    }
    public void InitTaskNums(){
        for(Map.Entry<Class<? extends Entity>,Float> entry : this.EntityListWeight.entrySet()){
            if(entry.getKey() == SlimeEntity.class){
                EntityListTaskNum.put(entry.getKey(), (int)(entry.getValue()*5));
            }else if(entry.getKey() == SilverfishEntity.class){
                EntityListTaskNum.put(entry.getKey(), (int)(entry.getValue()*5));
            }else{
                EntityListTaskNum.put(entry.getKey(), (int)(entry.getValue()*1));
            }
        }
    }

    @Override
    public String toString(){
        String name = EntityListName.get(TaskType);
        return String.format("Kill " + TaskNum + " " + name + "s");
    }

    public Class<? extends Entity> getTaskType(){return TaskType;}

    public int getTaskNum(){return TaskNum;}
    public void setTaskNum(int input){TaskNum = input;}
}
