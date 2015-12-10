/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import view.CastleView;
import view.DungeonView;
import view.KitchenView;
import view.TowerView;

/**
 *
 * @author Rich
 */
public class Map implements Serializable {

    private Location[][] map;
    private Location[] locationList;
    
    public Map() {
        map = new Location[8][4];
        locationList = new Location[24];
    }

    public Location[][] getMap() {
        return map;
    }

    public void setMap(Location[][] map) {
        this.map = map;
    }
    
    public Location getLocation(LocationType lt) {
        return locationList[lt.ordinal()];
    }
    
    public void init() {
        
        map[0][1] = new Location(0, 1, "Tower", new TowerView());
        locationList[LocationType.Tower.ordinal()] = map[0][1];
        
        Location kitchen = new Location(1, 0, "Kitchen", new KitchenView());
        map[1][0] = kitchen;
        locationList[LocationType.Kitchen.ordinal()] = kitchen;
        
        map[1][1] = new Location(1, 1, "Castle", new CastleView());
        locationList[LocationType.Castle.ordinal()] = map[1][1];
        
        map[1][2] = new Location(1, 2, "Dungeon", new DungeonView());
        locationList[LocationType.Dungeon.ordinal()] = map[1][2];
    }
    
    public Location getStartingLocation() {
        return map[1][1];
    }
    
    public Location getLocation(int row, int col) {
        return map[row][col];
    }
    
    /*
    map[0][1] = new Tower();
    map[1][0] = new Kitchen();
    map[1][1] = new Castle();
    map[1][2] = new Dungeon();
    map[2][0] = new Gallows();
    map[2][1] = new NorthKingdom();
    map[2][2] = new Shoppe();
    map[3][0] = new Blacksmith();
    map[3][1] = new SouthKingdom();
    map[3][2] = new Farmer();
    map[4][0] = new WestlandWoods();
    map[4][1] = new Crossroads();
    map[4][2] = new Bridge();
    map[4][3] = new EnchantedGarden();
    map[5][0] = new DeepWestlandWoods();
    map[5][1] = new Docks();
    map[5][2] = new River();
    map[5][3] = new Gazebo();
    map[6][0] = new DeepCave();
    map[6][1] = new Sea();
    map[6][2] = new Beach();
    map[7][0] = new WestSea();
    map[7][1] = new Ship();
    map[7][2] = new EastSea();
    */
}
