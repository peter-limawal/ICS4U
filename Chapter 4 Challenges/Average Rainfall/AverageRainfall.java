/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q8 Average Rainfall
*/

import java.util.Scanner;

public class AverageRainfall {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int numOfYears;
      double inchesOfRain;
      double totalInchesOfRain = 0;
      double averageRain = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining numOfYears input
      System.out.print("Enter number of years : ");
      numOfYears = keyboard.nextInt();
      
      // Parameters
      while (numOfYears < 1) {
         
         System.out.print("\nERROR! Number of years cannot be less than 1!");
         // Reobtaining numOfYears input
         System.out.print("\nEnter number of years : ");
         numOfYears = keyboard.nextInt();
         
      } 
      if (numOfYears >= 1) {
         
         outerloop:
         for (int i = 1; i <= numOfYears; i++) {
            
            innerloop:
            for (int j = 1; j <= 12; j++) {
               
               // Obtaining inchesOfRain input
               System.out.printf("Enter inches of rain for year %d, month %d : ", i, j);
               inchesOfRain = keyboard.nextDouble();
               
               // Parameters
               while (inchesOfRain < 0) {
                  
                  // Reobtaining inchesOfRain input
                  System.out.print("\nERROR! Inches of rainfall cannot be less than zero!");
                  System.out.printf("\nEnter inches of rain for year %d, month %d : ", i, j);
                  inchesOfRain = keyboard.nextDouble();
                  
               } if (inchesOfRain >= 0) {
                  
                  // Calculation
                  totalInchesOfRain += inchesOfRain;
                  averageRain = totalInchesOfRain / (numOfYears * 12);
                  
               }
               
            }
            
         }
         
         // Output
         System.out.print("\nNumber of months : " + (numOfYears * 12));
         System.out.print("\nTotal inches of rainfall : " + totalInchesOfRain);
         System.out.print("\nAverage rainfall per month : " + averageRain);
         
      }
      
   }
   
}