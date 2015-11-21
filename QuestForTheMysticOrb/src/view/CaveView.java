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
public class CaveView extends View {
   
    public CaveView() {
        super("As you are walking throught the forest you notice that there is a cave. n/"
        + "as you enter the cave you have the feeling that this might be a bad idea,  n/"
        + "but teh spirit of adventure is strong n/"
        + "What should you do (C)ontinue deeper into the cave, or (R)eturn to the safety of the woods.  n/"
        );
    
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'C' :
                System.out.println("You decide to head deeper in to the cave");
                showDeepCave();
                break;
            case 'R' :
                System.out.println("You decied that risk is not worth it, and to return to the woods.");
                showDeepWestlandWoods();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        return true;
    }
    
        private void showCastle() {
        CastleView showCastle = new CastleView();
        char in = showCastle.getInput();
        }
    
    
}
