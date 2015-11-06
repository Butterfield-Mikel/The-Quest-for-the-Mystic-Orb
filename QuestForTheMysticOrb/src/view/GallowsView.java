/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author mannj14
 */
public class GallowsView {
    public boolean hasKnife=false; 
    public GallowsView() {
    }
    
    public void displayStory() {
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("As you enter the Gallows you feel like you are being watched");
        System.out.println("You see a circle of torches surrounding the Gallows, ");
        System.out.println("you wonder if a touch would be useful as you embark on this quest.");
        System.out.println("");
        System.out.println("++++++++++++++++++++");
        System.out.println("You have the following choices:");
        System.out.println("T-- Get a torch");
        System.out.println("R-- Return to the north Kingdom");
        System.out.println("H-- View the games help menu");
    }
    
     public char getInput() {
        
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        
        while(input.length() < 1) {
            displayStory();
            input = in.nextLine();
            
            if(input.length() < 1) {
                System.out.println("please select an option");
                displayStory();
            } else {
            
            rtn = input.toUpperCase().charAt(0);
            
            if (rtn != 'T' && rtn != 'R' && rtn != 'H') {
                System.out.println("Please select a valid input.");
                input = "";
            }
            }
            
        }
        return rtn;
    }
     //can't get these messages to display, any ideas/
    public void doAction(char input) {
        
        switch(input) {
            case 'T' :
                if (hasKnife == true) {
                    System.out.println("You Got the Knife");
                }else {
                    System.out.println("You Need a Knife To Cut that Down");
                }
                break;
            case 'R' :       
                System.out.println("insert function to return to North Kingdom Here");
                break;
            case 'H' :
                System.out.println("does this show if i type h?");
                break;
            default:
                System.out.println("ERROR ON INPUT");
                
        }
    }
    }
