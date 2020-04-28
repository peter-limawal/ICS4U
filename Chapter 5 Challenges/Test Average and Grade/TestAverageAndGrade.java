/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q7 Test Average and Grade
*/

import java.util.Scanner;

public class TestAverageAndGrade {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double scoreA, scoreB, scoreC, scoreD, scoreE, average;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining scoreA input
      System.out.print("Enter first score : ");
      scoreA = keyboard.nextDouble();
      
      // Obtaining scoreB input
      System.out.print("Enter second score : ");
      scoreB = keyboard.nextDouble();
      
      // Obtaining scoreC input
      System.out.print("Enter third score : " );
      scoreC = keyboard.nextDouble();
      
      // Obtaining scoreD input
      System.out.print("Enter fourth score : ");
      scoreD = keyboard.nextDouble();
      
      // Obtaining scoreE input
      System.out.print("Enter fifth score : ");
      scoreE = keyboard.nextDouble();
      
      // Calling calcAverage method
      average = calcAverage(scoreA, scoreB, scoreC, scoreD, scoreE);
      
      // Output
      System.out.print("\n\tScore\t\tGrade");
      System.out.print("\n--------------------");
      System.out.print("\n\t " + scoreA + "\t\t  " + determineGrade(scoreA));
      System.out.print("\n\t " + scoreB + "\t\t  " + determineGrade(scoreB));
      System.out.print("\n\t " + scoreC + "\t\t  " + determineGrade(scoreC));
      System.out.print("\n\t " + scoreD + "\t\t  " + determineGrade(scoreD));
      System.out.print("\n\t " + scoreE + "\t\t  " + determineGrade(scoreE));
      System.out.printf("\nAverage score : %.2f", average);
      System.out.print("\nAverage grade : " + determineGrade(average));
      
   } // Main method
   
   private static double calcAverage(double a, double b, double c, double d, double e) {
      
      // Declaring variable
      double average;
      
      // Calculation
      average = (a + b + c + d + e) / 5.0;
      
      // Returning average
      return average;
      
   } // calcAverage method
   
   private static String determineGrade(double score) {
      
      // If-else-if statements
      if (score <= 100 && score >= 90) {
         return "A";
      } else if (score < 90 && score >= 80) {
         return "B";
      } else if (score < 80 && score >= 70) {
         return "C";
      } else if (score < 70 && score >= 60) {
         return "D";
      } else if (score < 60 && score >= 0) {
         return "F";
      } else {
         return "X";
      }
      
   } // determineGrade method
   
} // End class