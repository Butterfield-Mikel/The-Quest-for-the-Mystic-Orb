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
        super("You start to smell the crisp relaxing air of the sea, as you \n"
                + "start to relax you remember that you have a kingdom to \n"
                + "save. In the distance you see a great sea. You see a  \n"
                + "(S)hip with nobody on it, a (B)each, and some (D)ocks.");
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
            case 'B' :
                showBeach();
                break;
            case 'D' :
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
