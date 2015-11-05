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
    
    public int farmSize(String widthOfFarm, String lengthOfFarm) {
        int width = Integer.parseInt(widthOfFarm);
        int length = Integer.parseInt(lengthOfFarm);
        return width * length;
        
    }        
     
}
