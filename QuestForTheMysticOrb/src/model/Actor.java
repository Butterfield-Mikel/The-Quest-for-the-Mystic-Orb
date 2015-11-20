/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mikel
 */
public enum Actor implements Serializable {

    Hero("This is the player character, the one who finds the orb and saves the kingdom."),
    King("The king is the king of the kingdom and he sends the play on his or her quest.")
    Blacksmith("He is the finest blacksmith in all the land.")
    Farmer("He is a wise farmer who saved food from his last harves.")
    Mystic("He is a mysterious man who warns the player of danger.")

    private final String description;
    private final Point coordinates;

Actor(String descripting) {
    this.description = description;
    coordinates = new Point(1,1);
}

public String getDescription() {
    return description;
}

public Point getCoordinates() {
return coordinates;
}
    
    
}
