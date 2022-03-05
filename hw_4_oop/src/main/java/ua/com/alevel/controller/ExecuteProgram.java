package ua.com.alevel.controller;

import ua.com.alevel.arraylist.ArrayList;
import ua.com.alevel.entity.Watch;
import ua.com.alevel.entity.WatchShape;
import ua.com.alevel.service.WatchService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteProgram {

    private static final WatchService watchService = new WatchService();

    public static void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                mainNavigation();
                String choose = reader.readLine();
                baseCrud(choose, reader);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void mainNavigation() {

        System.out.println("Create new watch press 1.");
        System.out.println("Update new watch press 2.");
        System.out.println("Delete new watch press 3.");
        System.out.println("Find new watch by id press 4.");
        System.out.println("Find all watches press 5.");
        System.out.println("Exit press 0.");
        System.out.println("->>");
    }

    private static void baseCrud(String choose, BufferedReader reader) {
        switch (choose) {
            case "1" -> create(reader);
            case "2" -> update(reader);
            case "3" -> delete(reader);
            case "4" -> findById(reader);
            case "5" -> findAll();
            case "0" -> System.exit(0);
            default -> System.out.println("Incorrect input data!!!");
        }
    }

    private static void create(BufferedReader reader) {
        try {
            System.out.print("Type the watch name (ORIENT, SEIKO, CARTIER, ROLEX ): ");
            String name = reader.readLine();
            System.out.print("Type the watch shape (round, square, oval, triangular, rectangular): ");
            String shape = reader.readLine();
            WatchShape watchShape = WatchShape.valueOf(shape.toUpperCase());
            Watch watch = new Watch();
            watch.setName(name);
            watch.setShape(watchShape);
            watchService.create(watch);
            System.out.println(watch);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Trouble: " + e.getMessage());
        }
    }

    private static void update(BufferedReader reader) {
        try {
            System.out.print("Type the watch id: ");
            String id = reader.readLine();
            System.out.print("Type the watch name (Orient, Seiko, Cartier, Rolex ): ");
            String name = reader.readLine();
            System.out.print("Type the watch shape (round, square, oval, triangular, rectangular): ");
            String shape = reader.readLine();
            WatchShape watchShape = WatchShape.valueOf(shape.toUpperCase());
            Watch watch = new Watch();
            watch.setId(id);
            watch.setName(name);
            watch.setShape(watchShape);
            watchService.update(watch);
            System.out.println(watch);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Trouble: " + e.getMessage());
        }
    }

    private static void delete(BufferedReader reader) {
        try {
            System.out.print("Type the watch id: ");
            String id = reader.readLine();
            watchService.delete(id);
        } catch (Exception e) {
            System.out.println("Trouble: " + e.getMessage());
        }
    }

    private static void findById(BufferedReader reader) {
        try {
            System.out.print("Type the watch id: ");
            String id = reader.readLine();
            Watch watch = watchService.findById(id);
            if (watch == null) {
                System.out.println("Watch with such id doesn't exist!!!");
            } else {
                System.out.println(watch);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Trouble: " + e.getMessage());
        }
    }

    private static void findAll() {
        boolean flag = false;
        ArrayList<Watch> watches = watchService.findAll();
        for (int i = 0; i < watches.size(); i++) {
            Watch watch = watches.get(i);
            if (watch != null) {
                flag = true;
                System.out.println(watch);
                System.out.println();
            }
        }
        if (!flag) {
            System.out.println("Watches database is empty!!!");
        }
    }
}
