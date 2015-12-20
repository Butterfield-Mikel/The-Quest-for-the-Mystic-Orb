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
 * @author Rich
 */
public class EnchantedGardenView extends View {
    //map[4][3].EnchantedGarden();
    public EnchantedGardenView() {
        super("You find yourself in an enchanted garden. You feel the powers of the garden. \n"
                + "You see an (A)pple tree that has a delicous looking apple on it. \n"
                + "You can go (W)est to the bridge or (S)outh to the garden's gazebo\n");
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
"                   ,'. \n" +
"                 ,(   ).  \n" +
"               ,/       \\.            _ \n" +
"              /    _  _   \\         /  \n" +
"            /     ( `' )    \\      !  (\n" +
"           (       \\  /      )      \\ _  \n" +
"          ,/        `'       \\.\n" +
"         (_____________________)\n" +
"        ((((((((|||||||||))))))))\n" +
"       (=========================)\n" +
"        ) ( )(             )( ) ( \n" +
"        | | !!             !! | | \n" +
"        | | !!             !! | | \n" +
"        | | !!             !! | | \n" +
"        | | !!             !! | | \n" +
"        | | !!             !! | | \n" +
"        | | )(             )( | | \n" +
"        ) (.''~~~~~~~~~~~~~''.) (\n");
                
                showGazebo();
                break;
            case 'W' :
                
                                System.out.println(""+             
"   ^^                __..-:'':__:..:__:'':-..__\n" +
"                 _.-:__:.-:'':  :  :  :'':-.:__:-._\n" +
"               .':.-:  :  :  :  :  :  :  :  :  :._:'.\n" +
"            _ :.':  :  :  :  :  :  :  :  :  :  :  :'.: _\n" +
"           [ ]:  :  :  :  :  :  :  :  :  :  :  :  :  :[ ]\n" +
"           [ ]:  :  :  :  :  :  :  :  :  :  :  :  :  :[ ]\n" +
"  :::::::::[ ]:__:__:__:__:__:__:__:__:__:__:__:__:__:[ ]:::::::::::\n" +
"  !!!!!!!!![ ]!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!![ ]!!!!!!!!!!!\n" +
"  ^^^^^^^^^[ ]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^[ ]^^^^^^^^^^^\n" +
"           [ ]                                        [ ]\n" +
"           [ ]                                        [ ]\n" +
"           [ ]                                        [ ]\n" +
"   ~~^_~^~/   \\~^-~^~ _~^-~_^~-^~_^~~-^~_~^~-~_~-^~_^/   \\~^ ~~_ ^\n");
                
                showBridge();
                break;
            case 'A' :
                getEnchantedApple();
                break;            
            default:
                System.out.println("ERROR ON INPUT");
                
                    
            
                    
        }
        return true;
    }
        private void showGazebo() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Gazebo);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showBridge() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Bridge);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
    private void getEnchantedApple() {
        Item i = Game.getInstance().getItemByNameAndRemove("EnchantedApple");
        if(i == null) {
            System.out.println("You should finish your other apple before picking another.\n");
            return;
        }
        Game.getInstance().getPlayer().getItems().add(i);
        System.out.println("You pick and eat some of the apple and it makes you feel enchanted!\n");
    }
}


