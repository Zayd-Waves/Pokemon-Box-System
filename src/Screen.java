/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          Screen                                              |
|   Description:    View class that handles the                         |
|                   graphical interface for the program.                |
|                                                                       |
|   Author:         Waves                                               |
|   Date:           3/23/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/

package pbox;
import java.util.Scanner;

public class Screen {

    private Scanner scanner;

    public Screen() {
        scanner = new Scanner(System.in);
    }
    
    public int choice() {
        int choice = -1;
        while (choice < 0 || choice > 2) {
            try {
                System.out.print("Please enter your choice: ");
                choice = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println();
                System.out.println("Choice must be a valid number from 0 - 2! ");
                scanner.nextLine();
            }
        }
        return choice;
    }
    
    public void welcomeMessage() {
        System.out.println(
          "--------------------------------------------------------------------------------"
        + "                           Welcome to the Trainer PC!                           "
        + "--------------------------------------------------------------------------------"
        );
    }
    
    public void exitMessage() {
        System.out.println(
          "                                     Okay!                                      "
        + "                                  Exiting PC...                                 "
        );
    }
    
    public void menu() {
        System.out.println(
          "                            What would you like to do?                          "
        + "                                 1 - View Pokemon                               "
        + "                                 2 - Add Pokemon                                "
        + "                                 0 - Exit PC                                    "
        );
    }
    
    public void addPokemonMenu() {
        System.out.println(
          "--------------------------------------------------------------------------------"
        + "      ____________________                                                      "
        + "    +| Adding new Pokemon |+                                                    "
        + "      --------------------                                                      "
        + "                                                                                "
        + "                                                                                "
        + "                                                                                "
        + "                                                                                "
        );
    }
    
    public void printAllBoxes(Storage storage) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(
          "--------------------------------------------------------------------------------"
        + "                                                                                "
        + "                                                                                "
        + "                                                                                "
        + "                                                                                "
        );
        for (int i = 0; i < storage.getNumBoxes(); i++) {
                System.out.println("         =================================================         ");
                System.out.println("         ====   " + storage.getBox(i).getName() + "   ====         ");
                System.out.println("         =================================================         ");
            for (int j = 0; j < storage.getBox(i).getNumPokemon(); j++) {
                System.out.print("   ( " + storage.getBox(i).getPokemon(j).getIcon() + " )   ");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
            System.out.println("");
            System.out.println("");
            System.out.println("");
    }
    
    
    
    /* The following four methods each capture a new Pokemon's species, nickname, level and shiny status respectively */
    /*
    /*
    /*
    /* 1:                             */
    public String getPokemonSpecies() {
        scanner.nextLine(); // Clear any buffers
        String species = "";
        System.out.println("What is this Pokemon's species? ");
        species = scanner.nextLine();
        while (species.length() > 10) {
            System.out.println("A Pokemon's species cannot exceed 10 characters...!");
            species = scanner.nextLine();
        }
        return species;
    }
    
    /* 2:                          */
    public String getPokemonName() {
        String name = "";
        System.out.println("What is this Pokemon's nickname? ");
        name = scanner.nextLine();
        while (name.length() > 10) {
            System.out.println("A Pokemon's nickname cannot exceed 10 characters...!");
            name = scanner.nextLine();
        }
        return name;
    }
    
    /* 3:                        */
    public int getPokemonLevel() {
        int level = -1;
        while (level < 0 || level > 100) {
            try {
                System.out.println("What is this Pokemon's level? ");
                level = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println();
                System.out.println("The Pokemon's level must be a valid number from 0 - 100! ");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return level;
    }
    
    /* 4:                           */
    public boolean isPokemonShiny() {
        String shiny = "";
        
        do {
            System.out.println("Is this Pokemon shiny? Just a yes or a no please! ");
            shiny = scanner.nextLine();
        } while (!(shiny.equals("yes")) && !(shiny.equals("y")) && !(shiny.equals("no")) && !(shiny.equals("n")));
        
        System.out.println(shiny);
        if (shiny.equals("yes") || shiny.equals("y")) {
            return true;
        } else {
            return false;
        }
        
    }
    /* End of Pokemon input methods */
}