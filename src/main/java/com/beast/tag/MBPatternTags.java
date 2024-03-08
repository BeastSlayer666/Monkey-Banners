package com.beast.tag;

import com.beast.MonkeyBanners;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MBPatternTags {

    public static final TagKey<BannerPattern> MB_PATTERN_ITEM = of("pattern_item/monkeys");

    private static TagKey<BannerPattern> of(String name) {
        return TagKey.of(RegistryKeys.BANNER_PATTERN, new Identifier(MonkeyBanners.MOD_ID, name));
    }
}
