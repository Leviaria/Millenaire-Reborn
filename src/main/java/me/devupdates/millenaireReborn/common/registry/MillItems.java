package me.devupdates.millenaireReborn.common.registry;

import java.util.Map;

import javax.tools.Tool;

import me.devupdates.millenaireReborn.MillenaireReborn;
import me.devupdates.millenaireReborn.common.registry.MillFoodItemBuilder.MillFoodType;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
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

    // Norman Foods
    public static Item CIDER_APPLE;
    public static Item CIDER;
    public static Item BOUDIN;
    public static Item CALVA;
    public static Item TRIPES;

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

    // Byzantine Foods & Seeds
    public static Item GRAPES;
    public static Item WINE_BASIC;
    public static Item WINE_FANCY;
    public static Item FETA;
    public static Item SOUVLAKI;
    public static Item OLIVES;
    public static Item OLIVE_OIL;

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

    // Japanese Foods
    public static Item SAKE;
    public static Item UDON;
    public static Item IKAYAKI;
    public static Item CHERRIES;
    public static Item CHERRY_BLOSSOM;

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

    // Mayan Foods & Seeds
    public static Item MAIZE;
    public static Item MASA;
    public static Item WAH;
    public static Item BALCHE;
    public static Item SIKIL_PAH;
    public static Item CACAUHAA;

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

    // Special Items
    public static Item VILLAGE_BANNER;
    public static Item CULTURE_BANNER;
    public static Item SILK;
    public static Item OBSIDIAN_FLAKE;
    public static Item UNKNOWN_POWDER;
    
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
        NORMAN_PICKAXE = register("normanpickaxe", new Item(createSettings("normanpickaxe").pickaxe(MillCustomMaterials.NORMAN_TOOL_MATERIAL, 1, -2.8f)));
        NORMAN_AXE = register("normanaxe", new AxeItem(MillCustomMaterials.NORMAN_TOOL_MATERIAL, 4, -3, createSettings("normanaxe")));
        NORMAN_SHOVEL = register("normanshovel", new ShovelItem(MillCustomMaterials.NORMAN_TOOL_MATERIAL, 1.5f, -3, createSettings("normanshovel")));
        NORMAN_HOE = register("normanhoe", new HoeItem(MillCustomMaterials.NORMAN_TOOL_MATERIAL, -4, 1, createSettings("normanhoe")));
        NORMAN_BROADSWORD = register("normanbroadsword", new Item(createSettings("normanbroadsword").sword(MillCustomMaterials.NORMAN_TOOL_MATERIAL, 3, -2.4f)));

        // Norman Armor (erstmal als basic Items - später zu richtiger Armor upgraden)
        NORMAN_HELMET = register("normanhelmet", new Item(createSettings("normanhelmet").armor(MillCustomMaterials.NORMAN_ARMOR_MATERIAL, EquipmentType.HELMET)));
        NORMAN_PLATE = register("normanplate", new Item(createSettings("normanplate").armor(MillCustomMaterials.NORMAN_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
        NORMAN_LEGS = register("normanlegs", new Item(createSettings("normanlegs").armor(MillCustomMaterials.NORMAN_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
        NORMAN_BOOTS = register("normanboots", new Item(createSettings("normanboots").armor(MillCustomMaterials.NORMAN_ARMOR_MATERIAL, EquipmentType.BOOTS)));

        // Norman Parchments
        PARCHMENT_NORMAN_VILLAGERS = register("parchment_normanvillagers", new Item(createSettings("parchment_normanvillagers")));
        PARCHMENT_NORMAN_ITEMS = register("parchment_normanitems", new Item(createSettings("parchment_normanitems")));
        PARCHMENT_NORMAN_BUILDINGS = register("parchment_normanbuildings", new Item(createSettings("parchment_normanbuildings")));
        PARCHMENT_NORMAN_FULL = register("parchment_normanfull", new Item(createSettings("parchment_normanfull")));

        // Norman Foods
        CIDER_APPLE = register("ciderapple", MillFoodItemBuilder.CreateItem(createSettings("ciderapple"), MillFoodType.CIDER_APPLE));
        CIDER = register("cider", MillFoodItemBuilder.CreateItem(createSettings("cider"), MillFoodType.CIDER));
        BOUDIN = register("boudin", MillFoodItemBuilder.CreateItem(createSettings("boudin"), MillFoodType.BOUDIN));
        CALVA = register("calva", MillFoodItemBuilder.CreateItem(createSettings("calva"), MillFoodType.CALVA)); 
        TRIPES = register("tripes", MillFoodItemBuilder.CreateItem(createSettings("tripes"), MillFoodType.TRIPES));    

        // BYZANTINE ITEMS
        // Byzantine Tools (als Items - später zu Tools upgraden)
        BYZANTINE_PICKAXE = register("byzantinepickaxe", new Item(createSettings("byzantinepickaxe").pickaxe(MillCustomMaterials.BYZANTINE_TOOL_MATERIAL, 1, -2.8f)));
        BYZANTINE_AXE = register("byzantineaxe", new AxeItem(MillCustomMaterials.BYZANTINE_TOOL_MATERIAL, 5, -3, createSettings("byzantineaxe")));
        BYZANTINE_SHOVEL = register("byzantineshovel", new ShovelItem(MillCustomMaterials.BYZANTINE_TOOL_MATERIAL, 1.5f, -3, createSettings("byzantineshovel")));
        BYZANTINE_HOE = register("byzantinehoe", new HoeItem(MillCustomMaterials.BYZANTINE_TOOL_MATERIAL, -3, 0, createSettings("byzantinehoe")));
        BYZANTINE_MACE = register("byzantinemace", new Item(createSettings("byzantinemace").sword(MillCustomMaterials.BYZANTINE_TOOL_MATERIAL, 2, -2.4f)));

        // Byzantine Armor (als Items - später zu Armor upgraden)
        BYZANTINE_HELMET = register("byzantinehelmet", new Item(createSettings("byzantinehelmet").armor(MillCustomMaterials.BYZANTINE_ARMOR_MATERIAL, EquipmentType.HELMET)));
        BYZANTINE_PLATE = register("byzantineplate", new Item(createSettings("byzantineplate").armor(MillCustomMaterials.BYZANTINE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
        BYZANTINE_LEGS = register("byzantinelegs", new Item(createSettings("byzantinelegs").armor(MillCustomMaterials.BYZANTINE_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
        BYZANTINE_BOOTS = register("byzantineboots", new Item(createSettings("byzantineboots").armor(MillCustomMaterials.BYZANTINE_ARMOR_MATERIAL, EquipmentType.BOOTS)));

        // Byzantine Icons & Decorations
        BYZANTINE_ICON_SMALL = register("byzantineiconsmall", new Item(createSettings("byzantineiconsmall")));
        BYZANTINE_ICON_MEDIUM = register("byzantineiconmedium", new Item(createSettings("byzantineiconmedium")));
        BYZANTINE_ICON_LARGE = register("byzantineiconlarge", new Item(createSettings("byzantineiconlarge")));

        // Byzantine Clothes
        BYZANTINE_CLOTH_WOOL = register("clothes_byz_wool", new Item(createSettings("clothes_byz_wool")));
        BYZANTINE_CLOTH_SILK = register("clothes_byz_silk", new Item(createSettings("clothes_byz_silk")));

        // Byzantine Foods & Seeds
        GRAPES = register("grapes", new Item(createSettings("grapes"))); //TODO SEED
        WINE_BASIC = register("winebasic", MillFoodItemBuilder.CreateItem(createSettings("winebasic"), MillFoodType.WINE_BASIC));
        WINE_FANCY = register("winefancy", MillFoodItemBuilder.CreateItem(createSettings("winefancy"), MillFoodType.WINE_FANCY));
        SOUVLAKI = register("souvlaki", MillFoodItemBuilder.CreateItem(createSettings("souvlaki"), MillFoodType.SOUVLAKI));
        FETA = register("feta", MillFoodItemBuilder.CreateItem(createSettings("feta"), MillFoodType.FETA));
        OLIVES = register("olives", MillFoodItemBuilder.CreateItem(createSettings("olives"), MillFoodType.OLIVES));
        OLIVE_OIL = register("oliveoil", MillFoodItemBuilder.CreateItem(createSettings("oliveoil"), MillFoodType.OLIVE_OIL));

        // JAPANESE ITEMS
        // Japanese Weapons (als Items - später zu richtigen Weapons upgraden)
        TACHI_SWORD = register("tachisword", new Item(createSettings("tachisword").sword(MillCustomMaterials.BETTER_STEEL_TOOL_MATERIAL, 2, -2.4f)));
        YUMI_BOW = register("yumibow", new Item(createSettings("yumibow").maxCount(1)));

        // Japanese Red Samurai Armor
        JAPANESE_RED_HELMET = register("japaneseredhelmet", new Item(createSettings("japaneseredhelmet").armor(MillCustomMaterials.JAPANESE_RED_ARMOR_MATERIAL, EquipmentType.HELMET)));
        JAPANESE_RED_PLATE = register("japaneseredplate", new Item(createSettings("japaneseredplate").armor(MillCustomMaterials.JAPANESE_RED_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
        JAPANESE_RED_LEGS = register("japaneseredlegs", new Item(createSettings("japaneseredlegs").armor(MillCustomMaterials.JAPANESE_RED_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
        JAPANESE_RED_BOOTS = register("japaneseredboots", new Item(createSettings("japaneseredboots").armor(MillCustomMaterials.JAPANESE_RED_ARMOR_MATERIAL, EquipmentType.BOOTS)));

        // Japanese Blue Samurai Armor
        JAPANESE_BLUE_HELMET = register("japanesebluehelmet", new Item(createSettings("japanesebluehelmet").armor(MillCustomMaterials.JAPANESE_BLUE_ARMOR_MATERIAL, EquipmentType.HELMET)));
        JAPANESE_BLUE_PLATE = register("japaneseblueplate", new Item(createSettings("japaneseblueplate").armor(MillCustomMaterials.JAPANESE_BLUE_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
        JAPANESE_BLUE_LEGS = register("japanesebluelegs", new Item(createSettings("japanesebluelegs").armor(MillCustomMaterials.JAPANESE_BLUE_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
        JAPANESE_BLUE_BOOTS = register("japaneseblueboots", new Item(createSettings("japaneseblueboots").armor(MillCustomMaterials.JAPANESE_BLUE_ARMOR_MATERIAL, EquipmentType.BOOTS)));

        // Japanese Guard Armor
        JAPANESE_GUARD_HELMET = register("japaneseguardhelmet", new Item(createSettings("japaneseguardhelmet").armor(MillCustomMaterials.JAPANESE_GUARD_ARMOR_MATERIAL, EquipmentType.HELMET)));
        JAPANESE_GUARD_PLATE = register("japaneseguardplate", new Item(createSettings("japaneseguardplate").armor(MillCustomMaterials.JAPANESE_GUARD_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
        JAPANESE_GUARD_LEGS = register("japaneseguardlegs", new Item(createSettings("japaneseguardlegs").armor(MillCustomMaterials.JAPANESE_GUARD_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
        JAPANESE_GUARD_BOOTS = register("japaneseguardboots", new Item(createSettings("japaneseguardboots").armor(MillCustomMaterials.JAPANESE_GUARD_ARMOR_MATERIAL, EquipmentType.BOOTS)));

        // Japanese Parchments
        PARCHMENT_JAPANESE_VILLAGERS = register("parchment_japanesevillagers", new Item(createSettings("parchment_japanesevillagers")));
        PARCHMENT_JAPANESE_ITEMS = register("parchment_japaneseitems", new Item(createSettings("parchment_japaneseitems")));
        PARCHMENT_JAPANESE_BUILDINGS = register("parchment_japanesebuildings", new Item(createSettings("parchment_japanesebuildings")));
        PARCHMENT_JAPANESE_FULL = register("parchment_japanesefull", new Item(createSettings("parchment_japanesefull")));

        // Japanese Foods
        SAKE = register("sake", MillFoodItemBuilder.CreateItem(createSettings("sake"), MillFoodType.SAKE));
        UDON = register("udon", MillFoodItemBuilder.CreateItem(createSettings("udon"), MillFoodType.UDON));
        IKAYAKI = register("ikayaki", MillFoodItemBuilder.CreateItem(createSettings("ikayaki"), MillFoodType.IKAYAKI));
        CHERRIES = register("cherries", MillFoodItemBuilder.CreateItem(createSettings("cherries"), MillFoodType.CHERRIES));
        CHERRY_BLOSSOM = register("cherry_blossom", MillFoodItemBuilder.CreateItem(createSettings("cherry_blossom"), MillFoodType.CHERRY_BLOSSOM));

        // MAYAN ITEMS  
        // Mayan Tools (als Items - später zu Tools upgraden)
        MAYAN_PICKAXE = register("mayanpickaxe", new Item(createSettings("mayanpickaxe").pickaxe(MillCustomMaterials.OBSIDIAN_TOOL_MATERIAL, 1, -2.8f)));
        MAYAN_AXE = register("mayanaxe", new AxeItem(MillCustomMaterials.OBSIDIAN_TOOL_MATERIAL, 6, -3, createSettings("mayanaxe")));
        MAYAN_SHOVEL = register("mayanshovel", new ShovelItem(MillCustomMaterials.OBSIDIAN_TOOL_MATERIAL, 1.5f, -3, createSettings("mayanshovel")));
        MAYAN_HOE = register("mayanhoe", new HoeItem(MillCustomMaterials.OBSIDIAN_TOOL_MATERIAL, -2, -1, createSettings("mayanhoe")));
        MAYAN_MACE = register("mayanmace", new Item(createSettings("mayanmace").sword(MillCustomMaterials.OBSIDIAN_TOOL_MATERIAL, 3, -2.4f)));
        MAYAN_QUEST_CROWN = register("mayanquestcrown", new Item(createSettings("mayanquestcrown").armor(MillCustomMaterials.MAYAN_CROWN_ARMOR_MATERIAL, EquipmentType.HELMET)));

        // Mayan Parchments
        PARCHMENT_MAYAN_VILLAGERS = register("parchment_mayanvillagers", new Item(createSettings("parchment_mayanvillagers")));
        PARCHMENT_MAYAN_ITEMS = register("parchment_mayanitems", new Item(createSettings("parchment_mayanitems")));
        PARCHMENT_MAYAN_BUILDINGS = register("parchment_mayanbuildings", new Item(createSettings("parchment_mayanbuildings")));
        PARCHMENT_MAYAN_FULL = register("parchment_mayanfull", new Item(createSettings("parchment_mayanfull")));

        // Mayan Foods & Seeds
        MAIZE = register("maize", new Item(createSettings("maize"))); //TODO SEED
        MASA = register("masa", MillFoodItemBuilder.CreateItem(createSettings("masa"), MillFoodType.MASA));
        WAH = register("wah", MillFoodItemBuilder.CreateItem(createSettings("wah"), MillFoodType.WAH));
        BALCHE = register("balche", MillFoodItemBuilder.CreateItem(createSettings("balche"), MillFoodType.BALCHE));
        SIKIL_PAH = register("sikilpah", MillFoodItemBuilder.CreateItem(createSettings("sikilpah"), MillFoodType.SIKIL_PAH));
        CACAUHAA = register("cacauhaa", MillFoodItemBuilder.CreateItem(createSettings("cacauhaa"), MillFoodType.CACAUHAA));

        // INDIAN ITEMS
        // Indian Seeds & Food
        RICE = register("rice", new Item(createSettings("rice"))); //TODO SEED
        TURMERIC = register("turmeric", new Item(createSettings("turmeric"))); //TODO SEED
        VEG_CURRY = register("vegcurry", MillFoodItemBuilder.CreateItem(createSettings("vegcurry"), MillFoodType.VEG_CURRY));
        CHICKEN_CURRY = register("chickencurry", MillFoodItemBuilder.CreateItem(createSettings("chickencurry"), MillFoodType.CHICKEN_CURRY));
        RASGULLA = register("rasgulla", MillFoodItemBuilder.CreateItem(createSettings("rasgulla"), MillFoodType.RASGULLA));

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
        SELJUK_SCIMITAR = register("seljukscimitar", new Item(createSettings("seljukscimitar").sword(MillCustomMaterials.BETTER_STEEL_TOOL_MATERIAL, 3, -2.4f)));
        SELJUK_BOW = register("seljukbow", new Item(createSettings("seljukbow").maxCount(1)));

        // Seljuk Armor (als Items - später zu Armor upgraden)
        SELJUK_HELMET = register("seljukhelmet", new Item(createSettings("seljukhelmet").armor(MillCustomMaterials.SELJUK_ARMOR_MATERIAL, EquipmentType.HELMET)));
        SELJUK_TURBAN = register("seljukturban", new Item(createSettings("seljukturban").armor(MillCustomMaterials.SELJUK_WOOL_ARMOR_MATERIAL, EquipmentType.HELMET)));
        SELJUK_PLATE = register("seljukplate", new Item(createSettings("seljukplate").armor(MillCustomMaterials.SELJUK_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
        SELJUK_LEGS = register("seljuklegs", new Item(createSettings("seljuklegs").armor(MillCustomMaterials.SELJUK_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
        SELJUK_BOOTS = register("seljukboots", new Item(createSettings("seljukboots").armor(MillCustomMaterials.SELJUK_ARMOR_MATERIAL, EquipmentType.BOOTS)));

        // Seljuk Foods  
        YOGURT = register("yogurt", MillFoodItemBuilder.CreateItem(createSettings("yogurt"), MillFoodType.YOGURT));
        AYRAN = register("ayran",  MillFoodItemBuilder.CreateItem(createSettings("ayran"), MillFoodType.AYRAN));
        PIDE = register("pide", MillFoodItemBuilder.CreateItem(createSettings("pide"), MillFoodType.PIDE));
        LOKUM = register("lokum", MillFoodItemBuilder.CreateItem(createSettings("lokum"), MillFoodType.LOKUM));
        HELVA = register("helva", MillFoodItemBuilder.CreateItem(createSettings("helva"), MillFoodType.HELVA));
        PISTACHIOS = register("pistachios", MillFoodItemBuilder.CreateItem(createSettings("pistachios"), MillFoodType.PISTACHIOS));

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
        FUR_HELMET = register("furhelmet", new Item(createSettings("furhelmet").armor(MillCustomMaterials.FUR_ARMOR_MATERIAL, EquipmentType.HELMET)));
        FUR_PLATE = register("furplate", new Item(createSettings("furplate").armor(MillCustomMaterials.FUR_ARMOR_MATERIAL, EquipmentType.CHESTPLATE)));
        FUR_LEGS = register("furlegs", new Item(createSettings("furlegs").armor(MillCustomMaterials.FUR_ARMOR_MATERIAL, EquipmentType.LEGGINGS)));
        FUR_BOOTS = register("furboots", new Item(createSettings("furboots").armor(MillCustomMaterials.FUR_ARMOR_MATERIAL, EquipmentType.BOOTS)));

        // Inuit Foods
        BEAR_MEAT_RAW = register("bearmeat_raw", MillFoodItemBuilder.CreateItem(createSettings("bearmeat_raw"), MillFoodType.BEAR_MEAT_RAW));
        BEAR_MEAT_COOKED = register("bearmeat_cooked", MillFoodItemBuilder.CreateItem(createSettings("bearmeat_cooked"), MillFoodType.BEAR_MEAT_COOKED));
        WOLF_MEAT_RAW = register("wolfmeat_raw", MillFoodItemBuilder.CreateItem(createSettings("wolfmeat_raw"), MillFoodType.WOLF_MEAT_RAW));
        WOLF_MEAT_COOKED = register("wolfmeat_cooked", MillFoodItemBuilder.CreateItem(createSettings("wolfmeat_cooked"), MillFoodType.WOLF_MEAT_COOKED));
        SEAFOOD_RAW = register("seafood_raw", MillFoodItemBuilder.CreateItem(createSettings("seafood_raw"), MillFoodType.SEAFOOD_RAW));
        SEAFOOD_COOKED = register("seafood_cooked", MillFoodItemBuilder.CreateItem(createSettings("seafood_cooked"), MillFoodType.SEAFOOD_COOKED));
        INUIT_BEAR_STEW = register("inuitbearstew", MillFoodItemBuilder.CreateItem(createSettings("inuitbearstew"), MillFoodType.INUIT_BEAR_STEW));
        INUIT_MEATY_STEW = register("inuitmeatystew", MillFoodItemBuilder.CreateItem(createSettings("inuitmeatystew"), MillFoodType.INUIT_MEATY_STEW));
        INUIT_POTATO_STEW = register("inuitpotatostew", MillFoodItemBuilder.CreateItem(createSettings("inuitpotatostew"), MillFoodType.INUIT_POTATO_STEW));

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
