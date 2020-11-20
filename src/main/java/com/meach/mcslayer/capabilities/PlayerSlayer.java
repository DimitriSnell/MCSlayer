package com.meach.mcslayer.capabilities;

import com.meach.mcslayer.Slayer.SlayerTask;

public class PlayerSlayer implements IPlayerSlayer{
    private SlayerTask CurrentTask;

    private int SlayerLevel = 0;
    private double CurrentXp = 0;
    private double XpToNextLevel = 0;
    private int SlayerPoints = 0;
    private int SlayerStreak = 0;
    private final int LEVEL_CAP = 99;

    public PlayerSlayer(){
        SlayerLevel = 1;
        CurrentXp = 0;
        XpToNextLevel = CalcXpToNextLevel(SlayerLevel) + 1;
    }
    public SlayerTask getCurrentTask(){return this.CurrentTask;}
    public void SetCurrentTask(SlayerTask newTask){ CurrentTask = newTask;}


    public double CalcXpToNextLevel(int level){
        double result = (double)(level);
        double level2 = (double)(level);
        result =  1/8 * (level2 * (level2-1));
        result += 75  * (((Math.pow(2,((level2-1)/7))))- 1)/(1-0.90572366426);
        return result;
    }
    public void CalcXpForKill(int health){
        CurrentXp += (10 * health);
        if(SlayerLevel == LEVEL_CAP){
            XpToNextLevel = CurrentXp;
        }
        else {
            while (CurrentXp > XpToNextLevel) {
                CurrentXp -= XpToNextLevel;
                SlayerLevel += 1;
                XpToNextLevel = CalcXpToNextLevel(SlayerLevel);
            }
        }
    }

    public int getSlayerLevel() {
        return SlayerLevel;
    }

    public double getCurrentXp() {
        return CurrentXp;
    }

    public double getXpToNextLevel() {
        return XpToNextLevel;
    }

    public int getSlayerPoints() {
        return SlayerPoints;
    }

    public void setSlayerPoints(int slayerPoints) {
        SlayerPoints = slayerPoints;
    }

    public int getSlayerStreak() {
        return SlayerStreak;
    }

    public void setSlayerStreak(int slayerStreak) {
        SlayerStreak = slayerStreak;
    }

    public int CalcPointsPerTask(){
        int result = 12;
        if(SlayerStreak % 10 == 0){
            result = 60;
        }
        if(SlayerStreak % 50 == 0){
            result = 180;
        }
        if(SlayerStreak % 100 == 0){
            result = 300;
        }
        if(SlayerStreak % 250 == 0){
            result = 420;
        }
        if(SlayerStreak % 1000 == 0){
            result = 600;
        }
        return result;
    }
}
