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
public class DungeonView {
    
    public DungeonView() {
        
    }

    public void displayMenu() {
        
        System.out.println("You walk down the stars into Ye Olde Dungeon. (see what I did there?)");
        System.out.println("Looking around you notice a guard, and four cells. The guard has a big mustaache and his name is Frank. How do you know his name is Frank? You don't you decided to name him that when you were walking down the stairs.");
        System.out.println("So what would you like to do in this dark, abysmal dungeon? Your only real options are to go back to the (C)astle, (T)alk to the guard, or (L)ook inside one of the cells.");
    
    }
    
    public char getInput() {
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        
        while(input.length() < 1) {
            displayMenu();
            input = in.nextLine();
            
            if(input.length() < 1) {
                System.out.println("please select an option");
                displayMenu();
            } else {
            
            rtn = input.toUpperCase().charAt(0);
            
            if (rtn != 'C' && rtn != 'T' && rtn != 'L') {
                System.out.println("Please select a valid input.");
                input = "";
            }
            }
            
        }
        return rtn;
    }
    
    public void doAction(char input) {
        
        switch(input) {
            case 'C' :
                System.out.println("You decide that there isn't much going on down here, and head back to the castle.");
                break;
            case 'T' :
                System.out.println("You attempt a conversation with the guard and ask him his name. He says it's Frank. WHat were the odds?");
                break;
            case 'L' :
                System.out.println("Like an idiot you walk into the nearest cell and look around. Your hear the door slam shut behind you and Frank giggles like a school girl. You immediatly regret all the decisions in your life that have brought you to this point.");
                break;
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        
    }
}