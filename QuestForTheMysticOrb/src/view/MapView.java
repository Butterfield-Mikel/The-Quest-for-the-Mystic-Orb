/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import view.ItemsView;
/**
 *
 * @author Mikel
 */
public class MapView extends View {
    
    
     public MapView() {
/*
   int countDown = 3;
        while (countDown < 1) {
            System.out.println("Loading map " + countDown + ".");
            System.out.println(countDown);
            countDown--;
        }
         */
    

    super("+---+---+---+---+---+---+---+---+ \n"
        + "|---+---+---+TWR+---+---+---+---| \n"
        + "|---+---+KCN+CST+DNG+---+---+---| \n"
        + "|---+---+GLW+NKD+SHP+---+---+---| \n"
        + "|---+---+BST+SKD+FRM+---+---+---| \n"
        + "|---+---+WWD+XRD+BDG+GDN+---+---| \n"
        + "|---+---+DWD+MAN+---+GZB+---+---| \n"
        + "|---+---+CAV+DOC+---+---+---+---| \n"
        + "|---+---+DCV+SEA+BCH+---+---+---| \n"
        + "|---+---+PIR+SOD+SHK+---+---N---| \n"
        + "|---+---+---+---+---+---+-W-+-E-| \n"
        + "+---+---+---+---+---+---+---S---+ \n");

        int keyCount = 1;

     
        do {

            System.out.println("TWR=Tower KCN=Kitchen CST=Castle DNG=Dungeon GLW=Gallows NKD=North Kingdom");
            System.out.println("SHP=Ship BST=Blacksmith SKD=South Kingdom FRM=Farm WWD=Westland Woods XRD=Crossroads");
            System.out.println("BDG=Bridge GDN=Garden DWD=Deep Westland Woods MAN=Mystic Who Warns GZB=Gazebo");
            System.out.println("CAV=Cave DOC=Docks DCV=Deep Cave SEA=Sea BCH=Beach PIR=Pirates SOD=Ship SHK=Shark");
            System.out.println("Press (T) to return to the tower. Also, you can (P)rint the items you see to an external file.");
            keyCount++;

        } while (keyCount < 2);
    }

   /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'T':
               showTower();
                break;        
                case 'P':
                  saveItems(); 
                break;         
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void showTower() {
        TowerView showTower = new TowerView();
        char in = showTower.getInput();
    }
    
    private void saveItems() {
        ItemsView saveItems = new ItemsView();
    }
    

}
