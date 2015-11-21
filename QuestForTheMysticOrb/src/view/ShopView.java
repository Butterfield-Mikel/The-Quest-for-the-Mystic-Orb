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
public class ShopView extends View {
    
    public ShopView() {
        super("In the shoppe you can buy many item that may help you on your quest"
                + "others may be a complete waste of time"
                + "but which are which, that will be up to you to decide"
                + "The Following Items are for sale"
                + "(B)ucket"
                + "(F)ish"
                + "(T)orch"
                + "(K)nife"
                + "You can also (R)eturn to the North Kingdom ");
    }
     @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'B':
                System.out.println("You now have a bucket, aren't you cool...");
                break;
            case 'F':
                System.out.println("You have a fish, what exactly do you plan to do with that...");
            case 'T':
                System.out.println("You have a torch.");
                break;
            case 'K':
                System.out.println("You have a knife.");
            case 'R':
                System.out.println("You have chosen to return to the North Kingdom");
                showNorthKingdom();
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
    
    
}
