package ua.com.alevel.idgenerator;

public class GeneratorID {
    private static int idCounter=0;

    private GeneratorID() {}

    public static String createID()
    {
        return String.valueOf(idCounter++);
    }
}
