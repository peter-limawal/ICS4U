/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Challenges Q4 Test Scores and Grade
*/

import java.util.Scanner; // Import Scanner class

public class TestScoreAndGrade {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double scoreA;
      double scoreB;
      double scoreC;
      double scoreAverage;
      String letterGrade = "";
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining scoreA input
      System.out.print("Please enter the first score : ");
      scoreA = keyboard.nextDouble();
      
      // Obtaining scoreB input
      System.out.print("Please enter the second score : ");
      scoreB = keyboard.nextDouble();
      
      // Obtaining scoreC input
      System.out.print("Please enter the third score : ");
      scoreC = keyboard.nextDouble();
      
      // Calculating scoreAverage
      scoreAverage = (scoreA + scoreB + scoreC) / 3;
      
      // If-else-if statements to determine letterGrade
      if (scoreAverage >= 90 && scoreAverage < 100) {
         letterGrade = "A";
      } else if (scoreAverage >= 80 && scoreAverage < 90) {
         letterGrade = "B";
      } else if (scoreAverage >= 70 && scoreAverage < 80) {
         letterGrade = "C";
      } else if (scoreAverage >= 60 && scoreAverage < 70) {
         letterGrade = "D";
      } else if (scoreAverage >= 0 && scoreAverage < 60) {
         letterGrade = "F";
      }
      
      // Output
      System.out.printf("\nThe average of the three scores are %.2f", scoreAverage);
      System.out.print("\nThe score is considered grade " + letterGrade + ".");
      
   } // Main method
   
} // End class