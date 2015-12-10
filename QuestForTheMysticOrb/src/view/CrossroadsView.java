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
public class CrossroadsView extends View {
    
 public CrossroadsView() {
        super("Oh dear, now you have to make the tough decision \n"
                + "which way should you go \n"
                + "You have four options \n"
                + "Head (N)orth to the South Kingdom \n"
                + "Head (E)ast to the bridge \n"
                + "Head (S)outh to the Docks \n"
                + "Head (W)est to the Westland Woods. \n"
                + "As you are pondering the which direction to travel \n"
                + "an old women appears from the shadows \n"
                + "If you would like you can (T)alk to her.");
    
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'N' :
                System.out.println("You decide to return to the South Kingdom.");
                showSouthKingdom();
                break;
            case 'E' :
                System.out.println("You decide to head to the bridge/");
                showBridge();
                break;
            case 'S' :
                System.out.println("You decide that a walk down to the Dock might be relaxing /n");
                showDocks();
                break;
            case 'W' :
                System.out.println("You have entered the Westland Woods n/");
                showWestlandWoods();
                break;
            case 'T' :
                System.out.println("You talk to the Mystic, she warns you to avoid Boats this month/");
                break;    
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        return true;
    }
    
        private void showSouthKingdom() {
       MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.SouthKingdom);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        private void showBridge() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Bridge);
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
        private void showWestlandWoods() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.WestlandWoods);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
}