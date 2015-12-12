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
public class GazeboView extends View {

    public GazeboView() {
        super("At the oter end of the enchanted garden you find yourself \n"
                + "at a gazebo. There isn't anything here that apears to be \n"
                + "useful. You can go back to the main part of the (E)nchanted garden. \n"
                );
               
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
            mc.moveLocation(p, LocationType.EnchantedGarden);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }

}
