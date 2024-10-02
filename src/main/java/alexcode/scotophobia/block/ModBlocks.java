package alexcode.scotophobia.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import alexcode.scotophobia.Scotophobia;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GREG_BLOCK = registerBlock("greg_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).requiresTool()));
    public static final Block WILD_GREG_BLOCK = registerBlock("wild_greg_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Scotophobia.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Scotophobia.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Scotophobia.LOGGER.info("Registering Modblocks for " + Scotophobia.MOD_ID);
    }
}
