package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessonsDuration {

    private static final int VAR_1 = 1;
    private static final int VAR_2 = 2;
    private static final int VAR_5 = 5;
    private static final int VAR_9 = 9;
    private static final int VAR_10 = 10;
    private static final int VAR_15 = 15;
    private static final int VAR_45 = 45;
    private static final int VAR_60 = 60;

    public static void сalculateDuration() throws IOException {
        while(true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Please enter the lessons number from 1 to 10) >> ");
                String str = bufferedReader.readLine();
                int numLesson = Integer.parseInt(str);
                if (numLesson < VAR_1 || numLesson > VAR_10) {
                    System.out.println("You enter incorrect number!!!");
                    continue;
                }
                int duration  = numLesson * VAR_45 + (numLesson / VAR_2) * VAR_5 + ((numLesson + VAR_1) / VAR_2 - VAR_1) * VAR_15;
                int hour = duration / VAR_60 + VAR_9;
                int min = duration % VAR_60;
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
