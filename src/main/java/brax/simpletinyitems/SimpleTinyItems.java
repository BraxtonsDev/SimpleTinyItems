package brax.simpletinyitems;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTinyItems implements ModInitializer
{
	public static final String MOD_ID = "simple-tiny-items";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Simple Tiny Items initialized :p");
	}
}