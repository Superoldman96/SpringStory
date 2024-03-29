package com.dori.SpringStory.constants;

public interface GameConstants {
    // Field -
    int DEFAULT_FIELD_MOB_CAPACITY = 25;
    double DEFAULT_FIELD_MOB_RATE_BY_MOB_GEN_COUNT = 1.5;
    // Equips -
    short MAX_HAMMER_SLOTS = 2;
    // Character -
    int DEFAULT_START_LVL = 1;
    int BASE_START_STAT = 4;
    int BASE_START_HP = 50;
    int BASE_START_MP = 50;
    int MAX_HP = 999_999_999;
    int MAX_MP = 999_999_999;
    int DEFAULT_MAP_ID = 100_000_000;
    int DEFAULT_SKIN = 1;
    int DEFAULT_FACE = 20_000;
    int DEFAULT_HAIR = 30_027;
    int DEFAULT_INVENTORY_SIZE = 52;
    int DEFAULT_CASH_INVENTORY_SIZE = 96;
    int MAX_LVL = 200;
    int MAX_MESO = 2_000_000_000;
    int[] EXP_TABLE = {
            15, 34, 57, 92, 135, 372, 560, 840, 1242, 1242, 1242, 1242, 1242, 1242, 1490, 1788, 2146, 2575, 3090, 3708, 4450, 5340, 6408, 7690, 9228, 11074, 13289, 15947, 19136, 19136, 19136, 19136, 19136, 19136, 22963, 27556, 33067, 39680, 47616, 51425, 55539, 59982, 64781, 69963, 75560, 81605, 88133, 95184, 102799, 111023, 119905, 129497, 139857, 151046, 163130, 176180, 190274, 205496, 221936, 239691, 258866, 279575, 301941, 326096, 352184, 380359, 410788, 443651, 479143, 479143, 479143, 479143, 479143, 479143, 512683, 548571, 586971, 628059, 672023, 719065, 769400, 823258, 880886, 942548, 1008526, 1079123, 1154662, 1235488, 1321972, 1414510, 1513526, 1619473, 1732836, 1854135, 1983924, 2122799, 2271395, 2430393, 2600521, 2782557, 2977336, 3185750, 3408753, 3647366, 3902682, 4175870, 4468181, 4780954, 5115621, 5473714, 5856874, 6266855, 6705535, 7174922, 7677167, 8214569, 8789589, 9404860, 10063200, 10063200, 10063200, 10063200, 10063200, 10063200, 10767624, 11521358, 12327853, 13190803, 14114159, 15102150, 16159301, 17290452, 18500784, 19795839, 21181548, 22664256, 24250754, 25948307, 27764688, 29708216, 31787791, 34012936, 36393842, 38941411, 41667310, 44584022, 47704904, 51044247, 54617344, 58440558, 62531397, 66908595, 71592197, 76603651, 81965907, 87703520, 93842766, 100411760, 107440583, 113887018, 120720239, 127963453, 135641260, 143779736, 152406520, 161550911, 171243966, 181518604, 192409720, 203954303, 216191561, 229163055, 242912838, 257487608, 272936864, 289313076, 306671861, 325072173, 344576503, 365251093, 387166159, 410396129, 435019897, 461121091, 488788356, 518115657, 549202596, 582154752, 617084037, 654109079, 693355624, 734956961, 779054379, 825797642, 875345501, 927866231, 983538205, 1042550497, 1105103527, 0
    };
    int QUICK_SLOT_LENGTH = 7;
    // World -
    int EXP_RATE = 2;
    float DROP_RATE = 1.0f;
    float MESO_RATE = 1.0f;
    int DEFAULT_MOB_RESPAWN_DELAY = 10;
    // Drop -
    int DROP_HEIGHT = 100;
    int DROP_DIFF = 25;
    // Enchantment -
    int ENHANCEMENT_BASE_PERCENTAGE = 80;
    int ADVANCE_ENHANCEMENT_BASE_PERCENTAGE = 100;
    int LOWEST_ENHANCEMENT_PERCENTAGE = 10;
    int BASE_STAT_CHANCE = 1; // 1%
    int BASE_STAT_ENHANCEMENT = 3;
    int BASE_HP_MP_ENHANCEMENT = 10;
    int BASE_ATK_ENHANCEMENT = 3;
    int BASE_SECONDARY_STAT_ENHANCEMENT = 5;
    int BASE_MOBILITY_STAT_ENHANCEMENT = 2;
    // Potential -
    int POTENTIAL_BASE_PERCENTAGE = 70;
    int ADVANCE_POTENTIAL_BASE_PERCENTAGE = 90;
    int MAX_AMOUNT_OF_POTENTIAL_LINES = 3;
    int MIN_AMOUNT_OF_POTENTIAL_LINES = 1;
    int ADDITIONAL_LINE_POTENTIAL_PERCENTAGE = 10; // 10%
    int EPIC_POTENTIAL_RANK_UP_PERCENTAGE = 15;
    int UNIQUE_POTENTIAL_RANK_UP_PERCENTAGE = 10;
    int POTENTIAL_EQUIP_DROP = 15;
}
