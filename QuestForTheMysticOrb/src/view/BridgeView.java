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
public class BridgeView extends View {

    public BridgeView() {
        super("You find yourself near a bridge. Unfortunately you \n"
                + "cannot go further east without crossing the bridge.  \n"
                + "The bridge is covered with a thorn bush. You could try \n"
                + "To cross and go to the (G)arden on the other side, but you \n"
                + "might need something to help you. You can always turn back \n"
                + "And go to the (C)rossroads or head down to the (R)iver.");
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'G':
                showEnchantedGarden();
                break;
            case 'R':
                showRiver();
                break;
            case 'C':
                showCrossroads();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
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

    private void showRiver() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.River);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }

     private void showEnchantedGarden() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        
        if(!p.hasItem("Gauntlets")) {
            System.out.println("You try to move the bush so you can cross the bridge but \nyou just get your hands cut up.");
            return;
        }
        try {
            mc.moveLocation(p, LocationType.EnchantedGarden);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
     }
     
}
