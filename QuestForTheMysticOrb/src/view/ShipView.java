/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Rich
 */
public class ShipView extends View {
    //map[7][1].Ship();
    public ShipView() {
        super("You board the ship to make sure there aren’t any  \n"
                + "pirates or anything like that. During your search  \n"
                + "you start to question your own morals. I mean,  \n"
                + "seriously, you just get one someone else’s ship? \n"
                + "I bet they worked really hard for this! Well, the \n"
                + "damage is done, so if you want you can swim back \n"
                + "to the (S)ea and go to the beach from there, or \n"
                + "you can sail (E)ast or (W)east to see where it takes you.");
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
                showSea();
                break;
            case 'E' :
                System.out.println("You set sail to the east in hopes of finding the n/"
                        + "orb that will save the kingdom. A huge shark n/"
                        + "jumps out of the great waters and lands on n/"
                        + "your ship. It swallows you whole. n/"
                        + "Game over.");
                break;
            case 'W' :
                System.out.println("You set sail to the west in hopes of finding the n/"
                        + "orb that will save the kingdom. You see a ship n/"
                        + "approaching yours from the distance. OH NO, n/"
                        + "they are flying the skull and crossbones flag! n/"
                        + "PIRATES!!! The pirates board your ship, take n/"
                        + "all your valuables, and end your life… n/"
                        + "Game Over.");
                break;        
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showSea() {
        SeaView showSea = new SeaView();
        char in = showSea.getInput();
        }
        
/*
        Need to implament some kind of game over method here. maybe just have something 
        take you back to the main menu. I'll ask my group and get back to this. 
        
        private void showMainMenu() {
        MainMenuView MainMenuSea = new MainMenuView();
        char in = showMainMenu.getInput();
        }
        
        */
}