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

        super("You find yourself in the castle. The king knows you can \n"
                + "find the orb and save the kingdom. Looking around you \n"
                + "see a pile of (B)uckets and a few exits. You can go \n"
                + "(E)ast to the dungeon, (W)est to the kitchen, (S)outh out \n"
                + "of the castle, (V)isit the king, or (N)orth to the tower.");
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'B':
                getBucket();
                break;
            case 'E':
                showDungeon();
                break;
            case 'W':
                showKitchen();
                break;
            case 'N':
                showTower();
                break;
            case 'S':
               showNorthKingdom();
                break;
            case 'V':
                showKing();
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
    
      private void showKing() {
       Player p = Game.getInstance().getPlayer();
           if(!p.hasItem("MysticOrb")) {
            System.out.println("The king doesn't want to see you unless you have the mystic orb.");
            return;
    } else {
               System.out.println("The king welcomes you into his throne room for the first time.");
               System.out.println("The room is simply marvelous. The king thanks you and calls for ");
               System.out.println("his royal Mage. after a few minutes the mage comes and takes the orb.");
               System.out.println("You hear him mumble a spell and you see light shoot out from the orb.");
               System.out.println("The next day you wake up in your small cotage your small cottage outside");
               System.out.println("the kingdom. There is a note by your bed that reads *thank you adventurer,");
               System.out.println("you have saved the entire kingdom.*");
               System.out.println("You decide to go back to the castle, even though you already win!");
               
           }
               
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
