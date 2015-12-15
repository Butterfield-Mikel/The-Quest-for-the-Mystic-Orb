/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.questforthemysticorb.MapControl;
import model.Game;
import model.Item;
import model.LocationType;
import model.Player;

/**
 *
 * @author mannj14
 */
public class DeepWestlandWoodsView extends View {
    
    public DeepWestlandWoodsView() {
        super("You are in the Deep Westland Woods, it seems rather dark and scary. \n"
        + "As you look deeper into the woods you see what apears to be an orb of some kind. \n"
        + "At last!! You know that it is the orb that you have been questing for. \n"
        + "You can aproach the (O)rb and take it, or you can (R)un back to the Westland Woods. \n"
       );        
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'O' :
               getMysticOrb();
                break;
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
        private void getMysticOrb() {
        Item i = Game.getInstance().getItemByNameAndRemove("MysticOrb");
        if(i == null) {
            System.out.println("As you look closer you see that it's just a kickball. You already go the orb.\n");
            return;
        }
        Game.getInstance().getPlayer().getItems().add(i);
        System.out.println("You got the Mystic Orb of Rejuvination! You should take this back\nto the castle and give it to the king so you can\nsave the kingdom from this curse.");
    }
    
}
