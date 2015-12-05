/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Mikel
 */
public class TowerView extends View {
    
    
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
    

    public TowerView() {
        super("You enter the tallest tower in the kingdom. Even if n/"
                + "you don’t find anything useful up here you still  n/"
                + "needed the exercise. In the tower you can look n/"
                + "out at the entire kingdom and the land surrounding  n/"
                + "It. You can (L)ook around and count the locations. n/"
                + "There is a (M)ap on the table. You don’t see anything n/"
                + "Else so you can go back (D)ownstairs to the main castle. ");
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'M':
                showMap();
                break;
             case 'D':
                showCastle();
                break;
                 case 'L':    
                     
                     //This should calculate the length of the array. 
            for (int i = 0; i < locations.length; i++) 
            System.out.println("You see " + i + " locations.");      
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void showCastle() {
        CastleView showCastle = new CastleView();
        char in = showCastle.getInput();
    }
    
    
    private void showMap() {
        MapView showMap = new MapView();
        char in = showMap.getInput();
    }

}


