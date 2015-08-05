/*
 -----------------------------------------------------------------------
|                                                                       |
|   Class:          Pokemon                                             |
|   Description:    Model class that represents a                       |
|                   single Pokemon object.                              |
|                                                                       | 
|   Author:         Waves                                               |
|   Date:           3/23/2015                                           |
|                                                                       |
|                                                                       |
 -----------------------------------------------------------------------
*/
package pbox;

public class Pokemon {

    private String      species;
    private String      name;
    private int         level;
    private boolean     shiny;
    private String      icon;

    /* Default constructor */
    public Pokemon() {
        species = "Bulbasaur";
        name = "Bulby";
        level = 100;
        shiny = false;
        icon = name.substring(0, 1); // 'B'
    }
    
    /* General constructor */
    public Pokemon(String s, String n, int lvl, boolean sh) {
        species = s;
        name = n;
        level = lvl;
        shiny = sh;
        icon = name.substring(0, 1);
    }

    /* Get methods */
    public String getSpecies()   { return species; }
    public String getName()      { return name;    }
    public int getLevel()        { return level;   }
    public boolean isShiny()     { return shiny;   }
    public String getIcon()      { return icon;    }

}
















