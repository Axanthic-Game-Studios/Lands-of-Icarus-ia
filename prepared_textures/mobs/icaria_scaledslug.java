package icaria;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * icaria_scaledslug - Shado47
 * Created using Tabula 7.0.0
 */
public class icaria_scaledslug extends ModelBase {
    public ModelRenderer neck;
    public ModelRenderer head;
    public ModelRenderer tail;
    public ModelRenderer rearbody;
    public ModelRenderer mainbody;
    public ModelRenderer rearneck;
    public ModelRenderer feelerbottomright;
    public ModelRenderer feelerbottomleft;
    public ModelRenderer feelertopright;
    public ModelRenderer feelertopleft;
    public ModelRenderer head_1;
    public ModelRenderer eyeright;
    public ModelRenderer eyeleft;
    public ModelRenderer scale;
    public ModelRenderer scale_1;
    public ModelRenderer scale_2;
    public ModelRenderer scale_3;
    public ModelRenderer scale_4;
    public ModelRenderer scale_5;
    public ModelRenderer scale_6;
    public ModelRenderer scale_7;
    public ModelRenderer scale_8;
    public ModelRenderer scale_9;
    public ModelRenderer scale_10;
    public ModelRenderer scale_11;
    public ModelRenderer scale_12;
    public ModelRenderer scale_13;
    public ModelRenderer scale_14;
    public ModelRenderer scale_15;
    public ModelRenderer scale_16;
    public ModelRenderer scale_17;
    public ModelRenderer scale_18;
    public ModelRenderer scale_19;
    public ModelRenderer scale_20;
    public ModelRenderer scale_21;
    public ModelRenderer scale_22;
    public ModelRenderer scale_23;
    public ModelRenderer scale_24;
    public ModelRenderer scale_25;
    public ModelRenderer scale_26;
    public ModelRenderer scale_27;
    public ModelRenderer scale_28;
    public ModelRenderer scale_29;
    public ModelRenderer scale_30;
    public ModelRenderer backscales;
    public ModelRenderer backscales_1;
    public ModelRenderer backscales_2;
    public ModelRenderer backscales_3;
    public ModelRenderer backscales_4;
    public ModelRenderer backscales_5;
    public ModelRenderer backscales_6;
    public ModelRenderer backscales_7;
    public ModelRenderer scale_31;
    public ModelRenderer scale_32;
    public ModelRenderer scale_33;
    public ModelRenderer scale_34;
    public ModelRenderer scale_35;
    public ModelRenderer scale_36;
    public ModelRenderer backscales_8;
    public ModelRenderer backscales_9;
    public ModelRenderer backscales_10;
    public ModelRenderer backscales_11;
    public ModelRenderer backscales_12;
    public ModelRenderer backscales_13;
    public ModelRenderer backscales_14;
    public ModelRenderer scale_37;
    public ModelRenderer scale_38;
    public ModelRenderer scale_39;
    public ModelRenderer scale_40;
    public ModelRenderer scale_41;
    public ModelRenderer scale_42;
    public ModelRenderer backscales_15;
    public ModelRenderer backscales_16;
    public ModelRenderer backscales_17;
    public ModelRenderer backscales_18;
    public ModelRenderer backscales_19;
    public ModelRenderer backscales_20;
    public ModelRenderer backscales_21;
    public ModelRenderer backscales_22;
    public ModelRenderer backscales_23;

    public icaria_scaledslug() {
        this.textureWidth = 64;
        this.textureHeight = 48;
        this.scale_36 = new ModelRenderer(this, 30, 32);
        this.scale_36.setRotationPoint(-2.5F, 2.0F, 0.0F);
        this.scale_36.addBox(0.0F, 0.0F, 0.0F, 0, 2, 8, 0.0F);
        this.setRotateAngle(scale_36, 0.0F, 0.0F, 0.39269908169872414F);
        this.backscales_9 = new ModelRenderer(this, 8, 38);
        this.backscales_9.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.backscales_9.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_9, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales = new ModelRenderer(this, -2, 44);
        this.backscales.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backscales.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_1 = new ModelRenderer(this, 2, 45);
        this.scale_1.setRotationPoint(2.5F, 0.0F, 3.0F);
        this.scale_1.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_1, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_6 = new ModelRenderer(this, 12, 45);
        this.scale_6.setRotationPoint(2.5F, 0.5F, 2.5F);
        this.scale_6.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_6, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_15 = new ModelRenderer(this, 30, 45);
        this.scale_15.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.scale_15.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_15, 0.0F, 0.0F, 0.39269908169872414F);
        this.backscales_20 = new ModelRenderer(this, 9, 32);
        this.backscales_20.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.backscales_20.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 1, 0.0F);
        this.setRotateAngle(backscales_20, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales_17 = new ModelRenderer(this, 18, 32);
        this.backscales_17.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.backscales_17.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_17, 0.19634954084936207F, 0.0F, 0.0F);
        this.tail = new ModelRenderer(this, 20, 0);
        this.tail.setRotationPoint(0.0F, 21.3F, 11.0F);
        this.tail.addBox(-2.5F, 0.0F, 0.0F, 5, 3, 8, 0.0F);
        this.backscales_14 = new ModelRenderer(this, 19, 38);
        this.backscales_14.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.backscales_14.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 1, 0.0F);
        this.setRotateAngle(backscales_14, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales_15 = new ModelRenderer(this, -2, 32);
        this.backscales_15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backscales_15.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_15, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_28 = new ModelRenderer(this, 56, 45);
        this.scale_28.setRotationPoint(-2.5F, 1.0F, 4.0F);
        this.scale_28.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_28, 0.0F, 0.0F, 0.39269908169872414F);
        this.backscales_18 = new ModelRenderer(this, 28, 32);
        this.backscales_18.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.backscales_18.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_18, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales_12 = new ModelRenderer(this, -2, 38);
        this.backscales_12.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.backscales_12.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_12, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales_22 = new ModelRenderer(this, 4, 30);
        this.backscales_22.setRotationPoint(0.0F, -4.0F, -3.5F);
        this.backscales_22.addBox(-2.0F, 0.0F, 0.0F, 4, 0, 2, 0.0F);
        this.setRotateAngle(backscales_22, 0.39269908169872414F, 0.0F, 0.0F);
        this.feelerbottomleft = new ModelRenderer(this, 15, 0);
        this.feelerbottomleft.setRotationPoint(1.8F, -1.0F, -1.0F);
        this.feelerbottomleft.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(feelerbottomleft, -1.1780972450961724F, 0.0F, -0.39269908169872414F);
        this.scale_4 = new ModelRenderer(this, 8, 45);
        this.scale_4.setRotationPoint(2.5F, 0.0F, 7.5F);
        this.scale_4.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_4, 0.0F, 0.0F, -0.39269908169872414F);
        this.feelertopright = new ModelRenderer(this, 46, 16);
        this.feelertopright.setRotationPoint(-1.8F, -0.5F, -4.5F);
        this.feelertopright.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(feelertopright, -2.356194490192345F, 0.0F, 0.39269908169872414F);
        this.scale_5 = new ModelRenderer(this, 10, 45);
        this.scale_5.setRotationPoint(2.5F, 0.5F, 1.0F);
        this.scale_5.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_5, 0.0F, 0.0F, -0.39269908169872414F);
        this.backscales_10 = new ModelRenderer(this, 18, 38);
        this.backscales_10.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.backscales_10.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_10, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_27 = new ModelRenderer(this, 54, 45);
        this.scale_27.setRotationPoint(-2.5F, 1.0F, 2.5F);
        this.scale_27.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_27, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_39 = new ModelRenderer(this, 32, 30);
        this.scale_39.setRotationPoint(2.5F, 2.0F, 6.0F);
        this.scale_39.addBox(0.0F, 0.0F, -4.0F, 0, 2, 6, 0.0F);
        this.setRotateAngle(scale_39, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_21 = new ModelRenderer(this, 42, 45);
        this.scale_21.setRotationPoint(-2.5F, 0.5F, 0.5F);
        this.scale_21.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_21, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_16 = new ModelRenderer(this, 32, 45);
        this.scale_16.setRotationPoint(-2.5F, 0.0F, 1.5F);
        this.scale_16.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_16, 0.0F, 0.0F, 0.39269908169872414F);
        this.backscales_3 = new ModelRenderer(this, 28, 44);
        this.backscales_3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.backscales_3.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_3, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_32 = new ModelRenderer(this, 16, 35);
        this.scale_32.setRotationPoint(2.5F, 1.0F, 1.0F);
        this.scale_32.addBox(0.0F, 0.0F, 0.0F, 0, 2, 7, 0.0F);
        this.setRotateAngle(scale_32, 0.0F, 0.0F, -0.39269908169872414F);
        this.backscales_2 = new ModelRenderer(this, 18, 44);
        this.backscales_2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.backscales_2.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_2, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales_5 = new ModelRenderer(this, 8, 44);
        this.backscales_5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.backscales_5.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_5, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales_6 = new ModelRenderer(this, 18, 44);
        this.backscales_6.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.backscales_6.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_6, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_3 = new ModelRenderer(this, 6, 45);
        this.scale_3.setRotationPoint(2.5F, 0.0F, 6.0F);
        this.scale_3.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_3, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_26 = new ModelRenderer(this, 52, 45);
        this.scale_26.setRotationPoint(-2.5F, 1.0F, 1.0F);
        this.scale_26.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_26, 0.0F, 0.0F, 0.39269908169872414F);
        this.head_1 = new ModelRenderer(this, 20, 13);
        this.head_1.setRotationPoint(0.0F, -4.0F, -5.0F);
        this.head_1.addBox(0.0F, -4.0F, 0.0F, 0, 4, 10, 0.0F);
        this.scale_9 = new ModelRenderer(this, 18, 45);
        this.scale_9.setRotationPoint(2.5F, 0.5F, 7.0F);
        this.scale_9.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_9, 0.0F, 0.0F, -0.39269908169872414F);
        this.backscales_23 = new ModelRenderer(this, 12, 30);
        this.backscales_23.setRotationPoint(0.0F, -3.75F, -2.5F);
        this.backscales_23.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_23, 0.5890486225480862F, 0.0F, 0.0F);
        this.backscales_4 = new ModelRenderer(this, -2, 44);
        this.backscales_4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.backscales_4.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_4, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_37 = new ModelRenderer(this, 0, 27);
        this.scale_37.setRotationPoint(2.4F, 0.0F, 3.0F);
        this.scale_37.addBox(0.0F, 0.0F, -4.0F, 0, 2, 9, 0.0F);
        this.setRotateAngle(scale_37, 0.0F, 0.0F, -0.39269908169872414F);
        this.rearbody = new ModelRenderer(this, 20, 11);
        this.rearbody.setRotationPoint(0.0F, 20.2F, 4.0F);
        this.rearbody.addBox(-2.5F, 0.0F, 0.0F, 5, 4, 8, 0.0F);
        this.backscales_19 = new ModelRenderer(this, -2, 32);
        this.backscales_19.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.backscales_19.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_19, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_22 = new ModelRenderer(this, 44, 45);
        this.scale_22.setRotationPoint(-2.5F, 0.5F, 2.0F);
        this.scale_22.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_22, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_35 = new ModelRenderer(this, 16, 33);
        this.scale_35.setRotationPoint(-2.5F, 1.0F, 1.0F);
        this.scale_35.addBox(0.0F, 0.0F, 0.0F, 0, 2, 7, 0.0F);
        this.setRotateAngle(scale_35, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_2 = new ModelRenderer(this, 4, 45);
        this.scale_2.setRotationPoint(2.5F, 0.0F, 4.5F);
        this.scale_2.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_2, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_14 = new ModelRenderer(this, 28, 45);
        this.scale_14.setRotationPoint(2.5F, 1.0F, 6.5F);
        this.scale_14.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_14, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_18 = new ModelRenderer(this, 36, 45);
        this.scale_18.setRotationPoint(-2.5F, 0.0F, 4.5F);
        this.scale_18.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_18, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_33 = new ModelRenderer(this, 30, 34);
        this.scale_33.setRotationPoint(2.5F, 2.0F, 0.0F);
        this.scale_33.addBox(0.0F, 0.0F, 0.0F, 0, 2, 8, 0.0F);
        this.setRotateAngle(scale_33, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_13 = new ModelRenderer(this, 26, 45);
        this.scale_13.setRotationPoint(2.5F, 1.0F, 5.0F);
        this.scale_13.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_13, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_29 = new ModelRenderer(this, 58, 45);
        this.scale_29.setRotationPoint(-2.5F, 1.0F, 5.5F);
        this.scale_29.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_29, 0.0F, 0.0F, 0.39269908169872414F);
        this.backscales_7 = new ModelRenderer(this, 29, 44);
        this.backscales_7.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.backscales_7.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 1, 0.0F);
        this.setRotateAngle(backscales_7, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_10 = new ModelRenderer(this, 20, 45);
        this.scale_10.setRotationPoint(2.5F, 1.0F, 0.5F);
        this.scale_10.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_10, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_23 = new ModelRenderer(this, 46, 45);
        this.scale_23.setRotationPoint(-2.5F, 0.5F, 3.5F);
        this.scale_23.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_23, 0.0F, 0.0F, 0.39269908169872414F);
        this.backscales_21 = new ModelRenderer(this, -2, 30);
        this.backscales_21.setRotationPoint(0.0F, -4.0F, -5.0F);
        this.backscales_21.addBox(-1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F);
        this.setRotateAngle(backscales_21, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_30 = new ModelRenderer(this, 60, 45);
        this.scale_30.setRotationPoint(-2.5F, 1.0F, 7.0F);
        this.scale_30.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_30, 0.0F, 0.0F, 0.39269908169872414F);
        this.backscales_13 = new ModelRenderer(this, 9, 38);
        this.backscales_13.setRotationPoint(0.0F, 0.5F, 8.0F);
        this.backscales_13.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 1, 0.0F);
        this.setRotateAngle(backscales_13, 0.19634954084936207F, 0.0F, 0.0F);
        this.feelerbottomright = new ModelRenderer(this, 15, 0);
        this.feelerbottomright.setRotationPoint(-1.8F, -1.0F, -1.0F);
        this.feelerbottomright.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(feelerbottomright, -1.1780972450961724F, 0.0F, 0.39269908169872414F);
        this.scale_11 = new ModelRenderer(this, 22, 45);
        this.scale_11.setRotationPoint(2.5F, 1.0F, 2.0F);
        this.scale_11.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_11, 0.0F, 0.0F, -0.39269908169872414F);
        this.eyeright = new ModelRenderer(this, 38, 0);
        this.eyeright.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.eyeright.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.scale_12 = new ModelRenderer(this, 24, 45);
        this.scale_12.setRotationPoint(2.5F, 1.0F, 3.5F);
        this.scale_12.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_12, 0.0F, 0.0F, -0.39269908169872414F);
        this.rearneck = new ModelRenderer(this, 0, 18);
        this.rearneck.setRotationPoint(0.0F, 24.0F, -3.0F);
        this.rearneck.addBox(-2.5F, -4.0F, -5.0F, 5, 4, 5, 0.0F);
        this.setRotateAngle(rearneck, -0.39269908169872414F, 0.0F, 0.0F);
        this.backscales_8 = new ModelRenderer(this, -2, 38);
        this.backscales_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backscales_8.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_8, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales_1 = new ModelRenderer(this, 8, 44);
        this.backscales_1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.backscales_1.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_1, 0.19634954084936207F, 0.0F, 0.0F);
        this.backscales_16 = new ModelRenderer(this, 8, 32);
        this.backscales_16.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.backscales_16.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_16, 0.19634954084936207F, 0.0F, 0.0F);
        this.scale_20 = new ModelRenderer(this, 40, 45);
        this.scale_20.setRotationPoint(-2.5F, 0.0F, 7.5F);
        this.scale_20.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_20, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_38 = new ModelRenderer(this, 18, 29);
        this.scale_38.setRotationPoint(2.5F, 1.0F, 5.0F);
        this.scale_38.addBox(0.0F, 0.0F, -4.0F, 0, 2, 7, 0.0F);
        this.setRotateAngle(scale_38, 0.0F, 0.0F, -0.39269908169872414F);
        this.mainbody = new ModelRenderer(this, 38, 3);
        this.mainbody.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.mainbody.addBox(-2.5F, 0.0F, 0.0F, 5, 4, 8, 0.0F);
        this.scale_24 = new ModelRenderer(this, 48, 45);
        this.scale_24.setRotationPoint(-2.5F, 0.5F, 5.0F);
        this.scale_24.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_24, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_34 = new ModelRenderer(this, 0, 32);
        this.scale_34.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.scale_34.addBox(0.0F, 0.0F, 0.0F, 0, 2, 8, 0.0F);
        this.setRotateAngle(scale_34, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_40 = new ModelRenderer(this, 0, 25);
        this.scale_40.setRotationPoint(-2.4F, 0.0F, 3.0F);
        this.scale_40.addBox(0.0F, 0.0F, -4.0F, 0, 2, 9, 0.0F);
        this.setRotateAngle(scale_40, 0.0F, 0.0F, 0.39269908169872414F);
        this.backscales_11 = new ModelRenderer(this, 28, 38);
        this.backscales_11.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.backscales_11.addBox(-2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F);
        this.setRotateAngle(backscales_11, 0.19634954084936207F, 0.0F, 0.0F);
        this.eyeleft = new ModelRenderer(this, 38, 4);
        this.eyeleft.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.eyeleft.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.scale_42 = new ModelRenderer(this, 32, 28);
        this.scale_42.setRotationPoint(-2.5F, 2.0F, 6.0F);
        this.scale_42.addBox(0.0F, 0.0F, -4.0F, 0, 2, 6, 0.0F);
        this.setRotateAngle(scale_42, 0.0F, 0.0F, 0.39269908169872414F);
        this.feelertopleft = new ModelRenderer(this, 46, 16);
        this.feelertopleft.setRotationPoint(1.8F, -0.5F, -4.5F);
        this.feelertopleft.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(feelertopleft, -2.356194490192345F, 0.0F, -0.39269908169872414F);
        this.scale_19 = new ModelRenderer(this, 38, 45);
        this.scale_19.setRotationPoint(-2.5F, 0.0F, 6.0F);
        this.scale_19.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_19, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_17 = new ModelRenderer(this, 34, 45);
        this.scale_17.setRotationPoint(-2.5F, 0.0F, 3.0F);
        this.scale_17.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_17, 0.0F, 0.0F, 0.39269908169872414F);
        this.neck = new ModelRenderer(this, 0, 9);
        this.neck.setRotationPoint(0.0F, 22.2F, -7.3F);
        this.neck.addBox(-2.5F, -4.0F, -5.0F, 5, 4, 5, 0.0F);
        this.setRotateAngle(neck, -0.7853981633974483F, 0.0F, 0.0F);
        this.scale_25 = new ModelRenderer(this, 50, 45);
        this.scale_25.setRotationPoint(-2.5F, 0.5F, 6.5F);
        this.scale_25.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_25, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_7 = new ModelRenderer(this, 14, 45);
        this.scale_7.setRotationPoint(2.5F, 0.5F, 4.0F);
        this.scale_7.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_7, 0.0F, 0.0F, -0.39269908169872414F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 19.0F, -10.4F);
        this.head.addBox(-2.5F, -4.0F, -5.0F, 5, 4, 5, 0.0F);
        this.setRotateAngle(head, -1.1780972450961724F, 0.0F, 0.0F);
        this.scale = new ModelRenderer(this, 0, 45);
        this.scale.setRotationPoint(2.5F, 0.0F, 1.5F);
        this.scale.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_8 = new ModelRenderer(this, 16, 45);
        this.scale_8.setRotationPoint(2.5F, 0.5F, 5.5F);
        this.scale_8.addBox(0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F);
        this.setRotateAngle(scale_8, 0.0F, 0.0F, -0.39269908169872414F);
        this.scale_41 = new ModelRenderer(this, 18, 27);
        this.scale_41.setRotationPoint(-2.5F, 1.0F, 5.0F);
        this.scale_41.addBox(0.0F, 0.0F, -4.0F, 0, 2, 7, 0.0F);
        this.setRotateAngle(scale_41, 0.0F, 0.0F, 0.39269908169872414F);
        this.scale_31 = new ModelRenderer(this, 0, 34);
        this.scale_31.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.scale_31.addBox(0.0F, 0.0F, 0.0F, 0, 2, 8, 0.0F);
        this.setRotateAngle(scale_31, 0.0F, 0.0F, -0.39269908169872414F);
        this.rearbody.addChild(this.scale_36);
        this.rearbody.addChild(this.backscales_9);
        this.tail.addChild(this.backscales);
        this.tail.addChild(this.scale_1);
        this.tail.addChild(this.scale_6);
        this.tail.addChild(this.scale_15);
        this.mainbody.addChild(this.backscales_20);
        this.mainbody.addChild(this.backscales_17);
        this.rearbody.addChild(this.backscales_14);
        this.mainbody.addChild(this.backscales_15);
        this.tail.addChild(this.scale_28);
        this.mainbody.addChild(this.backscales_18);
        this.rearbody.addChild(this.backscales_12);
        this.rearneck.addChild(this.backscales_22);
        this.head.addChild(this.feelerbottomleft);
        this.tail.addChild(this.scale_4);
        this.head.addChild(this.feelertopright);
        this.tail.addChild(this.scale_5);
        this.rearbody.addChild(this.backscales_10);
        this.tail.addChild(this.scale_27);
        this.mainbody.addChild(this.scale_39);
        this.tail.addChild(this.scale_21);
        this.tail.addChild(this.scale_16);
        this.tail.addChild(this.backscales_3);
        this.rearbody.addChild(this.scale_32);
        this.tail.addChild(this.backscales_2);
        this.tail.addChild(this.backscales_5);
        this.tail.addChild(this.backscales_6);
        this.tail.addChild(this.scale_3);
        this.tail.addChild(this.scale_26);
        this.head.addChild(this.head_1);
        this.tail.addChild(this.scale_9);
        this.rearneck.addChild(this.backscales_23);
        this.tail.addChild(this.backscales_4);
        this.mainbody.addChild(this.scale_37);
        this.mainbody.addChild(this.backscales_19);
        this.tail.addChild(this.scale_22);
        this.rearbody.addChild(this.scale_35);
        this.tail.addChild(this.scale_2);
        this.tail.addChild(this.scale_14);
        this.tail.addChild(this.scale_18);
        this.rearbody.addChild(this.scale_33);
        this.tail.addChild(this.scale_13);
        this.tail.addChild(this.scale_29);
        this.tail.addChild(this.backscales_7);
        this.tail.addChild(this.scale_10);
        this.tail.addChild(this.scale_23);
        this.rearneck.addChild(this.backscales_21);
        this.tail.addChild(this.scale_30);
        this.rearbody.addChild(this.backscales_13);
        this.head.addChild(this.feelerbottomright);
        this.tail.addChild(this.scale_11);
        this.feelertopright.addChild(this.eyeright);
        this.tail.addChild(this.scale_12);
        this.rearbody.addChild(this.backscales_8);
        this.tail.addChild(this.backscales_1);
        this.mainbody.addChild(this.backscales_16);
        this.tail.addChild(this.scale_20);
        this.mainbody.addChild(this.scale_38);
        this.tail.addChild(this.scale_24);
        this.rearbody.addChild(this.scale_34);
        this.mainbody.addChild(this.scale_40);
        this.rearbody.addChild(this.backscales_11);
        this.feelertopleft.addChild(this.eyeleft);
        this.mainbody.addChild(this.scale_42);
        this.head.addChild(this.feelertopleft);
        this.tail.addChild(this.scale_19);
        this.tail.addChild(this.scale_17);
        this.tail.addChild(this.scale_25);
        this.tail.addChild(this.scale_7);
        this.tail.addChild(this.scale);
        this.tail.addChild(this.scale_8);
        this.mainbody.addChild(this.scale_41);
        this.rearbody.addChild(this.scale_31);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.tail.offsetX, this.tail.offsetY, this.tail.offsetZ);
        GlStateManager.translate(this.tail.rotationPointX * f5, this.tail.rotationPointY * f5, this.tail.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.9D, 0.9D);
        GlStateManager.translate(-this.tail.offsetX, -this.tail.offsetY, -this.tail.offsetZ);
        GlStateManager.translate(-this.tail.rotationPointX * f5, -this.tail.rotationPointY * f5, -this.tail.rotationPointZ * f5);
        this.tail.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rearbody.offsetX, this.rearbody.offsetY, this.rearbody.offsetZ);
        GlStateManager.translate(this.rearbody.rotationPointX * f5, this.rearbody.rotationPointY * f5, this.rearbody.rotationPointZ * f5);
        GlStateManager.scale(0.95D, 0.95D, 0.95D);
        GlStateManager.translate(-this.rearbody.offsetX, -this.rearbody.offsetY, -this.rearbody.offsetZ);
        GlStateManager.translate(-this.rearbody.rotationPointX * f5, -this.rearbody.rotationPointY * f5, -this.rearbody.rotationPointZ * f5);
        this.rearbody.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.rearneck.offsetX, this.rearneck.offsetY, this.rearneck.offsetZ);
        GlStateManager.translate(this.rearneck.rotationPointX * f5, this.rearneck.rotationPointY * f5, this.rearneck.rotationPointZ * f5);
        GlStateManager.scale(0.95D, 0.95D, 0.95D);
        GlStateManager.translate(-this.rearneck.offsetX, -this.rearneck.offsetY, -this.rearneck.offsetZ);
        GlStateManager.translate(-this.rearneck.rotationPointX * f5, -this.rearneck.rotationPointY * f5, -this.rearneck.rotationPointZ * f5);
        this.rearneck.render(f5);
        GlStateManager.popMatrix();
        this.mainbody.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.neck.offsetX, this.neck.offsetY, this.neck.offsetZ);
        GlStateManager.translate(this.neck.rotationPointX * f5, this.neck.rotationPointY * f5, this.neck.rotationPointZ * f5);
        GlStateManager.scale(0.9D, 0.9D, 0.9D);
        GlStateManager.translate(-this.neck.offsetX, -this.neck.offsetY, -this.neck.offsetZ);
        GlStateManager.translate(-this.neck.rotationPointX * f5, -this.neck.rotationPointY * f5, -this.neck.rotationPointZ * f5);
        this.neck.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.head.offsetX, this.head.offsetY, this.head.offsetZ);
        GlStateManager.translate(this.head.rotationPointX * f5, this.head.rotationPointY * f5, this.head.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 0.8D, 0.8D);
        GlStateManager.translate(-this.head.offsetX, -this.head.offsetY, -this.head.offsetZ);
        GlStateManager.translate(-this.head.rotationPointX * f5, -this.head.rotationPointY * f5, -this.head.rotationPointZ * f5);
        this.head.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
