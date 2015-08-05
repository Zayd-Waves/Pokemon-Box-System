/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          BoxArray                                            |
|   Description:    Collection class that wraps an                      |
|                   array of Box objects.                               |
|                                                                       |
|   Author:         Waves                                               |
|   Date:           3/23/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/
package pbox;

public class BoxArray {

    private Box         boxArray[];
    private int         numBoxes = 10;
    
    public BoxArray() {
        boxArray = new Box[numBoxes];
        for (int i = 0; i < numBoxes; i++) {
            boxArray[i] = new Box(i);
        }
    }
    
    /* Adds Pokemon p into the first available box in the boxArray */
    public int add(Pokemon p) {
        int i = 0;
        int rc = boxArray[i].addPokemon(p);
        while ( rc != 0 ) {
            i++;
            rc = boxArray[i].addPokemon(p);
        }
        return rc;
    }
    
    /* Adds Pokemon p into the ith Box in the boxArray. Returns 0 if successful and -1 otherwise. */
    public int add(Pokemon p, int i) {
        return boxArray[i].addPokemon(p);
    }
    
    /* Changes the name of the ith Box */
    public void changeBoxName(String s, int i) {
        boxArray[i].setName(s);
    }
    
    /* Easier to write */
    public Box get(int i) {
        return getBoxWithNumber(i);
    }
    
    public Box getBoxWithNumber(int i) {
        return boxArray[i];
    }
    
    /* Loops through boxArray and looks for a Box whose name matches. Returns null otherwise */
    public Box getBoxWithName(String name) {
        for (int i = 0; i < numBoxes; i++) {
            if (boxArray[i].getName() == name) {
                return boxArray[i];
            }
        }
        return null;
    }
    
    /* Get methods */
    public int getNumBoxes() { return numBoxes; }
}




