/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikel
 */
public class FarmControllerTest {
    
    public FarmControllerTest() {
    }

    /**
     * Test of farmSize method, of class FarmController.
     */
    @Test
    public void testFarmSize() {
        System.out.println("farmSize");
        String widthOfFarm = "3";
        String lengthOfFarm = "3";
        FarmController instance = new FarmController();
        int expResult = 9;
        int result = instance.farmSize(widthOfFarm, lengthOfFarm);
        assertEquals(expResult, result);
        
    }
    
}
