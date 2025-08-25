package me.devupdates.millenaireReborn.common.registry;

import javax.tools.Tool;

import me.devupdates.millenaireReborn.MillenaireReborn;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

/**
 * Registry für alle Millénaire Items
 */
public class MillItems {
    
    // Items werden lazy initialisiert (wie Blocks)
    public static Item DENIER;
    public static Item DENIER_POUCH;
    public static Item MILLENAIRE_BOOK;
    public static Item NEGATION_WAND;
    
    // Block Items werden nach Block-Registrierung erstellt
    public static Item NORMAN_BRICKS_ITEM;
    public static Item NORMAN_COBBLESTONE_ITEM;
    public static Item BYZANTINE_TILES_ITEM;
    public static Item BYZANTINE_SANDSTONE_ORNAMENT_ITEM;
    public static Item INDIAN_STONE_ORNAMENT_ITEM;

    // Norman Tools & Weapons
    public static Item NORMAN_PICKAXE;
    public static Item NORMAN_AXE;
    public static Item NORMAN_SHOVEL;
    public static Item NORMAN_HOE;
    public static Item NORMAN_BROADSWORD;

    // Norman Armor
    public static Item NORMAN_HELMET;
    public static Item NORMAN_PLATE;
    public static Item NORMAN_LEGS;
    public static Item NORMAN_BOOTS;

        // Norman Parchments
    public static Item PARCHMENT_NORMAN_VILLAGERS;
    public static Item PARCHMENT_NORMAN_ITEMS;
    public static Item PARCHMENT_NORMAN_BUILDINGS;
    public static Item PARCHMENT_NORMAN_FULL;

    // BYZANTINE ITEMS
    // Byzantine Tools & Weapons
    public static Item BYZANTINE_PICKAXE;
    public static Item BYZANTINE_AXE;
    public static Item BYZANTINE_SHOVEL;
    public static Item BYZANTINE_HOE;
    public static Item BYZANTINE_MACE;

    // Byzantine Armor
    public static Item BYZANTINE_HELMET;
    public static Item BYZANTINE_PLATE;
    public static Item BYZANTINE_LEGS;
    public static Item BYZANTINE_BOOTS;

    // Byzantine Icons & Decorations
    public static Item BYZANTINE_ICON_SMALL;
    public static Item BYZANTINE_ICON_MEDIUM;
    public static Item BYZANTINE_ICON_LARGE;

    // Byzantine Clothes
    public static Item BYZANTINE_CLOTH_WOOL;
    public static Item BYZANTINE_CLOTH_SILK;

    // JAPANESE ITEMS
    // Japanese Weapons
    public static Item TACHI_SWORD;
    public static Item YUMI_BOW;

    // Japanese Red Samurai Armor
    public static Item JAPANESE_RED_HELMET;
    public static Item JAPANESE_RED_PLATE;
    public static Item JAPANESE_RED_LEGS;
    public static Item JAPANESE_RED_BOOTS;

    // Japanese Blue Samurai Armor
    public static Item JAPANESE_BLUE_HELMET;
    public static Item JAPANESE_BLUE_PLATE;
    public static Item JAPANESE_BLUE_LEGS;
    public static Item JAPANESE_BLUE_BOOTS;

    // Japanese Guard Armor
    public static Item JAPANESE_GUARD_HELMET;
    public static Item JAPANESE_GUARD_PLATE;
    public static Item JAPANESE_GUARD_LEGS;
    public static Item JAPANESE_GUARD_BOOTS;

    // Japanese Parchments
    public static Item PARCHMENT_JAPANESE_VILLAGERS;
    public static Item PARCHMENT_JAPANESE_ITEMS;
    public static Item PARCHMENT_JAPANESE_BUILDINGS;
    public static Item PARCHMENT_JAPANESE_FULL;

    // MAYAN ITEMS
    // Mayan Tools & Weapons
    public static Item MAYAN_PICKAXE;
    public static Item MAYAN_AXE;
    public static Item MAYAN_SHOVEL;
    public static Item MAYAN_HOE;
    public static Item MAYAN_MACE;
    public static Item MAYAN_QUEST_CROWN;

    // Mayan Parchments
    public static Item PARCHMENT_MAYAN_VILLAGERS;
    public static Item PARCHMENT_MAYAN_ITEMS;
    public static Item PARCHMENT_MAYAN_BUILDINGS;
    public static Item PARCHMENT_MAYAN_FULL;

    // INDIAN ITEMS
    // Indian Seeds & Food
    public static Item RICE;
    public static Item TURMERIC;
    public static Item VEG_CURRY;
    public static Item CHICKEN_CURRY;
    public static Item RASGULLA;

    // Indian Decorations
    public static Item INDIAN_STATUE;
    public static Item BRICK_MOULD;

    // Indian Parchments
    public static Item PARCHMENT_INDIAN_VILLAGERS;
    public static Item PARCHMENT_INDIAN_ITEMS;
    public static Item PARCHMENT_INDIAN_BUILDINGS;
    public static Item PARCHMENT_INDIAN_FULL;
    public static Item PARCHMENT_SADHU;

    // SELJUK ITEMS
    // Seljuk Weapons
    public static Item SELJUK_SCIMITAR;
    public static Item SELJUK_BOW;

    // Seljuk Armor
    public static Item SELJUK_HELMET;
    public static Item SELJUK_TURBAN;
    public static Item SELJUK_PLATE;
    public static Item SELJUK_LEGS;
    public static Item SELJUK_BOOTS;

    // Seljuk Foods
    public static Item YOGURT;
    public static Item AYRAN;
    public static Item PIDE;
    public static Item LOKUM;
    public static Item HELVA;
    public static Item PISTACHIOS;

    // Seljuk Decorations
    public static Item WALL_CARPET_SMALL;
    public static Item WALL_CARPET_MEDIUM;
    public static Item WALL_CARPET_LARGE;

    // Seljuk Clothes
    public static Item SELJUK_CLOTH_WOOL;
    public static Item SELJUK_CLOTH_COTTON;

    // INUIT ITEMS
    // Inuit Weapons & Tools
    public static Item INUIT_TRIDENT;
    public static Item INUIT_BOW;
    public static Item ULU;

    // Inuit Fur Armor
    public static Item FUR_HELMET;
    public static Item FUR_PLATE;
    public static Item FUR_LEGS;
    public static Item FUR_BOOTS;

    // Inuit Foods
    public static Item BEAR_MEAT_RAW;
    public static Item BEAR_MEAT_COOKED;
    public static Item WOLF_MEAT_RAW;
    public static Item WOLF_MEAT_COOKED;
    public static Item SEAFOOD_RAW;
    public static Item SEAFOOD_COOKED;
    public static Item INUIT_BEAR_STEW;
    public static Item INUIT_MEATY_STEW;
    public static Item INUIT_POTATO_STEW;

    // Inuit Materials
    public static Item TANNED_HIDE;
    public static Item HIDE_HANGING;

    // SPECIAL ITEMS
    // Paint Buckets (alle 16 Farben)
    public static Item PAINT_BUCKET_WHITE;
    public static Item PAINT_BUCKET_ORANGE;
    public static Item PAINT_BUCKET_MAGENTA;
    public static Item PAINT_BUCKET_LIGHT_BLUE;
    public static Item PAINT_BUCKET_YELLOW;
    public static Item PAINT_BUCKET_LIME;
    public static Item PAINT_BUCKET_PINK;
    public static Item PAINT_BUCKET_GRAY;

    public static Item PAINT_BUCKET_CYAN;
    public static Item PAINT_BUCKET_PURPLE;
    public static Item PAINT_BUCKET_BLUE;
    public static Item PAINT_BUCKET_BROWN;
    public static Item PAINT_BUCKET_GREEN;
    public static Item PAINT_BUCKET_RED;
    public static Item PAINT_BUCKET_BLACK;

    // Amulets
    public static Item VISHNU_AMULET;
    public static Item YGGDRASIL_AMULET;
    public static Item ALCHEMIST_AMULET;
    public static Item SKOLL_HATI_AMULET;

    // Wall Decorations
    public static Item TAPESTRY;

    // Special Foods
    public static Item SAKE;
    public static Item UDON;
    public static Item IKAYAKI;
    public static Item WINE_BASIC;
    public static Item WINE_FANCY;
    public static Item SOUVLAKI;
    public static Item FETA;

    // Special Items
    public static Item VILLAGE_BANNER;
    public static Item CULTURE_BANNER;
    public static Item SILK;
    public static Item OBSIDIAN_FLAKE;
    public static Item UNKNOWN_POWDER;

    // TODO: Tool und Armor Materials später implementieren wenn wir die korrekte 1.21.8 API gefunden haben
    public static final ToolMaterial NORMAN_TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 10.0F, 4.0F, 10, ItemTags.DIAMOND_TOOL_MATERIALS);
    public static final ToolMaterial BYZANTINE_TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 12.0F, 3.0F, 15, ItemTags.DIAMOND_TOOL_MATERIALS);
    public static final ToolMaterial OBSIDIAN_TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 6.0F, 2.0F, 25, ItemTags.DIAMOND_TOOL_MATERIALS);
    public static final ToolMaterial BETTER_STEEL_TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 5.0F, 3.0F, 10, ItemTags.DIAMOND_TOOL_MATERIALS);
    
    /**
     * Erstellt Item-Settings mit korrekter Registry-Key
     */
    private static Item.Settings createSettings(String name) {
        // Registry Key explizit setzen um "Item id not set" zu vermeiden
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, 
            Identifier.of(MillenaireReborn.MOD_ID, name));
            
        return new Item.Settings()
            .registryKey(key);
    }
    
    /**
     * Registriert ein Item
     */
    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM,
            Identifier.of(MillenaireReborn.MOD_ID, name), item);
    }
    
    /**
     * Initialisiert die Item-Registry und fügt Items zu Creative-Tabs hinzu
     */
    public static void init() {
        MillenaireReborn.LOGGER.info("Registering Millénaire items...");
        
        // Normale Items mit explizitem Registry Key
        DENIER = register("denier", 
            new Item(createSettings("denier")));
        
        DENIER_POUCH = register("denier_pouch",
            new Item(createSettings("denier_pouch")));
            
        MILLENAIRE_BOOK = register("millenaire_book",
            new Item(createSettings("millenaire_book")));
            
        NEGATION_WAND = register("negation_wand",
            new Item(createSettings("negation_wand").maxCount(1)));
        
        // Block Items registrieren (nach Block-Registrierung)
        NORMAN_BRICKS_ITEM = register("norman_bricks",
            new BlockItem(MillBlocks.NORMAN_BRICKS, createSettings("norman_bricks")));
            
        NORMAN_COBBLESTONE_ITEM = register("norman_cobblestone",
            new BlockItem(MillBlocks.NORMAN_COBBLESTONE, createSettings("norman_cobblestone")));
            
        BYZANTINE_TILES_ITEM = register("byzantine_tiles",
            new BlockItem(MillBlocks.BYZANTINE_TILES, createSettings("byzantine_tiles")));
            
        BYZANTINE_SANDSTONE_ORNAMENT_ITEM = register("byzantine_sandstone_ornament",
            new BlockItem(MillBlocks.BYZANTINE_SANDSTONE_ORNAMENT, createSettings("byzantine_sandstone_ornament")));
            
        INDIAN_STONE_ORNAMENT_ITEM = register("indian_stone_ornament",
            new BlockItem(MillBlocks.INDIAN_STONE_ORNAMENT, createSettings("indian_stone_ornament")));

        // Norman Tools (erstmal als basic Items - später zu richtigen Tools upgraden)
        NORMAN_PICKAXE = register("normanpickaxe", new Item(createSettings("normanpickaxe").pickaxe(NORMAN_TOOL_MATERIAL, 1, -2.8f)));
        NORMAN_AXE = register("normanaxe", new AxeItem(NORMAN_TOOL_MATERIAL, 4, -3, createSettings("normanaxe")));
        NORMAN_SHOVEL = register("normanshovel", new ShovelItem(NORMAN_TOOL_MATERIAL, 1.5f, -3, createSettings("normanshovel")));
        NORMAN_HOE = register("normanhoe", new HoeItem(NORMAN_TOOL_MATERIAL, -4, 1, createSettings("normanhoe")));
        NORMAN_BROADSWORD = register("normanbroadsword", new Item(createSettings("normanbroadsword").sword(NORMAN_TOOL_MATERIAL, 3, -2.4f)));

        // Norman Armor (erstmal als basic Items - später zu richtiger Armor upgraden)
        NORMAN_HELMET = register("normanhelmet", new Item(createSettings("normanhelmet")));
        NORMAN_PLATE = register("normanplate", new Item(createSettings("normanplate")));
        NORMAN_LEGS = register("normanlegs", new Item(createSettings("normanlegs")));
        NORMAN_BOOTS = register("normanboots", new Item(createSettings("normanboots")));

        // Norman Parchments
        PARCHMENT_NORMAN_VILLAGERS = register("parchment_normanvillagers", new Item(createSettings("parchment_normanvillagers")));
        PARCHMENT_NORMAN_ITEMS = register("parchment_normanitems", new Item(createSettings("parchment_normanitems")));
        PARCHMENT_NORMAN_BUILDINGS = register("parchment_normanbuildings", new Item(createSettings("parchment_normanbuildings")));
        PARCHMENT_NORMAN_FULL = register("parchment_normanfull", new Item(createSettings("parchment_normanfull")));

        // BYZANTINE ITEMS
        // Byzantine Tools (als Items - später zu Tools upgraden)
        BYZANTINE_PICKAXE = register("byzantinepickaxe", new Item(createSettings("byzantinepickaxe").pickaxe(BYZANTINE_TOOL_MATERIAL, 1, -2.8f)));
        BYZANTINE_AXE = register("byzantineaxe", new AxeItem(BYZANTINE_TOOL_MATERIAL, 5, -3, createSettings("byzantineaxe")));
        BYZANTINE_SHOVEL = register("byzantineshovel", new ShovelItem(BYZANTINE_TOOL_MATERIAL, 1.5f, -3, createSettings("byzantineshovel")));
        BYZANTINE_HOE = register("byzantinehoe", new HoeItem(BYZANTINE_TOOL_MATERIAL, -3, 0, createSettings("byzantinehoe")));
        BYZANTINE_MACE = register("byzantinemace", new Item(createSettings("byzantinemace").sword(BYZANTINE_TOOL_MATERIAL, 2, -2.4f)));

        // Byzantine Armor (als Items - später zu Armor upgraden)
        BYZANTINE_HELMET = register("byzantinehelmet", new Item(createSettings("byzantinehelmet")));
        BYZANTINE_PLATE = register("byzantineplate", new Item(createSettings("byzantineplate")));
        BYZANTINE_LEGS = register("byzantinelegs", new Item(createSettings("byzantinelegs")));
        BYZANTINE_BOOTS = register("byzantineboots", new Item(createSettings("byzantineboots")));

        // Byzantine Icons & Decorations
        BYZANTINE_ICON_SMALL = register("byzantineiconsmall", new Item(createSettings("byzantineiconsmall")));
        BYZANTINE_ICON_MEDIUM = register("byzantineiconmedium", new Item(createSettings("byzantineiconmedium")));
        BYZANTINE_ICON_LARGE = register("byzantineiconlarge", new Item(createSettings("byzantineiconlarge")));

        // Byzantine Clothes
        BYZANTINE_CLOTH_WOOL = register("clothes_byz_wool", new Item(createSettings("clothes_byz_wool")));
        BYZANTINE_CLOTH_SILK = register("clothes_byz_silk", new Item(createSettings("clothes_byz_silk")));

        // JAPANESE ITEMS
        // Japanese Weapons (als Items - später zu richtigen Weapons upgraden)
        TACHI_SWORD = register("tachisword", new Item(createSettings("tachisword").sword(BETTER_STEEL_TOOL_MATERIAL, 2, -2.4f)));
        YUMI_BOW = register("yumibow", new Item(createSettings("yumibow").maxCount(1)));

        // Japanese Red Samurai Armor
        JAPANESE_RED_HELMET = register("japaneseredhelmet", new Item(createSettings("japaneseredhelmet")));
        JAPANESE_RED_PLATE = register("japaneseredplate", new Item(createSettings("japaneseredplate")));
        JAPANESE_RED_LEGS = register("japaneseredlegs", new Item(createSettings("japaneseredlegs")));
        JAPANESE_RED_BOOTS = register("japaneseredboots", new Item(createSettings("japaneseredboots")));

        // Japanese Blue Samurai Armor
        JAPANESE_BLUE_HELMET = register("japanesebluehelmet", new Item(createSettings("japanesebluehelmet")));
        JAPANESE_BLUE_PLATE = register("japaneseblueplate", new Item(createSettings("japaneseblueplate")));
        JAPANESE_BLUE_LEGS = register("japanesebluelegs", new Item(createSettings("japanesebluelegs")));
        JAPANESE_BLUE_BOOTS = register("japaneseblueboots", new Item(createSettings("japaneseblueboots")));

        // Japanese Guard Armor
        JAPANESE_GUARD_HELMET = register("japaneseguardhelmet", new Item(createSettings("japaneseguardhelmet")));
        JAPANESE_GUARD_PLATE = register("japaneseguardplate", new Item(createSettings("japaneseguardplate")));
        JAPANESE_GUARD_LEGS = register("japaneseguardlegs", new Item(createSettings("japaneseguardlegs")));
        JAPANESE_GUARD_BOOTS = register("japaneseguardboots", new Item(createSettings("japaneseguardboots")));

        // Japanese Parchments
        PARCHMENT_JAPANESE_VILLAGERS = register("parchment_japanesevillagers", new Item(createSettings("parchment_japanesevillagers")));
        PARCHMENT_JAPANESE_ITEMS = register("parchment_japaneseitems", new Item(createSettings("parchment_japaneseitems")));
        PARCHMENT_JAPANESE_BUILDINGS = register("parchment_japanesebuildings", new Item(createSettings("parchment_japanesebuildings")));
        PARCHMENT_JAPANESE_FULL = register("parchment_japanesefull", new Item(createSettings("parchment_japanesefull")));

        // MAYAN ITEMS  
        // Mayan Tools (als Items - später zu Tools upgraden)
        MAYAN_PICKAXE = register("mayanpickaxe", new Item(createSettings("mayanpickaxe").pickaxe(OBSIDIAN_TOOL_MATERIAL, 1, -2.8f)));
        MAYAN_AXE = register("mayanaxe", new AxeItem(OBSIDIAN_TOOL_MATERIAL, 6, -3, createSettings("mayanaxe")));
        MAYAN_SHOVEL = register("mayanshovel", new ShovelItem(OBSIDIAN_TOOL_MATERIAL, 1.5f, -3, createSettings("mayanshovel")));
        MAYAN_HOE = register("mayanhoe", new HoeItem(OBSIDIAN_TOOL_MATERIAL, -2, -1, createSettings("mayanhoe")));
        MAYAN_MACE = register("mayanmace", new Item(createSettings("mayanmace").sword(OBSIDIAN_TOOL_MATERIAL, 3, -2.4f)));
        MAYAN_QUEST_CROWN = register("mayanquestcrown", new Item(createSettings("mayanquestcrown").maxCount(1)));

        // Mayan Parchments
        PARCHMENT_MAYAN_VILLAGERS = register("parchment_mayanvillagers", new Item(createSettings("parchment_mayanvillagers")));
        PARCHMENT_MAYAN_ITEMS = register("parchment_mayanitems", new Item(createSettings("parchment_mayanitems")));
        PARCHMENT_MAYAN_BUILDINGS = register("parchment_mayanbuildings", new Item(createSettings("parchment_mayanbuildings")));
        PARCHMENT_MAYAN_FULL = register("parchment_mayanfull", new Item(createSettings("parchment_mayanfull")));

        // INDIAN ITEMS
        // Indian Seeds & Food
        RICE = register("rice", new Item(createSettings("rice")));
        TURMERIC = register("turmeric", new Item(createSettings("turmeric")));
        VEG_CURRY = register("vegcurry", new Item(createSettings("vegcurry")));
        CHICKEN_CURRY = register("chickencurry", new Item(createSettings("chickencurry")));
        RASGULLA = register("rasgulla", new Item(createSettings("rasgulla")));

        // Indian Decorations
        INDIAN_STATUE = register("indianstatue", new Item(createSettings("indianstatue")));
        BRICK_MOULD = register("brickmould", new Item(createSettings("brickmould").maxCount(1)));

        // Indian Parchments
        PARCHMENT_INDIAN_VILLAGERS = register("parchment_indianvillagers", new Item(createSettings("parchment_indianvillagers")));
        PARCHMENT_INDIAN_ITEMS = register("parchment_indianitems", new Item(createSettings("parchment_indianitems")));
        PARCHMENT_INDIAN_BUILDINGS = register("parchment_indianbuildings", new Item(createSettings("parchment_indianbuildings")));
        PARCHMENT_INDIAN_FULL = register("parchment_indianfull", new Item(createSettings("parchment_indianfull")));
        PARCHMENT_SADHU = register("parchment_sadhu", new Item(createSettings("parchment_sadhu")));

        // SELJUK ITEMS
        // Seljuk Weapons (als Items - später zu richtigen Weapons upgraden)
        SELJUK_SCIMITAR = register("seljukscimitar", new Item(createSettings("seljukscimitar").sword(BETTER_STEEL_TOOL_MATERIAL, 3, -2.4f)));
        SELJUK_BOW = register("seljukbow", new Item(createSettings("seljukbow").maxCount(1)));

        // Seljuk Armor (als Items - später zu Armor upgraden)
        SELJUK_HELMET = register("seljukhelmet", new Item(createSettings("seljukhelmet")));
        SELJUK_TURBAN = register("seljukturban", new Item(createSettings("seljukturban")));
        SELJUK_PLATE = register("seljukplate", new Item(createSettings("seljukplate")));
        SELJUK_LEGS = register("seljuklegs", new Item(createSettings("seljuklegs")));
        SELJUK_BOOTS = register("seljukboots", new Item(createSettings("seljukboots")));

        // Seljuk Foods  
        YOGURT = register("yogurt", new Item(createSettings("yogurt")));
        AYRAN = register("ayran", new Item(createSettings("ayran")));
        PIDE = register("pide", new Item(createSettings("pide")));
        LOKUM = register("lokum", new Item(createSettings("lokum")));
        HELVA = register("helva", new Item(createSettings("helva")));
        PISTACHIOS = register("pistachios", new Item(createSettings("pistachios")));

        // Seljuk Decorations
        WALL_CARPET_SMALL = register("wallcarpetsmall", new Item(createSettings("wallcarpetsmall")));
        WALL_CARPET_MEDIUM = register("wallcarpetmedium", new Item(createSettings("wallcarpetmedium")));
        WALL_CARPET_LARGE = register("wallcarpetlarge", new Item(createSettings("wallcarpetlarge")));

        // Seljuk Clothes
        SELJUK_CLOTH_WOOL = register("clothes_seljuk_wool", new Item(createSettings("clothes_seljuk_wool")));
        SELJUK_CLOTH_COTTON = register("clothes_seljuk_cotton", new Item(createSettings("clothes_seljuk_cotton")));

        // INUIT ITEMS
        // Inuit Weapons & Tools (als Items - später zu richtigen Tools upgraden)
        INUIT_TRIDENT = register("inuittrident", new Item(createSettings("inuittrident").sword(ToolMaterial.IRON, 3, -2.4f)));
        INUIT_BOW = register("inuitbow", new Item(createSettings("inuitbow").maxCount(1)));
        ULU = register("ulu", new Item(createSettings("ulu").maxCount(1)));

        // Inuit Fur Armor (als Items - später zu Armor upgraden)
        FUR_HELMET = register("furhelmet", new Item(createSettings("furhelmet")));
        FUR_PLATE = register("furplate", new Item(createSettings("furplate")));
        FUR_LEGS = register("furlegs", new Item(createSettings("furlegs")));
        FUR_BOOTS = register("furboots", new Item(createSettings("furboots")));

        // Inuit Foods
        BEAR_MEAT_RAW = register("bearmeat_raw", new Item(createSettings("bearmeat_raw")));
        BEAR_MEAT_COOKED = register("bearmeat_cooked", new Item(createSettings("bearmeat_cooked")));
        WOLF_MEAT_RAW = register("wolfmeat_raw", new Item(createSettings("wolfmeat_raw")));
        WOLF_MEAT_COOKED = register("wolfmeat_cooked", new Item(createSettings("wolfmeat_cooked")));
        SEAFOOD_RAW = register("seafood_raw", new Item(createSettings("seafood_raw")));
        SEAFOOD_COOKED = register("seafood_cooked", new Item(createSettings("seafood_cooked")));
        INUIT_BEAR_STEW = register("inuitbearstew", new Item(createSettings("inuitbearstew")));
        INUIT_MEATY_STEW = register("inuitmeatystew", new Item(createSettings("inuitmeatystew")));
        INUIT_POTATO_STEW = register("inuitpotatostew", new Item(createSettings("inuitpotatostew")));

        // Inuit Materials
        TANNED_HIDE = register("tannedhide", new Item(createSettings("tannedhide")));
        HIDE_HANGING = register("hidehanging", new Item(createSettings("hidehanging")));

        // SPECIAL ITEMS
        // Paint Buckets (alle 16 Farben) - maxCount(1) da sie Tools sind
        PAINT_BUCKET_WHITE = register("paint_bucket_white", new Item(createSettings("paint_bucket_white").maxCount(1)));
        PAINT_BUCKET_ORANGE = register("paint_bucket_orange", new Item(createSettings("paint_bucket_orange").maxCount(1)));
        PAINT_BUCKET_MAGENTA = register("paint_bucket_magenta", new Item(createSettings("paint_bucket_magenta").maxCount(1)));
        PAINT_BUCKET_LIGHT_BLUE = register("paint_bucket_light_blue", new Item(createSettings("paint_bucket_light_blue").maxCount(1)));
        PAINT_BUCKET_YELLOW = register("paint_bucket_yellow", new Item(createSettings("paint_bucket_yellow").maxCount(1)));
        PAINT_BUCKET_LIME = register("paint_bucket_lime", new Item(createSettings("paint_bucket_lime").maxCount(1)));
        PAINT_BUCKET_PINK = register("paint_bucket_pink", new Item(createSettings("paint_bucket_pink").maxCount(1)));
        PAINT_BUCKET_GRAY = register("paint_bucket_gray", new Item(createSettings("paint_bucket_gray").maxCount(1)));

        PAINT_BUCKET_CYAN = register("paint_bucket_cyan", new Item(createSettings("paint_bucket_cyan").maxCount(1)));
        PAINT_BUCKET_PURPLE = register("paint_bucket_purple", new Item(createSettings("paint_bucket_purple").maxCount(1)));
        PAINT_BUCKET_BLUE = register("paint_bucket_blue", new Item(createSettings("paint_bucket_blue").maxCount(1)));
        PAINT_BUCKET_BROWN = register("paint_bucket_brown", new Item(createSettings("paint_bucket_brown").maxCount(1)));
        PAINT_BUCKET_GREEN = register("paint_bucket_green", new Item(createSettings("paint_bucket_green").maxCount(1)));
        PAINT_BUCKET_RED = register("paint_bucket_red", new Item(createSettings("paint_bucket_red").maxCount(1)));
        PAINT_BUCKET_BLACK = register("paint_bucket_black", new Item(createSettings("paint_bucket_black").maxCount(1)));

        // Amulets (maxCount(1) da sie einzigartig sind)
        VISHNU_AMULET = register("vishnu_amulet", new Item(createSettings("vishnu_amulet").maxCount(1)));
        YGGDRASIL_AMULET = register("yggdrasil_amulet", new Item(createSettings("yggdrasil_amulet").maxCount(1)));
        ALCHEMIST_AMULET = register("alchemist_amulet", new Item(createSettings("alchemist_amulet").maxCount(1)));
        SKOLL_HATI_AMULET = register("skoll_hati_amulet", new Item(createSettings("skoll_hati_amulet").maxCount(1)));

        // Wall Decorations
        TAPESTRY = register("tapestry", new Item(createSettings("tapestry")));

        // Special Foods
        SAKE = register("sake", new Item(createSettings("sake")));
        UDON = register("udon", new Item(createSettings("udon")));
        IKAYAKI = register("ikayaki", new Item(createSettings("ikayaki")));
        WINE_BASIC = register("winebasic", new Item(createSettings("winebasic")));
        WINE_FANCY = register("winefancy", new Item(createSettings("winefancy")));
        SOUVLAKI = register("souvlaki", new Item(createSettings("souvlaki")));
        FETA = register("feta", new Item(createSettings("feta")));

        // Special Items
        VILLAGE_BANNER = register("villagebanner", new Item(createSettings("villagebanner")));
        CULTURE_BANNER = register("culturebanner", new Item(createSettings("culturebanner")));
        SILK = register("silk", new Item(createSettings("silk")));
        OBSIDIAN_FLAKE = register("obsidianflake", new Item(createSettings("obsidianflake")));
        UNKNOWN_POWDER = register("unknownpowder", new Item(createSettings("unknownpowder")));

        // Items werden durch Custom Creative Tabs organisiert
        // Keine Vanilla-Tab-Modifikationen mehr nötig
        
        MillenaireReborn.LOGGER.info("Successfully registered {} items", 163);
    }
}
