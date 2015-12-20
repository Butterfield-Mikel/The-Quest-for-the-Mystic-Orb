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
public class SeaView extends View {
    
       public SeaView() {
        super("You find yourself standing alongside the sea. (S)outh of \n"
                + "you there is a ship and there are some docks to the \n"
                + "(N)orth. Also, there is a beach to the (E)ast.");
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'S' :
                System.out.println(""+
"                  ,/|\\,\n" +
"                ,/' |\\ \\,\n" +
"              ,/'   | |  \\\n" +
"            ,/'     | |   |\n" +
"          ,/'       |/    |\n" +
"        ,/__________|-----' ,\n" +
"       ___.....-----''-----/\n" +
"       \\                  /\n" +
"   ~~-~^~^~`~^~`~^^~^~-^~^~^~-~^~^\n" +
"     ~-^~^-`~^~-^~^`^~^-^~^`^~^-~^\n");
                showShip();
                break;
            case 'E' :
                Player p = Game.getInstance().getPlayer();
        if(p.hasItem("Bucket")) {
                     System.out.println(""+          
"         ___   ____\n"+
"        /' --;^/ ,-_|     | |  \n"+
"       / / --o| o-| |   --(_)--\n"+
"      /-/-/|o|-||-|| ||   / |  \n"+
"       '`  ` |-|   `` '\n"+
"             |-|\n"+
"             |-|O\n"+
"             |-(|,__\n"+
"          ...|-||--,|_....\n"+
"      ,;;;;;;;;;;;;;;;;;;;;;;;;,.\n"+
"~~,;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
"~;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,  ______   ---------   _____     ------\n"); }
                        
                showBeach();
                break;
            case 'N' :
                                System.out.println(""+
"                       _  _                 |-._\n" +
"                    -         - _           |-._|\n" +
"                 O                 (). _    |\n" +
"                                     '(_) __|__\n" +
"                                     [__|__|_|_]\n" +
"  ~~ _|_ _|_ _|_  ~~     ~~~          |__|__|_|\n" +
"     ||| ||| |||      ~~      ~~~     |_|__|__|\n" +
"     _|___|___|__.      ~~~ ~~       /|__|__|_|\n" +
"    |___________/       ~~~~  ~~~   / |_|__|__|\n" +
"  ~     ~~ ~      ~~       ~~      /  |_| |___|\n" +
"     ~~~~    ~~~   ~~~~   ~   ~~  /    \n");
                showDocks();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showBeach() {
      MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        
        if(!p.hasItem("Bucket")) {
            System.out.println("You go to the beach but there is nothing to do yet so you return to the sea. \n");
            return;
        }
        
        try {
            mc.moveLocation(p, LocationType.Beach);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
            
        private void showShip() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Ship);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
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
