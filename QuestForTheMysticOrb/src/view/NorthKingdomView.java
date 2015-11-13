/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Rich
 */
public class NorthKingdomView extends View {
    
    public NorthKingdomView() {
        super("Walking outside into the North Kingdom, you see some friendly n/"
                + "looking (G)allows, and a dark and dreary (S)hoppe. Scratch that, n/"
                + "the Shoppe is friendly and the Gallows are dark. You can go check n/"
                + "out either one, or keep going to the South (K)ingdom. Then there n/"
                + "is always going back into the (C)astle.");
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'S' :
                showShoppe();
                break;
            case 'G' :
                showGallows();
                break;
            case 'K' :
                showSouthKingdom();
                break;
            case 'C' :
                showCastle();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showShoppe() {
        ShoppeView showShoppe = new ShoppeView();
        char in = showShoppe.getInput();
        }
        
        private void showGallows() {
        GallowsView showGallows = new GallowsView();
        char in = showGallows.getInput();
        }
        
        private void showSouthKingdom() {
        SouthKingdomView showSouthKingdom = new SouthKingdomView();
        char in = showSouthKingdom.getInput();
        }
        
        private void showCastle() {
        CastleView showCastle = new CastleView();
        char in = showCastle.getInput();
        }
}