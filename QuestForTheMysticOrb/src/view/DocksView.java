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
public class DocksView extends View {
    
    public DocksView() {
        super("You keep walking until you get to the end of the dock. n/"
                + "There is a (S)hip here that can take you away from the kingdom n/"
                + ", away from all your problems and fears. This is your chance n/"
                + "for a new life out in the open sea! Do it man, you know that n/"
                + "you want to. n/"
                + " n/"
                + "Then again, if you did bother to bring that bucket with you, n/"
                + "there is (W)ater and you could fill it with water. You better n/"
                + "find a use for t quick though, if you thought carrying an empty n/"
                + "bucket made you look stupid, a bucket of water might get you n/"
                + "sent to the loony bin. n/"
                + " n/"
                + "If you are bored though, head back to the (C)rossroads.");
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
                showShip();
                break;
            case 'C' :
                showCrossroads();
                break;
            case 'W' :
                System.out.println("You fill your bucket with water, hoping for a good workout n/"
                        + "as you galavant around the rest of the Kingdom.");
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showCrossroads() {
        CrossroadsView showCrossroads = new CrossroadsView();
        char in = showCrossroads.getInput();
        }
            
        private void showShip() {
        ShipView showShip = new ShipView();
        char in = showShip.getInput();
        }
}
