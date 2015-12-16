/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.questforthemysticorb.MapControl;
import java.util.Random;
import model.Game;
import model.LocationType;
import model.Player;

/**
 *
 * @author Rich
 */
public class DungeonView extends View {

    //map[1][2].Dungeon();

    public DungeonView() {
        super("You have found the castle’s secret dungeon. It is very cold and sad \n"
                + "in here. You hear prisoners cry to you to let them out. You see a \n"
                + "(G)uard that you can talk to, or you can  go back (W)est to the castle.");

    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'W':
                System.out.println("You decide that there isn't much going on down here, \n"
                        + "and head back to the castle.");
                showCastle();
                break;
            case 'G':
                System.out.println("You approach the guard and he tells you to leave because you are in a restricted area.");
                break;              
            default:
                System.out.println("ERROR ON INPUT");

        }

        return true;
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
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
