/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q2 Retail Price Calculator
*/

import java.util.Scanner;

public class RetailPriceCalculator {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double wholesale;
      double markup;
      double retail;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining wholesale input
      System.out.print("Enter wholesale cost : ");
      wholesale = keyboard.nextDouble();
      
      // Obtaining markup input
      System.out.print("Enter markup percentage : ");
      markup = keyboard.nextDouble();
      
      // Calling calculateRetail method
      retail = calculateRetail(wholesale, markup);
      
      // Output
      System.out.printf("\nThe retail price is $%.2f", retail);
      
   } // Main method
   
   private static double calculateRetail(double cost, double percent) {
      
      // Calculation
      double retail = cost * (percent / 100);
      retail += cost;
      
      // Returning retail
      return retail;
      
   } // calculateRetail method
   
} // End class