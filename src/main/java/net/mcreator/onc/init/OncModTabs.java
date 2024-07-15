
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.onc.OncMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OncModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OncMod.MODID);
	public static final RegistryObject<CreativeModeTab> ONC_CREATIVE_TAB = REGISTRY.register("onc_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.onc.onc_creative_tab")).icon(() -> new ItemStack(OncModBlocks.OXYGEN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OncModBlocks.OXYGEN.get().asItem());
				tabData.accept(OncModBlocks.BASIC_TILE.get().asItem());
				tabData.accept(OncModBlocks.AIRFLOW_TILE.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(OncModItems.SHINE_BUGS_SPAWN_EGG.get());
		}
	}
}
