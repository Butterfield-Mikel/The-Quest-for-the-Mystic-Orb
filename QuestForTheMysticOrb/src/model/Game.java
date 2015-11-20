/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Mikel
 */
public class Game implements Serializable {
    
    private Item[] inventory;
    private Player player;
    private String[] actors;
    private Bucket bucket;
    private Corn corn;
    private EnchantedApple enchantedApple;
    private Gauntlets gauntlets;
    private Map map;
    private MysticOrb mysticOrb;
    private Torch torch;
/*    
    public Game {
    
}
    public double getTotalTime() {
        return totalTime;
    }
    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
    public Item[] getInventory() {
        return inventory;
    }
    */
}
