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
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.IReorderingProcessor;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraftforge.common.util.LazyOptional;

import java.util.ArrayList;
import java.util.List;


public class SlayerJournalGui extends Screen{

    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(mcslayer.MOD_ID,
            "textures/guis/d5qld50-4b77b07b-aae6-4a0b-883c-5fa3a60be7a4.png");
    private FontRenderer fr;
    private SlayerJournalItem Journal;
    private PlayerEntity player;
    private PlayerSlayer ps;
    private ArrayList<Button> buttonlist = new ArrayList<Button>();
    private Button b2;
    private Button b;

    public SlayerJournalGui(ITextComponent titleIn, SlayerJournalItem INJournal, PlayerEntity playerIn) {
        super(titleIn);
        player = playerIn;
        Journal = INJournal;
        LazyOptional<PlayerSlayer> holder = player.getCapability(PlayerProperties.PLAYER_SLAYER, null);

        if (holder.isPresent()) {
            try {
                PlayerSlayer st = holder.orElseThrow(() -> new Exception("pointless"));
                ps = st;
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void func_231160_c_(){
        super.func_231160_c_();

        int x = (this.field_230708_k_-271)/2;
        int y = (this.field_230709_l_-180)/2;
        b = new Button(x + 15, y + 60, 100, 20, new StringTextComponent("New Task"), (button) -> {
            Journal.generateTask(player);



        });
        b2 = new Button(x + 15, y + 60, 100, 20, new StringTextComponent("Cancel Task"), (button) -> {
            Journal.cancelTask(player);


        });

        func_230480_a_(b);
        func_230480_a_(b2);

    }

    @Override
    public void func_230430_a_(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {

        int x = (this.field_230708_k_-271)/2;
        int y = (this.field_230709_l_-180)/2;
        if(ps.getCurrentTask() == null) {
            b.field_230694_p_ = true;
            b2.field_230694_p_ = false;
        }else{
            b2.field_230694_p_ = true;
            b.field_230694_p_ = false;
        }

        this.func_230446_a_(p_230430_1_);
        Minecraft.getInstance().getTextureManager().bindTexture(BACKGROUND_TEXTURE);

        RenderSystem.color4f(1,1,1,1);
        func_238463_a_(p_230430_1_,x,y,0F,0F,271,180,271,180);

        for(Widget w : this.field_230710_m_){
            w.func_230430_a_(p_230430_1_,p_230430_2_,p_230430_3_,p_230430_4_);
        }

        fr = Minecraft.getInstance().fontRenderer;
        fr.func_238421_b_(p_230430_1_, "SLAYER JOURNAL", x+34, y+10, 0);
        fr.func_238421_b_(p_230430_1_, "CURRENT TASK:", x+15, y+30, 0);

        if(ps.getCurrentTask() == null){
            fr.func_238421_b_(p_230430_1_, "NONE", x+15, y+40, 0);
        }else{
            fr.func_238421_b_(p_230430_1_, ps.getCurrentTask().toString() , x+15, y+40, 0);

        }

    }



}
