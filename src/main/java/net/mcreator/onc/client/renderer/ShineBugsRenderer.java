
package net.mcreator.onc.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.onc.entity.ShineBugsEntity;
import net.mcreator.onc.client.model.Modelshiner;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShineBugsRenderer extends MobRenderer<ShineBugsEntity, Modelshiner<ShineBugsEntity>> {
	public ShineBugsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshiner(context.bakeLayer(Modelshiner.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ShineBugsEntity, Modelshiner<ShineBugsEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("onc:textures/entities/shiners.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShineBugsEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ShineBugsEntity entity) {
		return new ResourceLocation("onc:textures/entities/shiners.png");
	}
}
