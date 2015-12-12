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
public class KitchenView extends View {

    public KitchenView() {
        super(
                "\nYou are in the castle's kitchen."
                + "\nThe kitchen is a mess, and it smells really bad."
                + "\nYou should go back to the main floor of the (C)astle"
                + "where it doesn't smell so bad."
        );
    }

    //can't get these messages to display, any ideas/
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'C':
                showCastle();
                break;           
            default:
                System.out.println("ERROR ON INPUT");

        }

        return true;
    }
    
     private void showCastle() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Castle);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }
}
