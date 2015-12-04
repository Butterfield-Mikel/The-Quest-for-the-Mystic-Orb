/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mikel
 */
public class ItemsView {
    
    //prints items list and location on external file

    public void saveItems() {

        FileWriter outFile = null;

        String fileLocation = "Items.txt";
                
        try {

            outFile = new FileWriter(fileLocation);

            outFile.write("Bucket = Castle                    | Corn = Farm\n");
            outFile.write("Enchanted Apple = Enchanted Garden | Gauntlets = Blacksmith\n");
            outFile.write("Mystic orb = Deep Westland Woods   | Map = Tower \n");
            outFile.write("Torch = Gallows                    | Knife = Kitchen\n");
            outFile.write("Water for your bucket = Sea        | \n");
            outFile.write("Good luck, Adventurer");

            outFile.flush();

        } catch (IOException ex1) {
            System.out.println("Error writing to file");
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException ex2) {
                    System.out.println("Error closing file");
                }
            }
        }
    }

}
