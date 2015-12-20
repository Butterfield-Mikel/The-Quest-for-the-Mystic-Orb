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
public class NorthKingdomView extends View {
    
    public NorthKingdomView() {
        super("You are outside the castle at the north end of the kingdom. (W)est there are \n"
                + "some gallows and there is a shop to the (E)ast. You can also go \n"
                + "(N)orth to the castle or (S)outh to the southen end of the kingdom. \n"
            
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
            case 'E' :
                System.out.println(""+
                
"         _._._                       _._._\n"+
"        _|   |_                     _|   |_\n"+
"        | ... |_._._._._._._._._._._| ... |\n"+
"        | ||| |  o Ye Old Shoppe o  | ||| |\n"+
"        | ``` |  ```    ```    ```  | ``` |\n"+
"   ())  |[-|-]| [-|-]  [-|-]  [-|-] |[-|-]|  ())\n"+
"  (())) |     |---------------------|     | (()))\n"+
" (())())| ``` |  ```    ```    ```  | ``` |(())())\n"+
" (()))()|[-|-]|  :::   .-`-.   :::  |[-|-]|(()))()\n"+
" ()))(()|     | |~|~|  |_|_|  |~|~| |     |()))(()\n"+
"    ||  |_____|_|_|_|__|_|_|__|_|_|_|_____|  ||\n"+
" ~ ~^^ @@@@@@@@@@@@@@|=======|@@@@@@@@@@@@@@ ^^~ ~\n"+
"      ^~^~                                ~^~^ \n");
                
                showShoppe();
                break;
            case 'W' :
                System.out.println(""+
"     _______________,,.\n" +
"    /_____________.;;'/|\n" +
"   |\"____  _______;;;]/\n" +
"   | || //'         ;\n" +
"   | ||//'          ;\n" +
"   | |//'           ;\n" +
"   |  /'           ,^.\n" +
"   | ||            | |  \n" +
"   | ||            `.'\n" +
"   | ||            \n" +
"   | ||            \n" +
"   | ||            \n" +
"   | || \n"            );
                
                showGallows();
                break;
            case 'S' :                             
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
                

                showCastle();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showShoppe() {
     MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Shoppe);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showGallows() {
      MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Gallows);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
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
        
        private void showCastle() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Castle);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
}