/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.questforthemysticorb.MapControl;
import model.Game;
import model.LocationType;
import model.Player;

/**
 *
 * @author Mikel
 */
public class TowerView extends View {
    
    
     String[] locations = {
        "Beach",
        "Blacksmith",
        "Bridge",
        "Castle",
        "Crossroads",
        "Deep Westland Woods",
        "Docks",
        "Dungeon",
        "Enchanted Garden",
        "Farm",
        "Gallows",
        "Gazebo",
        "Kitchen",
        "North Kingdom",
        "Sea",
        "Ship",
        "Shoppe",
        "South Kingdom",
        "Tower",
        "Westland Woods"
    };
    

    public TowerView() {
        super("You are in the tallest tower in the kingdom. Even if \n"
                + "you don’t find anything useful up here you still  \n"
                + "needed the exercise. In the tower you can look \n"
                + "out at the entire kingdom and the land surrounding  \n"
                + "It. You can (L)ook around and count the locations. \n"
                + "There is a (M)ap on the table. You don’t see anything \n"
                + "Else so you can go (S)outh downstairs to the main castle. ");
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'M':
                showMap();
                break;
             case 'S':
   System.out.println("__________________________________________________________________________\n" +
"                                                                ..-..     |\n" +
"   _-            _-        _-                 _-              .'   | `.   |\n" +
"                                    _-                _-    .'  _- |`)'`. |\n" +
"       _-                  _-              _-               |      | U  | |\n" +
"           ..-..             ..-..             ..-..        |      |\\|/ | |\n" +
" _-      .'/////`.  _-     .'/////`.  _-     .'/////`.  _-  |  _-  | !  | |\n" +
"         |///////|         |///////|         |///////|      |      |   [| |\n" +
"   `),   |///////|   `(,   |///////|   `),   |///////|=%==%=|      |__[ | |\n" +
"    V _- |///////|    V    |///////|    V    |///////||\\../|| _-  [_____| |\n" +
" o  |  o |u=/////| o  |  o |u=/////| o  |  o |u=/////||  / ||    [______| |\n" +
"  '.|.'  |///////|  '.|.'  |///////|  '.|.'  |///////| \\/_/ |   [_______| |\n" +
"    !    |///////|    !    |///////|    !    |///////|      |  [________| |\n" +
" _-      |///////| _-      |///////|  _-     |///////| _-   | [_________| |\n" +
"lc_______|///////|_________|///////|_________|///////|______|[__________|_|\n" +
"         \"\"\"\"\"\"\"\"\"         \"\"\"\"\"\"\"\"\"         \"\"\"\"\"\"\"\"\"                  \\ \\\n" +
"  _-               __-                __--             _-                \\ \\\n" +
"_________________________________________________________________________/_/\n");
                
                showCastle();
                break;
                 case 'L':    
                     //This should calculate the length of the array. 
            for (int i = 0; i < locations.length; i++) 
            System.out.println("You see " + (i+1) + " locations.");      
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void showCastle() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Castle);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }
    
    
    private void showMap() {
        MapView showMap = new MapView();
        char in = showMap.getInput();
    }

}


