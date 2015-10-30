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
import view.MainMenuView;
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
        
        
        //mainMenuView
        MainMenuView mainView = new MainMenuView();
        
        char in = mainView.getInput();
        
        System.out.println("You entered " + in);
        
        
    }
    
}
//comment...