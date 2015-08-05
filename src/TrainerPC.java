/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          TrainerPC                                           |
|   Description:    Control class that handles the                      |
|                   control flow of the program.                        |
|                                                                       |
|   Author:         Waves                                               |
|   Date:           3/23/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/

package pbox;

public class TrainerPC {

    private Storage     storage;
    private Screen      screen;
    
    public TrainerPC() {
        storage = new Storage();
        screen = new Screen();
    }
    
    public void bootPC() {
        int choice = -1;
        screen.welcomeMessage();
        
        while(choice != 0) {
            screen.menu();
            choice = screen.choice();
            if (choice == 1) {
                screen.printAllBoxes(storage);
            }
            if (choice == 2) {
                String sp, n;
                int lvl;
                boolean sh;
                screen.addPokemonMenu();
                sp = screen.getPokemonSpecies();
                screen.addPokemonMenu();
                n = screen.getPokemonName();
                screen.addPokemonMenu();
                lvl = screen.getPokemonLevel();
                screen.addPokemonMenu();
                sh = screen.isPokemonShiny();
                
                Pokemon p = new Pokemon(sp, n, lvl, sh);
                storage.addPokemon(p);
            }
        }
    }
}