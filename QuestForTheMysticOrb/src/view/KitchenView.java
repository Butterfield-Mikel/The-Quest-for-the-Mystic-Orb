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
public class KitchenView {
    
public KitchenView() {
    }
    
    public void displayStory() {
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("You have entered the castle kitchen");
        System.out.println("In the kitchen you see a knife, a bucket, and some meat");
        System.out.println("you wonder if any of these items would be useful as you embark on this quest.");
        System.out.println("the only exit is the one you just came in that will return you to the castle.");
        System.out.println("++++++++++++++++++++");
        System.out.println("You have the following choices:");
        System.out.println("K-- Get a Knife");
        System.out.println("B-- Get a Bucket");
        System.out.println("M-- Get some meat");
        System.out.println("R-- Return to the Castle");
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
            
            if (rtn != 'K' && rtn != 'B' && rtn != 'M' && rtn != 'R' && rtn != 'H') {
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
            case 'K' :
               System.out.println("You Took a Knife");
                break;
            case 'B' :       
                System.out.println("You now have a bucket");
                break;
            case 'M' :
                System.out.println("Congrats, you now have a hunk of raw meat...");
                break;
            case 'R' :
                System.out.println("You have returned to the main castle");
                break;
             case 'H' :
                System.out.println("Display Help Menu");
                break;    
            default:
                System.out.println("ERROR ON INPUT");
                
        }
    }
    }

