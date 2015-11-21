/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;

/**
 *
 * @author Mikel
 */
public class TowerControl {
    /*
     public static (getMap) {
     boolean getMap;
     if (getMap = true)
     return true;
           
     return null;
     }
     private static class getMap {

     public getMap() {
     }
     }
     */

    // look out and see all the locations
    String[] locations = {
        "Beach",
        "Blacksmith",
        "Bridge",
        "Castle",
        "Cave",
        "Crossroads",
        "Deep Westland Woods",
        "Docks",
        "Dungeon",
        "Enchanted Garden",
        "Farm",
        "Gallows",
        "Gazebo",
        "Kitchen",
        "North Kingdom",
        "River",
        "Sea",
        "Ship",
        "Shoppe",
        "South Kingdom",
        "Tower",
        "Westland Woods"
    };

 //this calculates the numer of locations so the player knows how many places he or she can visit
    public int i = locations.length;
   

// and something like this will have to go in the view layer
//System.out.println("Tehre are " + i + " locations for you to visit.")
    
}




