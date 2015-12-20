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
                System.out.println(""+   
"|             *_   _   _   _   _   _   _*\n" +
"|     ^       | `_' `-' `_' `-' `_' `_`  |\n" +
"|     |        |     |    |    |    |    |\n" +
"|     |  (*)   |     |    |    |    |    |\n" +
"|     | _<\">_  |-----+----+----+----+----|\n" +
"|    o+o \\ / \\0      |    |    |    |    |\n" +
"|     0'\\ ^ /\\/      |    |    |    |    |\n" +
"|       /_^_\\  |-----+----+----+----+----|\n" +
"|       || || |      |    |    |    |    |\n" +
"|       d|_|b_T______|____|____|____|____|\n");
                
                showDungeon();
                break;
            case 'W':
               System.out.println(""+
  "| |__________________________________|                               |\n" +
  "|    |   _______________________   |     _-            -             |\n" +
  "|_-  |  |                       |  |                        _-       |\n" +
  "|    |  |                     _ |  |  T  T  T  T  T                  |\n" +
  "| _-_|  |    __.'`'`'`''`;__ /  |  |  |  |  |  |  |        _-     -  |\n"+
  "|    |  | _/U  `'.'.,.,`.'  U   |  |  | (_) |  |  |                  |\n"+
  "|    |  |   |               |   |  | | |    O (_) ()    _o_     |    |\n"+ 
  "|    |  |   |      `', `,   |   |  | |_|   ____         [ ]     |    |\n"+
  "|_-  |  |   |   ``) ( )`    |   |  | ______|__|_________[_]__   |    |\n"+
  "|    |  |   |____(,`)(,(____|   |  | ________________________   |    |\n"+
  "|    |  |   |   `@@(@@)@)'  |   |  | ||            _____   ||   |    |\n"+
  "|    |  |   !   @@)@@)@@@(  !   |  | ||   _--      |   |   ||  |||   |\n"+
  "|__lc|__| _____________________ |__|_||____________|###|___||_|||||__|\n"+
  " -_  _ -      _ -   _-_    -  _ - _ -|| -_    _  - |___|_- || |||||-_ |\n");
               
                showKitchen();
                break;
            case 'N':
                System.out.println(""+
"                                   _______________________      |\n" +
"                                  |  ________   ________  |     |\n" +
"                                  | |        | |    ___ | |     |\n" +
"                                  | |        | |  ,',.('| |     |\n" +
"                                  | |        | | :  .'  | |     |\n" +
"                                  | |        | | :) _  (| |     |\n" +
"                                  | |        | |  `:_)_,| |     |\n" +
"                                  | |________| |________| |     |\n" +
"                                  |  ________   ________  |     |\n" +
"                                  | |        | |        | |     |\n" +
"                                  | |        | |        | |     |\n" +
"                                  | |        | |        | |     |\n" +
"                                  | |        | |        | |     |\n" +
"                                  | |        | |        | |     |\n" +
"                                  | |________| |________| |     |\n" +
"                                  |_______________________|     |\n" +
"                                                                |\n" +
"                                                                |\n" +
"                   _____________________________________________|\n" +
"                                                                `.\n" +
"                                                                  `.\n");
                
                showTower();
                break;
            case 'S':
                System.out.println(""+
"                             -|             |-\n" +
"         -|                  [-_-_-_-_-_-_-_-]                  |-\n" +
"         [-_-_-_-_-]          |             |          [-_-_-_-_-]\n" +
"          | o   o |           [  0   0   0  ]           | o   o |\n" +
"           |     |    -|       |           |       |-    |     |\n" +
"           |     |_-___-___-___-|         |-___-___-___-_|     |\n" +
"           |  o  ]              [    0    ]              [  o  |\n" +
"           |     ]   o   o   o  [ _______ ]  o   o   o   [     | ----__________\n" +
"_____----- |     ]              [ ||||||| ]              [     |\n" +
"           |     ]              [ ||||||| ]              [     |\n" +
"       _-_-|_____]--------------[_|||||||_]--------------[_____|-_-_\n" +
"      ( (__________------------_____________-------------_________) )\n");
                
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
               System.out.println("The next day you wake up in your small cottage outside");
               System.out.println("the kingdom. There is a note by your bed that reads 'thank you adventurer,");
               System.out.println("you have saved the entire kingdom. Also, the king wants his bucket back.'");
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
