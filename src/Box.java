/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          Box                                                 |
|   Description:    Model class that represents a                       |
|                   single Box object.                                  |
|                                                                       |
|   Author:         Waves                                               |
|   Date:           3/23/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/
package pbox;

public class Box {
    
    private PokemonArray    pList;
    private String          name;
    private int             number;
    
    public Box(int n) {
        pList = new PokemonArray();
        number = n;
        name = "BOX: " + number;
    }
    
    /* Returns the Pokemon if it is in the Box, NULL otherwise */
    public Pokemon getPokemon(int index) {
        return pList.find(index);
    }
    
    /* Adds Pokemon p into the pList. Returns 0 if successful and -1 otherwise. */
    public int addPokemon(Pokemon p) {
        return pList.addPokemon(p);
    }
    
    
    /* Get methods */
    public String getName() { return name; }
    public int getNumber() { return number; }
    public int getNumPokemon() { return pList.getNumPokemon(); }
    
    /* Set methods */
    public void setName(String n) { name = n; }
}








