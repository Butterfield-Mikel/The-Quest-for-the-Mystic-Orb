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
 * @author mannj14
 */
public class KitchenView extends View {

    public KitchenView() {
        super("You are in the castle's kitchen. \n"
                + "The kitchen is a mess, and it smells really bad. \n"
                + "You should go (E)ast to the main floor of the castle \n"
                + "where it doesn't smell so bad."
        );
    }

    
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'E':
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
            default:
                System.out.println("ERROR ON INPUT");

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
}
