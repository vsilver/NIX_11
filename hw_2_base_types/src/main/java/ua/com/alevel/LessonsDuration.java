package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessonsDuration {

    public static void сalculateDuration() throws IOException {
        while(true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Please enter the lessons number from 1 to 10) >> ");
                String str = bufferedReader.readLine();
                int numLesson = Integer.parseInt(str);
                if (numLesson < 1 || numLesson > 10) {
                    System.out.println("You enter incorrect number!!!");
                    continue;
                }
                int duration  = numLesson * 45 + (numLesson / 2) * 5 + ((numLesson + 1) / 2 - 1) * 15;
                int hour = duration / 60 + 9;
                int min = duration % 60;
                System.out.println("Lessons end at: ");
                System.out.println(hour + " " + min);
                break;

            } catch (Exception e) {
                System.out.println("You enter incorrect data!!!");
                continue;
            }
        }
    }
}
