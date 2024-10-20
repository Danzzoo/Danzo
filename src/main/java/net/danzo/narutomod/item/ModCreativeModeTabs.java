package net.danzo.narutomod.item;

import net.danzo.narutomod.NarutoMod;
import net.danzo.narutomod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NarutoMod.MOD_ID);


    public static final Supplier<CreativeModeTab> NARUTO_MOD_ITEMS = CREATIVE_MODE_TAB.register("naruto_mod_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KEBAP.get()))
                    .title(Component.translatable("creativetab.narutoid.naruto_mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SHISH);
                        output.accept(ModItems.KEBAP);
                        output.accept(ModItems.KEBAPS);


             } ).build());

    public static final Supplier<CreativeModeTab> NARUTO_MOD_BLOCKS = CREATIVE_MODE_TAB.register("naruto_mod_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.EARTH_RELEASE_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(NarutoMod.MOD_ID, "naruto_mod_items"))
                    .title(Component.translatable("creativetab.narutoid.naruto_mod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.EARTH_RELEASE_BLOCK);
                        output.accept(ModBlocks.KAMUI_DIMENSION_BLOCK);


             } ).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);



    }



}
