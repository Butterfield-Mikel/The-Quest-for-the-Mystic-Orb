/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class MainMenuView {
    
    public MainMenuView() {
        
    }
    
    public void displayMenu() {
        System.out.println("Select an option:");
        System.out.println("N - start new game");
        System.out.println("L - load saved game");
        System.out.println("M - view help menu");
        System.out.println("E - exit game");
    
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
            }
            
            rtn = input.toUpperCase().charAt(0);
            
            if (rtn != 'N' || rtn != 'L' || rtn != 'H' || rtn != 'E') {
                System.out.println("Please select a valid input.");
                input = "";
                
            }
            
        }
        return rtn;
    }
    public void doAction(char input) {
        
    }
    
}
