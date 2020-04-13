/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q15 World Series Champions
*/

import java.util.Scanner;
import java.io.*;

public class WorldSeriesChampions {
   
   public static void main(String[] args) throws IOException {
      
      // Declaring variables
      int count = 0;
      String teamName;
      int winCount;
      
      // Reading file
      File file = new File("WorldSeriesWinners.txt");
      Scanner st = new Scanner(file);
      
      // Counting number of champions
      while (st.hasNext()) {
         count++;
         st.nextLine();
      }
      
      // Declaring array
      String[] winners = new String[count];
      
      // Re-reading file
      Scanner str = new Scanner(file);
      
      // Filling in array
      for (int i = 0; i < count; i++) {
         winners[i] = str.nextLine();
      }
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining teamName input
      System.out.print("Enter team name : ");
      teamName = keyboard.nextLine();
      
      // Calling winCounter method
      winCount = winCounter(winners, teamName);
      
      // Output
      System.out.print("Team " + teamName + " has won the World Series " + winCount + " times*!");
      System.out.print("\n*From 1903 to 2009");
      
   } // Main method
   
   private static int winCounter(String[] winners ,String teamName) {
      
      // Declaring variable
      int winCount = 0;
      
      // For loop
      for (int i = 0; i < winners.length; i++) {
         if (winners[i].equals(teamName)) {
            winCount++;
         }
      }
      
      // Returning winCount
      return winCount;
      
   } // winCounter method
   
} // End class