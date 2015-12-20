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
 * @author Mikel
 */
public class BridgeView extends View {

    public BridgeView() {
        super("You find yourself near a bridge that is covered in a \n"
                + "Thck thorn bush. On the other side of the bridge to the \n"
                + "(E)ast is an enchanted garden. However, the thorn bush \n"
                + "might make it hard to cross. You can also go back (W)est \n"
                + "to the Crossroads."
        );
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'E':
                  Player p = Game.getInstance().getPlayer();
        if(p.hasItem("Gauntlets")) {
                System.out.println(""+
"         &&& &&  & &&\n" +
"      && &\\/&\\|& ()|/ @, &&\n" +
"      &\\/(/&/&||/& /_/)_&/_&\n" +
"   &() &\\/&|()|/&\\/ '%\" & ()\n" +
"  &_\\_&&_\\ |& |&&/&__%_/_& &&\n" +
"&&   && & &| &| /& & % ()& /&&\n" +
" ()&_---()&\\&\\|&&-&&--%---()~\n" +
"     &&     \\|||\n" +
"             |||\n" +
"             |||\n" +
"             |||\n" +
"       , -=-~  .-^- _\n"); }
                showEnchantedGarden();
                break;            
            case 'W':
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

     private void showEnchantedGarden() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        
        if(!p.hasItem("Gauntlets")) {
            System.out.println("You try to move the bush so you can cross the bridge but \nyou just get your hands cut up.");
            return;
        }
        try {
            mc.moveLocation(p, LocationType.EnchantedGarden);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
     }
     
}
