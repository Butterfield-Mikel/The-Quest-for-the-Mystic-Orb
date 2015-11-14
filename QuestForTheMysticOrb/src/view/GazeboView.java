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
public class GazeboView extends View {
    
    public GazeboView() {
        super("You walk over to the Gazebo because you obviously have nothing better n/"
                + "to be doing right now. There is a really comfotable looking couch n/"
                + "just sitting there. Seriously, this is a LazyBoy quallity couch here. n/"
                + "If you didn't take a (N)ap it would be a crime.n/"
                + "n/"
                + "Then again you could just go back to the (E)nchanted Garden and n/"
                + "try to find somehting else to do.");
    }

    /**
     * @param input
     *
     * @return
     */
    
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'N':
                System.out.println("You decide to put the dire needs of your nation in the rear view mirror n/"
                        + "and settle in for a nap. You wake up an hour later and realize that you have been n/"
                        + "attacked an eaten by a pack of wild bunnies. That's what you get slacker, GAME OVER.");
                return false;
            case 'E':
                showEnchantedGarden();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void showEnchantedGarden() {
    EnchantedGardenView showEnchantedGarden = new EnchantedGardenView();
    char in = showEnchantedGarden.getInput();
    }
}
