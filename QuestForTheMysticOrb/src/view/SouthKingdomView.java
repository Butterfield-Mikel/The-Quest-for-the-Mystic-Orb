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
public class SouthKingdomView extends View {
    
      public SouthKingdomView() {
        super("You approach the southern end of the kingdom. You look \n"
                + "around and see the (N)orth end of the kingdom, a (F)arm \n"
                + "to your east, a (B)lacksmith to the west and the (C)rossroads \n"
                + "outside of the kingdom to the south.");
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
                showNorthKingdom();
                break;
            case 'F' :
                showFarm();
                break;
            case 'B' :
                showBlacksmith();
                break;
            case 'C' :
                showCrossroads();
                break;
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
        
        private void showFarm() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Farm);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showBlacksmith() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Blacksmith);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showCrossroads() {
      MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Crossroads);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
}