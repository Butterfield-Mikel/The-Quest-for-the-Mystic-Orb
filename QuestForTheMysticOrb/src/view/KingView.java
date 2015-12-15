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
public class KingView extends View {

    public KingView() {
        super("You enter the king’s throne room for the first time, and it is simply magnificent.  \n"
                + "you slowly approach the king and tell him in an exhausted voice that you have found \n"
                + "the Mystic Orb of Rejuvenation. The king calls in his royal Mage to use the orb and \n"
                + "save the kingdom. \n"
                + "Congratulations adventurer, the kingdom is now saved thanks to you.  \n"
                + "If have beat the game, but if you want to go back to the main part of the \n"
                + "(C)astle to mess around feel free."
                + "Thank you for playing");

    }

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

