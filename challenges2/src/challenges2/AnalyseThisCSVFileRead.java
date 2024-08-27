package challenges2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Application that reads in scores from a series of games from a CSV file and
 * outputs to screen the scores and determines the winner.
 *
 * @author 3048360
 */
public class AnalyseThisCSVFileRead {
    /**
     * Start point for the application.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Reading in the file (CSV)
        // Expected format is:
        // team1,team1 score,team 2,team 2 score
        // Example: Japan,30,Russia,10
        File file = new File("Scores.csv");

        // Need these to compare the scores by both teams
        int team1Score, team2Score;

        // Var to hold each line (i.e. game details)
        String game = null;

        // Var to hold each game details after it is split by ,
        // so gameInfo[0] is the team1 (name)
        // gameInfo[1] is the team1 score
        // gameInfo[2] is the team2 (name)
        // gameInfo[3] is the team2 score
        String[] gameInfo = null;

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            // Going to ignore the first line (as it is the header of the file)
            br.readLine();

            // Now get each game details line by line
            game = br.readLine();

            // If we have a game info then in the loop we go ...
            while (game != null) {
                // Parse the line (by each comma the line)
                gameInfo = game.split(",");

                // Capturing the team scores (need to parse from a String to int)
                team1Score = Integer.parseInt(gameInfo[1]);
                team2Score = Integer.parseInt(gameInfo[3]);

                // Output to screen:
                // Team 1
                System.out.print(gameInfo[0] + " ");
                // Team 1 score
                System.out.print(gameInfo[1] + " : ");
                // Team 2
                System.out.print(gameInfo[2] + " ");
                // Team 2 score
                System.out.print(gameInfo[3] + "\t");

                // Determining winner
                System.out.print("\t\t Winner ");
                if (team1Score > team2Score) {
                    // Winner was team 1
                    System.out.println(gameInfo[0]);
                } else if (team2Score > team1Score) {
                    // Winner was team 2
                    System.out.println(gameInfo[2]);
                } else {
                    // Draw
                    System.out.println("Draw");
                }

                // Read the next game if there is one.
                game = br.readLine();
            }

            // File read completely so close all resources
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Had a problem");
        }
    }
}
