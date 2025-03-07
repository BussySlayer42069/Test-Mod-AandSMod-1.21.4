package com.bussyslayer42069.archaeologyandsmellsmod.item;

import com.bussyslayer42069.archaeologyandsmellsmod.ArchaeologyAndSmellsMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SNIFFER_FOSSIL_HEAD = registerItem("sniffer_fossil_head", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ArchaeologyAndSmellsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ArchaeologyAndSmellsMod.LOGGER.info("Registering Mod Items for " + ArchaeologyAndSmellsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SNIFFER_FOSSIL_HEAD);
        });
    }
}