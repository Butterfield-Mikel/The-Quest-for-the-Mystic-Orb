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
public class BeachView extends View {
    
    public BeachView() {
        super("You find yourself at the beach. There is not much here other than \n"
        + "some sand and water. You can go back to the (D)ocks, or take a (S)wim. \n");
               
        
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'D' :
                showDocks();
                break;
            case 'S' :
                System.out.println("Against your better judgement you decide that swimming is an important"
                        + "n/ thing for you to start doing. Did I forget to tell you that these are eel"
                        + "n/ infested waters? Like the ones in A Princess Bride. Only problem is that"
                        + "n/ you don't have anyone to save you. Long story short, you are eaten."
                        + "n/"
                        + "n/ They wanted me to tell you that you were delicous. Game over");
                break;
            default:
                System.out.println("ERROR ON INPUT");
            }
        return true;
    }
    
    private void showDocks() {
    MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Docks);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }
    
    
}

