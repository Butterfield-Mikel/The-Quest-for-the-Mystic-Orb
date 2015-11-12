// test push
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import static view.MapView.mapView;

/**
 *
 * @author Mikel
 */
public class HelpMenuView {
    
    public HelpMenuView() {
        
    }
    
    public void displayMenu() {
        System.out.println("Welcome to the Quest for the Mystic Orb. This is a simple text-based game where you type the \ndisplayed commands and use the enter key to execute the command you typed. Common commands \nwill be \nget “item name here” \nnorth \nsouth \neast \nwest \ntalk to “non-player character’s name here” \nquit");
        System.out.println("Q - quit to the main menu");
        System.out.println("M - look at the map");
    
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
            } else {
            
            rtn = input.toUpperCase().charAt(0);
            
            if (rtn != 'Q' && rtn != 'M') {
                System.out.println("Please select a valid input.");
                input = "";
            }
            }
            
        }
        return rtn;
    }
    public void doAction(char input) {
        
        switch(input) {
           
            case 'Q' :
                showMainMenu();
                break;
            case 'M' :
                mapView();
                break;
            
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        
    }



    private void showMainMenu() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    private void mapView() {
        
        MapView mapView = new MapView();
        char in = mapView.getInput();
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
