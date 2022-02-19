package ua.com.alevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumNumInString {

    private SumNumInString() { }

    public static void makeSumNumStr() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter your string: ");
            Pattern p = Pattern.compile("\\d+");
            String str = reader.readLine();
            Matcher m = p.matcher(str);

            int sum = 0;
            while (m.find()) {
                char[] arr = (m.group()).toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    sum += Integer.parseInt(String.valueOf(arr[i]));
                }
            }

            System.out.println("Sum of your digits is: " + sum);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

