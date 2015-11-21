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
public class RiverView  {
       
    public void RiverView(){
            System.out.println("You jumped in to a river, now you are dead");
            showMainMenu();
               
    }
    
    private void showMainMenu() {
        MainMenuView showMainMenu = new MainMenuView();
    }
    
    
}
