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

/**
 *
 * @author Rich
 */
public class WestlandWoodsView extends View {
    //map[4][0].WestlandWoods();
    public WestlandWoodsView() {
        super("You find yourself in the cursed Westland Woods. The enchanted apple fills you with, \n"
                + "Power and lets you withstand the force of the woods. You can go (S)outh deeper into \n"
                + "the woods, if you dare. You can also go (E)ast to the crossroads. \n"
                );
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
                System.out.println(""+
"       |  |   \\\\|.'    |  |    \\\\|.'   |  |     \\\\|.'  |  |\n" +
"       | ||   \\` /   _.| ||,!  \\` /   _| ||\\,!  \\` /   | ||\n" +
"       ||||`. f |_.-'.'||||\\`. f |_.-'.|||| \\`. f |_.-'||||\n" +
"       | ||\\ \\|! ,-'   | || \\ \\|! ,-'M | ||  \\ \\|! ,-' | ||\n" +
"       || |W`. ||  N   || |  `. ||   N || |   `. ||    || |\n" +
"       ||||H `. |  W   ||||  H`. |   W ||||    `. |    ||||\n" +
"       || |N  |L|  M   || |  N |L|   M || |    N|L|    || |\n" +
"       | ||W  ||]  H   | ||  W ||]   H | ||    W||]    | ||\n" +
"       ||||M  [ I  W   ||||  M [ I   W ||||    M[ I    ||||\n" +
"       || |H  I |  M   || |  H I |   M || |    HI |    || |\n" +
"       | [|N, !l| ,H\\  | [| /N,!l|  ,H\\| [|   /N!l|    | [|\n" +
"       || |   '-`      || |    '-`     || |     '-`    || |\n" +
"      / '| \\          / '| \\          / '| \\          / '| \\\n");
                showDeepWestlandWoods();
                break;
            case 'E' :
                                                System.out.println(""+
"                    /  :  \\           ______\n" +
"                   /   .   \\         | ~~~~ |\n" +
"                  /    .    \\        | ~~~  |\n" +
"                 /           \\       |______|\n" +
" ````````````````            ````````````||```\n" +
"  --     --     --     --     --     --  ||\n" +
"_______________        |        _________||_____\n" +
"             /                   \\       ||\n" +
"            /                     \\\n" +
"           /           |           \\\n" +
"          /                         \\\n" +
"         /                           \\\n" +
"        /              |              \\\n" +
"       /               |               \\   \n");
                showCrossroads();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showDeepWestlandWoods() {
      MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.DeepWestlandWoods);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }
        private void showCrossroads() {
     MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Crossroads);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
}