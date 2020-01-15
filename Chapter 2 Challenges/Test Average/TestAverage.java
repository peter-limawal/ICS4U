/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 2 Challenges Q10 Test Average
*/

import java.util.Scanner; // Import Scanner class

public class TestAverage {
   
   public static void main(String[] args) {
   
      // Declaring variables
      double scoreA;
      double scoreB;
      double scoreC;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining scoreA input
      System.out.print("Enter the first test score : ");
      scoreA = keyboard.nextDouble();
      
      // Obtaining scoreB input
      System.out.print("Enter the second test score : ");
      scoreB = keyboard.nextDouble();
      
      // Obtaining scoreC input
      System.out.print("Enter the third test score : ");
      scoreC = keyboard.nextDouble();
      
      // Calculation
      double scoreAverage = (scoreA + scoreB + scoreC) / 3;
      
      // Output
      System.out.println("\nThe first score is " + scoreA);
      System.out.println("The second score is " + scoreB);
      System.out.println("The third score is " + scoreC);
      System.out.printf("The average out of the three scores is %.2f", scoreAverage);
      
   } // Main method
   
} // End class