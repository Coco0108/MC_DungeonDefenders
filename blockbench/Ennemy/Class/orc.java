// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class orc<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "orc"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart arm0;
	private final ModelPart arm1;
	private final ModelPart left_item;
	private final ModelPart leg0;
	private final ModelPart leg1;

	public orc(ModelPart root) {
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.arm0 = this.body.getChild("arm0");
		this.arm1 = this.body.getChild("arm1");
		this.left_item = this.arm1.getChild("left_item");
		this.leg0 = this.body.getChild("leg0");
		this.leg1 = root.getChild("leg1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(76, 25).addBox(2.6667F, -5.5833F, -5.5833F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(68, 15).addBox(-1.3333F, -5.5833F, -4.5833F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 78).addBox(-8.3333F, -5.5833F, -5.5833F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.3333F, -5.5833F, -3.5833F, 18.0F, 12.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(68, 33).addBox(-3.8333F, 6.4167F, -2.5833F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.5F))
		.texOffs(36, 21).addBox(-5.8333F, -8.5833F, -0.5833F, 13.0F, 5.0F, 7.0F, new CubeDeformation(0.5F))
		.texOffs(70, 52).addBox(-7.8333F, -7.5833F, -1.5833F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.5F))
		.texOffs(76, 15).addBox(8.1667F, -7.5833F, -1.5833F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(-0.6667F, -0.4167F, -0.4167F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(36, 33).addBox(-4.0F, -9.0F, -5.5F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(84, 76).addBox(-1.0F, -5.0F, -7.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 66).addBox(-4.0F, -8.0F, -7.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 8).addBox(-3.0F, -2.0F, -7.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 69).addBox(1.0F, -8.0F, -7.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 72).addBox(-3.0F, -4.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 79).addBox(1.0F, -3.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 44).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(54, 15).addBox(-2.0F, -11.0F, 3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(70, 62).addBox(-2.0F, -10.0F, 7.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 41).addBox(-2.0F, -8.0F, 8.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(84, 11).addBox(4.0F, -7.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 62).addBox(-8.0F, -7.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.6667F, -6.5833F, -1.5833F));

		PartDefinition arm0 = body.addOrReplaceChild("arm0", CubeListBuilder.create().texOffs(0, 41).addBox(-13.0F, -0.5F, -3.0F, 4.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.6667F, -6.5833F, 0.4167F));

		PartDefinition arm1 = body.addOrReplaceChild("arm1", CubeListBuilder.create().texOffs(20, 51).addBox(9.0F, -0.5F, -3.0F, 4.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.6667F, -6.5833F, 0.4167F));

		PartDefinition left_item = arm1.addOrReplaceChild("left_item", CubeListBuilder.create().texOffs(54, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(-1.0F, 7.0F, -17.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 80).addBox(-1.0F, 4.0F, -4.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(84, 0).addBox(-1.0F, 4.0F, -20.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 68).addBox(-1.0F, 2.0F, -13.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(40, 51).addBox(-1.0F, -2.0F, -16.0F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(11.0F, 19.0F, 0.0F));

		PartDefinition leg0 = body.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(40, 68).addBox(-3.5F, 0.0F, -3.0F, 6.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.3333F, 11.4167F, 0.4167F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(62, 68).addBox(-3.0F, -6.5F, -2.5F, 6.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, 17.5F, -0.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}