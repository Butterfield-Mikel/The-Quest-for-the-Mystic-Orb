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
public class DeepWestlandWoodsView extends View {
    
    public DeepwestlandWoodsView() {
        super("You have entered the Deep Westland Woods, it seems rather dark and scary n/"
        + "As you look deeper into the woods you see what apears to be a wooden box of some kind n/"
        + "you realize that you really only have two choices at this point. /n"
        + "You can (A)proach the box and perhaps loose a limb, or you can (R)un back to the Westland Woods n/"
        + "like a scared little girl.");        
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'A' :
                System.out.println("You have reached the orb, now how to we solve this combination");
                break;
            case 'R' :
                System.out.println("You Chicken");
                showWestlandWoods();
                break;
            case 'L' :
                System.out.println("Like an idiot you walk into the nearest cell and look n/"
                        + "around. Your hear the door slam shut behind you and Frank giggles n/"
                        + "like a school girl. You immediatly regret all the decisions in your n/"
                        + "life that have brought you to this point.");
                break;
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        return true;
    }
    
        private void showWestlandWoods() {
        WestlandWoodsView showWestlandWoods = new WestlandWoodsView();
        char in = showWestlandWoods.getInput();
        }
    
}
