package org.example.p4;

import org.junit.jupiter.api.Test;

class EShopTest {

    public static final String SHOULD_BE_EQUAL = "Should be equal";

    @Test
    void getCheapestKeyboard() {
        EShop eShop = new EShop(new int[]{40, 35, 70, 15, 45}, new int[]{18, 15, 40, 14});
        assert 15 == eShop.getCheapestKeyboard() : SHOULD_BE_EQUAL;

        EShop eShop1 = new EShop(new int[]{}, new int[]{});
        assert -1 == eShop1.getCheapestKeyboard() : SHOULD_BE_EQUAL;
    }

    @Test
    void getMostExpensiveItem() {
        EShop eShop = new EShop(new int[]{15, 20, 10, 35}, new int[]{20, 15, 40, 15});
        assert 40 == eShop.getMostExpensiveItem() : SHOULD_BE_EQUAL;

        EShop eShop1 = new EShop(new int[]{}, new int[]{});
        assert -1 == eShop1.getMostExpensiveItem() : SHOULD_BE_EQUAL;
    }

    @Test
    void getBestDriveInBudget() {
        EShop eShop = new EShop(new int[]{15, 20, 10, 35}, new int[]{15, 45, 20});
        assert 20 == eShop.getBestDriveInBudget(30) : SHOULD_BE_EQUAL;

        assert -1 == eShop.getBestDriveInBudget(7) : SHOULD_BE_EQUAL;
    }

    @Test
    void getMostExpensiveSetInBudget() {
        EShop eShop = new EShop(new int[]{40, 50, 60}, new int[]{8, 12});
        assert 58 == eShop.getMostExpensiveSetInBudget(60) : SHOULD_BE_EQUAL;

        EShop eShop1 = new EShop(new int[]{50, 60}, new int[]{80, 90});
        assert -1 == eShop1.getMostExpensiveSetInBudget(60) : SHOULD_BE_EQUAL;
    }
}
