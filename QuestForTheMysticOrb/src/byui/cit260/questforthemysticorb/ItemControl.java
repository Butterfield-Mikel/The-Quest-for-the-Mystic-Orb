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
        bucket.setDescription("Can hold Water");
        
        Game.getInstance().getAvailableItems().add(bucket);
        
        Item corn = new Item();
        corn.setName("Corn");
        corn.setDescription("Food");
        
        Game.getInstance().getAvailableItems().add(corn);
        
        Item gauntlets = new Item();
        gauntlets.setName("Gauntlets");
        gauntlets.setDescription("Protects hands");
        
        Game.getInstance().getAvailableItems().add(gauntlets);
        
        Item bucketOfWater = new Item();
        bucketOfWater.setName("BucketOfWater");
        bucketOfWater.setDescription("Wet");
        
        Game.getInstance().getAvailableItems().add(bucketOfWater);
        
        Item enchantedApple = new Item();
        enchantedApple.setName("EnchantedApple");
        enchantedApple.setDescription("Sweet");
        
        Game.getInstance().getAvailableItems().add(enchantedApple);
        
        Item mysticOrb = new Item();
        mysticOrb.setName("MysticOrb");
        mysticOrb.setDescription("Rejuvinating");
        
        Game.getInstance().getAvailableItems().add(mysticOrb);
        
        
    }
    
}
