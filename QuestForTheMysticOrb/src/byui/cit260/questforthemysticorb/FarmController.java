/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;

import model.Corn;

/**
 *
 * @author Mikel
 */
public class FarmController {
    
    
    //so i have this idea for the player to calculate the size of the farm and get corn as a reward.
    
    public int farmSize(String widthOfFarm, String lengthOfFarm) {
        
        //this whole business is how you convert a string into a number, or an int..
        int width = Integer.parseInt(widthOfFarm);
        int length = Integer.parseInt(lengthOfFarm);
        return width * length;
        
    }        
     
   
    
    
}
