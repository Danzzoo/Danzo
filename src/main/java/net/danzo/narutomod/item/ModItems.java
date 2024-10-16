package net.danzo.narutomod.item;

import net.danzo.narutomod.NarutoMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =   DeferredRegister.createItems(NarutoMod.MOD_ID);

    public static final DeferredItem<Item> KEBAP = ITEMS.register( "kebap",
            () -> new Item(new Item.Properties()));








    public static void register(IEventBus eventBus) {

     ITEMS.register(eventBus);
     }

}
