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
public class DeepCaveView extends View {
    
    public DeepCaveView() {
     super("You enter the deepest part of the cave n/"
        + "If you took the cave from the gallows you are ok because you can see. n/"
        + "If not a monster comes out the shadows and since you can't see anything it kills you n/"
        + "If you survive the monster attack, your only option is to (R)eturn to the less deep part of the cave"     
        );
    
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'R' :
                System.out.println("You decide that there isn't much going on down here, n/"
                        + "and head back to the cave.");
                showCave();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        return true;
    }
    
        private void showCave() {
        CaveView showCave = new CaveView();
        char in = showCave.getInput();
        }
}
