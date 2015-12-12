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
public class CaveView extends View {
   
    public CaveView() {
        super("You find yourself in a forest and you notice that there is a cave. \n"
        + "as you enter the cave you have the feeling that this might be a bad idea,  \n"
        + "but teh spirit of adventure is strong. \n"
        + "What should you do? (C)ontinue deeper into the cave, or (R)eturn to the safety of the woods.  "
        );
    
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'C' :
               // System.out.println("You decide to head deeper in to the cave");
                showDeepCave();
                break;
            case 'R' :
               // System.out.println("You decied that risk is not worth it, and to return to the woods.");
                showDeepWestlandWoods();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        return true;
    }
    
        private void showDeepCave() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.DeepCave);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        private void showDeepWestlandWoods() {
       MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.DeepWestlandWoods);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
    
}
