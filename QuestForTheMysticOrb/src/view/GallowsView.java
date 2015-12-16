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
public class GallowsView extends View {

    public GallowsView() {
        super("At the gallows you are fortunate enough to \n"
                + "be here betweem beheadings. It smells really \n"
                + "nice compared to the usual smell of execution. The only place to go \n"
                + "is (E)ast to the northern end of the kingdom.");
               
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'E':
              showNorthKingdom();  
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

}
