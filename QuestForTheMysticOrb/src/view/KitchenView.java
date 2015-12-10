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
public class KitchenView extends View {

    public KitchenView() {
        super(
                "\n++++++++++++++++++++++++++++"
                + "\nYou have entered the castle kitchen"
                + "\nIn the kitchen you see a knife, a bucket, and some meat"
                + "\nyou wonder if any of these items would be useful as you embark on this quest."
                + "\nthe only exit is the one you just came in that will return you to the castle."
                + "\n++++++++++++++++++++"
                + "\nYou have the following choices:"
                + "\nK-- Get a Knife"
                + "\nB-- Get a Bucket"
                + "\nM-- Get some meat"
                + "\nR-- Return to the Castle"
                + "\nH-- View the games help menu"
        );
    }

    //can't get these messages to display, any ideas/
    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'K':
                System.out.println("You Took a Knife");
                break;
            case 'B':
                System.out.println("You now have a bucket");
                break;
            case 'M':
                System.out.println("Congrats, you now have a hunk of raw meat...");
                break;
            case 'R':
                System.out.println("You have returned to the main castle");
                break;
            case 'H':
                System.out.println("Display Help Menu");
                break;
            default:
                System.out.println("ERROR ON INPUT");

        }
        
        return true;
    }
}
