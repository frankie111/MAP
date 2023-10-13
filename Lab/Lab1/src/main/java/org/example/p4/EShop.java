package org.example.p4;

public class EShop {
    private final int[] keyboards;
    private final int[] drives;

    public EShop(int[] keyboards, int[] drives) {
        this.keyboards = keyboards;
        this.drives = drives;
    }

    /**
     * @return the cheapest keyboard in the Shop or -1 if no keyboards exist
     */
    public int getCheapestKeyboard() {
        if (keyboards.length == 0)
            return -1;

        int min = Integer.MAX_VALUE;
        for (int k : keyboards)
            if (k < min)
                min = k;

        return min;
    }

    /**
     * @return the most expensive item in the Shop or -1 if the shop is empty
     */
    public int getMostExpensiveItem() {
        int max = -1;
        for (int k : keyboards)
            if (k > max)
                max = k;

        for (int d : drives)
            if (d > max)
                max = d;

        return max;
    }

    /**
     * @return the most expensive drive in the buyers budget or -1 if non-existent
     */
    public int getBestDriveInBudget(int budget) {
        int max = -1;

        for (int d : drives)
            if (d > max && d <= budget)
                max = d;

        return max;
    }

    /**
     * @return the most expensive tuple of a keyboard and a drive that fits in the buyers budget or -1 if no viable set exists
     */
    public int getMostExpensiveSetInBudget(int budget) {
        int maxSpend = -1;

        for (int k : keyboards) {
            for (int d : drives) {
                int totalCost = k + d;
                if (totalCost <= budget && totalCost > maxSpend)
                    maxSpend = totalCost;
            }
        }

        return maxSpend;
    }
}
