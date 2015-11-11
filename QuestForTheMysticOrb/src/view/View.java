/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Mikel
 */
public abstract class View implements ViewInterface {

    private String menu;

    //@Overried
    public void display() {
        boolean cont = true;
        do {
            System.out.println(menu);
            String in = getInput();
            doAction(in);
        } while (cont);

    }

}
