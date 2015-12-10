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
public class DeepWestlandWoodsView extends View {
    
    public DeepWestlandWoodsView() {
        super("You have entered the Deep Westland Woods, it seems rather dark and scary \n"
        + "As you look deeper into the woods you see what apears to be a wooden box of some kind \n"
        + "you realize that you really only have two choices at this point. \n"
        + "You can (A)proach the box and perhaps loose a limb, or you can (R)un back to the Westland Woods \n"
        + "like a scared little girl.");        
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'A' :
                System.out.println("You have reached the orb, now how to we solve this combination");
                break;
            case 'R' :
                System.out.println("You Chicken");
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
