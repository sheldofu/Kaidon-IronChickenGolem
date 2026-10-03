package net.kaidon.chicken.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kaidon.chicken.KaidonIronChickenGolem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.SpawnEggItem;
import net.kaidon.chicken.entity.ModEntities;
import net.kaidon.chicken.entity.PinkGarnetItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TSU = registerItem("tsu",new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new PinkGarnetItem(new Item.Settings().maxCount(16)));
    public static final Item TSU_SWORD = registerItem("tsu_sword", new TsuSwordItem(
            ToolMaterials.DIAMOND,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -2.4F))
    ));
    public static final Item CHICKEN_GOLEM_SPAWN_EGG = registerItem("chicken_golem_spawn_egg",
            new SpawnEggItem(ModEntities.CHICKEN_GOLEM, 0xF4EBDD, 0xD94A42, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KaidonIronChickenGolem.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KaidonIronChickenGolem.LOGGER.info("Registering Mod Items for " + KaidonIronChickenGolem.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TSU);
            entries.add(RAW_PINK_GARNET);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> entries.add(TSU_SWORD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(entries -> entries.add(CHICKEN_GOLEM_SPAWN_EGG));
    }
}
