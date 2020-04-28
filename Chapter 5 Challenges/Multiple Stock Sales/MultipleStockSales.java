/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q11 Multiple Stock Sales
*/

import java.util.Scanner;

public class MultipleStockSales {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int multiple;
      double NS, PP, PC, SP, SC, profit = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining multiple input
      System.out.print("Enter number of stock sales : ");
      multiple = keyboard.nextInt();
      
      // Parameters
      while (multiple <= 0) {
         System.out.println("ERROR! Number of stock sales cannot be zero or less!");
         System.out.print("Enter number of stock sales : ");
         multiple = keyboard.nextInt();
      }
      
      // For loop
      for (int i = 1; i <= multiple; i++) {
            
         // Obtaining NS input
         System.out.printf("\nEnter number of shares for sale %d : ", i);
         NS = keyboard.nextDouble();
         
         // Obtaining PP input
         System.out.printf("Enter purchase price per share for sale %d : ", i);
         PP = keyboard.nextDouble();
         
         // Obtaining PC input
         System.out.printf("Enter purchase commission paid for sale %d : ", i);
         PC = keyboard.nextDouble();
         
         // Obtaining SP input
         System.out.printf("Enter sale price per share for sale %d : ", i);
         SP = keyboard.nextDouble();
         
         // Obtaining SC input
         System.out.printf("Enter sale commission paid for sale %d : ", i);
         SC = keyboard.nextDouble();
      
         // Adding profit
         profit += profitCount(NS, PP, PC, SP, SC);
         
      }
      
      // Output
      if (profit >= 0) {
         System.out.printf("\nThe amount of profit is $%,.2f", profit);
      } else {
         System.out.printf("\nThe amount of loss is $%,.2f", Math.abs(profit));
      }
      
   } // Main method
   
   private static double profitCount(double NS, double PP, double PC, double SP, double SC) {
      
      return ((NS * SP) - SC) - ((NS * PP) + PC);
      
   } // profitCount method
   
} // End class