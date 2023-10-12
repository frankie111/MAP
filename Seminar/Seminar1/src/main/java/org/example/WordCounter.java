package org.example;

public class WordCounter {
    public int wordCount(String input) {
        int ct = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (Character.isLetter(input.charAt(i)) &&
                    !Character.isLetter(input.charAt(i + 1)) || i + 1 == input.length() - 1) {
                ct++;
            }
        }

        return ct;
    }
}
