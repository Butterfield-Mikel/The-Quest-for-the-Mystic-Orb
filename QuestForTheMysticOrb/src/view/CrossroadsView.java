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
public class CrossroadsView extends View {
    
 public CrossroadsView() {
        super("You find yourself at a crossroad. Also, there is an old wood \n"
                + "street sign that reads \n"
              
                + "   (N)orth to the South Kingdom \n"
                + "   (E)ast to the bridge \n"
                + "   (S)outh to the Docks \n"
                + "   (W)est to the Westland Woods. \n");
    
    }
    @Override
    public boolean doAction(char input) {
        
        switch(input) {
            case 'N' :
                                System.out.println(""+
"      (())                           (())\n" +
"     ((()))  __          .      __  ((()))\n" +
"    (((())))(())     .         (())(((())))\n" +
"   ((((()))))())) _         _ ((()((((()))))\n" +
"     |____|((())))()   ,   ()(((()))|____|\n" +
"     |_[]_| |__|((())__A__((())|__| |_[]_|\n" +
"    _|    |_|[]|_|_|I-I-I-I|_|_|[]|_|    |_\n" +
"   |-|    |-|  |-|||-I-I-I-|||-|  |-|    |-|\n" +
"  (|-|    |-|  |-| |I-I-I-I| |-|  |-|    |-|)\n" +
" ((|-| __ |-|  |-| |-I-I-I-| |-|  |-| __ |-|))\n" +
" ()|-|_XX_|-|__|T|_|[T]-[T]|_|T|__|-|_XX_|-|()\n" );
                showSouthKingdom();
                break;
            case 'E' :
                System.out.println(""+
"   ^^                __..-:'':__:..:__:'':-..__\n" +
"                 _.-:__:.-:'':  :  :  :'':-.:__:-._\n" +
"               .':.-:  :  :  :  :  :  :  :  :  :._:'.\n" +
"            _ :.':  :  :  :  :  :  :  :  :  :  :  :'.: _\n" +
"           [ ]:  :  :  :  :  :  :  :  :  :  :  :  :  :[ ]\n" +
"           [ ]:  :  :  :  :  :  :  :  :  :  :  :  :  :[ ]\n" +
"  :::::::::[ ]:__:__:__:__:__:__:__:__:__:__:__:__:__:[ ]:::::::::::\n" +
"  !!!!!!!!![ ]!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!![ ]!!!!!!!!!!!\n" +
"  ^^^^^^^^^[ ]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^[ ]^^^^^^^^^^^\n" +
"           [ ]                                        [ ]\n" +
"           [ ]                                        [ ]\n" +
"           [ ]                                        [ ]\n" +
"   ~~^_~^~/   \\~^-~^~ _~^-~_^~-^~_^~~-^~_~^~-~_~-^~_^/   \\~^ ~~_ ^\n");
                showBridge();
                break;
            case 'S' :
                System.out.println(""+
"                       _  _                 |-._\n" +
"                    -         - _           |-._|\n" +
"                 O                 (). _    |\n" +
"                                     '(_) __|__\n" +
"                                     [__|__|_|_]\n" +
"  ~~ _|_ _|_ _|_  ~~     ~~~          |__|__|_|\n" +
"     ||| ||| |||      ~~      ~~~     |_|__|__|\n" +
"     _|___|___|__.      ~~~ ~~       /|__|__|_|\n" +
"    |___________/       ~~~~  ~~~   / |_|__|__|\n" +
"  ~     ~~ ~      ~~       ~~      /  |_| |___|\n" +
"     ~~~~    ~~~   ~~~~   ~   ~~  /    \n");
                showDocks();
                break;
            case 'W' :
                  Player p = Game.getInstance().getPlayer();
        if(p.hasItem("EnchantedApple")) {
                System.out.println(""+
"               ,@@@@@@@,\n" +
"       ,,,.   ,@@@@@@/@@,  .oo8888o.\n" +
"    ,&%%&%&&%,@@@@@/@@@@@@,8888\\88/8o\n" +
"   ,%&\\%&&%&&%,@@@\\@@@/@@@88\\88888/88'\n" +
"   %&&%&%&/%&&%@@\\@@/ /@@@88888\\88888'\n" +
"   %&&%/ %&%%&&@@\\ V /@@' `88\\8 `/88'\n" +
"   `&%\\ ` /%&'    |.|        \\ '|8'\n" +
"       |o|        | |         | |\n" +
"       |.|        | |         | |\n" +
"    \\\\/ ._\\//_/__/  ,\\_//__\\\\/.  \\_//__/_\n"); }
                showWestlandWoods();
                break;    
            default:
                System.out.println("ERROR ON INPUT");
                
        }
        
        return true;
    }
    
        private void showSouthKingdom() {
       MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.SouthKingdom);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        private void showBridge() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        
        try {
            mc.moveLocation(p, LocationType.Bridge);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        private void showDocks() {
       MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Docks);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        private void showWestlandWoods() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        
         if(!p.hasItem("EnchantedApple")) {
            System.out.println("As you approach the Westland Woods you feel consumed by dark magic. \nYou hear a dark voice that says *only the enchanted may enter.*\nYou run back in fear.");
            return;
        }
        
        try {
            mc.moveLocation(p, LocationType.WestlandWoods);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
}