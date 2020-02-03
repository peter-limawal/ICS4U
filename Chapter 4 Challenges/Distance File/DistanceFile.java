/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q3 Distance File
*/

import java.util.Scanner;
import java.io.*;

public class DistanceFile {
   
   public static void main(String[] args) throws IOException {
   
      // Creating file
      File file = new File("DistanceFile");
      
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
      
      // Opening file
      PrintWriter out = new PrintWriter(file);
      
      // Parameters
      if (speed >= 0 && time >= 1) {
      
         // Output
         out.println("\nHour     Distance Travelled");
         out.println("---------------------------");
         
         // For loop
         for (int i = 1; i <= time; i++) {
            
            // Calculation
            distance = speed * i;
            
            // Output
            out.println("  " + i + "             " + distance);
            
         }
         
      }
      
      else {
         
         System.out.print("\nERROR! Speed cannot be less than zero or time cannot be less than one!");
         
      }
      
      out.close();
      
   }
   
}