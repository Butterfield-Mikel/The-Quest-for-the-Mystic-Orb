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
        super("You see a big farm with a small farm house. \n"
                + "Inside the house you see an old farmer and \n"
                + "his wife. They both look hungry, but not as \n"
                + "they have some corn saved from last year’s \n"
                + "harvest. You really want some of this corn, \n"
                + "so the farmer tells you that if you will (H)elp \n"
                + "him measure his farm for seed he will give you \n"
                + "some corn. The only place you can go is to \n"
                + "the (S)outh kingdom.  ");
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
            case 'S':
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
            System.out.println("You already helped the farmer!\n");
            return;
        }
        Game.getInstance().getPlayer().getItems().add(i);
        System.out.println("You help the farmer on his farm and you are rewarded with Corn.\n");
    
}

}


