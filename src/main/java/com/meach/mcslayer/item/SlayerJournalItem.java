//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.meach.mcslayer.item;

import java.util.List;

import com.meach.mcslayer.Slayer.SlayerTask;
import com.meach.mcslayer.capabilities.PlayerProperties;
import com.meach.mcslayer.capabilities.PlayerSlayer;
import com.meach.mcslayer.client.gui.SlayerJournalGui;
import com.meach.mcslayer.setup.Sounds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.util.LazyOptional;

import javax.swing.*;

public class SlayerJournalItem extends Item {
    private SlayerTask CurrentTask = null;
    private int CurrentTaskNum;
    public SlayerJournalItem(Properties properties) {
        super(properties);
    }

    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("test info"));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        worldIn.playSound(playerIn,new BlockPos(playerIn.getPositionVec()), Sounds.BOOKOPEN.get(), SoundCategory.NEUTRAL,1.0f,1.0f);
        if(worldIn.isRemote) {
            Minecraft.getInstance().displayGuiScreen(new SlayerJournalGui(new StringTextComponent("test"), this, playerIn));
        }

        return new ActionResult<ItemStack>(ActionResultType.SUCCESS,item);
    }

    public void generateTask(PlayerEntity playerIn){
        LazyOptional<PlayerSlayer> holder = playerIn.getCapability(PlayerProperties.PLAYER_SLAYER,null);

        if(holder.isPresent()){
            try {
                PlayerSlayer st = holder.orElseThrow(()-> new Exception("pointless"));
                st.SetCurrentTask(new SlayerTask());
                st.getCurrentTask().InitTask();
                playerIn.sendMessage(new StringTextComponent("You have been assigned the task: " + st.getCurrentTask().toString()),playerIn.getGameProfile().getId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public SlayerTask GetCurrentTask(){ return CurrentTask;}
}
