/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.questforthemysticorb.MapControl;
import model.Game;
import model.Item;
import model.LocationType;
import model.Player;

/**
 *
 * @author Rich
 */
public class DocksView extends View {

    //map[5][1].Castle();

    public DocksView() {
        super("You are standing on the docks. There is some old rope, but it's too heavy to lift. \n"
                + "You can go (S)outh and walk along the sea or go (N)orth to the crossroads.");
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
                                System.out.println(""+
"    _.-'```\"\"\"``\"-._\n" +
"    /\"`                '.\n" +
"    `':.,_               \"._\n" +
"         \\`'-._             `'-._\n" +
"          \\    `:._              `'-._          _\n" +
"          |      \\ `:_                `\"--\"--\"``\n" +
"          |       \\   `:_\n" +
"          |      :|    \\ '.\n" +
"~~~~~~~~~~|       |     |  `:_\n" +
"~~   ~~   |       |:    |     `:_\n" +
"  ~    ~~ |:      |     |\n" +
" ~   ~    |       |\n");
               
                showSea();
                break;
            case 'N':
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
        } catch (Exception e) {
            e.printStackTrace();
        }

        p.getLocation().getLocationView().display();
    }

    private void showSea() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Sea);
        } catch (Exception e) {
            e.printStackTrace();
        }

        p.getLocation().getLocationView().display();
    }
    

    }

