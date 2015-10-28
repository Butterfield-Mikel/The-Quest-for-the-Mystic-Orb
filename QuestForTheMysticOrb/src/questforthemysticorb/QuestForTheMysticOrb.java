/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questforthemysticorb;

import model.Bucket;
import model.EnchantedApple;
import model.Location;
import model.Player;
import view.WelcomeView;

/**
 *
 * @author Mikel
 */
public class QuestForTheMysticOrb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player player = new Player();
        
        WelcomeView welcomeView = new WelcomeView();
        welcomeView.displayBanner();
        
       player.setName(welcomeView.getPlayerName());
        
       welcomeView.displayPlayerNameBanner(player); 
        
        
        
       /* 
        Player playerOne = new Player();
        Bucket newBucket = new Bucket();
        Location currentLocation = new Location();
        EnchantedApple newApple = new EnchantedApple(); 
        
        System.out.println("This works");
        System.out.println(Player.class);
        System.out.println(Location.class);
        System.out.println(Bucket.class);
        System.out.println(EnchantedApple.class);
        */
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
    }
    
}
