package net.bollen33.blazesexpanded.item;

import net.bollen33.blazesexpanded.BlazesExpanded;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlazesExpanded.MOD_ID);
    public static final RegistryObject<Item> BLAZE_INGOT = ITEMS.register("blaze_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLAZE_EYE = ITEMS.register("blaze_eye",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
