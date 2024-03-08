package com.beast.item;

import com.beast.MonkeyBanners;
import com.beast.tag.MBPatternTags;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.apache.commons.lang3.text.WordUtils;

public class MBBannerPatternItem {
    public static final Item MB_BANNER_PATTERN = new BannerPatternItem(MBPatternTags.MB_PATTERN_ITEM, new FabricItemSettings().maxCount(1).rarity(Rarity.COMMON));

    private static void register () {
        Registry.register(Registries.ITEM, new Identifier(MonkeyBanners.MOD_ID, "mb_banner_pattern"), MBBannerPatternItem.MB_BANNER_PATTERN);
    }

    public static void addItemToIngredientsTab (FabricItemGroupEntries entries) {
        entries.add(MB_BANNER_PATTERN);
    }

    public static void registerMonkeyPattern() {
        MonkeyBanners.LOGGER.info("Registering BannerPatternItem for " + MonkeyBanners.MOD_ID);

        register();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(MBBannerPatternItem::addItemToIngredientsTab);
    }
}
