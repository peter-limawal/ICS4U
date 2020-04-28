/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q10 Stock Profit
*/

import java.util.Scanner;

public class StockProfit {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double NS, PP, PC, SP, SC, profit;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining NS input
      System.out.print("Enter number of shares : ");
      NS = keyboard.nextDouble();
      
      // Obtaining PP input
      System.out.print("Enter purchase price per share : ");
      PP = keyboard.nextDouble();
      
      // Obtaining PC input
      System.out.print("Enter purchase commission paid : ");
      PC = keyboard.nextDouble();
      
      // Obtaining SP input
      System.out.print("Enter sale price per share : ");
      SP = keyboard.nextDouble();
      
      // Obtaining SC input
      System.out.print("Enter sale commission paid : ");
      SC = keyboard.nextDouble();
      
      // Obtaining profit input
      profit = profitCount(NS, PP, PC, SP, SC);
      
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