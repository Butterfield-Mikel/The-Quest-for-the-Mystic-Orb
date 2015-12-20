/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.questforthemysticorb.GameControl;
import java.util.Scanner;
import model.Game;
import questforthemysticorb.QuestForTheMysticOrb;
import view.CastleView;

/**
 *
 * @author Mikel
 */
public class MainMenuView extends View{
    
    public MainMenuView() {
        super("+---------------------+\n"
                + "| Select an option:   |\n"
                + "| N - start new game  |\n"
                + "| L - load saved game |\n"
                + "| H - view help menu  |\n"
                + "| E - exit game       |\n"
                + "+---------------------+");
    }
    
    /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'N' :
System.out.println("__________________________________________________________________________\n" +
"                                                                ..-..     |\n" +
"   _-            _-        _-                 _-              .'   | `.   |\n" +
"                                    _-                _-    .'  _- |`)'`. |\n" +
"       _-                  _-              _-               |      | U  | |\n" +
"           ..-..             ..-..             ..-..        |      |\\|/ | |\n" +
" _-      .'/////`.  _-     .'/////`.  _-     .'/////`.  _-  |  _-  | !  | |\n" +
"         |///////|         |///////|         |///////|      |      |   [| |\n" +
"   `),   |///////|   `(,   |///////|   `),   |///////|=%==%=|      |__[ | |\n" +
"    V _- |///////|    V    |///////|    V    |///////||\\../|| _-  [_____| |\n" +
" o  |  o |u=/////| o  |  o |u=/////| o  |  o |u=/////||  / ||    [______| |\n" +
"  '.|.'  |///////|  '.|.'  |///////|  '.|.'  |///////| \\/_/ |   [_______| |\n" +
"    !    |///////|    !    |///////|    !    |///////|      |  [________| |\n" +
" _-      |///////| _-      |///////|  _-     |///////| _-   | [_________| |\n" +
"lc_______|///////|_________|///////|_________|///////|______|[__________|_|\n" +
"         \"\"\"\"\"\"\"\"\"         \"\"\"\"\"\"\"\"\"         \"\"\"\"\"\"\"\"\"                  \\ \\\n" +
"  _-               __-                __--             _-                \\ \\\n" +
"_________________________________________________________________________/_/\n");
                
                startNewGame();
                break;
            case 'L' :
                loadGame();
                break;
            case 'H' :
                showHelpMenu();            
                break;
            case 'E' : 
                return false;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void startNewGame() {
        // this should create a new game.
        GameControl.createNewGame();
        
        ViewInterface view = Game.getInstance().getPlayer().getLocation().getLocationView();
        view.display();
    }

    private void loadGame() {
       System.out.println("NOT IMPLEMENTED YET");
    }

    private void showHelpMenu() {
        //System.out.println("does this print if i type h?");
        HelpMenuView helpMenuView = new HelpMenuView();
        char in = helpMenuView.getInput();
    }
    
}
