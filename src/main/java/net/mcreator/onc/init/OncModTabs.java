
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.onc.OncMod;

public class OncModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OncMod.MODID);
	public static final RegistryObject<CreativeModeTab> ONC_CREATIVE_TAB = REGISTRY.register("onc_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.onc.onc_creative_tab")).icon(() -> new ItemStack(OncModBlocks.OXYGEN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OncModBlocks.OXYGEN.get().asItem());
			}).withSearchBar().build());
}
