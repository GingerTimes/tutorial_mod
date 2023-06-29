package name.tutorialmod.registry;

import name.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block SILVER_BLOCK = registerblock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.SILVER, ItemGroups.BUILDING_BLOCKS);
    public static final Block SILVER_ORE = registerblock("silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(2,6)),
            ModItemGroup.SILVER, ItemGroups.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_SILVER_ORE = registerblock("deepslate_silver_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(2,6)),
            ModItemGroup.SILVER, ItemGroups.BUILDING_BLOCKS);
    public static Block registerblock(String name, Block block, ItemGroup... itemGroups) {
        ModItems.registerItem(name, new BlockItem(block, new FabricItemSettings()), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
    public static void registerModBlocks(){
        TutorialMod.LOGGER.debug("Registering mod blocks for"+TutorialMod.MOD_ID);
    }
}
