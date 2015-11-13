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
public class BlacksmithView extends View {

    public BlacksmithView() {
        super("You see a blacksmith working in his shop. n/"
                + "he looks very hungry, probably because n/"
                + "of the curse that has been put on the kingdom. /n"
                + "You also see a pair of beautifully crafted (G)auntlets. n/"
                + "The only direction you can go is back to the (S)outh Kingdom.  ");
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
                showSouthKingdom();
                break;
            
            /*
            case 'G':
                Need to make it so you can get the gauntlets by trading the corn for it,
                if corn.Items = true
                    sout "You trade your corn for the gauntlets."
                else sout "This guy is running a business, he isn't just going to give away his merchandise. His wife would kill him! "
        */
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void showSouthKingdom() {
        SouthKingdomView showSouthKingdom = new SouthKingdomView();
        char in = showSouthKingdom.getInput();
    }


}


