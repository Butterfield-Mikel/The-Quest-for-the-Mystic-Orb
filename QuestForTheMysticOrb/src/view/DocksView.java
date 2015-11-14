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
                + "There is a great (S)ea out there to go exploring about in, "
                + "if that is the sort of thing you are into. n/"
                + " n/"
                + "Then again, if you did bother to bring that bucket with you, n/"
                + "there is (W)ater here so you could fill it with water. You better n/"
                + "find a use for it quick though, if you thought carrying an empty n/"
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
                showSea();
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
            
        private void showSea() {
        SeaView showSea = new SeaView();
        char in = showSea.getInput();
        }
}
