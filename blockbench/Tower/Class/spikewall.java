// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class spikewall<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "spikewall"), "main");
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

	public spikewall(ModelPart root) {
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

		PartDefinition pillier_r = partdefinition.addOrReplaceChild("pillier_r", CubeListBuilder.create().texOffs(71, 31).addBox(-1.0F, -6.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(77, 41).addBox(-9.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(77, 45).addBox(-7.0F, 2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(77, 49).addBox(-5.0F, 0.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(35, 49).addBox(-3.0F, -2.0F, -6.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(17, 16).addBox(-2.0F, -2.0F, -15.0F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 18.0F, 15.0F));

		PartDefinition pillier_l = partdefinition.addOrReplaceChild("pillier_l", CubeListBuilder.create().texOffs(71, 45).addBox(-1.0F, -6.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(77, 53).addBox(-9.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(77, 71).addBox(-7.0F, 2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(77, 75).addBox(-5.0F, 0.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 27).addBox(-3.0F, -2.0F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(37, 27).addBox(-2.0F, -2.0F, 7.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 18.0F, -15.0F));

		PartDefinition pillier_m = partdefinition.addOrReplaceChild("pillier_m", CubeListBuilder.create().texOffs(45, 72).addBox(-1.0F, -6.0F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 78).addBox(-9.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(63, 78).addBox(-7.0F, 2.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(75, 79).addBox(-5.0F, 0.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 18.0F, 0.0F));

		PartDefinition wall_r = partdefinition.addOrReplaceChild("wall_r", CubeListBuilder.create(), PartPose.offset(-2.0F, 24.0F, -8.0F));

		PartDefinition l = wall_r.addOrReplaceChild("l", CubeListBuilder.create().texOffs(77, 31).addBox(5.0F, -1.0F, 13.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(63, 63).addBox(6.0F, -6.0F, 13.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(51, 72).addBox(6.0F, -10.0F, 13.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(75, 65).addBox(5.0F, -12.0F, 13.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, -5.0F));

		PartDefinition pique = l.addOrReplaceChild("pique", CubeListBuilder.create().texOffs(49, 58).addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 34).addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 60).addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 60).addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 62).addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 1.0F));

		PartDefinition pique3 = l.addOrReplaceChild("pique3", CubeListBuilder.create().texOffs(31, 64).addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(77, 57).addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 34).addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 66).addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(45, 68).addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 1.0F));

		PartDefinition m = wall_r.addOrReplaceChild("m", CubeListBuilder.create().texOffs(63, 72).addBox(5.0F, -1.0F, 12.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(57, 24).addBox(6.0F, -6.0F, 12.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(17, 60).addBox(6.0F, -10.0F, 12.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(31, 68).addBox(5.0F, -12.0F, 12.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition pique2 = m.addOrReplaceChild("pique2", CubeListBuilder.create().texOffs(45, 70).addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 80).addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 59).addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 61).addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 75).addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition r = wall_r.addOrReplaceChild("r", CubeListBuilder.create().texOffs(53, 55).addBox(4.0F, -1.0F, 17.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(17, 37).addBox(5.0F, -6.0F, 17.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(39, 16).addBox(5.0F, -10.0F, 17.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(53, 37).addBox(3.0F, -12.0F, 17.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition pique4 = r.addOrReplaceChild("pique4", CubeListBuilder.create().texOffs(41, 77).addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 81).addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 79).addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(59, 80).addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 83).addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -1.0F, 5.0F));

		PartDefinition pique5 = r.addOrReplaceChild("pique5", CubeListBuilder.create().texOffs(37, 83).addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 81).addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 83).addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 83).addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(79, 83).addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 5.0F, 5.0F));

		PartDefinition wall_l = partdefinition.addOrReplaceChild("wall_l", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -13.0F));

		PartDefinition l2 = wall_l.addOrReplaceChild("l2", CubeListBuilder.create().texOffs(77, 36).addBox(5.0F, -1.0F, 18.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 69).addBox(6.0F, -6.0F, 18.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(75, 16).addBox(6.0F, -10.0F, 18.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(29, 75).addBox(5.0F, -12.0F, 18.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, -9.0F));

		PartDefinition pique6 = l2.addOrReplaceChild("pique6", CubeListBuilder.create().texOffs(83, 83).addBox(8.0F, -8.0F, 21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 82).addBox(8.0F, -8.0F, 20.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 84).addBox(8.0F, -8.0F, 19.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(21, 84).addBox(8.0F, -7.0F, 20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 24).addBox(8.0F, -9.0F, 20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -2.0F));

		PartDefinition pique7 = l2.addOrReplaceChild("pique7", CubeListBuilder.create().texOffs(85, 26).addBox(8.0F, -8.0F, 21.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 82).addBox(8.0F, -8.0F, 20.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 28).addBox(8.0F, -8.0F, 19.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(51, 84).addBox(8.0F, -7.0F, 20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 84).addBox(8.0F, -9.0F, 20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, -2.0F));

		PartDefinition m2 = wall_l.addOrReplaceChild("m2", CubeListBuilder.create().texOffs(75, 59).addBox(5.0F, -1.0F, 12.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(35, 58).addBox(6.0F, -6.0F, 12.0F, 2.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(49, 63).addBox(6.0F, -10.0F, 12.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(71, 24).addBox(5.0F, -12.0F, 12.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 0.0F, -8.0F));

		PartDefinition pique8 = m2.addOrReplaceChild("pique8", CubeListBuilder.create().texOffs(85, 57).addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(59, 82).addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(59, 84).addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(63, 84).addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 84).addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, -2.0F));

		PartDefinition r2 = wall_l.addOrReplaceChild("r2", CubeListBuilder.create().texOffs(57, 16).addBox(4.0F, -1.0F, 17.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(35, 37).addBox(5.0F, -6.0F, 17.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(17, 49).addBox(5.0F, -10.0F, 17.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(53, 46).addBox(3.0F, -12.0F, 17.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, -20.0F));

		PartDefinition pique9 = r2.addOrReplaceChild("pique9", CubeListBuilder.create().texOffs(71, 84).addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(67, 82).addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 85).addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 85).addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 85).addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -1.0F, 5.0F));

		PartDefinition pique10 = r2.addOrReplaceChild("pique10", CubeListBuilder.create().texOffs(37, 85).addBox(8.0F, -8.0F, 16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 83).addBox(8.0F, -8.0F, 15.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 85).addBox(8.0F, -8.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 85).addBox(8.0F, -7.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(79, 85).addBox(8.0F, -9.0F, 15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 5.0F, 5.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		pillier_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pillier_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pillier_m.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wall_r.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wall_l.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}