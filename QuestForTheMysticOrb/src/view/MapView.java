/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import byui.cit260.questforthemysticorb.MapControl;
import model.Game;
import model.LocationType;
import model.Player;
import view.ItemsView;
/**
 *
 * @author Mikel
 */
public class MapView extends View {
    
    
     public MapView() {

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
             System.out.println("+---+---+---+---+---+---+---+---+ \n"
        + "|---+---+---+TWR+---+---+---+---| \n"
        + "|---+---+KCN+CST+DNG+---+---+---| \n"
        + "|---+---+GLW+NKD+SOP+---+---+---| \n"
        + "|---+---+BST+SKD+FRM+---+---+---| \n"
        + "|---+---+WWD+XRD+BDG+GDN+---+---| \n"
        + "|---+---+DWD+DOC+---+GZB+---+---| \n"
        + "|---+---+---+SEA+BCH+---+---+---| \n"
        + "|---+---+---+SHP+---+---+---+---| \n"
        + "|---+---+---+---+---+---+---N---| \n"
        + "|---+---+---+---+---+---+-W-+-E-| \n"
        + "+---+---+---+---+---+---+---S---+ \n");
            System.out.println("TWR=Tower KCN=Kitchen CST=Castle DNG=Dungeon GLW=Gallows NKD=North Kingdom");
            System.out.println("SHP=Ship BST=Blacksmith SKD=South Kingdom FRM=Farm WWD=Westland Woods ");
            System.out.println("BDG=Bridge GDN=Garden DWD=Deep Westland Woods GZB=Gazebo XRD=Crossroads");
            System.out.println("DOC=Docks SEA=Sea BCH=Beach SOP=Shoppe SHP=Ship");
            System.out.println("Press (T) to return to the tower.");
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
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void showTower() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Tower);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }
    
    private void saveItems() {
        ItemsView saveItems = new ItemsView();
    }
    

}
