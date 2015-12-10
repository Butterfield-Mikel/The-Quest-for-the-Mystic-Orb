/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;

import model.Map;
import model.Player;
import Exception.MapControlException;
import model.Game;
import model.Location;
import model.LocationType;

/**
 *
 * @author Mikel
 */
public class MapControl {

    public static Map initMap() {
        Map map = new Map();
        map.init();
        return map;
    }

    public boolean moveLocation(Player p, LocationType locationType) throws MapControlException {
        
        Location newLocation = Game.getInstance().getMap().getLocation(locationType);
        
        p.setLocation(newLocation);
        
        return true;
    }
}
