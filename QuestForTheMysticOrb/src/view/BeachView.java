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
 * @author mannj14
 */
public class BeachView extends View {
    
    public BeachView() {
        super("You find yourself at the beach. There is not much here other than \n"
        + "some sand and water. You can go (W)est to the sea, or (F)ill your bucket with water. \n");
               
        
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'W' :
                showSea();
                break;
            case 'F' : 
                getBucketOfWater();
                break;
            default:
                System.out.println("ERROR ON INPUT");
            }
        return true;
    }
    
    private void showSea() {
    MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Sea);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }
    
    private void getBucketOfWater() {
        Item i = Game.getInstance().getItemByNameAndRemove("BucketOfWater");
        if(i == null) {
            System.out.println("Your bicket is already full.\n");
            return;
        }
        Game.getInstance().getPlayer().getItems().add(i);
        System.out.println("You fill your bucket with water!\n");
    }
    
    
}

