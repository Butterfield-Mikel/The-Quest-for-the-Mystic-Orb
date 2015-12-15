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
        super("You find yourself in an enchanted garden. \n"
                + "You see an (A)pple tree that has a delicous looking \n"
                + "apple. You can also (S)ee a gazebo in the garden \n"
                + "or you can go back to the (B)ridge"
              );
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
                showGazebo();
                break;
            case 'B' :
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
        System.out.println("Take a bite of the apple and it makes you feel enchanted!\n");
    }
}


