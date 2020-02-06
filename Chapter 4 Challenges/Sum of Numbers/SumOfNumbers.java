/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q1 Sum of Numbers
*/

import java.util.Scanner;

public class SumOfNumbers {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int number;
      int sum = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining number input
      System.out.print("Enter positive non-zero number : ");
      number = keyboard.nextInt();
      
      // Parameters
      if (number > 0) {
         
         // For loop
         for (int i = 1; i <= number; i++) {
            
            sum += i;
            
         }
         
         // Output
         System.out.print("\n" + sum);
         
      }
      
      else {
         
         // Error message
         System.out.print("ERROR! Please enter a positive non-zero integer!");
         
      }
      
   } // Main method
   
} // End class