package ua.com.alevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StartProgram {

    private StartProgram() { }

    public static void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Please enter 1 if you want to find the sum of all numbers in a string");
                System.out.println("Please enter 2 if you want to find the number of characters in a string and sort them");
                System.out.println("Please enter 3 if you want to find when the specified lesson ends");
                System.out.println("Please enter 0 if you want to exit");
                System.out.print(">> ");
                switch (reader.readLine()) {
                    case "1" -> SumNumInString.makeSumNumStr();
                    case "2" -> ExtractSortLetterInString.extractString();
                    case "3" -> LessonsDuration.сalculateDuration();
                    case "0" -> System.exit(0);
                    default -> System.out.println("\nWrong input");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
