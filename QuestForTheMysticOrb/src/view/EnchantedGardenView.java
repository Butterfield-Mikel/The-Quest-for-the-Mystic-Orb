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
public class EnchantedGardenView extends View {
    
    public EnchantedGardenView() {
        super("You get across the bridge into the Enchanted Garden. That is the ironic n/"
                + "name that you give it, due to the face that it looks awful. All you n/"
                + "see are dead trees, dirt, and dead grass. One tree looks like it could n/"
                + "do something if it has some water, but you would be crazy if you were n/"
                + "carrying a bucket of (W)ater all this time. n/"
                + " n/"
                + "You also spy a nice looking (G)azebo in the distance. It looks pretty n/"
                + "awesome as far as Gazebos go.");
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'G' :
                showGazebo();
                break;
            case 'B' :
                showBridge();
                break;
            case 'W' :
                System.out.println("You water the almost dead apple tree and it springs to life! n/"
                        + "It magically grows a presumably magic apple for you to eat. You take n/"
                        + "the apple and eat it without questioning it's origins because face it, n/"
                        + "you are really hungry and the King didn't say anything about starving n/"
                        + "while trying to save the Kingdom");
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
        private void showGazebo() {
        GazeboView showGazebo = new GazeboView();
        char in = showGazebo.getInput();
        }
        
        private void showBridge() {
        BridgeView showBridge = new BridgeView();
        char in = showBridge.getInput();
        }
}