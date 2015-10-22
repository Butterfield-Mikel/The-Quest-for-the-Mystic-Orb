/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;

import static byui.cit260.questforthemysticorb.CastleControl.getBucket;
import model.Bucket;
import model.Item;
import model.MysticOrb;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikel
 */
public class CastleControlTest {
    
    public CastleControlTest() {
    }

    /**
     * Test of getBucket method, of class CastleControl.
     */
    @Test
    public void testGetBucket() {
        System.out.println("getBucket");
        Bucket b = new Bucket();
        Item i = new Item();
        CastleControl.getBucket(b, i);
        boolean getBucket;
        assertTrue(getBucket);
       
    }

    /**
     * Test of winGame method, of class CastleControl.
     */
    @Test
    public void testWinGame() {
        System.out.println("winGame");
        MysticOrb o = true;
        Item i = true;
        CastleControl.winGame(o, i);
        
    }
    
}
