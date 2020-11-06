package com.meach.mcslayer.capabilities;

import com.meach.mcslayer.Slayer.SlayerTask;

public class PlayerSlayer implements IPlayerSlayer{
    private SlayerTask CurrentTask;

    public PlayerSlayer(){

    }
    public SlayerTask getCurrentTask(){return this.CurrentTask;}
    public void SetCurrentTask(SlayerTask newTask){ CurrentTask = newTask;}
}
