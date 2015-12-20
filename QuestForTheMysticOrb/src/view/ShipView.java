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
 * @author Rich
 */
public class ShipView extends View {
    //map[7][1].Ship();
    public ShipView() {
        super("You swam to the ship and it looks old and run down. The \n"
                + "sails are torn and the wood is splitting everywhere, it's a mess. \n"
                + "You can swim (N)orth to the land by the sea or try to sail (W)est or (E)ast. \n");
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'N' :
                 System.out.println(""+
"    _.-'```\"\"\"``\"-._\n" +
"    /\"`                '.\n" +
"    `':.,_               \"._\n" +
"         \\`'-._             `'-._\n" +
"          \\    `:._              `'-._          _\n" +
"          |      \\ `:_                `\"--\"--\"``\n" +
"          |       \\   `:_\n" +
"          |      :|    \\ '.\n" +
"~~~~~~~~~~|       |     |  `:_\n" +
"~~   ~~   |       |:    |     `:_\n" +
"  ~    ~~ |:      |     |\n" +
" ~   ~    |       |\n");
                showSea();
                break;
            case 'E' :
                System.out.println("You would like to set sail, but you are too weak to get \n the anchor off the sea floor. Do you even lift, bro?.");
                break;
            case 'W' :
                System.out.println("You would like to set sail, but you are too weak to get \n the anchor off the sea floor. Do you even lift, bro?.");
                break;        
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showSea() {
       MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Sea);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
}