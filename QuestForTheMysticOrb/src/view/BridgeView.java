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
public class BridgeView extends View {

    public BridgeView() {
        super("As you are walking you see a bridge. Unfortunately you n/"
                + "cannot go further east without crossing the bridge.  n/"
                + "he bridge is covered with a thorn bush. You could try n/"
                + "to (M)ove the bush, but it looks like you might need n/"
                + "something to help you. You can always turn back n/"
                + "And go to the (C)rossroads or head down to the (B)each.");
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'M':
                //if gloves.Items = false {
                System.out.println("You try to move the bush but the thorns cut up your hands. n/"
                        + "Too bad, I bet whatever is on the other side of this bridge is awesome.");
                //} else { showEnchantedGardenView(); }
                break;
            case 'B':
                showBeach();
                break;
            case 'C':
                showCrossroads();
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

    private void showBeach() {
        BeachView showBeach = new BeachView();
        char in = showBeach.getInput();
    }

    /*
     private void showEnchantedGarden() {
     EnchantedGardenView showEnchantedGarden = new EnchantedGardenView();
     char in = showEnchantedGarden.getInput();
     }
     */
}
