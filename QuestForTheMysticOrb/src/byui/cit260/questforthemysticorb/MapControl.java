/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;

import model.Map;
import model.Player;
import Exception.MapControlException;
import model.Location;

/**
 *
 * @author Mikel
 */
public class MapControl {
    
    Location[][] map = new Location[7][3];
    
    /*
    MAP:
    []                   [Tower]        []          []
    [Kitchen]            [Castle]       [Dungeon]   []
    [Gallows]            [North Kingdom][Shoppe]    []
    [Blacksmith]         [South Kingdom][Farmer]    []
    [Westland Woods]     [Crossroads]   [Bridge]    [Enchanted Garden]
    [Deep Westland Woods][Docks]        [River]     [Gazebo]
    [Deep Cave]          [Sea]          [Beach]     []
    [West Sea]           [Ship]         [East Sea]  []
    */
    
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
    
    public boolean moveLocation(Player p, Map m) throws MapControlException {
            
         //   if(p.getLocation();.getRow() == 0) {
        throw new MapControlException("Player can't go that way.");
        
        Location newLoc = m.getMatrix()[p.getLocation().getRow() - 1][p.getLocation().getColumn()];
        
        p.setLocation(newLoc);
        
        return true;
    }
    
    
               
//    return true;

    
}

    
