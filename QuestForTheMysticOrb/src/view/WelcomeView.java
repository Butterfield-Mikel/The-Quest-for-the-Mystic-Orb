/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Player;
import sun.audio.AudioPlayer;

/**
 *
 * @author Mikel
 */
public class WelcomeView {
    
    public WelcomeView() {
        
    }
    public void displayBanner() {
        
        System.out.println("********************************");
        
    }
    
    public String getPlayerName() {
        Scanner in = new Scanner(System.in);
        String name = "";
                
        System.out.println("what is your name?");
        
        name = in.nextLine();
        
        return name;
        
    }
    
    public void displayPlayerNameBanner(Player p) {
           System.out.println("welcome" + p.getName() + ":");
           System.out.println("have fun playing");
    }


    }

  
    

