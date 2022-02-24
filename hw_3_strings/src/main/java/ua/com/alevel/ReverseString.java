package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

    private ReverseString() {
    }

    public static void startReverse() throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String inputString = "", result = "", rezOnlyW = "", inputSubstring = "";

            while (true) {

                System.out.println("Please enter 1 if you want to reverse string which contains one word.");
                System.out.println("Please enter 2 if you want to reverse string which contains several words.");
                System.out.println("Please enter 3 if you want to reverse substring.");
                System.out.println("Please enter 4 if you want to reverse substring which contains several words.");
                System.out.println("Please enter 5 if you want to reverse substring by chars.");
                System.out.println("Please enter 6 if you want to reverse substring by chars which contains several words");
                System.out.println("Please enter 7 if you want to reverse substring by indexes.");
                System.out.println("Please enter 8 if you want to reverse substring (by strings).");
                System.out.println("Please enter 0 if you want to exit.");

                switch (reader.readLine()) {
                    case "1" -> {
                        System.out.println("Please enter your string >>");
                        inputString = reader.readLine();
                        result = ReverseStringHelper.reverseString(inputString);
                        System.out.println("\nString before: " + inputString);
                        System.out.println("String after:  " + result);
                        System.out.println();
                    }
                    case "2" -> {
                        System.out.println("Please enter your string which contains several words.>>");
                        inputString = reader.readLine();
                        result = ReverseStringHelper.reverseAllWords(inputString);
                        System.out.println("\nString before: " + inputString);
                        System.out.println("String after:  " + result);
                        System.out.println();
                    }
                    case "3" -> {
                        System.out.println("Please enter your string >>");
                        inputString = reader.readLine();
                        System.out.print("Please enter your substring: ");
                        inputSubstring = reader.readLine();
                        result = ReverseStringHelper.reverseSubString(inputString, inputSubstring);
                        System.out.println("\nString before: " + inputString);
                        System.out.println("String after:  " + result);
                        System.out.println();
                    }
                    case "4" -> {
                        System.out.println("Please enter your string which contains several words>>");
                        inputString = reader.readLine();
                        System.out.print("Please enter your substring: ");
                        inputSubstring = reader.readLine();
                        result = ReverseStringHelper.reverseAllWordsForSubstring(inputString, inputSubstring);
                        System.out.println("\nString before: " + inputString);
                        System.out.println("String after:  " + result);
                        System.out.println();
                    }
                    case "5" -> {
                        System.out.println("Please enter your string >>");
                        inputString = reader.readLine();
                        System.out.print("Please enter first char: ");
                        Character firstChar = reader.readLine().charAt(0);
                        System.out.print("Please enter last char: ");
                        Character lastChar = reader.readLine().charAt(0);
                        result = ReverseStringHelper.reverseForSymbols(inputString, firstChar, lastChar);
                        System.out.println("\nString before: " + inputString);
                        System.out.println("String after:  " + result);
                        System.out.println();
                    }
                    case "6" -> {
                        System.out.println("Please enter your string which contains several words>>");
                        inputString = reader.readLine();
                        System.out.print("Please enter first char: ");
                        Character firstChar = reader.readLine().charAt(0);
                        System.out.print("Please enter last char: ");
                        Character lastChar = reader.readLine().charAt(0);
                        result = ReverseStringHelper.reverseAllWordsForSymbols(inputString, firstChar, lastChar);
                        System.out.println("\nString before: " + inputString);
                        System.out.println("String after:  " + result);
                        System.out.println();
                    }
                    case "7" -> {
                        System.out.println("Please enter your string >>");
                        inputString = reader.readLine();
                        System.out.print("Please enter first index: ");
                        int firstIndex = Integer.parseInt(reader.readLine());
                        System.out.print("Please enter last index: ");
                        int lastIndex = Integer.parseInt(reader.readLine());
                        result = ReverseStringHelper.reverseForIndexes(inputString, firstIndex, lastIndex);
                        System.out.println("\nString before: " + inputString);
                        System.out.println("String after:  " + result);
                        System.out.println();
                    }
                    case "8" -> {
                        System.out.println("Please enter your string which contains several words>>");
                        inputString = reader.readLine();
                        System.out.print("Please enter first index: ");
                        int firstIndex = Integer.parseInt(reader.readLine());
                        System.out.print("Please enter last index: ");
                        int lastIndex = Integer.parseInt(reader.readLine());
                        result = ReverseStringHelper.reverseAllWordsForIndexes(inputString, firstIndex, lastIndex);
                        System.out.println("\nString before: " + inputString);
                        System.out.println("String after:  " + result);
                        System.out.println();
                    }
                    case "0" -> System.exit(0);
                    default -> System.out.println("\nWrong input");
                }
            }
        }

    }
}
