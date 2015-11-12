/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import view.CastleView;

/**
 *
 * @author Mikel
 */
public class MainMenuView extends View{
    
    public MainMenuView() {
        super("+---------------------+\n"
                + "| Select an option:   |\n"
                + "| N - start new game  |\n"
                + "| L - load saved game |\n"
                + "| H - view help menu  |\n"
                + "| E - exit game       |\n"
                + "+---------------------+");
    }
    
    /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'N' :
                startNewGame();
                break;
            case 'L' :
                loadGame();
                break;
            case 'H' :
                showHelpMenu();
                //System.out.println("does this show if i type h?");
                break;
            case 'E' : 
                return false;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void startNewGame() {
        System.out.println("you selected start game");
    }

    private void loadGame() {
       System.out.println("NOT IMPLEMENTED YET");
    }

    private void showHelpMenu() {
        //System.out.println("does this print if i type h?");
        HelpMenuView helpMenuView = new HelpMenuView();
        char in = helpMenuView.getInput();
    }
    
}
