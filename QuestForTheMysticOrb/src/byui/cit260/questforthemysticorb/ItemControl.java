/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;
import java.util.ArrayList;
/**
 *
 * @author Rich
 */
public class ItemControl {
    public static void main(int args[]){
        
        ArrayList<Inventory> Inv = new ArrayList<>();
        
        Inventory bucket = new Inventory(0);
        
        Inv.add(bucket);
        Inv.add(new Inventory(1));
        
        Inventory corn = new Inventory(1);
        Inv.add(corn);
        Inv.add(new Inventory(2));
        
        Inventory gauntlets = new Inventory(2);
        Inv.add(gauntlets);
        Inv.add(new Inventory(3));
        
        Inventory torch = new Inventory(3);
        Inv.add(torch);
        Inv.add(new Inventory(4));
        
        //Inv.get(0);
    }
    
    public static class Inventory {
        
        private int item;
        
        public Inventory(int item) {
            item = 1;
        }
        
        public Inventory() {
            
        }
        
        public int getItem() {
            return item;
        }
        
        public void setItem(int item){
            this.item = item;
        }
        
    }
}
