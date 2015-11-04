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
           System.out.println("Welcome " + p.getName() + ":");
           System.out.println("Have fun playing!");
    }


    }

  
    

