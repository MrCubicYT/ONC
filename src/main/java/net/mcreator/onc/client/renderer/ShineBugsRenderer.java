
package net.mcreator.onc.client.renderer;

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
