package ua.com.alevel;

import ua.com.alevel.countuniccharacters.CountUnicCharacters;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StartProject {

    private StartProject() {}

    public static void run()
    {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            while (true)
            {
                startMenu();
                switch (reader.readLine())
                {
                    case "1" -> CountUnicCharacters.getCountOfUnicCharacters();
                    /*case "2" -> HorseMove.makeHorseMove();
                    case "3" -> AreaOfTriangle.findAreaOfTriangle();
                    case "4" -> BracketsString.checkBracketsString();
                    case "5" -> GameOfLife.startGameOfLife();*/
                    case "0" -> {
                        System.out.println("Close program...");
                        System.exit(0);
                    }
                    default -> System.out.println("Incorrect input");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void startMenu()
    {
        System.out.println("Please enter 1 if yoy want to find the quantity of unique digits in a string");
        System.out.println("Please enter 2 if yoy want to check the possibility of a horse move");
        System.out.println("Please enter 3 if yoy want to find the triangle's area");
        System.out.println("Please enter 4 if yoy want to check a string for validity");
        System.out.println("Please enter 5 if yoy want to play the game of life");
        System.out.println("Please enter 0 if yoy want to exit");
        System.out.print("->> ");
    }
}



