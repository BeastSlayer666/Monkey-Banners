package com.beast;

import com.beast.item.MBBannerPatternItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonkeyBanners implements ModInitializer {

	public static final String MOD_ID = "monkey-banners";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		MBBannerPatternItem.registerMonkeyPattern();

		LOGGER.info("Hello from Monkey Banners!");
	}
}