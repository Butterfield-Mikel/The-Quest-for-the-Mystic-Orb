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
public class GallowsView extends View {

    public GallowsView() {
        
         
        super("At the gallows you are fortunate enough to \n"
                + "be here between hangings. It smells really \n"
                + "nice compared to the usual smell of execution. you \n"
                + "can go (E)ast to the northern end of the kingdom.");
               
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'E':
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
