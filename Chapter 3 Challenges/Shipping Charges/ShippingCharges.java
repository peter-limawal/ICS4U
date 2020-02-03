/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Challenges Q9 Shipping Charges
*/

import java.util.Scanner; // Import Scanner class

public class ShippingCharges {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double weightOfPackage;
      int milesShipped;
      double charge = 0;
      double finalAmount;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining weightOfPackage input;
      System.out.print("How many pounds does your package weigh? : ");
      weightOfPackage = keyboard.nextDouble();
      
      // Obtaining milesShipped input;
      System.out.print("How many miles away are you shipping your package? : ");
      milesShipped = keyboard.nextInt();
      
      // If-else-if statement to determine charge
      if (weightOfPackage > 0 && weightOfPackage <= 2) {
         charge = 1.10;
      } else if (weightOfPackage > 2 && weightOfPackage <= 6) {
         charge = 2.20;
      } else if (weightOfPackage > 6 && weightOfPackage <= 10) {
         charge = 3.70;
      } else if (weightOfPackage > 10) {
         charge = 3.80;
      } else {
         System.out.print("\nERROR! The weight of a package cannot be negative!");
      }
      
      // If milesShipped does not match parameters
      if (milesShipped <= 0) {
         System.out.print("\nERROR! The amount of miles shipped cannot be less than 0!");
      }
      
      // If input is within parameters
      if (weightOfPackage > 0 && milesShipped > 0) {
      
         // Calculation
         finalAmount = (((milesShipped - 1) / 500) + 1) * charge;
         
         // Output
         System.out.print("\nYour package weighs " + weightOfPackage + " pounds");
         System.out.print("\nThe distance of your shipment is " + milesShipped + " miles");
         System.out.printf("\nThe cost for shipping your package is $%.2f", finalAmount);
         
      }
      
   } // Main method
   
} // End class