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
public class RiverView extends View {
       
    public RiverView() {
            super("This location no longer exists" );
               
    }
    
    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'S':
                System.out.println("You make a noble effort to get to shore but the current is just too strong."
                        + "You should think twice before randomly jumping into a river. Game Over");
                break;
            case 'G':
                System.out.println("Really? That's it for you? Game over, your died.");
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
    private void showMainMenu() {
        MainMenuView showMainMenu = new MainMenuView();
    }
    
    
}
