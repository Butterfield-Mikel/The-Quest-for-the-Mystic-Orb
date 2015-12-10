/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mikel
 */
public class Game implements Serializable {
    
    private List<Item> availableItems;
    private Player player;
    private String[] actors;
    private Bucket bucket;
    private Corn corn;
    private EnchantedApple enchantedApple;
    private Gauntlets gauntlets;
    private Map map;
    private MysticOrb mysticOrb;
    private Torch torch;

    private static Game instance;
    
    private Game() {
        
    }
    
    public static Game getInstance() {
        if(instance == null) {
            instance = new Game();
        }
        return instance;
    }
    
    public static void setInstance(Game g) {
        instance = g;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Item> getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(List<Item> availableItems) {
        this.availableItems = availableItems;
    }

    public Item getItemByName(String name) {
        if(availableItems != null) {
            for(Item i : availableItems) {
                if(i.getName().equals(name)) {
                    return i;
                }
            }
        }
        return null;
    }
    
    public Item getItemByNameAndRemove(String name) {
        Item i = getItemByName(name);
        
        availableItems.remove(i);
        
        return i;
    }
    
}
