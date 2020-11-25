// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer Torso;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer mask;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer Arms;
	private final ModelRenderer cube_r12;
	private final ModelRenderer lowerarms;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer LowerBody;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer Legs;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;

	public custom_model() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(2.0167F, 7.7667F, -1.1333F);
		

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(Torso);
		setRotationAngle(Torso, 0.48F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0833F, -13.1667F, -9.1667F);
		Torso.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 30).addBox(-4.0F, -8.0F, 0.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.9833F, -8.9167F, -4.8667F);
		Torso.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 1).addBox(-5.0F, -5.0F, -1.0F, 10.0F, 5.0F, 10.0F, 0.05F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.9833F, -7.1667F, -1.6167F);
		Torso.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 15).addBox(-6.0F, -3.5F, -4.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.9833F, -2.4167F, 0.3833F);
		Torso.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(32, 32).addBox(-4.0F, -3.5F, -4.0F, 8.0F, 5.0F, 8.0F, 0.1F, false);

		mask = new ModelRenderer(this);
		mask.setRotationPoint(1.0833F, -9.5967F, -9.6722F);
		Torso.addChild(mask);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.696F, 0.0811F, 0.301F);
		mask.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0436F, 0.0F, 1.5708F);
		cube_r5.setTextureOffset(0, 34).addBox(-4.3379F, 0.4834F, -0.9132F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(30, 7).addBox(0.8099F, 0.894F, -0.6794F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.9361F, -9.6009F, -3.2116F);
		mask.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0436F, 0.0F, 1.5708F);
		cube_r6.setTextureOffset(11, 46).addBox(-3.831F, 5.2342F, 2.5391F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(42, 45).addBox(-4.0157F, -3.7736F, 2.5336F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(30, 21).addBox(-3.8772F, 1.2342F, 2.6249F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(40, 66).addBox(0.5773F, -3.7717F, 2.4913F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(30, 66).addBox(-5.4167F, -2.7733F, 2.455F, 4.0F, 10.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(0, 0).addBox(2.3586F, -1.7674F, 2.5885F, 2.0F, 8.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(70, 15).addBox(3.6113F, -3.7664F, 2.6128F, 2.0F, 12.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.1853F, -3.3131F, 0.2039F);
		mask.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0436F, 0.0F, 1.0036F);
		cube_r7.setTextureOffset(6, 6).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.8677F, -2.9073F, 0.1966F);
		mask.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0436F, 0.0F, -1.0036F);
		cube_r8.setTextureOffset(6, 0).addBox(0.3511F, -0.4196F, -0.518F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.6639F, 1.1891F, 0.1905F);
		mask.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0436F, 0.0F, -0.8727F);
		cube_r9.setTextureOffset(0, 30).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.3361F, 1.1891F, 0.1905F);
		mask.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0436F, 0.0F, 0.8727F);
		cube_r10.setTextureOffset(25, 46).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.5F, -3.6766F, -1.1459F);
		mask.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(0, 15).addBox(3.6F, 0.6021F, 0.7471F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(0, 20).addBox(-0.8F, 0.6021F, 0.7471F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		Arms = new ModelRenderer(this);
		Arms.setRotationPoint(0.9833F, -1.946F, -7.9906F);
		Torso.addChild(Arms);
		setRotationAngle(Arms, -0.4363F, 0.0F, 0.0F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(7.0F, -13.1593F, 3.7404F);
		Arms.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(49, 49).addBox(-2.0F, -3.0F, -2.5F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		cube_r12.setTextureOffset(25, 45).addBox(-17.0F, -3.0F, -3.5F, 5.0F, 6.0F, 7.0F, 0.0F, false);

		lowerarms = new ModelRenderer(this);
		lowerarms.setRotationPoint(0.05F, -12.454F, 3.959F);
		Arms.addChild(lowerarms);
		setRotationAngle(lowerarms, -0.2618F, 0.0F, 0.0F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(7.45F, 24.0308F, -7.9472F);
		lowerarms.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(24, 31).addBox(-1.8F, -1.4738F, -0.9006F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r13.setTextureOffset(30, 58).addBox(-16.9F, -1.7129F, -1.791F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-7.05F, 3.3937F, 0.2645F);
		lowerarms.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(0, 46).addBox(-2.0F, -2.0F, -2.5F, 3.0F, 14.0F, 5.0F, 0.0F, false);
		cube_r14.setTextureOffset(56, 21).addBox(13.0F, -2.0F, -1.5F, 3.0F, 14.0F, 4.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(6.95F, 16.1437F, -3.4855F);
		lowerarms.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.48F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(16, 58).addBox(-1.0F, -2.0F, -1.5F, 3.0F, 10.0F, 4.0F, 0.0F, false);
		cube_r15.setTextureOffset(56, 0).addBox(-16.0F, -2.0F, -2.5F, 3.0F, 10.0F, 5.0F, 0.0F, false);

		LowerBody = new ModelRenderer(this);
		LowerBody.setRotationPoint(-2.0167F, 12.3333F, 1.1333F);
		body.addChild(LowerBody);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(2.5F, -15.0F, -1.5F);
		LowerBody.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(30, 0).addBox(-3.5F, -0.5F, -0.5F, 8.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.5F, -11.5F, -1.5F);
		LowerBody.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2182F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(34, 9).addBox(-3.5F, -0.5F, -3.5F, 8.0F, 6.0F, 6.0F, 0.05F, false);

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(3.0F, -0.006F, -5.1725F);
		LowerBody.addChild(Legs);
		setRotationAngle(Legs, -0.1309F, 0.0F, 0.0F);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(2.0F, -4.394F, 0.6725F);
		Legs.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
		cube_r18.setTextureOffset(48, 61).addBox(-1.0F, -2.5F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		cube_r18.setTextureOffset(62, 62).addBox(-6.0F, -2.5F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(2.5F, 1.572F, 0.1637F);
		Legs.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
		cube_r19.setTextureOffset(0, 65).addBox(-1.5F, -3.5F, -2.0F, 3.0F, 5.0F, 4.0F, 0.05F, false);
		cube_r19.setTextureOffset(65, 46).addBox(-6.5F, -3.5F, -2.0F, 3.0F, 5.0F, 4.0F, 0.05F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(2.5F, 2.322F, 0.1637F);
		Legs.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.1309F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(34, 24).addBox(-1.5F, 0.5F, -4.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r20.setTextureOffset(58, 39).addBox(-6.5F, 0.5F, -4.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}