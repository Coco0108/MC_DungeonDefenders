// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Petitbelin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "petitbelin"), "main");
	private final ModelPart waist;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart rightArm;
	private final ModelPart rightItem;
	private final ModelPart leftArm;
	private final ModelPart leftItem;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;

	public Petitbelin(ModelPart root) {
		this.waist = root.getChild("waist");
		this.body = this.waist.getChild("body");
		this.head = this.body.getChild("head");
		this.rightArm = this.body.getChild("rightArm");
		this.rightItem = this.rightArm.getChild("rightItem");
		this.leftArm = this.body.getChild("leftArm");
		this.leftItem = this.leftArm.getChild("leftItem");
		this.rightLeg = this.body.getChild("rightLeg");
		this.leftLeg = this.body.getChild("leftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition waist = partdefinition.addOrReplaceChild("waist", CubeListBuilder.create(), PartPose.offset(0.0F, 9.8125F, -0.75F));

		PartDefinition body = waist.addOrReplaceChild("body", CubeListBuilder.create().texOffs(24, 15).addBox(-4.0F, -1.8125F, -1.25F, 8.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(-4.0F, 2.1875F, -2.25F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 10).addBox(-4.0F, 4.1875F, -3.25F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(26, 40).addBox(-1.0F, 3.0F, -7.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(14, 39).addBox(-10.0F, 2.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(34, 27).addBox(-7.0F, 2.0F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(14, 39).addBox(7.0F, 2.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(34, 27).addBox(4.0F, 2.0F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.8125F, 0.75F));

		PartDefinition rightArm = body.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(20, 27).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -0.8125F, 0.25F));

		PartDefinition rightItem = rightArm.addOrReplaceChild("rightItem", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.5F));

		PartDefinition leftArm = body.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(20, 27).mirror().addBox(-2.0F, -1.0F, -1.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, -0.8125F, 0.25F));

		PartDefinition leftItem = leftArm.addOrReplaceChild("leftItem", CubeListBuilder.create().texOffs(34, 34).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(-2.0F, -3.0F, -12.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));

		PartDefinition rightLeg = body.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(30, 0).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 2.1875F, 0.75F));

		PartDefinition leftLeg = body.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 2.1875F, 0.75F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}