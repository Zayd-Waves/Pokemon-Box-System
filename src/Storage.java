/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          Storage                                             |
|   Description:    Model class that encapsulates all the               |
|                   'Storage' capabilities of the Program.              |
|                                                                       |
|   Author:         Waves                                               |
|   Date:           3/23/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/
package pbox;

public class Storage {
    
    private BoxArray boxes;

    public Storage() {
        boxes = new BoxArray();
    }
    
    /* Adds Pokemon p into the BoxArray boxes */
    public int addPokemon(Pokemon p) {
        return boxes.add(p);
    }
    
    /* Adds Pokemon p into the ith Box */
    public int addPokemon(Pokemon p, int i) {
        return boxes.add(p, i);
    }
    
    /* Changes the name of the ith Box. Returns 0 if successful, -1 otherwise. */
    public int changeBoxName(String name, int i) {
        if (i < 0 || i > boxes.getNumBoxes()) {
            return -1;
        } else {
            boxes.get(i).setName(name);
            return 0;
        }
    }
    
    /* Changes the name of the Box whose current name is 'oldname'. Returns 0 if successful, -1 otherwise. */
    public int changeBoxName(String oldName, String newName) {
        if (boxes.getBoxWithName(oldName) == null) {
            return -1;
        } else {
            boxes.getBoxWithName(oldName).setName(newName);
            return 0;
        }
    }
    /* Returns the Box at position i in the BoxArray */
    public Box getBox(int i) {
        return boxes.get(i);
    }
    
    /* Loops through boxes and returns total amount of Pokemon */
    public int totalPokemon() {
        int total = 0;
        for (int i = 0; i < boxes.getNumBoxes(); i++) {
            total += boxes.get(i).getNumPokemon();
        }
        return total;
    }
    
    /* Returns the amount of boxes currently held in storage */
    public int getNumBoxes() {
        return boxes.getNumBoxes();
    }
}



