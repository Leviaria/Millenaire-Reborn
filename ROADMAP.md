# Development Roadmap

Porting Millénaire from Minecraft 1.12.2 Forge to 1.21.8 Fabric.

## Progress Overview

| Phase | Status | Timeframe |
|-------|--------|-----------|
| 1. Basic Infrastructure | Complete | 2-3 days |
| 2. Basic Items & Localization | Complete | 3-4 days |
| 3. Advanced Item Functionality | In Progress | ~1 week |
| 4. Blocks & World Generation | In Progress | ~2 weeks |
| 5. Entities & Villagers | Planned | ~2 weeks |
| 6. World Generation & Structures | Planned | ~3 weeks |
| 7. Gameplay Systems | Planned | ~2 weeks |
| 8. GUI, Sounds & Polish | Planned | ~1 week |

## Phase 1: Basic Infrastructure ✓

**Status:** Complete

- [x] Mod Structure & Entry Points (`MillenaireReborn`, `MillenaireRebornClient`)
- [x] Registry System (`MillBlocks`, `MillItems`, `MillEntities`, `MillSounds`)
- [x] Initial Content (5 Blocks, 163 Items with correct textures)
- [x] Config System (`MillConfig`)
- [x] Networking Foundation (`MillNetworking`)
- [x] Utility Classes (`Point`)
- [x] Minecraft 1.21.8 Item Model Description System
- [x] Complete Asset Pipeline (Blockstates, Models, Textures)

Result: Mod launches successfully, all items/blocks work perfectly.

## Phase 2: Basic Items and Localization ✓

**Status:** Complete

- [x] All cultural items ported (163 items total)
  - [x] Norman Culture: Tools, Armor, Parchments
  - [x] Byzantine Culture: Tools, Armor, Icons, Clothing
  - [x] Japanese Culture: Weapons, Armor Sets, Parchments
  - [x] Mayan Culture: Tools, Weapons, Parchments
  - [x] Indian Culture: Food, Decorations, Parchments
  - [x] Seljuk Culture: Weapons, Armor, Food, Decorations
  - [x] Inuit Culture: Weapons, Armor, Food, Materials
- [x] Special Items: Paint Buckets (15 colors), Amulets, Banners, etc.
- [x] Item Model Descriptions for all items
- [x] Localization (en_us.json, de_de.json) complete
- [x] Creative Tabs for all cultures
- [x] OldSource Cleanup - migrated items removed

Result: All basic items work, are localized and organized in Creative Tabs.

## Phase 3: Advanced Item Functionality

**Status:** In Progress

- [x] Tool Functionality
  - [x] Define Tool Materials (Norman, Byzantine, etc.)
  - [x] Mining Speed, Durability, Attack Damage
  - [x] Special Effects (e.g. Mayan Quest Crown)
- [x] Armor Functionality
  - [x] Define Armor Materials
  - [x] Protection Values, Durability
  - [x] Armor Rendering for all cultures
- [ ] Bow Functionality
  - [ ] Yumi Bow, Seljuk Bow, Inuit Bow
  - [ ] Pull Animations
- [x] Food Items
  - [x] Hunger/Saturation Values
  - [x] Special Effects (e.g. Sake)
- [ ] Special Items
  - [ ] Amulet Effects
  - [ ] Paint Bucket Functionality
  - [ ] Negation Wand Functionality

## Phase 4: Blocks and World Generation

**Status:** Planned

- [ ] Port all Blocks from OldSource (~200+ blocks)
  - [ ] Building Blocks (Bricks, Tiles, etc.)
  - [ ] Decorative Blocks
  - [ ] Functional Blocks (Crafting Stations, etc.)
- [ ] Block Properties & Behavior
  - [ ] Hardness, Resistance
  - [ ] Tool Requirements
  - [ ] Special Behaviors
- [ ] Crafting Recipes
  - [ ] Vanilla Integration
  - [ ] Millénaire-specific Recipes

## Phase 5: Entities and Villagers

**Status:** Planned

- [ ] MillVillager Entity
  - [ ] Entity Class & Registration
  - [ ] Rendering & Models
  - [ ] Basic AI System
- [ ] Villager Behavior
  - [ ] Pathing System
  - [ ] Goal System (Working, Sleeping, etc.)
  - [ ] Player Interactions
- [ ] Professions & Specializations
  - [ ] Farmer, Blacksmith, Guard, etc.
  - [ ] Culture-specific Professions

## Phase 6: World Generation and Village Structures

**Status:** Planned

- [ ] Structure System
  - [ ] Port Building Plan System
  - [ ] Schematic Loader
  - [ ] Structure Placement
- [ ] Village Generation
  - [ ] Biome Integration
  - [ ] Village Layouts
  - [ ] Culture-specific Buildings
- [ ] World Features
  - [ ] Lone Buildings
  - [ ] Resource Spawning

## Phase 7: Gameplay Systems

**Status:** Planned

- [ ] Trading System
  - [ ] Trading GUI
  - [ ] Currency (Denier)
  - [ ] Marketplace Mechanics
- [ ] Reputation & Diplomacy
  - [ ] Player-Village Relations
  - [ ] Rewards/Penalties
- [ ] Quest System
  - [ ] Quest Types
  - [ ] Rewards
  - [ ] Progression

## Phase 8: GUI, Sounds and Polish

**Status:** Planned

- [ ] GUI Systems
  - [ ] Millénaire Book
  - [ ] Village Information
  - [ ] Quest Log
- [ ] Sound Integration
  - [ ] Villager Sounds
  - [ ] Ambient Sounds
- [ ] Advancements
- [ ] Performance Optimization

## Current State

### Completed
- Mod Infrastructure complete (Entry Points, Registry, Config, Networking)
- 163 Items registered with models and localization
- 5 Basic Blocks implemented as examples
- Creative Tabs for all cultures
- Asset Pipeline fully functional
- Armor, tools and food items

### Next Steps
1. Make items functional (Tools, Armor, Food values)
2. Port more blocks from OldSource
3. Begin Entity System

### Key Files
- `src/.../registry/MillItems.java` - All items
- `src/.../registry/MillBlocks.java` - All blocks
- `OldSource/` - Reference for not yet ported features

### Technical Details
- Minecraft Version: 1.21.8
- Mod Loader: Fabric
- Dependencies: Fabric API
- Item System: Uses new Registry Key API from 1.21.8
