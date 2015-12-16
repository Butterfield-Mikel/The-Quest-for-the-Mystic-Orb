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
public class SeaView extends View {
    
       public SeaView() {
        super("You find yourself standing alongside the sea. (S)outh of \n"
                + "you there is a ship and there are some docks to the \n"
                + "(N)orth. Also, there is a beach to the (E)ast.");
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
                showShip();
                break;
            case 'E' :
                showBeach();
                break;
            case 'N' :
                showDocks();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showBeach() {
      MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        
        if(!p.hasItem("Bucket")) {
            System.out.println("You go to the beach but there is nothing to do yet so you return to the sea. \n");
            return;
        }
        
        try {
            mc.moveLocation(p, LocationType.Beach);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
            
        private void showShip() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Ship);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showDocks() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Docks);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        
}
