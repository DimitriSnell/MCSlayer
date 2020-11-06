package com.meach.mcslayer.capabilities;

import com.meach.mcslayer.Slayer.SlayerTask;

public interface IPlayerSlayer {
    public SlayerTask getCurrentTask();
    public void SetCurrentTask(SlayerTask newTask);
}
