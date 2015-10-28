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
        
        System.out.println("********************************");
        System.out.println("The game will play as a text-based roleplaying game where you navigate from the castle, ");
        System.out.println("through the kingdom, and out into the unchartered lands outside the kingdom.");
        System.out.println("You will face challenges, collect items, use those items to get more items, and get lost a few times. ");
        System.out.println("Once you find the Mystic Orb of Rejuvenation you will have to take it back to the castle where the king will thank you and Merlyn");
        System.out.println("the powerful wizard, can use it to restore the kingdom to its prosperous state.");
        System.out.println("********************************");
        System.out.println("");
        
    }
    
    public String getPlayerName() {
        Scanner in = new Scanner(System.in);
        String name = "";
                
    while (name.length() < 2) {
        
        System.out.println("what is your name?");
        
        name = in.nextLine();
        
        if(name.length() < 2) {
            System.out.println("Please put a longer name.");
        }
    }
        
        return name;
        
    }
    
    public void displayPlayerNameBanner(Player p) {
           System.out.println("");
           System.out.println( p.getName() + ", King Simon has summoned you, ");
           System.out.println("the head knight of the round table, because a dark wizard has cursed the kingdom with a famine." );
           System.out.println("The only way to restore the kingdom to its prosperous state is to go on a dangerous quest ");
           System.out.println(" to the deep Westland Woods where you can find the Mystic Orb of Rejuvenation.");
           
    }


    }

  
    

