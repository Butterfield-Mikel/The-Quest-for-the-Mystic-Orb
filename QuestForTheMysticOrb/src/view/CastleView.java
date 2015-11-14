/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Rich
 */
public class CastleView extends View{
        public boolean hasMap=false; 
    public CastleView(){
        
        super("You stand there, alone in the Castle. Looking around the room, you see a n/"
                + "(B)UCKET on the floor. It might come in handy, you never know. Or you n/"
                + "might be stuck awkwardly carrying a bucket around the whole game, your call.n/"
                + " n/"
                + "Obvious exits from here are the (T)OWER, (D)UNGEON, (K)ITCHEN, and (N)ORTH KINGDOM. n/"
                + "I typed them in all caps to let you know they are important.n/"
                + "**************************************************************************************n/"
                + "What would you like to do (enter the first letter)?");
    }
    
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'B' :
                System.out.println("You pick up the BUCKET. Your life is truly the exciting one.");
                break;
            case 'D' :
                showDungeon();
                break;
            case 'K' :
                showKitchen();
                break;
            case 'T' : 
                showTower();
                break;
            case 'N' : 
                if (hasMap == true) {
                    showNorthKingdom();
                }else {
                    System.out.println("You really should find a MAP or something before wandering around a whole Kingdom. n/"
                            + "Maybe if you head to the TOWER and take a look around you can make one. Sorry, no Rand McNally option.");
                }
                break;
            default:
                System.out.println("ERROR ON INPUT");
            }
        return true;
    }
    
    private void showDungeon() {
    DungeonView showDungeon = new DungeonView();
    char in = showDungeon.getInput();
    }
    
    private void showKitchen() {
    KitchenView showKitchen = new KitchenView();
    char in = showKitchen.getInput();
    }
    
    private void showTower() {
    TowerView showTower = new TowerView();
    char in = showTower.getInput();
    }
    
    private void showNorthKingdom() {
    NorthKingdomView showNorthKingdom = new NorthKingdomView();
    char in = showNorthKingdom.getInput();
    }
}

