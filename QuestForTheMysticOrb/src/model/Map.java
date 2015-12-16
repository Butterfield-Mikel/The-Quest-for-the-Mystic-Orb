/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import view.BeachView;
import view.BlacksmithView;
import view.BridgeView;
import view.CastleView;
import view.CrossroadsView;
import view.DeepCaveView;
import view.DeepWestlandWoodsView;
import view.DocksView;
import view.DungeonView;
import view.EnchantedGardenView;
import view.FarmView;
import view.GallowsView;
import view.GazeboView;
import view.KingView;
import view.KitchenView;
import view.NorthKingdomView;
import view.RiverView;
import view.SeaView;
import view.ShipView;
import view.ShoppeView;
import view.SouthKingdomView;
import view.TowerView;
import view.WestlandWoodsView;

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

        map[2][0] = new Location(2, 0, "Gallows", new GallowsView());
        locationList[LocationType.Gallows.ordinal()] = map[2][0];

        map[2][1] = new Location(2, 1, "NorthKingdom", new NorthKingdomView());
        locationList[LocationType.NorthKingdom.ordinal()] = map[2][1];

        map[2][2] = new Location(2, 2, "Shoppe", new ShoppeView());
        locationList[LocationType.Shoppe.ordinal()] = map[2][2];

        map[3][0] = new Location(3, 0, "Blacksmith", new BlacksmithView());
        locationList[LocationType.Blacksmith.ordinal()] = map[3][0];

        map[3][1] = new Location(3, 1, "SouthKingdom", new SouthKingdomView());
        locationList[LocationType.SouthKingdom.ordinal()] = map[3][1];

        map[3][1] = new Location(3, 1, "SouthKingdom", new SouthKingdomView());
        locationList[LocationType.SouthKingdom.ordinal()] = map[3][1];

        map[3][2] = new Location(3, 2, "Farm", new FarmView());
        locationList[LocationType.Farm.ordinal()] = map[3][2];

        map[4][0] = new Location(4, 0, "WestlandWoods", new WestlandWoodsView());
        locationList[LocationType.WestlandWoods.ordinal()] = map[4][0];

        map[4][1] = new Location(4, 1, "Crossroads", new CrossroadsView());
        locationList[LocationType.Crossroads.ordinal()] = map[4][1];

        map[4][2] = new Location(4, 2, "Bridge", new BridgeView());
        locationList[LocationType.Bridge.ordinal()] = map[4][2];

        map[4][3] = new Location(4, 3, "EnchantedGarden", new EnchantedGardenView());
        locationList[LocationType.EnchantedGarden.ordinal()] = map[4][3];

        map[5][0] = new Location(5, 0, "DeepWestlandWoods", new DeepWestlandWoodsView());
        locationList[LocationType.DeepWestlandWoods.ordinal()] = map[5][0];

        map[5][1] = new Location(5, 1, "Docks", new DocksView());
        locationList[LocationType.Docks.ordinal()] = map[5][1];

    //   map[5][2] = new Location(5, 2, "River", new RiverView());
        //   locationList[LocationType.River.ordinal()] = map[5][2];
        map[5][3] = new Location(5, 3, "Gazebo", new GazeboView());
        locationList[LocationType.Gazebo.ordinal()] = map[5][3];

        map[6][0] = new Location(6, 0, "DeepCave", new DeepCaveView());
        locationList[LocationType.DeepCave.ordinal()] = map[6][0];

        map[6][1] = new Location(6, 1, "Sea", new SeaView());
        locationList[LocationType.Sea.ordinal()] = map[6][1];

        map[6][2] = new Location(6, 2, "Beach", new BeachView());
        locationList[LocationType.Beach.ordinal()] = map[6][2];

    //    map[7][0] = new Location(7, 0, "WestSea", new WestSeaView());
        //    locationList[LocationType.WestSea.ordinal()] = map[7][0];
        map[7][1] = new Location(7, 1, "Ship", new ShipView());
        locationList[LocationType.Ship.ordinal()] = map[7][1];

    //    map[7][2] = new Location(7, 2, "EastSea", new EastSeaView());
        //    locationList[LocationType.EastSea.ordinal()] = map[7][2];
         
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
     map[7][2] = new King();
     */
}
