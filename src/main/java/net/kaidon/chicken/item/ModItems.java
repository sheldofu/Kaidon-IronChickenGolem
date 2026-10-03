package net.kaidon.chicken.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kaidon.chicken.KaidonIronChickenGolem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.kaidon.chicken.entity.PinkGarnetItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TSU = registerItem("tsu",new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new PinkGarnetItem(new Item.Settings().maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KaidonIronChickenGolem.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KaidonIronChickenGolem.LOGGER.info("Registering Mod Items for " + KaidonIronChickenGolem.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TSU);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
