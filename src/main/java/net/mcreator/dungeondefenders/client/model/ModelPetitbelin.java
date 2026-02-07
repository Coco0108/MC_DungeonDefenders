package net.mcreator.dungeondefenders.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelPetitbelin extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("dungeon_defenders", "model_petitbelin"), "main");
	public final ModelPart waist;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart rightArm;
	public final ModelPart rightItem;
	public final ModelPart leftArm;
	public final ModelPart leftItem;
	public final ModelPart rightLeg;
	public final ModelPart leftLeg;

	public ModelPetitbelin(ModelPart root) {
		super(root);
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
		PartDefinition body = waist.addOrReplaceChild("body", CubeListBuilder.create().texOffs(24, 15).addBox(-4.0F, -1.8125F, -1.25F, 8.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
				.addBox(-4.0F, 2.1875F, -2.25F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 10).addBox(-4.0F, 4.1875F, -3.25F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(26, 40).addBox(-1.0F, 3.0F, -7.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 39)
						.addBox(-10.0F, 2.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 27).addBox(-7.0F, 2.0F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 39)
						.addBox(7.0F, 2.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 27).addBox(4.0F, 2.0F, -3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -9.8125F, 0.75F));
		PartDefinition rightArm = body.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(20, 27).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -0.8125F, 0.25F));
		PartDefinition rightItem = rightArm.addOrReplaceChild("rightItem", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 1.5F));
		PartDefinition leftArm = body.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(20, 27).mirror().addBox(-2.0F, -1.0F, -1.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.0F, -0.8125F, 0.25F));
		PartDefinition leftItem = leftArm.addOrReplaceChild("leftItem",
				CubeListBuilder.create().texOffs(34, 34).addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-2.0F, -3.0F, -12.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, -1.5F));
		PartDefinition rightLeg = body.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(30, 0).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 2.1875F, 0.75F));
		PartDefinition leftLeg = body.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 2.1875F, 0.75F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightItem.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}