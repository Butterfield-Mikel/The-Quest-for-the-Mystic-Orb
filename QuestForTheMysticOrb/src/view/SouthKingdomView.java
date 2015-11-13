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
public class SouthKingdomView extends View {
    
      public SouthKingdomView() {
        super("You approach the southern end of the kingdom. You look n/"
                + "around and see the (N)orth end of the kingdom, a (F)arm n/"
                + "to your east, a (B)lacksmith to the west and the (C)rossroads n/"
                + "outside of the kingdom to the south.");
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
                showNorthKingdom();
                break;
            case 'F' :
                showFarm();
                break;
            case 'B' :
                showBlacksmith();
                break;
            case 'C' :
                showCrossroads();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showNorthKingdom() {
        NorthKingdomView showNorthKingdom = new NorthKingdomView();
        char in = showNorthKingdom.getInput();
        }
        
        private void showFarm() {
        FarmView showFarm = new FarmView();
        char in = showFarm.getInput();
        }
        
        private void showBlacksmith() {
        BlacksmithView showBlacksmith = new BlacksmithView();
        char in = showBlacksmith.getInput();
        }
        
        private void showCrossroads() {
        CrossroadsView showCrossroads = new CrossroadsView();
        char in = showCrossroads.getInput();
        }
}