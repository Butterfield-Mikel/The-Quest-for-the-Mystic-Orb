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
public class GallowosView extends View {

    public GallowosView() {
        super("At the gallows you are fortunate enough to n/"
                + "Be here betweem beheadings. It smells really n/"
                + "nice. The only place to go is the (N)orth/n"
                + "Kingdom.");
               
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'N':
                System.out.println("You go out to measure the farmer's farm. \n "
                        + "You measure 8 acres long and 4 acres wide. \n"
                        + "Now you need to go back and tell the farmer \n"
                        + "How many square acres his farm is so he can \n"
                        + "Buy the proper amount of seed to plant. \n"
                        + "Maybe if you get it right he will give you some corn.  ");
                
                // I am not sure where or how, but i need to implament a way to get test the users input and and the corn the the playrs inventory if it is correct.
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

}
