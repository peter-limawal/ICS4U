/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q12 Bar Chart
*/

import java.util.Scanner;

public class BarChart {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int numStores;
      int sales;
      int bar;
      String output = "\nSALES BAR CHART";
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining number of stores input
      System.out.print("Enter number of stores : ");
      numStores = keyboard.nextInt();
      
      // Parameters
      while (numStores <= 0) {
         
         // Reobtaining numStores input
         System.out.print("\nERROR! Number of stores cannot be less than one!");
         System.out.print("\nEnter number of stores : ");
         numStores = keyboard.nextInt();
         
      }
      
      // For loop
      for (int i = 1; i <= numStores; i++) {
         
         // Obtaining sales input
         System.out.printf("Enter today's sales for store %d: ", i);
         sales = keyboard.nextInt();
         
         // Calculation
         bar = sales / 100;
         
         // Output
         output += "\nStore " + i + ": ";
         
         for (int j = 1; j <= bar; j++) {
            output += "*";
         }
         
      }
      
      System.out.print(output);
      
   } // Main method
   
} // End class