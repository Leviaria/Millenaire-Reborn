package me.devupdates.millenaireReborn.common.registry;

import me.devupdates.millenaireReborn.MillenaireReborn;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * Custom Creative Tabs für alle Millénaire Kulturen
 */
public class MillCreativeTabs {
    
    // Registry Keys für alle Tabs
    public static final RegistryKey<ItemGroup> MILLENAIRE_BLOCKS = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "blocks"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_NORMAN = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "norman"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_BYZANTINE = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "byzantine"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_JAPANESE = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "japanese"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_MAYAN = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "mayan"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_INDIAN = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "indian"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_SELJUK = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "seljuk"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_INUIT = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "inuit"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_FOOD = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "food"));
    public static final RegistryKey<ItemGroup> MILLENAIRE_MISC = RegistryKey.of(RegistryKeys.ITEM_GROUP, 
        Identifier.of(MillenaireReborn.MOD_ID, "misc"));

    public static void init() {
        MillenaireReborn.LOGGER.info("Registering Millénaire Creative Tabs...");

        // 🧱 Millénaire Blocks Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_BLOCKS, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillBlocks.NORMAN_BRICKS))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.blocks"))
            .entries((displayContext, entries) -> {
                // Alle Blöcke hinzufügen
                entries.add(MillItems.NORMAN_BRICKS_ITEM);
                entries.add(MillItems.NORMAN_COBBLESTONE_ITEM);
                entries.add(MillItems.BYZANTINE_TILES_ITEM);
                entries.add(MillItems.BYZANTINE_SANDSTONE_ORNAMENT_ITEM);
                entries.add(MillItems.INDIAN_STONE_ORNAMENT_ITEM);
            })
            .build());

        // ⚔️ Norman Culture Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_NORMAN, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.NORMAN_BROADSWORD))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.norman"))
            .entries((displayContext, entries) -> {
                // Norman Tools
                entries.add(MillItems.NORMAN_PICKAXE);
                entries.add(MillItems.NORMAN_AXE);
                entries.add(MillItems.NORMAN_SHOVEL);
                entries.add(MillItems.NORMAN_HOE);
                entries.add(MillItems.NORMAN_BROADSWORD);
                
                // Norman Armor
                entries.add(MillItems.NORMAN_HELMET);
                entries.add(MillItems.NORMAN_PLATE);
                entries.add(MillItems.NORMAN_LEGS);
                entries.add(MillItems.NORMAN_BOOTS);
                
                // Norman Parchments
                entries.add(MillItems.PARCHMENT_NORMAN_VILLAGERS);
                entries.add(MillItems.PARCHMENT_NORMAN_ITEMS);
                entries.add(MillItems.PARCHMENT_NORMAN_BUILDINGS);
                entries.add(MillItems.PARCHMENT_NORMAN_FULL);

                // Norman Foods
                entries.add(MillItems.CIDER_APPLE);
                entries.add(MillItems.CIDER);
                entries.add(MillItems.BOUDIN);
                entries.add(MillItems.CALVA);
                entries.add(MillItems.TRIPES);
            })
            .build());

        // 🏛️ Byzantine Culture Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_BYZANTINE, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.BYZANTINE_MACE))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.byzantine"))
            .entries((displayContext, entries) -> {
                // Byzantine Tools
                entries.add(MillItems.BYZANTINE_PICKAXE);
                entries.add(MillItems.BYZANTINE_AXE);
                entries.add(MillItems.BYZANTINE_SHOVEL);
                entries.add(MillItems.BYZANTINE_HOE);
                entries.add(MillItems.BYZANTINE_MACE);
                
                // Byzantine Armor
                entries.add(MillItems.BYZANTINE_HELMET);
                entries.add(MillItems.BYZANTINE_PLATE);
                entries.add(MillItems.BYZANTINE_LEGS);
                entries.add(MillItems.BYZANTINE_BOOTS);
                
                // Byzantine Icons & Decorations
                entries.add(MillItems.BYZANTINE_ICON_SMALL);
                entries.add(MillItems.BYZANTINE_ICON_MEDIUM);
                entries.add(MillItems.BYZANTINE_ICON_LARGE);
                
                // Byzantine Clothes
                entries.add(MillItems.BYZANTINE_CLOTH_WOOL);
                entries.add(MillItems.BYZANTINE_CLOTH_SILK);

                // Byzantine Foods & Seeds
                entries.add(MillItems.GRAPES);
                entries.add(MillItems.WINE_BASIC);
                entries.add(MillItems.WINE_FANCY);
                entries.add(MillItems.FETA);
                entries.add(MillItems.SOUVLAKI);
                entries.add(MillItems.OLIVES);
                entries.add(MillItems.OLIVE_OIL);
            })
            .build());

        // 🏯 Japanese Culture Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_JAPANESE, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.TACHI_SWORD))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.japanese"))
            .entries((displayContext, entries) -> {
                // Japanese Weapons
                entries.add(MillItems.TACHI_SWORD);
                entries.add(MillItems.YUMI_BOW);
                
                // Japanese Red Samurai Armor
                entries.add(MillItems.JAPANESE_RED_HELMET);
                entries.add(MillItems.JAPANESE_RED_PLATE);
                entries.add(MillItems.JAPANESE_RED_LEGS);
                entries.add(MillItems.JAPANESE_RED_BOOTS);
                
                // Japanese Blue Samurai Armor
                entries.add(MillItems.JAPANESE_BLUE_HELMET);
                entries.add(MillItems.JAPANESE_BLUE_PLATE);
                entries.add(MillItems.JAPANESE_BLUE_LEGS);
                entries.add(MillItems.JAPANESE_BLUE_BOOTS);
                
                // Japanese Guard Armor
                entries.add(MillItems.JAPANESE_GUARD_HELMET);
                entries.add(MillItems.JAPANESE_GUARD_PLATE);
                entries.add(MillItems.JAPANESE_GUARD_LEGS);
                entries.add(MillItems.JAPANESE_GUARD_BOOTS);
                
                // Japanese Parchments
                entries.add(MillItems.PARCHMENT_JAPANESE_VILLAGERS);
                entries.add(MillItems.PARCHMENT_JAPANESE_ITEMS);
                entries.add(MillItems.PARCHMENT_JAPANESE_BUILDINGS);
                entries.add(MillItems.PARCHMENT_JAPANESE_FULL);

                // Japanese Foods
                entries.add(MillItems.SAKE);
                entries.add(MillItems.UDON);
                entries.add(MillItems.IKAYAKI);
                entries.add(MillItems.CHERRIES);
                entries.add(MillItems.CHERRY_BLOSSOM);
            })
            .build());

        // 🗿 Mayan Culture Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_MAYAN, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.MAYAN_QUEST_CROWN))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.mayan"))
            .entries((displayContext, entries) -> {
                // Mayan Tools & Weapons
                entries.add(MillItems.MAYAN_PICKAXE);
                entries.add(MillItems.MAYAN_AXE);
                entries.add(MillItems.MAYAN_SHOVEL);
                entries.add(MillItems.MAYAN_HOE);
                entries.add(MillItems.MAYAN_MACE);
                entries.add(MillItems.MAYAN_QUEST_CROWN);
                
                // Mayan Parchments
                entries.add(MillItems.PARCHMENT_MAYAN_VILLAGERS);
                entries.add(MillItems.PARCHMENT_MAYAN_ITEMS);
                entries.add(MillItems.PARCHMENT_MAYAN_BUILDINGS);
                entries.add(MillItems.PARCHMENT_MAYAN_FULL);

                // Mayan Foods & Seeds
                entries.add(MillItems.MAIZE);
                entries.add(MillItems.MASA);
                entries.add(MillItems.WAH);
                entries.add(MillItems.BALCHE);
                entries.add(MillItems.SIKIL_PAH);
                entries.add(MillItems.CACAUHAA);
            })
            .build());

        // 🕌 Indian Culture Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_INDIAN, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.INDIAN_STATUE))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.indian"))
            .entries((displayContext, entries) -> {                
                // Indian Decorations
                entries.add(MillItems.INDIAN_STATUE);
                entries.add(MillItems.BRICK_MOULD);
                
                // Indian Parchments
                entries.add(MillItems.PARCHMENT_INDIAN_VILLAGERS);
                entries.add(MillItems.PARCHMENT_INDIAN_ITEMS);
                entries.add(MillItems.PARCHMENT_INDIAN_BUILDINGS);
                entries.add(MillItems.PARCHMENT_INDIAN_FULL);
                entries.add(MillItems.PARCHMENT_SADHU);

                // Indian Seeds & Food
                entries.add(MillItems.RICE);
                entries.add(MillItems.TURMERIC);
                entries.add(MillItems.VEG_CURRY);
                entries.add(MillItems.CHICKEN_CURRY);
                entries.add(MillItems.RASGULLA);
            })
            .build());

        // ☪️ Seljuk Culture Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_SELJUK, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.SELJUK_SCIMITAR))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.seljuk"))
            .entries((displayContext, entries) -> {
                // Seljuk Weapons
                entries.add(MillItems.SELJUK_SCIMITAR);
                entries.add(MillItems.SELJUK_BOW);
                
                // Seljuk Armor
                entries.add(MillItems.SELJUK_HELMET);
                entries.add(MillItems.SELJUK_TURBAN);
                entries.add(MillItems.SELJUK_PLATE);
                entries.add(MillItems.SELJUK_LEGS);
                entries.add(MillItems.SELJUK_BOOTS);
                
                // Seljuk Decorations
                entries.add(MillItems.WALL_CARPET_SMALL);
                entries.add(MillItems.WALL_CARPET_MEDIUM);
                entries.add(MillItems.WALL_CARPET_LARGE);
                
                // Seljuk Clothes
                entries.add(MillItems.SELJUK_CLOTH_WOOL);
                entries.add(MillItems.SELJUK_CLOTH_COTTON);

                // Seljuk Foods
                entries.add(MillItems.YOGURT);
                entries.add(MillItems.AYRAN);
                entries.add(MillItems.PIDE);
                entries.add(MillItems.LOKUM);
                entries.add(MillItems.HELVA);
                entries.add(MillItems.PISTACHIOS);
            })
            .build());

        // 🏔️ Inuit Culture Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_INUIT, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.INUIT_TRIDENT))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.inuit"))
            .entries((displayContext, entries) -> {
                // Inuit Weapons & Tools
                entries.add(MillItems.INUIT_TRIDENT);
                entries.add(MillItems.INUIT_BOW);
                entries.add(MillItems.ULU);
                
                // Inuit Fur Armor
                entries.add(MillItems.FUR_HELMET);
                entries.add(MillItems.FUR_PLATE);
                entries.add(MillItems.FUR_LEGS);
                entries.add(MillItems.FUR_BOOTS);
                
                // Inuit Materials
                entries.add(MillItems.TANNED_HIDE);
                entries.add(MillItems.HIDE_HANGING);

                // Inuit Foods
                entries.add(MillItems.BEAR_MEAT_RAW);
                entries.add(MillItems.BEAR_MEAT_COOKED);
                entries.add(MillItems.WOLF_MEAT_RAW);
                entries.add(MillItems.WOLF_MEAT_COOKED);
                entries.add(MillItems.SEAFOOD_RAW);
                entries.add(MillItems.SEAFOOD_COOKED);
                entries.add(MillItems.INUIT_BEAR_STEW);
                entries.add(MillItems.INUIT_MEATY_STEW);
                entries.add(MillItems.INUIT_POTATO_STEW);
            })
            .build());

        // 🍖 Food Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_FOOD, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.SAKE))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.food"))
            .entries((displayContext, entries) -> {
                // Norman Foods
                entries.add(MillItems.CIDER_APPLE);
                entries.add(MillItems.CIDER);
                entries.add(MillItems.BOUDIN);
                entries.add(MillItems.CALVA);
                entries.add(MillItems.TRIPES);

                // Byzantine Foods & Seeds
                entries.add(MillItems.GRAPES);
                entries.add(MillItems.WINE_BASIC);
                entries.add(MillItems.WINE_FANCY);
                entries.add(MillItems.FETA);
                entries.add(MillItems.SOUVLAKI);
                entries.add(MillItems.OLIVES);
                entries.add(MillItems.OLIVE_OIL);

                // Japanese Foods
                entries.add(MillItems.SAKE);
                entries.add(MillItems.UDON);
                entries.add(MillItems.IKAYAKI);
                entries.add(MillItems.CHERRIES);
                entries.add(MillItems.CHERRY_BLOSSOM);

                // Mayan Foods & Seeds
                entries.add(MillItems.MAIZE);
                entries.add(MillItems.MASA);
                entries.add(MillItems.WAH);
                entries.add(MillItems.BALCHE);
                entries.add(MillItems.SIKIL_PAH);
                entries.add(MillItems.CACAUHAA);

                // Indian Seeds & Food
                entries.add(MillItems.RICE);
                entries.add(MillItems.TURMERIC);
                entries.add(MillItems.VEG_CURRY);
                entries.add(MillItems.CHICKEN_CURRY);
                entries.add(MillItems.RASGULLA);

                // Seljuk Foods
                entries.add(MillItems.YOGURT);
                entries.add(MillItems.AYRAN);
                entries.add(MillItems.PIDE);
                entries.add(MillItems.LOKUM);
                entries.add(MillItems.HELVA);
                entries.add(MillItems.PISTACHIOS);

                // Inuit Foods
                entries.add(MillItems.BEAR_MEAT_RAW);
                entries.add(MillItems.BEAR_MEAT_COOKED);
                entries.add(MillItems.WOLF_MEAT_RAW);
                entries.add(MillItems.WOLF_MEAT_COOKED);
                entries.add(MillItems.SEAFOOD_RAW);
                entries.add(MillItems.SEAFOOD_COOKED);
                entries.add(MillItems.INUIT_BEAR_STEW);
                entries.add(MillItems.INUIT_MEATY_STEW);
                entries.add(MillItems.INUIT_POTATO_STEW);                
            })
            .build());

        // 🎭 Miscellaneous Tab
        Registry.register(Registries.ITEM_GROUP, MILLENAIRE_MISC, FabricItemGroup.builder()
            .icon(() -> new ItemStack(MillItems.VISHNU_AMULET))
            .displayName(Text.translatable("itemgroup.millenaire-reborn.misc"))
            .entries((displayContext, entries) -> {
                // General Items
                entries.add(MillItems.DENIER);
                entries.add(MillItems.DENIER_POUCH);
                entries.add(MillItems.MILLENAIRE_BOOK);
                entries.add(MillItems.NEGATION_WAND);
                
                // Paint Buckets (alle 16 Farben)
                entries.add(MillItems.PAINT_BUCKET_WHITE);
                entries.add(MillItems.PAINT_BUCKET_ORANGE);
                entries.add(MillItems.PAINT_BUCKET_MAGENTA);
                entries.add(MillItems.PAINT_BUCKET_LIGHT_BLUE);
                entries.add(MillItems.PAINT_BUCKET_YELLOW);
                entries.add(MillItems.PAINT_BUCKET_LIME);
                entries.add(MillItems.PAINT_BUCKET_PINK);
                entries.add(MillItems.PAINT_BUCKET_GRAY);

                entries.add(MillItems.PAINT_BUCKET_CYAN);
                entries.add(MillItems.PAINT_BUCKET_PURPLE);
                entries.add(MillItems.PAINT_BUCKET_BLUE);
                entries.add(MillItems.PAINT_BUCKET_BROWN);
                entries.add(MillItems.PAINT_BUCKET_GREEN);
                entries.add(MillItems.PAINT_BUCKET_RED);
                entries.add(MillItems.PAINT_BUCKET_BLACK);
                
                // Amulets
                entries.add(MillItems.VISHNU_AMULET);
                entries.add(MillItems.YGGDRASIL_AMULET);
                entries.add(MillItems.ALCHEMIST_AMULET);
                entries.add(MillItems.SKOLL_HATI_AMULET);
                
                // Wall Decorations
                entries.add(MillItems.TAPESTRY);
                
                // Special Items
                entries.add(MillItems.VILLAGE_BANNER);
                entries.add(MillItems.CULTURE_BANNER);
                entries.add(MillItems.SILK);
                entries.add(MillItems.OBSIDIAN_FLAKE);
                entries.add(MillItems.UNKNOWN_POWDER);
                
                // Seeds
                entries.add(MillItems.RICE);
                entries.add(MillItems.TURMERIC);
            })
            .build());

        MillenaireReborn.LOGGER.info("Successfully registered {} creative tabs", 10);
    }
}