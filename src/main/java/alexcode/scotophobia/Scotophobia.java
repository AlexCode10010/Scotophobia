package alexcode.scotophobia;

import alexcode.scotophobia.block.ModBlocks;
import alexcode.scotophobia.item.ModItemGroups;
import alexcode.scotophobia.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scotophobia implements ModInitializer {
	public static final String MOD_ID = "scotophobia";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("cereal goes before milk. oh also Scotophobia loaded or something idk.");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}