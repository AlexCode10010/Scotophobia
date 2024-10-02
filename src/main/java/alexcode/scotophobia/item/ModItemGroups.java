package alexcode.scotophobia.item;

import alexcode.scotophobia.Scotophobia;
import alexcode.scotophobia.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SCOTOPHOBIA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Scotophobia.MOD_ID, "scotophobia"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scotophobia"))
                    .icon(() -> new ItemStack(ModItems.GREG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GREG);
                        entries.add(ModBlocks.GREG_BLOCK);
                        entries.add(ModBlocks.WILD_GREG_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        Scotophobia.LOGGER.info("Registering Item Groups for " + Scotophobia.MOD_ID);
    }
}
