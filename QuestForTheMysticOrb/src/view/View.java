/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public abstract class View implements ViewInterface {

    private String menu;
    
    public View(String menuString){
        menu = menuString;
    }

    @Override
    public void display() {
        boolean cont = true;
        do {
            System.out.println(menu);
            char in = getInput();
            doAction(in);
        } while (cont);

    }

    @Override
    public char getInput() {
        Scanner in = new Scanner(System.in);
        
        String input = "";
        char rtn = 0;
        
        while(input.length() < 1) {
            display();
            input = in.nextLine();
            
            if(input.length() < 1) {
                System.out.println("please select an option");
                display();
            } else {
            
            rtn = input.toUpperCase().charAt(0);
            
            if (rtn != 'N' && rtn != 'L' && rtn != 'M' && rtn != 'E') {
                System.out.println("Please select a valid input.");
                input = "";
            }
            }
            
        }
        return rtn;
    }
}
