/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;

import java.util.ArrayList;
import model.Game;
import model.Item;

/**
 *
 * @author Rich
 */
public class ItemControl {
   
    public static void initItemList() {
        Game.getInstance().setAvailableItems(new ArrayList<Item>());
        
        Item bucket = new Item();
        bucket.setName("Bucket");
        bucket.setDescription("Boring");
        
        Game.getInstance().getAvailableItems().add(bucket);
        
    }
    
}
