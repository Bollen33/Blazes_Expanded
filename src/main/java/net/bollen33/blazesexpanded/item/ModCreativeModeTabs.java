package net.bollen33.blazesexpanded.item;

import net.bollen33.blazesexpanded.BlazesExpanded;
import net.bollen33.blazesexpanded.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlazesExpanded.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("blazes_expanded_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLAZE_INGOT.get()))
                    .title(Component.translatable("creativetab.blazes_expanded_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLAZE_INGOT.get());
                        output.accept(ModItems.BLAZE_EYE.get());
                        output.accept(ModBlocks.BLAZE_INGOT_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
