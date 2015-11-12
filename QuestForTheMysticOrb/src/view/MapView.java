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
public class MapView {

    public static void mapView() {
//while loop here to see the map
        int countDown = 3;
        while (countDown < 1) {
            System.out.println("Loading map " + countDown + ".");
            System.out.println(countDown);
            countDown--;
        }

        System.out.println("+---+---+---+---+---+---+---+---+");
        System.out.println("|---+---+---+TWR+---+---+---+---|");
        System.out.println("|---+---+KCN+CST+DNG+---+---+---|");
        System.out.println("|---+---+GLW+NKD+SHP+---+---+---|");
        System.out.println("|---+---+BST+SKD+FRM+---+---+---|");
        System.out.println("|---+---+WWD+XRD+BDG+GDN+---+---|");
        System.out.println("|---+---+DWD+MAN+---+GZB+---+---|");
        System.out.println("|---+---+CAV+DOC+---+---+---+---|");
        System.out.println("|---+---+DCV+SEA+BCH+---+---+---|");
        System.out.println("|---+---+PIR+SOD+SHK+---+---N---|");
        System.out.println("|---+---+---+---+---+---+-W-+-E-|");
        System.out.println("+---+---+---+---+---+---+---S---+");

        int keyCount = 1;

        //do while loop here to see the map key
        do {

            System.out.println("TWR=Tower KCN=Kitchen CST=Castle DNG=Dungeon GLW=Gallows NKD=North Kingdom");
            System.out.println("SHP=Ship BST=Blacksmith SKD=South Kingdom FRM=Farm WWD=Westland Woods XRD=Crossroads");
            System.out.println("BDG=Bridge GDN=Garden DWD=Deep Westland Woods MAN=Mystic Who Warns GZB=Gazebo");
            System.out.println("CAV=Cave DOC=Docks DCV=Deep Cave SEA=Sea BCH=Beach PIR=Pirates SOD=Ship SHK=Shark");

            keyCount++;

        } while (keyCount < 2);
    }

    // @Override
    public boolean doAction(char input) {

        switch (input) {

            case 'H':
                showHelpMenu();
                //System.out.println("does this show if i type h?");
                break;

        }
        return true;
    }

    private void showHelpMenu() {
        //System.out.println("does this print if i type h?");
        HelpMenuView helpMenuView = new HelpMenuView();
        char in = helpMenuView.getInput();
    }

    char getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
