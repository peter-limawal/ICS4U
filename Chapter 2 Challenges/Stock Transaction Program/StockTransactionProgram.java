/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 2 Challenges Q19 Stock Transaction Program
*/

import java.util.Scanner; // Import Scanner class

public class StockTransactionProgram {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int numOfSharesBuy;
      double pricePerShare;
      double commission;
      int numOfSharesSell;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining numOfSharesBuy input
      System.out.print("Hello Joe! How many shares would you like to purchase from Acme Software, Inc.? : ");
      numOfSharesBuy = keyboard.nextInt();
      
      // Obtaining pricePerShare input
      System.out.print("How much is one share of Acme Software, Inc.? : ");
      pricePerShare = keyboard.nextDouble();
      
      // Obtaining commission input
      System.out.print("For commission, how many percent would you give to your stockbroker? : ");
      commission = keyboard.nextDouble();
      
      // First calculation
      double joePaid = numOfSharesBuy * pricePerShare;
      double commissionPaid = joePaid * (commission / 100);
      
      // Transition message
      System.out.print("\nTwo weeks later...");
      
      // Obtaining numOfSharesSell input
      System.out.print("Hello Joe! How many shares would you like to sell from Acme Software, Inc.? : ");
      numOfSharesSell = keyboard.nextInt();
      
      // Reobtaining pricePerShare input
      System.out.print("How much is one share of Acme Software, Inc.? : ");
      pricePerShare = keyboard.nextDouble();
      
      // Reobtaining commission input
      System.out.print("For commission, how many percent would you give to your stockbroker? : ");
      commission = keyboard.nextDouble();
      
      // Second calculation
      double joeSold = numOfSharesSell * pricePerShare;
      double commissionSold = joeSold * (commission / 100);
      double finalSum = (joeSold - commissionSold) - (joePaid - commissionPaid);
      
      // Output
      System.out.printf("\nAmount of money you paid for the stock: $%.2f", joePaid);
      System.out.printf("\nThe amount of commission you paid your broker when you bought the stock: $%.2f", commissionPaid);
      System.out.printf("\nThe amount that you sold the stock for: $%.2f", joeSold);
      System.out.printf("\nThe amount of commission you paid your broker when you sold the stock: $%.2f", commissionSold);
      System.out.printf("\nYour profit is $%.2f", finalSum);
   } // Main method
   
} // End class