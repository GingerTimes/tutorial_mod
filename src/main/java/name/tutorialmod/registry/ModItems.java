package name.tutorialmod.registry;

import name.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.IdentityHashMap;

public class ModItems {
    public static final Item SILVER = registerItem("silver",
            new Item(new FabricItemSettings()),
            ModItemGroup.SILVER, ItemGroups.INGREDIENTS);
    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings()),
            ModItemGroup.SILVER, ItemGroups.INGREDIENTS);

    public static Item registerItem(String name, Item item, ItemGroup... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
        for (ItemGroup itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering mod items for "+TutorialMod.MOD_ID);
    }
}
