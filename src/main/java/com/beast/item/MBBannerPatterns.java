package com.beast.item;

import com.beast.MonkeyBanners;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class MBBannerPatterns {

    public static final RegistryKey<BannerPattern> CHI = of("chi");
    public static final RegistryKey<BannerPattern> BONGO = of("bongo");
    public static final RegistryKey<BannerPattern> NUT = of("nut");
    public static final RegistryKey<BannerPattern> CHIQUIS = of("chiquis");
    public static final RegistryKey<BannerPattern> KIKO = of("kiko");

    public static final RegistryKey<BannerPattern> CIRCLE_75 = of("circle_75");
    public static final RegistryKey<BannerPattern> CIRCLE_50 = of("circle_50");
    public static final RegistryKey<BannerPattern> CIRCLE_25 = of("circle_25");

    public static final RegistryKey<BannerPattern> BANANA_FILL = of("banana_fill");
    public static final RegistryKey<BannerPattern> BANANA = of("banana");

    public static final RegistryKey<BannerPattern> BANANA_RIGHT_FILL = of("banana_right_fill");
    public static final RegistryKey<BannerPattern> BANANA_RIGHT = of("banana_right");

    public MBBannerPatterns () {
    }

    private static RegistryKey<BannerPattern> of(String id) {
        return RegistryKey.of(RegistryKeys.BANNER_PATTERN, new Identifier(MonkeyBanners.MOD_ID, id));
    }

    public static void register (Registry<BannerPattern> registry) {

        Registry.register(registry, CHI, new BannerPattern("mb_chi"));
        Registry.register(registry, BONGO, new BannerPattern("mb_bongo"));
        Registry.register(registry, NUT, new BannerPattern("mb_nut"));
        Registry.register(registry, CHIQUIS, new BannerPattern("mb_chiquis"));
        Registry.register(registry, KIKO, new BannerPattern("mb_kiko"));

        Registry.register(registry, CIRCLE_75, new BannerPattern("mb_circle_75"));
        Registry.register(registry, CIRCLE_50, new BannerPattern("mb_circle_50"));
        Registry.register(registry, CIRCLE_25, new BannerPattern("mb_circle_25"));

        Registry.register(registry, BANANA_FILL, new BannerPattern("mb_banana_fill"));
        Registry.register(registry, BANANA, new BannerPattern("mb_banana"));

        Registry.register(registry, BANANA_RIGHT_FILL, new BannerPattern("mb_banana_right_fill"));
        Registry.register(registry, BANANA_RIGHT, new BannerPattern("mb_banana_right"));

    }
}