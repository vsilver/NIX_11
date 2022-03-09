package ua.com.alevel.countuniccharacters;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountUnicCharacters {
    private CountUnicCharacters(){}

    public static void getCountOfUnicCharacters(){

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                Set<Integer> mySet = new HashSet<>();

                System.out.print("Please enter your string >> ");
                String string = reader.readLine();
                if (StringUtils.isBlank(string))
                {
                    System.out.println("incorrect input");
                    continue;
                }

                string = string.replaceAll("[^\\d.]", "");
                for (int i = 0; i < string.length(); i++)
                {
                    mySet.add(Integer.parseInt(String.valueOf(string.charAt(i))));
                }
                System.out.println("Amount of unique numbers: " + mySet.size());
                System.out.print("If you want to repeat print 'yes' or another char to end -> ");
                string = reader.readLine();
                if (!string.equals("yes")) {
                    break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
