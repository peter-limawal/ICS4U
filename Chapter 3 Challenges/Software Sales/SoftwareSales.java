/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Challenges Q8 Software Sales
*/

import java.util.Scanner; // Import Scanner class

public class SoftwareSales {
   
   public static void main(String[] args) {
      
      // Declaring variable
      double priceOfPackage = 99;
      int packagesPurchased;
      double discount = 0;
      double discountEarned;
      double totalPurchase;
      double finalAmount;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining packagesPurchased input
      System.out.print("How many packages have you purchased? : ");
      packagesPurchased = keyboard.nextInt();
      
      // If-else-if statements for discounts
      if (packagesPurchased >= 0 && packagesPurchased < 10) {
         discount = 0;
      } else if (packagesPurchased >= 10 && packagesPurchased < 20) {
         discount = 20;
      } else if (packagesPurchased >= 20 && packagesPurchased < 50) {
         discount = 30;
      } else if (packagesPurchased >= 50 && packagesPurchased < 100) {
         discount = 40;
      } else if (packagesPurchased >= 100) {
         discount = 50;
      } else {
         System.out.print("\nERROR! There can only be a positive number of quantities!");
      }
      
      // If input is within parameters
      if (packagesPurchased >= 0) {
      
         // Calculation
         totalPurchase = packagesPurchased * priceOfPackage;
         discountEarned = totalPurchase * (discount / 100);
         finalAmount = totalPurchase - discountEarned;
      
         // Output
         System.out.print("\nYou have purchased " + packagesPurchased + " packages");
         System.out.printf("\nThe total amount of your purchase before discount is $%.2f", totalPurchase);
         System.out.print("\nYou have earned a discount of " + discount + "%");
         System.out.printf("\nYour discount is $%.2f", discountEarned);
         System.out.printf("\nThe final amount of your purchase is $%.2f", finalAmount);
      
      }
      
   } // Main method
   
} // End class