// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelspikeblockade<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spikeblockade"), "main");
	private final ModelPart pillier_r;
	private final ModelPart pillier_l;
	private final ModelPart pillier_m;
	private final ModelPart wall_r;
	private final ModelPart l;
	private final ModelPart pique;
	private final ModelPart pique3;
	private final ModelPart m;
	private final ModelPart pique2;
	private final ModelPart r;
	private final ModelPart pique4;
	private final ModelPart pique5;
	private final ModelPart wall_l;
	private final ModelPart l2;
	private final ModelPart pique6;
	private final ModelPart pique7;
	private final ModelPart m2;
	private final ModelPart pique8;
	private final ModelPart r2;
	private final ModelPart pique9;
	private final ModelPart pique10;

	public Modelspikeblockade(ModelPart root) {
		this.pillier_r = root.getChild("pillier_r");
		this.pillier_l = root.getChild("pillier_l");
		this.pillier_m = root.getChild("pillier_m");
		this.wall_r = root.getChild("wall_r");
		this.l = this.wall_r.getChild("l");
		this.pique = this.l.getChild("pique");
		this.pique3 = this.l.getChild("pique3");
		this.m = this.wall_r.getChild("m");
		this.pique2 = this.m.getChild("pique2");
		this.r = this.wall_r.getChild("r");
		this.pique4 = this.r.getChild("pique4");
		this.pique5 = this.r.getChild("pique5");
		this.wall_l = root.getChild("wall_l");
		this.l2 = this.wall_l.getChild("l2");
		this.pique6 = this.l2.getChild("pique6");
		this.pique7 = this.l2.getChild("pique7");
		this.m2 = this.wall_l.getChild("m2");
		this.pique8 = this.m2.getChild("pique8");
		this.r2 = this.wall_l.getChild("r2");
		this.pique9 = this.r2.getChild("pique9");
		this.pique10 = this.r2.getChild("pique10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition pillier_r = partdefinition.addOrReplaceChild("pillier_r",
				CubeListBuilder.create().texOffs(54, 15)
						.addBox(-1.0F, -6.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 25)
						.addBox(-9.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 29)
						.addBox(-7.0F, 2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 33)
						.addBox(-5.0F, 0.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 33)
						.addBox(-3.0F, -2.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -2.0F, -15.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 18.0F, 15.0F));

		PartDefinition pillier_l = partdefinition.addOrReplaceChild("pillier_l",
				CubeListBuilder.create().texOffs(54, 29)
						.addBox(-1.0F, -6.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 37)
						.addBox(-9.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 55)
						.addBox(-7.0F, 2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 59)
						.addBox(-5.0F, 0.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-3.0F, -2.0F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 11)
						.addBox(-2.0F, -2.0F, 7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, 18.0F, -15.0F));

		PartDefinition pillier_m = partdefinition.addOrReplaceChild("pillier_m",
				CubeListBuilder.create().texOffs(28, 56)
						.addBox(-1.0F, -6.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-9.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 62)
						.addBox(-7.0F, 2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 63)
						.addBox(-5.0F, 0.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 18.0F, 0.0F));

		PartDefinition wall_r = partdefinition.addOrReplaceChild("wall_r", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 24.0F, -8.0F));

		PartDefinition l = wall_r.addOrReplaceChild("l",
				CubeListBuilder.create().texOffs(60, 15)
						.addBox(5.0F, -1.0F, 13.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 47)
						.addBox(6.0F, -6.0F, 13.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 56)
						.addBox(6.0F, -10.0F, 13.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 49)
						.addBox(5.0F, -12.0F, 13.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 0.0F, -5.0F));

		PartDefinition pique = l.addOrReplaceChild("pique",
				CubeListBuilder.create().texOffs(32, 42)
						.addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 18)
						.addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 44)
						.addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 44)
						.addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 46)
						.addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, 1.0F));

		PartDefinition pique3 = l.addOrReplaceChild("pique3",
				CubeListBuilder.create().texOffs(14, 48)
						.addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 41)
						.addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 18)
						.addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 50)
						.addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 52)
						.addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, 1.0F));

		PartDefinition m = wall_r.addOrReplaceChild("m",
				CubeListBuilder.create().texOffs(46, 56)
						.addBox(5.0F, -1.0F, 12.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
						.addBox(6.0F, -6.0F, 12.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(6.0F, -10.0F, 12.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 52)
						.addBox(5.0F, -12.0F, 12.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition pique2 = m.addOrReplaceChild("pique2",
				CubeListBuilder.create().texOffs(28, 54)
						.addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 64)
						.addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 43)
						.addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 45)
						.addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 59)
						.addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition r = wall_r.addOrReplaceChild("r",
				CubeListBuilder.create().texOffs(36, 39)
						.addBox(4.0F, -1.0F, 17.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(5.0F, -6.0F, 17.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(5.0F, -10.0F, 17.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 21)
						.addBox(3.0F, -12.0F, 17.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pique4 = r.addOrReplaceChild("pique4",
				CubeListBuilder.create().texOffs(24, 61)
						.addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 65)
						.addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 63)
						.addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 64)
						.addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 67)
						.addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -1.0F, 5.0F));

		PartDefinition pique5 = r.addOrReplaceChild("pique5",
				CubeListBuilder.create().texOffs(20, 67)
						.addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 65)
						.addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 67)
						.addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 67)
						.addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 67)
						.addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 5.0F, 5.0F));

		PartDefinition wall_l = partdefinition.addOrReplaceChild("wall_l", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, -13.0F));

		PartDefinition l2 = wall_l.addOrReplaceChild("l2",
				CubeListBuilder.create().texOffs(60, 20)
						.addBox(5.0F, -1.0F, 18.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(6.0F, -6.0F, 18.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(6.0F, -10.0F, 18.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 59)
						.addBox(5.0F, -12.0F, 18.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.0F, -9.0F));

		PartDefinition pique6 = l2.addOrReplaceChild("pique6",
				CubeListBuilder.create().texOffs(66, 67)
						.addBox(8.0F, -8.0F, 21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(8.0F, -8.0F, 20.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(8.0F, -8.0F, 19.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 68)
						.addBox(8.0F, -7.0F, 20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 8)
						.addBox(8.0F, -9.0F, 20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition pique7 = l2.addOrReplaceChild("pique7",
				CubeListBuilder.create().texOffs(68, 10)
						.addBox(8.0F, -8.0F, 21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 66)
						.addBox(8.0F, -8.0F, 20.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 12)
						.addBox(8.0F, -8.0F, 19.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 68)
						.addBox(8.0F, -7.0F, 20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 68)
						.addBox(8.0F, -9.0F, 20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 5.0F, -2.0F));

		PartDefinition m2 = wall_l.addOrReplaceChild("m2",
				CubeListBuilder.create().texOffs(58, 43)
						.addBox(5.0F, -1.0F, 12.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 42)
						.addBox(6.0F, -6.0F, 12.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 47)
						.addBox(6.0F, -10.0F, 12.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(54, 8)
						.addBox(5.0F, -12.0F, 12.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 0.0F, -8.0F));

		PartDefinition pique8 = m2.addOrReplaceChild("pique8",
				CubeListBuilder.create().texOffs(68, 41)
						.addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 66)
						.addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 68)
						.addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 68)
						.addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 68)
						.addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, -2.0F));

		PartDefinition r2 = wall_l.addOrReplaceChild("r2",
				CubeListBuilder.create().texOffs(40, 0)
						.addBox(4.0F, -1.0F, 17.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 21)
						.addBox(5.0F, -6.0F, 17.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(5.0F, -10.0F, 17.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 30)
						.addBox(3.0F, -12.0F, 17.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 0.0F, -20.0F));

		PartDefinition pique9 = r2.addOrReplaceChild("pique9",
				CubeListBuilder.create().texOffs(54, 68)
						.addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 66)
						.addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 69)
						.addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 69)
						.addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 69)
						.addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -1.0F, 5.0F));

		PartDefinition pique10 = r2.addOrReplaceChild("pique10",
				CubeListBuilder.create().texOffs(20, 69)
						.addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 67)
						.addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 69)
						.addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 69)
						.addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 69)
						.addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 5.0F, 5.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		pillier_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pillier_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pillier_m.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wall_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wall_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}