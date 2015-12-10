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
        super("You walk down the stars into Ye Olde Dungeon. (see what I did there?) \n"
                + "Looking around you notice a guard, and four cells. The guard has a big mustaache \n"
                + "and his name is Frank. How do you know his name is Frank? You don't you decided \n"
                + "to name him that when you were walking down the stairs. \n"
                + "So what would you like to do in this dark, abysmal dungeon? Your only real \n"
                + "options are to go back to the (C)astle, (T)alk to the guard, or (L)ook \n"
                + "inside one of the cells.");

    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'C':
                System.out.println("You decide that there isn't much going on down here, \n"
                        + "and head back to the castle.");
                showCastle();
                break;
            case 'T':
                System.out.println("You attempt a conversation with the guard and ask him \n"
                        + "his name. He says it's Frank. What were the odds?");
                break;
            case 'L':
                System.out.println("Like an idiot you walk into the nearest cell and look \n"
                        + "around. Your hear the door slam shut behind you and Frank giggles \n"
                        + "like a school girl. You immediatly regret all the decisions in your \n"
                        + "life that have brought you to this point.");
                System.out.println("*********************************************************************\n"
                        + "Frank wants you to guess the number in his head. It's only between 1-5, so you \n"
                        + "should get it eventually.");

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
