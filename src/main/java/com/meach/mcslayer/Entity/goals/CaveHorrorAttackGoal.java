package com.meach.mcslayer.Entity.goals;

import com.meach.mcslayer.Entity.CaveHorror;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.monster.ZombieEntity;

public class CaveHorrorAttackGoal extends MeleeAttackGoal {
    private final CaveHorror CaveHorror;
    private int raiseArmTicks;

    public CaveHorrorAttackGoal(CaveHorror creature, double speedIn, boolean useLongMemory) {
        super(creature, speedIn, useLongMemory);
        this.CaveHorror = creature;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting() {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask() {
        super.resetTask();
        this.CaveHorror.setAggroed(false);
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void tick() {
        super.tick();
        ++this.raiseArmTicks;
        if (this.raiseArmTicks >= 5 && this.func_234041_j_() < this.func_234042_k_() / 2) {
            this.CaveHorror.setAggroed(true);
        } else {
            this.CaveHorror.setAggroed(false);
        }

    }
}
