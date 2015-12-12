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
public class ShoppeView extends View {
    
    public ShoppeView() {
        super("You see a shoppe with a huge price markup \n"
                + "You have seen the owner's house and it's huge. \n"
                +" There is no way you are going to support this place \n"
                + "You can (R)eturn to the North Kingdom ");
    }
     @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'R':         
                showNorthKingdom();
            default:
                System.out.println("ERROR ON INPUT");
                break;
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
