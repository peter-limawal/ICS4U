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
      double totalRainfall, averageMonthly;
      int mostRain, leastRain;
      
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
         
      }
      
      // Obtaining mostRain value
      mostRain = mostRainMonth(rainfalls);
      
      // Obtaining leastRain value
      leastRain = leastRainMonth(rainfalls);
      
      // Calculating totalRainfall
      totalRainfall = totalRainfallOfYear(rainfalls);
      
      // Calculating averageMonthly
      averageMonthly = averageMonthlyRainfall(rainfalls);
      
      // Output
      System.out.printf("\nTotal rainfall for the year: %,.2f mm", totalRainfall);
      System.out.printf("\nAverage monthly rainfall for the year: %,.2f mm", averageMonthly);
      System.out.printf("\nMonth with the most rain: Month %d", mostRain);
      System.out.printf("\nMonth with the least rain: Month %d", leastRain);
      
   } // Main method
   
   private static double totalRainfallOfYear(double[] rainfalls) {
      
      // Declaring sum variable
      double sum = 0;
      
      // For loop
      for (int i = 0; i < rainfalls.length; i++) {
         sum += rainfalls[i];
      }
      
      // Returning sum
      return sum;
      
   } // totalRainfallOfYear method
   
   private static double averageMonthlyRainfall(double[] rainfalls) {
      
      // Declaring variables
      double totalRainfall;
      double average;
      
      // Obtaining totalRainfall
      totalRainfall = totalRainfallOfYear(rainfalls);
      
      // Calculating average
      average = totalRainfall / (double)(rainfalls.length);
      
      // Returning average
      return average;
      
   } // averageMonthlyRainfall method
   
   private static int mostRainMonth(double[] rainfalls) {
      
      // Declaring variables
      double max = rainfalls[0];
      int mostRain = 1;
      
      // For loop
      for (int i = 1; i < rainfalls.length; i++) {
         if (rainfalls[i] > max) {
            max = rainfalls[i];
            mostRain = i + 1;
         }
      }
      
      // Returning mostRain
      return mostRain;
      
   } // mostRainMonth method
   
   private static int leastRainMonth(double[] rainfalls) {
      
      // Declaring variables
      double min = rainfalls[0];
      int leastRain = 1;
      
      // For loop
      for (int i = 0; i < rainfalls.length; i++) {
         if (rainfalls[i] < min) {
            min = rainfalls[i];
            leastRain = i + 1;
         }
      }
      
      // Returning leastRain
      return leastRain;
      
   } // leastRainMonth method
   
} // End class