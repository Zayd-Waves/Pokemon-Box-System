/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          PokemonArray                                        |
|   Description:    Collection class that wraps an array of             |
|                   Pokemon objects.                                    |
|                                                                       |
|   Author:         Waves                                               |
|   Date:           3/23/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/
package pbox;
import java.util.ArrayList;

public class PokemonArray {

    private ArrayList<Pokemon>         pokemonList;
    private int                        numPokemon;
    
    public PokemonArray() {
        pokemonList = new ArrayList<Pokemon>();
        numPokemon = 0;
    }
    
    /* Adds Pokemon p into the pokemonList. Returns 0 if successful and -1 otherwise. */
    public int addPokemon(Pokemon p) {
        if (numPokemon == 30) { 
            return -1;
        } else {
            pokemonList.add(p);
            numPokemon++;
            return 0;
        }
    }
    
    /* Returns Pokemon in the given index of the pokemonList. Returns null otheriwse */
    public Pokemon find(int index) {
        if (index < 0 || index > numPokemon) {
            return null;
        } else {
            return pokemonList.get(index);
        }
    }

    /* Get methods */
    public int getNumPokemon() { return numPokemon; }

}