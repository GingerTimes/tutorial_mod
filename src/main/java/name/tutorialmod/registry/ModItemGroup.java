package name.tutorialmod.registry;

import name.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup SILVER = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID,"silver"))
            .displayName(Text.translatable("itemgroup.tutorial-mod.silver"))
            .icon(() -> new ItemStack(ModItems.SILVER))
            .build();
    public static void registerModItemGroup(){
        TutorialMod.LOGGER.debug("Register mod item group for"+TutorialMod.MOD_ID);
    }
}
