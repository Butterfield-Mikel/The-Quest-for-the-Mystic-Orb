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

        super("You stand there, alone in the Castle. Looking around the room, Maybe you can \n"
                + "take one of a few (B)uckets that are on the floor. That might be handy. However, you \n"
                + "might end up awkwardly carrying a bucket around the whole game, your call.\n"  
                + "Obvious exits from here are the (T)ower, (D)ungeon, (K)itchen, and (N)north kingdom. \n"
                + "Also, you can try to (V)isit the king."                             
                + "What would you like to do? \n"
                + "Please enter a single letter to preform an action. Action letters can be found above in parenthesis.");
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
               System.out.println("You win");
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
