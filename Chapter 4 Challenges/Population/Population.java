/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q9 Population
*/

import java.util.Scanner;

public class Population {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int startSize;
      double increase;
      int numDays;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining startSize input
      System.out.print("Enter starting size : ");
      startSize = keyboard.nextInt();
      
      // Parameters
      while (startSize < 2) {
         
         // Reobtaining startSize input
         System.out.print("\nERROR! Minimum starting size is 2!");
         System.out.print("\nEnter starting size : ");
         startSize = keyboard.nextInt();
         
      } 
      if (startSize >= 2) {
      
         int totalSize = startSize;
         
         // Obtaining increase input
         System.out.print("\nEnter average daily population increase (as a percentage) : ");
         increase = keyboard.nextDouble();
         
         while (increase < 0) {
            
            // Reobtaining increase input
            System.out.print("\nERROR! Average daily population increase cannot be less than 0!");
            System.out.print("\nEnter average daily population increase (as a percentage) : ");
            increase = keyboard.nextDouble();
            
         } 
         if (increase >= 0) {
            
            // Obtaining numDays input
            System.out.print("\nEnter number of days they will multiply : ");
            numDays = keyboard.nextInt();
            
            while (numDays < 1) {
               
               // Reobtaining numDays input
               System.out.print("\nERROR! Number of days cannot be less than 1!");
               System.out.print("\nEnter number of days they will multiply : ");
               numDays = keyboard.nextInt();
               
            } 
            if (numDays >= 1) {
               
               // Calculation
               for (int i = 1; i <= numDays; i++) {
               
                  System.out.printf("\nPopulation in day %d : %d", i, totalSize);
                  totalSize += (double)totalSize * (increase / 100);
                  
               }
               
            }
            
         }
         
      }
      
   } // Main method
   
} // End class