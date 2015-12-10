
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questforthemysticorb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import model.Bucket;
import model.EnchantedApple;
import model.Game;
import model.Location;
import model.Player;
//import view.GallowsView;
import view.MainMenuView;
import view.WelcomeView;
import view.CastleView;

/**
 * 
 *
 * @author Mikel
 */
public class QuestForTheMysticOrb {

    // week 11 stuff
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        QuestForTheMysticOrb.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInfile(BufferedReader inFile) {
        QuestForTheMysticOrb.inFile = inFile;
    }

    // end week 11 stuff
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // week 11 stuff
        try {
            QuestForTheMysticOrb.inFile = new BufferedReader(new InputStreamReader(System.in));

            Player player = new Player();

            WelcomeView welcomeView = new WelcomeView();
            welcomeView.displayBanner();

            player.setName(welcomeView.getPlayerName());

            welcomeView.displayPlayerNameBanner(player);

            Game.getInstance().setPlayer(player);
            
            //mainMenuView
            MainMenuView mainView = new MainMenuView();
            mainView.display();

            //          QuestForTheMysticOrb.outFile = new printWriter(System.out, true);
            String filePath = "log.txt";

            //this will be for windowsQuestForTheMysticOrb.logFile = new PrintWriter(C:\Users\Documents\tmp\logfile.txt);
            //for you mac bros QuestForTheMysticOrb.logFile = new PrintWriter(/users/Documents/tmp/logfile.txt);
            // create startprogramview and start the program
            //           StartProgramView startProgramView = new StartProgramView();
            //           StartProgramView.display();
            return;
        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();;
        } finally {
            try {
                if (QuestForTheMysticOrb.inFile != null) {
                    QuestForTheMysticOrb.inFile.close();
                }

                if (QuestForTheMysticOrb.outFile != null) {
                    QuestForTheMysticOrb.outFile.close();
                }

                if (QuestForTheMysticOrb.logFile != null) {
                    QuestForTheMysticOrb.logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

            // end week 11 stuff
        }

    }
}
