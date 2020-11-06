package com.meach.mcslayer.client.gui;

import com.meach.mcslayer.Slayer.SlayerTask;
import com.meach.mcslayer.capabilities.PlayerProperties;
import com.meach.mcslayer.capabilities.PlayerSlayer;
import com.meach.mcslayer.item.SlayerJournalItem;
import com.meach.mcslayer.mcslayer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.LazyOptional;


public class SlayerJournalGui extends Screen{

    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(mcslayer.MOD_ID,
            "textures/guis/d5qld50-4b77b07b-aae6-4a0b-883c-5fa3a60be7a4.png");
    private FontRenderer fr;
    private SlayerJournalItem Journal;
    private PlayerEntity player;
    public SlayerJournalGui(ITextComponent titleIn, SlayerJournalItem INJournal, PlayerEntity playerIn){
        super(titleIn);
        player = playerIn;
        Journal = INJournal;
    }

    @Override
    public void func_230430_a_(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {

        int x = (this.field_230708_k_-271)/2;
        int y = (this.field_230709_l_-180)/2;

        this.func_230446_a_(p_230430_1_);
        //super.func_230430_a_(p_230430_1_, p_230430_2_, p_230430_3_, p_230430_4_);
        Minecraft.getInstance().getTextureManager().bindTexture(BACKGROUND_TEXTURE);

        RenderSystem.color4f(1,1,1,1);
        func_238463_a_(p_230430_1_,x,y,0F,0F,271,180,271,180);

        fr = Minecraft.getInstance().fontRenderer;
        fr.func_238421_b_(p_230430_1_, "SLAYER JOURNAL", x+15, y+10, 0);
        fr.func_238421_b_(p_230430_1_, "CURRENT TASK:", x+15, y+30, 0);
        LazyOptional<PlayerSlayer> holder = player.getCapability(PlayerProperties.PLAYER_SLAYER,null);

        if(holder.isPresent()){
            try {
                PlayerSlayer st = holder.orElseThrow(()-> new Exception("pointless"));
                if(st.getCurrentTask() == null){
                    fr.func_238421_b_(p_230430_1_, "NONE", x+15, y+40, 0);
                }else{
                    fr.func_238421_b_(p_230430_1_, st.getCurrentTask().getTaskType().toString(), x+15, y+40, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


}
