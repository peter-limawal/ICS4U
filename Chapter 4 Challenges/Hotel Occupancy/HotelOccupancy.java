/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q7 Hotel Occupancy
*/

import java.util.Scanner;

public class HotelOccupancy {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int numFloors;
      int numRooms;
      int totalNumRooms = 0;
      int numOccupied;
      int totalNumOccupied = 0;
      double occupancyRate;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining numFloors input
      System.out.print("How many floors are in the hotel? : ");
      numFloors = keyboard.nextInt();
      
      // Parameters
      while (numFloors < 1) {
         
         // Reobtaining numFloors input
         System.out.print("\nERROR! Number of floors cannot be less than 1!");
         System.out.print("\nHow many floors are in the hotel? : ");
         numFloors = keyboard.nextInt();
         
      }
      if (numFloors >= 1) {
         
         outerloop:
         for (int i = 1; i <= numFloors; i++) {
            
            System.out.printf("How many rooms are in floor %d? : ", i);
            numRooms = keyboard.nextInt();
            
            while (numRooms < 10) {
               System.out.print("\nERROR! Number of rooms cannot be less than 10!");
               System.out.printf("\nHow many rooms are in floor %d? : ", i);
               numRooms = keyboard.nextInt();
            }
            
            if (numRooms >= 10) {
               
               totalNumRooms += numRooms;
               
               System.out.printf("How many rooms in floor %d are occupied? : ", i);
               numOccupied = keyboard.nextInt();
               
               while (numOccupied < 0 || numOccupied > numRooms) {
                  System.out.print("\nERROR! Number of occupied rooms cannot be less than 0 or more than number of rooms!");
                  System.out.printf("\nHow many rooms in floor %d are occupied? : ", i);
                  numOccupied = keyboard.nextInt();
               }
               
               if (numOccupied >= 0 || numOccupied <= numRooms) {
                  totalNumOccupied += numOccupied;
               }
               
            }
            
         }
         
         // Calculation
         occupancyRate = ((double)totalNumOccupied / (double)totalNumRooms) * 100;
         
         // Output
         System.out.printf("\nThe hotel has %d number of rooms", totalNumRooms);
         System.out.printf("\nThe hotel has %d occupied rooms", totalNumOccupied);
         System.out.printf("\nThe hotel has %d vacant rooms", (totalNumRooms - totalNumOccupied));
         System.out.printf("\nThe hotel's occupancy rate is %.2f", occupancyRate);
         System.out.print("%");
         
      }
      
   } // Main method
   
} // End class