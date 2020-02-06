/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q4 Pennies for Pay
*/

import java.util.Scanner;

public class PenniesForPay {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int period;
      double pay = 0.005;
      double finalPay = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining period input
      System.out.print("Enter number of days : ");
      period = keyboard.nextInt();
      
      // Parameters
      while (period < 1) {
         
         // Reobtaining period input
         System.out.print("\nERROR! Number of days cannot be less than 1!");
         System.out.print("\nEnter number of days : ");
         period = keyboard.nextInt();
         
      }
      if (period >= 1) {
      
         System.out.println("\nNumber of days:           Pay per day:");
         
         for (int i = 1; i <= period; i++) {
            
            pay *= 2;
            finalPay += pay;
            
            System.out.println(i + "                         $" + pay);
            
         }
         
         System.out.printf("\nYour salary is : $%.2f", finalPay);
         
      }
      
   } // Main method
   
} // End class