/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Player;

/**
 *
 * @author Mikel
 */
public class WelcomeView {
    
    public WelcomeView() {
        
    }
    public void displayBanner() {
        
        System.out.println("***************************************");
        System.out.println("Welcome to the Quest for the Mystic Orb");
        System.out.println("This game will play as a text-based roleplaying game");
        System.out.println("where you navigate from the castle, through the kingdom,");
        System.out.println("and out into the uncharted lands outside the kingdom.");
        System.out.println("You will face challegnes, collect items, and get lost a few times");
        System.out.println("***************************************");
        
    }
    
    public String getPlayerName() {
        Scanner in = new Scanner(System.in);
        String name = "";
                
    while (name.length() < 2) {
        
        
        System.out.println("Please enter your name: ");
        
        
        name = in.nextLine();
        
        if(name.length() < 2) {
            System.out.println("Please put a longer name.");
        }
    }
        
        return name;
        
    }
    
    public void displayPlayerNameBanner(Player p) {
           System.out.println("Welcome " + p.getName() + ", King Simon has summoned you, the head knight of the round table,");
           System.out.println("because a dark wizard has cursed the kingdom with a famine.");
           System.out.println("The only way to restore the kingdom to its prosperous state is to");
           System.out.println("go on a dangerous quest to the deep Westland Woods where");
           System.out.println("you can find the Mystic Orb of Rejuvenation.");
           System.out.println("Have fun playing!");
    }


    }

  
    

