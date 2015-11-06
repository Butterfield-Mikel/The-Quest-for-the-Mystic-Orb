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
public class CastleView {
    
    public CastleView(){
        
    }
    
    public void displayCastle() {
        System.out.println("You find yourself in the Castle. The King has requested that you personally embark on an epic quest to find the Mystic Orb and save the Kingdom.");
        System.out.println("Looking around the room, you see a (B)UCKET on the floor. It might come in handy, you never know. Or you might be stuck awkwardly carrying a bucket around the whole game, your call.");
        System.out.println("Obvious exits from here are the (T)OWER, (D)UNGEON, (K)ITCHEN, and (N)ORTH KINGDOM. I typed them in all caps to let you know they are important.");
        System.out.println("********************************");
        System.out.println("What would you like to do (enter the first letter)?");
    }
    
    public char getInput() {
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        
        while(input.length() < 1) {
            displayCastle();
            input = in.nextLine();
        
            if(input.length() < 1) {
                System.out.println("What would you really like to do?");
                displayCastle();
            } else {
            
            rtn = input.toUpperCase().charAt(0);
            
            if (rtn != 'B' && rtn != 'D' && rtn != 'K' && rtn != 'T' && rtn !='N') {
                System.out.println("Try doing something else, or typing something else. I promise something will might happen.");
                input = "";
            }
            }
            
        }
        return rtn;
        
    }
    public void doAction(char input) {
        
        switch(input) {
            case 'B' :
                
                break;
            case 'D' :
                
                break;
            case 'K' :
                
                //System.out.println("does this show if i type h?");
                break;
            case 'T' : 
                
                break;
            case 'N' : 
                
                break;
            default:
                System.out.println("ERROR ON INPUT");
            }
    }
}

