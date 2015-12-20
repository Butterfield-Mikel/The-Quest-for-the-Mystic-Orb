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
public class ShoppeView extends View {
    
    public ShoppeView() {
        super("You see a shoppe with a huge price markup \n"
                + "You have seen the owner's house and it's huge. \n"
                + "There is no way you are going to support this place \n"
                + "You can go (W)est to the north side of the kingdom. ");
    }
     @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'W':  
                                System.out.println(""+
"                             -|             |-\n" +
"         -|                  [-_-_-_-_-_-_-_-]                  |-\n" +
"         [-_-_-_-_-]          |             |          [-_-_-_-_-]\n" +
"          | o   o |           [  0   0   0  ]           | o   o |\n" +
"           |     |    -|       |           |       |-    |     |\n" +
"           |     |_-___-___-___-|         |-___-___-___-_|     |\n" +
"           |  o  ]              [    0    ]              [  o  |\n" +
"           |     ]   o   o   o  [ _______ ]  o   o   o   [     | ----__________\n" +
"_____----- |     ]              [ ||||||| ]              [     |\n" +
"           |     ]              [ ||||||| ]              [     |\n" +
"       _-_-|_____]--------------[_|||||||_]--------------[_____|-_-_\n" +
"      ( (__________------------_____________-------------_________) )\n");
                showNorthKingdom();
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

     private void showNorthKingdom() {
      MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.NorthKingdom);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
     }
    
    
}
