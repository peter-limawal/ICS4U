/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q1 Rainfall Class
*/

import java.util.Scanner;

public class RainfallClass {
   
   public static void main(String[] args) {
      
      // Declaring array
      double[] rainfalls = new double[12];
      
      // Declaring variables
      double totalRainfall = 0;
      double averageMonthly;
      double max = -1;
      double min = Math.pow(2, 53); // Just a really large number
      int mostRain = 0;
      int leastRain = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Filling array
      for (int i = 0; i < rainfalls.length; i++) {
         
         System.out.print("Enter rainfall for month " + (i+1) + " (in mm) : ");
         rainfalls[i] = keyboard.nextDouble();
         
         // Parameter
         while (rainfalls[i] < 0) {
            System.out.print("ERROR! Value of rainfall cannot be negative!\n");
            System.out.print("Enter rainfall for month " + (i+1) + " (in mm) : ");
            rainfalls[i] = keyboard.nextDouble();
         }
         
         // Obtaining mostRain value
         if (rainfalls[i] > max) {
            max = rainfalls[i];
            mostRain = i + 1;
         }
         
         // Obtaining leastRain value
         if (rainfalls[i] < min) {
            min = rainfalls[i];
            leastRain = i + 1;
         }
         
      }
      
      // Calculating totalRainfall
      for (int j = 0; j < rainfalls.length; j++) {
         totalRainfall += rainfalls[j];
      }
      
      // Calculating averageMonthly
      averageMonthly = totalRainfall / rainfalls.length;
      
      // Output
      System.out.printf("\nTotal rainfall for the year: %,.2f mm", totalRainfall);
      System.out.printf("\nAverage monthly rainfall for the year: %,.2f mm", averageMonthly);
      System.out.printf("\nMonth with the most rain: Month %d", mostRain);
      System.out.printf("\nMonth with the least rain: Month %d", leastRain);
      
   } // Main method
   
} // End class