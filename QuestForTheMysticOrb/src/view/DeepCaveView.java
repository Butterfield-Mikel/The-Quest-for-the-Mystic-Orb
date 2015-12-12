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
public class DeepCaveView extends View {
    
    public DeepCaveView() {
     super("You find yourself in the deepest part of the cave. \n"
        + "It is dark and cold in here, and you get a funny feeling. \n"
        + "The cave came to an end so you can (R)eturn to the enterance of the cave"     
        );
    
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'R' :               
                showWestlandWoods();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        return true;
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
