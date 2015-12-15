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
public class DocksView extends View {

    //map[5][1].Castle();

    public DocksView() {
        super("You are standing on the docks. \n"
                + "There is a great (S)ea out there to go exploring about in, or\n"              
                + "if you are bored though, head back to the (C)rossroads.");
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'S':
                showSea();
                break;
            case 'C':
                showCrossroads();
                break;        
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void showCrossroads() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Crossroads);
        } catch (Exception e) {
            e.printStackTrace();
        }

        p.getLocation().getLocationView().display();
    }

    private void showSea() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Sea);
        } catch (Exception e) {
            e.printStackTrace();
        }

        p.getLocation().getLocationView().display();
    }
    

    }

