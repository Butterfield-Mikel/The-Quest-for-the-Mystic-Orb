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
        super("You are on the ship and you are lucky that there aren't \n"
                + "pirates or anything like that. That's lucky! \n"
                + "You can swim back to the (S)ea and go to the beach from there, or \n"
                + "you can sail (E)ast or (W)east to see where it takes you.");
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'S' :
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