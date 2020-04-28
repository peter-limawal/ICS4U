/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q9 Distance Traveled Modification
*/

import java.util.Scanner;

public class DistanceTravelledModification {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int speed;
      int time;
      int distance;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining speed input
      System.out.print("Enter speed of vehicle (mph) : ");
      speed = keyboard.nextInt();
      
      // Obtaining time input
      System.out.print("Enter number of hours travelled : ");
      time = keyboard.nextInt();
      
      // Parameters
      while (speed < 0) {
         
         // Reobtaining speed input
         System.out.print("\nERROR! Speed cannot be less than zero!");
         System.out.print("\nEnter speed of vehicle (mph) : ");
         speed = keyboard.nextInt();
         
      } 
      while (time < 1) {
         
         // Reobtaining time input
         System.out.print("\nERROR! Time cannot be less than one!");
         // Obtaining time input
         System.out.print("\nEnter number of hours travelled : ");
         time = keyboard.nextInt();
         
      }
      
      if (speed >= 0 && time >= 1) {
      
      // Output
         System.out.println("\nHour     Distance Travelled");
         System.out.println("---------------------------");
         
         // For loop
         for (int i = 1; i <= time; i++) {
            
            // Calculation
            distance = distance(speed, i);
            
            // Output
            System.out.println("  " + i + "             " + distance);
            
         }
         
      }
      
   } // Main method
   
   private static int distance(int speed, int time) {
      
      // Calculation
      return speed * time;
      
   } // distance method
   
} // End class