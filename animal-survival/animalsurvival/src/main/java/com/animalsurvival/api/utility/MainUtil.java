package com.animalsurvival.api.utility;

import java.util.Scanner;

public class MainUtil {

    private static Scanner reader; 

    /**
     * Retrieves animal name from user and returns it
     * 
     * @param reader Scanner variable
     * @return
     */
    public static String getName() {
        String name = null;
        String choice = null;

        while (true) {
            System.out.println("\nPlease enter a name: ");
            reader = new Scanner(System.in);
            name = reader.nextLine();
            
            System.out.println("\nConfirm name as " + name + "? y/n");
            reader = new Scanner(System.in);
            choice = reader.nextLine().toLowerCase();
            if (choice.equals("y")) {
                break;
            }
        } 
        return name;
    }
}
