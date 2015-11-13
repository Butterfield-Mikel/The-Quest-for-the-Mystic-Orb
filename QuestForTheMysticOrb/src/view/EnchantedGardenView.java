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
        super("You get across the bridge into an enchanted garden. At least, it looks like n/"
                + "it may have been enchanted at one point. Everything around here looks pretty n/"
                + "dead, exept for a small apple tree. However, that apple tree looks like it is n/"
                + "nearing death and could die anytime. If you had some water it might (W)ater it.n/"
                + "So yeah, if you actually used that bucket you've been hauling around to pick up n/"
                + "some water, now would be the time."
                + " n/"
                + "Also, you spy a very nice (G)azebo. Check it out if you want, or head back to n/"
                + "the (B)ridge.");
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'W' :
                System.out.println("You water the tree and it springs back to life. An apple n/"
                        + "grows out right away and you decide to take it and eat it. You n/"
                        + "have much choice in the matter because you are really hungry, n/"
                        + "and it looks really delicious. You feel more awesome now, like you n/"
                        + "can travel more places than you could have before.");
                break;
            case 'G' :
                showGallows();
                break;
            case 'B' :
                showBridge();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
        private void showGallows() {
        GallowsView showGallows = new GallowsView();
        char in = showGallows.getInput();
        }
        
        private void showBridge() {
        BridgeView showBridge = new BridgeView();
        char in = showBridge.getInput();
        }
}
