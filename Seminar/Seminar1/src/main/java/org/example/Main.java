package org.example;

public class Main {
    public static String reverse(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Operations op = new Operations();
//        System.out.println(op.add(1, 2));
//        System.out.println(op.sub(1, 2));
//
//        System.out.println(reverse("string"));
//
//        System.out.println(new Student("bob", 20));

//        WordCounter counter = new WordCounter();
//        System.out.println(counter.wordCount("Ana  are     mere."));
//        System.out.println(op.isPerfect(6));

        System.out.println(WetterStation.average());
        System.out.println(WetterStation.maxTemp());
        int [] maxDiff = WetterStation.maxDifference();
        System.out.println(maxDiff[0] + " " + maxDiff[1]);
        WetterStation.table();
    }
}
