/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.questforthemysticorb.MapControl;
import java.util.Scanner;
import model.Game;
import model.Item;
import model.LocationType;
import model.Player;

/**
 *
 * @author Rich
 */
public class CastleView extends View {

    //map[1][1].Castle();

    public boolean hasMap = false;

    public CastleView() {

        super("You stand there, alone in the Castle. Looking around the room, you see a \n"
                + "(B)ucket on the floor. It might come in handy, you never know. Or you \n"
                + "might be stuck awkwardly carrying a bucket around the whole game, your call.\n"
                + " \n"
                + "Obvious exits from here are the (T)OWER, (D)UNGEON, (K)ITCHEN, and (N)ORTH KINGDOM. \n"
                + "I typed them in all caps to let you know they are important.\n"
                + "**************************************************************************************\n"
                + "What would you like to do (enter the first letter)?");
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'B':
                getBucket();
                break;
            case 'D':
                showDungeon();
                break;
            case 'K':
                showKitchen();
                break;
            case 'T':
                showTower();
                break;
            case 'N':
               showNorthKingdom();
                break;
            default:
                System.out.println("ERROR ON INPUT");
        }
        return true;
    }

    private void showDungeon() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Dungeon);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }

    private void showKitchen() {
       MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Kitchen);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }

    private void showTower() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Tower);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
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

    private void getBucket() {
        Item i = Game.getInstance().getItemByNameAndRemove("Bucket");
        if(i == null) {
            System.out.println("You actually already picked up the bucket.\n");
            return;
        }
        Game.getInstance().getPlayer().getItems().add(i);
        System.out.println("You got a bucket!\n");
    }
}
