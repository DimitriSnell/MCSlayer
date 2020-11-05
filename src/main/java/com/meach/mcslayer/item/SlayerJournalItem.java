//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.meach.mcslayer.item;

import java.util.List;

import com.meach.mcslayer.Slayer.SlayerTask;
import com.meach.mcslayer.client.gui.SlayerJournalGui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftGame;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.world.World;

public class SlayerJournalItem extends Item {
    private SlayerTask CurrentTask = null;

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
        if(worldIn.isRemote) {
            Minecraft.getInstance().displayGuiScreen(new SlayerJournalGui(new StringTextComponent("test"), this));
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public SlayerTask GetCurrentTask(){ return CurrentTask;}
}
