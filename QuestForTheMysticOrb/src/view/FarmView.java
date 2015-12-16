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
 * @author Mikel
 */
public class FarmView extends View {

    public FarmView() {
        super("You approach a small farm house on an old farm. The old farmer \n"
                + "tells you that his soil is dry on account of the kingdom’s \n"
                + "curse. He tells you that he will reward you if you (H)elp \n"
                + "him and give him some water for his crops. You can also go \n"
                + "(W)est to the southern end of the kingdom.  ");
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'H':
                getCorn();
               
                break;
            case 'W':
                showSouthKingdom();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
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
    
    private void getCorn() {
      
    Item i = Game.getInstance().getItemByNameAndRemove("Corn");
        if(i == null) {
            System.out.println("You already watered the farmer’s crops. \n");
            return;
        }
        Game.getInstance().getPlayer().getItems().add(i);
        System.out.println("You use your bucket of water to water The farmer’s crops. \nYou are rewarded with an ear of corn. \n");
    
}

}


