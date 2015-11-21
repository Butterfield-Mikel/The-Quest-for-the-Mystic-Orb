/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author mannj14
 */
public class BeachView extends View {
    
    public BeachView() {
        super("You have decided to take a small break fromt eh stressful life of a hero /n"
        + "to take a relaxing walk on the beach. After nice walk you can have to make a tough /n"
                + "decison, (B)uild a sand castle or (R)eturn to the Docks ");
        
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'B' :
                System.out.println("You decide to build a sand castle");
                System.out.println("As soon as you finish it, a wave swells up and washes it away");
                break;
            case 'R' :
                showDocks();
                break;
            default:
                System.out.println("ERROR ON INPUT");
            }
        return true;
    }
    
    private void showDocks() {
    DocksView showDocks = new DocksView();
    char in = showDocks.getInput();
    }
    
    
}

